package Functional;

import java.util.function.Predicate;

public class Predicatedemo {
public static void main(String args[]) {
	Predicate<Integer> pd=(num)->{
		if(num<6) {
			System.out.println("this number greater than 6");
		}
		return false;
	};
	boolean result;
	System.out.println(result=pd.test(45));
}
}
