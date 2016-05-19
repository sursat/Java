package Lambda;
import java.io.File;
import java.io.FileFilter;
/*
 * 1st
 */
public class FirstLambda {

	public static void main(String[] args) {
		//using anonymous class
		FileFilter fileFilter=new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith(".java");
			}
		};
		
		//using Lambda
		FileFilter fileFilterLambda = (File pathname) ->  pathname.getName().endsWith(".java");
		
		File dir = new File("/home/prasad/workspace/Java8/src/");
		File[] files = dir.listFiles(fileFilter);
		for(File file: files){
			System.out.println(file.getName());
		}
		System.out.println("\n\n---using lambda----");
		files = dir.listFiles(fileFilterLambda);
		for(File file: files){
			System.out.println(file.getName());
		}
	}
}
