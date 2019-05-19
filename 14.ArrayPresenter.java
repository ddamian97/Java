package Lambdas;

public class ArrayPresenter {

	public static void main(String[] args) throws NotSameSizeArraysException {
		int [] tab1 = {1, 2, 3, 4, 5, 6};
		int [] tab2 = {2, 3, 4, 5, 6, 7};
		ArrayPrinter ap = new ArrayPrinter(tab1, tab2);
		
//		ap.printResults(new IntegerManipulator() {
//			
//			@Override
//			public int manipulate(int a, int b) {
//				// TODO Auto-generated method stub
//				return a*b;
//			}
//		});
		
		
		//	wyrazenie lamba ma taka skladnie:
		//	opcjonalne []: [l] * [y] [l] -> x*x
		//	(x,y)->x*y
		//	nie ma informaji o type, bo mamy w manipulate typ. jezeli interfejs sklada sie z jednej metody, to wtedy mozna to robic, bo mamy typ.
		//	
		//	
		
		ap.printResults((x,y)->x*y);
		System.out.println();
		ap.printResults((x,y)->x+y);
		System.out.println();
		ap.printResults((x,y)->(x+y)*10);
		

	}

}

class ArrayPrinter{
	
	int [] tab1, tab2;

	public ArrayPrinter(int[] tab1, int[] tab2) throws NotSameSizeArraysException {
		if(tab1.length!=tab2.length) {
			throw new NotSameSizeArraysException();
		}
		
		this.tab1 = tab1;
		this.tab2 = tab2;
	}
	
	public void printResults(IntegerManipulator im) {
		for(int i=0; i<tab1.length; i++) {
			System.out.println(im.manipulate(tab1[i], tab2[i]));		//	nadal nie wiem jakie to ma byc dzialanie. to dopiero lamba mi powie.
																		// podobnie moge zrobic z klasa naonimowa
			
		}
	}
	
	
	
}


//	adnotacje @Override - to informacja dla nas, ze nasza intencja jest przesloniecie danej metody. kompilator sprawdza czy kompilujac taka metode
//	na prawde przeslaniamy inna metode. Bez tego tez zadziala, ale jak np. zeobie literowke w nazwie, to nie przyslonie danej metody
//	

@FunctionalInterface
interface IntegerManipulator{
	int manipulate(int a, int b);
}


class NotSameSizeArraysException extends Exception{

	public NotSameSizeArraysException() {
		super("Tablice maja rozne rozmiary");
		// TODO Auto-generated constructor stub
	}
	
}