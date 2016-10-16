package serialization;

import java.lang.Object;
public class SerializationTestRunner {
	
	public static void main(String[] args) {
		SerializationTestObject testObject1 = new SerializationTestObject("transient1","nonTransient1");
		System.out.println("testObject1 before Serialization: " + testObject1);

		Serialization.serialize((Object) testObject1, args[0]);
		System.out.println("Serialization of testObject1 is completed.");

		Object testObject2 = (SerializationTestObject) Serialization.deSerialize(args[0]);
		System.out.println("testObject1 after deserialization: " + testObject2);

		System.out.println("De-Serialization of testObject1 is completed.");
		
	}

}
