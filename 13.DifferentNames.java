import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		String tmp="";
		
		Set <String> zbior = new HashSet<>();
	     try {
	            File infile = new File("osoby.txt");
	            Scanner sc = new Scanner(infile);
	            Scanner sc1 = new Scanner(infile);
	            
	            
	            while(sc.hasNextLine()) {
	            	tmp = sc.nextLine();
	            	tmp = tmp.substring(tmp.indexOf(" ")+1, tmp.lastIndexOf(" "));
	            	zbior.add(tmp);
	            	System.out.println(tmp);
	            }
	            
	            
            	System.out.println();
            	System.out.println();
            	int i=0;
	            for(String s: zbior) {
	            	i++;
	            	System.out.println(i+" "+s);
	            	
	            }

	            

	            sc.close();

	

	    		
	    		


	        } catch(FileNotFoundException fnfe) {
	            System.err.println(fnfe.getMessage());
	        }
	}

}
