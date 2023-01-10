//package com.pdf.Test;
////org.apache.pdfbox
//
//import org.apache.pdfbox.pdmodel.*;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// * pdfTest.java
// * Class 설명을 작성하세요.
// *
// * @autor owner
// * @since 2023.01.09
// */
//public class pdfTest {
//    public static void main(String[] args) throws IOException {
//        PDDocument document = new PDDocument();
//
//        // PDF 저장 경로 지정 및 폴더 생성
//        String path = "D:\\test";
//        File folder = new File(path);
//
//        if(!folder.exists()){
//            try{
//                folder.mkdir();
//                System.out.println("폴더 생성 완료");
//            }catch (Exception e){
//                e.getStackTrace();
//            }
//        }else{
//            System.out.println("이미 폴더가 존재합니다.");
//        }
//
//        // 문서 저장 ==> 저장후 출력문으로 확인
//        document.save("D:/test/MY_DOC.pdf");
//        System.out.println("PDF created / PDF 생성됨");
//
//        // 문서 닫기
//        document.close();
//    }
//}
