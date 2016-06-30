package TestIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
public class ObjectStream {
public static void main(String[] args){
	ObjectOutputStream objectwriter = null;
	ObjectInputStream objectreader = null;
	try{
		objectwriter = new ObjectOutputStream(new FileOutputStream("d:/jar/files/student.txt"));
		objectwriter.writeObject(new Student("gg",22));
		objectwriter.writeObject(new Student("tt",15));
		objectwriter.writeObject(new Student("rr",25));
		objectreader = new ObjectInputStream(new FileInputStream("d:/jar/files/student.txt"));
		for(int i = 0; i < 3; i++)
			System.out.println(objectreader.readObject());
	}
	catch(IOException | ClassNotFoundException e){
		e.printStackTrace();
	}
	finally{
		try{
			objectwriter.close();
			objectreader.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

}
class Student implements Serializable{
	private String name;
	private int age;
	public Student(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString(){
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

