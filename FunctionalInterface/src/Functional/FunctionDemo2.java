package Functional;

import java.util.function.Function;

public class FunctionDemo2 {
	public static void main(String args[]) {
		Function<Integer,Integer> fu=(num)-> {
			if(num%2==0) {
				System.out.println("this is even number");
				
			}else {
				System.out.println("this is odd number");
			}
			
			return num;
			
			
		};
		
		System.out.println(fu.apply(121));
	}

}
