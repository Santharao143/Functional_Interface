package Functional;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String args[]) {
		Function<Integer,Integer> fun=(year)->{
			if(year%4==0) {
				System.out.println("this year is leap year");
			}else {
				System.out.println("this year is not leap year");
			}
			return year;
			
		};
		System.out.println(fun.apply(2000));
	}

}
