package Lambdas;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class FileStream {
	public static void main(String[] arg0) {
		System.out.println(System.getProperty("user.home"));
		File f = new File(System.getProperty("user.home")+"/Desktop");
		System.out.println(f.getAbsolutePath());
		File [] files = f.listFiles();
		
		//strumien moge tylko z dynamicznych, a tablica nie jest
		
		List<File> lista = Arrays.asList(files);
		
		//teraz moge z tego strumien zrobic
//		lista.stream().forEach(System.out::println);
		
		lista.stream().filter(f1->f1.isDirectory()).forEach(System.out::println);;	//sprawdzam katalogi i wypisuje
		System.out.println();
		lista.stream().filter(f1->f1.isFile()).forEach(System.out::println);;	//sprawdzam pliki i wypisuje
		System.out.println();
		System.out.println("Wielkosc plikow: "+lista.stream().filter(f1->f1.isFile()).mapToInt(f2->(int)f2.length()/1000).sum()+"kB");	//sprawdzam pliki i wypisuje
		
	}
	
	
}
