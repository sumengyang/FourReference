package TestIO;
import java.io.*;
public class createFile {
	public static void main(String[] args){
		createFile();
	}
	
	/**
	 * 文件处理示例
	 */
	public static void createFile(){
		File f = new File("d:/jar/files/create.txt");
		try{
			f.createNewFile();
			System.out.println("该分区大小"+f.getTotalSpace()/(1024*1024*1024)+"G");
			f.mkdirs();
			System.out.println("文件名" + f.getName());
			System.out.println("文件父目录字符串" + f.getParent());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
//			f.
		}
	}
}



//13.  public static void createFile() {  
//14.     File f=new File("E:/电脑桌面/jar/files/create.txt");  
//15.        try{  
//16.            f.createNewFile();  //当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。  
//17.            System.out.println("该分区大小"+f.getTotalSpace()/(1024*1024*1024)+"G"); //返回由此抽象路径名表示的文件或目录的名称。  
//18.            f.mkdirs();  //创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。  
//19.//            f.delete(); //  删除此抽象路径名表示的文件或目录  
//20.           System.out.println("文件名  "+f.getName());  //  返回由此抽象路径名表示的文件或目录的名称。  
//21.           System.out.println("文件父目录字符串 "+f.getParent());// 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。  
//22.            
//23.        }catch (Exception e) {  
//24.            e.printStackTrace();  
//25.        }  
//26.  }  
//27.}  