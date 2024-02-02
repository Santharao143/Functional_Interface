package Functional;

import java.util.function.Function;

public class FunctionalDemo1 {
public static void main(String args[]) {
	Function<String,Integer> fun=(s)->s.length();
	System.out.println(fun.apply("Santharao"));
	
}
}
