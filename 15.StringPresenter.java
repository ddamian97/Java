package Lambdas;

public class StringPresenter {

	private static String [] tab = {"asdsadads", "dasdsadassa", "ojopjpojpo", "oiuytretyuio"};  
	public static void main(String[] args) {
		
		showStrings(x->x);
		System.out.println();
		showStrings(x->x.toUpperCase());
		System.out.println();
		showStrings(x->x.substring(0, 5).toUpperCase());
		
	}
	
	private static void showStrings(StringManipulator sm) {
		for(String s: tab) {
			System.out.println(sm.manipulate(s));
		}
	}
	
}


@FunctionalInterface
interface StringManipulator{
	String manipulate(String s);
}
