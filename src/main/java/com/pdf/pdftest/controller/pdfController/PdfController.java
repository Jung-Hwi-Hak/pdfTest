package com.pdf.pdftest.controller.pdfController;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * PdfController.java
 * pdf 업로딩시 저장될 경로를 지정해줌
 *
 * @autor 정휘학
 * @since 2023.01.10
 */
@RestController
@RequestMapping(value = "/pdf")
public class PdfController {
    private String defaultPath; // 폴더 경로
    private String pdfName; // pdf 이름
    private static String pdfNum; // pdf 카운트
    private int pdfSize; // pdf 페이지 수
    File file;

    public PdfController(){}

    @RequestMapping(value = "/uploading", method = {RequestMethod.POST})
    public void pdfUploading(File file, @RequestBody Map<String, Object> param) throws IOException {
        PDDocument document = new PDDocument();

        // PDF 저장 경로 지정 및 폴더 생성
        String path = "D:\\test";
        File folder = new File(path);

        if(!folder.exists()){
            try{
                folder.mkdir();
                System.out.println("폴더 생성 완료");
            }catch (Exception e){
                e.getStackTrace();
            }
        }else{
            System.out.println("이미 폴더가 존재합니다.");
        }

        // 문서 저장 ==> 저장후 출력문으로 확인
        document.save("D:/test/MY_DOC.pdf");
        System.out.println("PDF created / PDF 생성됨");

        // 문서 닫기
        document.close();
    }
}
