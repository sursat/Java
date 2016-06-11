package Lambda;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * 3rd
 */
public class ComparatorLambda {

	public static void main(String[] args) {
		
		Comparator<String> comp = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		
		//Lambda expression
		Comparator<String> compLambda = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());  
		
		
		
		List<String> list = Arrays.asList("$$$","$$","$","$$$$");
		Collections.sort(list, comp);
		
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n\n");
		List<String> listLambda = Arrays.asList("$$$","$$","$","$$$$");
		Collections.sort(listLambda, compLambda);
		
		for (String s : listLambda) {
			System.out.println(s);
		}
	}
}
