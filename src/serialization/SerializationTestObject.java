package serialization;

import java.io.Serializable;

public class SerializationTestObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* Fields which are not meant to be serialized should be marked as "transient".
	 * Fields marked as transient will be populated with default values after the Object is de-serialized. e.g: int=0; String=null; boolean=false;
	 * Only fields can be marked as "transient", not the methods.
	 */ 
	private transient String transientString;
	private String nonTransientString;

	public SerializationTestObject(String transientString, String nonTransientString) {
		this.transientString = transientString;
		this.nonTransientString = nonTransientString;
	}

	@Override
	public String toString() {
		return transientString + ", " + nonTransientString; 
	}
}
