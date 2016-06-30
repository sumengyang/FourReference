package TestIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class fileCopy {
	public static void main(String[] args) {
		int count = 0;
		InputStream streamReader = null;
		byte[] buffer = new byte[512];//一次取出的字节数大小,缓冲区大小
		int numberRead = 0;
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			 input = new FileInputStream(new File(
						"d:/jar/files/win7IIS.doc"));// 1.png/win7IIS.doc
			 output = new FileOutputStream(new File(
						"d:/jar/files/win7IIS.docx"));//如果文件不存在会自动创建
			 while((numberRead = input.read(buffer)) != -1)
				 output.write(buffer, 0, numberRead);
		} catch (final Exception e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("copy ok");
	}
}
