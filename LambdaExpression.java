package Lambda.Expression.practice;
import java.util.ArrayList;
import java.util.List;
public class LambdaExpression {
	
        public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> inte = new ArrayList<Integer>();
		inte.add(12);
		inte.add(23);
		inte.add(42);
		inte.add(33);
		inte.add(80);
		System.out.println("the numbers are "+inte);
		System.out.println("even numbers are:");
		inte.stream().filter(n -> n%2==0).forEach(System.out::println);
		System.out.println("\nodd numbers are:");
		inte.stream().filter(n -> n%2!=0).forEach(System.out::println);
		
	}	
}
