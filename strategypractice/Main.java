package strategypractice;

public class Main {
	
	public static void main(String[] args) {				
		Context calculate = new Context(new OperationAdd());		
		System.out.println(calculate.executeStrategy(1, 2));	
		
		calculate = new Context(new OperationSubstract());		
		System.out.println(calculate.executeStrategy(1, 2));
				
		calculate = new Context(new OperationMultiply());		
		System.out.println(calculate.executeStrategy(1, 2));
	}
}
