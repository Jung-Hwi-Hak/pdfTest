const pdfFile = {
    uploading : () =>{
        console.log("pdfFile");
        $.ajax({
            url:"/pdf/uploading",
            type: "POST",
            async: false,
        }).done((result)=>{
            console.log(result,"완료")
        });
    }
}
pdfFile.uploading();
