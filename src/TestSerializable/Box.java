package TestSerializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {
	private static final long serialVersionUID = -3450064362986273896L;

	private int width;
	private int height;

	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(30);
		try {
			FileOutputStream fs = new FileOutputStream("F:\\foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
			
			FileInputStream fi = new FileInputStream("F:\\foo.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Box box = (Box) oi.readObject();
			oi.close();
			System.out.println(box.height + "," + box.width);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
