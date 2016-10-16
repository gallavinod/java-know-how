// The class should be declared final => An object of this class cannot be modified once it is created
public final ImmutableClass {

	private final int immutablePrimitive;
	private final String immitableNonPrimitive;
	private final MutableClass mutableObject;

	public ImmutableClass(int immutablePrimitive, String immutableNonPrimitive, MutableClass mutableObject) {
		this.immutablePrimitive = immutablePrimitive;
		this.immutableNonPrimitive = immutableNonPrimitive;
		this.mutableObject = mutableObject;
	}	

}
