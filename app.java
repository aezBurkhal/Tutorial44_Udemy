
public class app {

	public static void main(String[] args) {
		
		
	//factorial of 4:  4! = 4*3*2*1	(factorial of any number is this equation)
	
	System.out.println(factorial(3));
	}
	
	private static int factorial(int value) {
		//recursion is calling a method into itself
		
		//System.out.println(value);
		
		if(value == 1) {
			return 1;
			
		}
		
		return factorial(value - 1) * value;
	}

}
