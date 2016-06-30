package TestIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * @author smy
 * 下午4:23:15
 * Test 回退流操作
 */
public class PushBackInputStreamDemo {
	public static void main(String[] args)throws IOException{
		String str = "hello,rollenholt";
		PushbackInputStream push = null;
		ByteArrayInputStream bat = null;
		bat = new ByteArrayInputStream(str.getBytes());
		push = new PushbackInputStream(bat);
		int temp = 0;
		while((temp = push.read()) != -1){
			if(temp == ','){// 判断读取的是否是逗号  
				push.unread(temp);//回到temp的位置 
				temp = push.read();//接着读取字节 
				System.out.print("(回退" +(char)temp+")");//输出回退的字符
			}
			else{
				System.out.print((char)temp);// 否则输出字符  
			}
		}
	}
}
