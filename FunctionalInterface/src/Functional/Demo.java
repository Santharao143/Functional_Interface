package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
public static void main(String args[]) {
	List<String> li=Arrays.asList("2","3","43","54","23","12","202","25","2","203","2002");
	List<String> result=li.stream().filter(s->s.startsWith("2")).collect(Collectors.toList());
	System.out.println(result);
}
}
