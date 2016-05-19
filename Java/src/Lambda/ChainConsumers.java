package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*
 * 4th
 */
public class ChainConsumers {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("one","two","three","four","five");
		List<String> result = new ArrayList<String>();
		
		//Consumer<String> c1 = s -> System.out.println(s);  or 
		Consumer<String> c1 = System.out::println;
		
		//Consumer<String> c2 = s -> result.add(s); or 
		Consumer<String> c2 = result::add;
		
		
		//strings.forEach(c1); 
		System.out.println("Size of results list = " +result.size());
		
		strings.forEach(c1.andThen(c2));
		
		System.out.println("After foreach Size of results list = " +result.size());
	}
}
