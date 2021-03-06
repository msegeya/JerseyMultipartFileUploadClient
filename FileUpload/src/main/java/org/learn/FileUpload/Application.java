package org.learn.FileUpload;

import java.io.File;

public class Application {
	public static void main(String[] args) {
		try {
			String url = "http://localhost:9095/multipart/file/upload";
			File imgFile = new File("src/main/resource/img.jpg");
			File pdfFile = new File("src/main/resource/SamplePdf.pdf");
			File jsonFile = new File("src/main/resource/Organization.json");
			File zipFile = new File("src/main/resource/SoftwareData.rar");
			
			JerseyFileUpload.uploadFiles(url,imgFile,pdfFile,jsonFile,zipFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}