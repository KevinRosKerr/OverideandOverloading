
public class main extends Concrete {

	protected main() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main newmain = new main();
		newmain.concrete();
		override over = new override();
		over.concrete();
		overloading loading = new overloading();
		loading.run();
	}

	@Override
	protected void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("I'm from the abstract method");
	}

}
