import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CreateUTF8 {
	/**
	 * ����UTF-8�ļ�. 
	 * ����ļ�������û���������ݣ������ɵ��ļ�ΪANSI�����ʽ��
	 * ����ļ����������������ݣ������ɵ��ļ�ΪUTF-8�����ʽ��
	 * 
	 * @param fileName      �����ɵ��ļ�����������·����
	 * @param fileBody      �ļ�����
	 * @return
	 */
	public static boolean writeUTFFile(String fileName, String fileBody) {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream(fileName);
			osw = new OutputStreamWriter(fos, "UTF-8");
			osw.write(fileBody);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	// main()
	public static void main(String[] argc) {
		writeUTFFile("C:\\test1.txt", "aaa");// test1.txtΪANSI��ʽ�ļ�
		writeUTFFile("C:\\test2.txt", "����aaa");// test2.txtΪUTF-8��ʽ�ļ�
	}
}
