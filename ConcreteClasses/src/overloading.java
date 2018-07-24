
public class overloading {

	
	final public void run() {
		overload();
		overload("I am a String");
		overload(0);
		overload("I am a String +", 1);
	}
	
	final private void overload() {
		System.out.println("No Parameter");
	}
	
	final private void overload(String output) {
		System.out.println("String, one parameter: " + output);
	}
	
	final private void overload(int output) {
		System.out.println("Int, one parameter: " + output);
	}
	
	final private void overload(String output, int intoutput) {
		System.out.println("String, Int, two parameter: " + output +", " + intoutput);
	}
	
}
