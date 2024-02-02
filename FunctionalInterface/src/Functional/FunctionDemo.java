package Functional;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String args[]) {
		Function<Integer, Integer>Fun=(t)->(t+t);
		Function<Integer, Integer>Fun1=(t)->(t-1);
		Function<Integer, Integer>Fun2=(t)->(t*t);	
		Function<Integer, Integer>Fun3=(t)->(t/2);
		System.out.println(Fun.apply(5));
		System.out.println(Fun1.apply(2));
		System.out.println(Fun2.apply(6));
		System.out.println(Fun3.apply(10));
	
	}

}
