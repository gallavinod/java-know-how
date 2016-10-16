package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void serialize(Object object, String fileName) {
		ObjectOutputStream out;
		try {
			out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(object);
		} catch (IOException ex) {
			System.out.println("Error in serialize " + ex.getMessage());
		}
	}

	public static Object deSerialize(String fileName) {
		ObjectInputStream in;
		Object object = null;
		try {
			in = new ObjectInputStream(new FileInputStream(fileName));
			object = (Object) in.readObject();
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Error in serialize " + ex.getMessage());
		}
		return object;
	}

}
