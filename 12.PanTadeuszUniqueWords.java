import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Set<String> zbior = new HashSet<>();
		String [] wykluczone = {" ", "," , "." , "/" , ":" , ";" , "<" , ">", "?", "!", "\"", "\n", "(", ")", "-", "“", "—",
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "[", "]", "{", "}", "_", "‘",
				};

		int i=0;
        System.out.println(System.getProperty("user.dir"));
        try {
            File infile = new File("Pan Tadeusz.txt");
            Scanner sc = new Scanner(infile);
            Scanner sc1 = new Scanner(infile);
            
//            while(sc1.hasNext()) {
//            	
//            	System.out.println(sc.next());
//            }

            

            while (sc.hasNext()) {
                String tmp = sc.next();
                
                for(int j=0; j<wykluczone.length; j++) {
                	if(tmp.contains(wykluczone[j])) {
                    	tmp = tmp.replace(wykluczone[j], "");
                    }
                	
                	if(tmp.endsWith("’")) {
                		tmp = tmp.replace("’", "");
                	}
                	
                	if(tmp.endsWith("”")) {
                		tmp = tmp.replace("”", "");
                	}
                	
                	
                }
                tmp = tmp.toUpperCase();
                
                zbior.add(tmp);
            }

            sc.close();

    		Iterator <String> it = zbior.iterator();

    		while(it.hasNext()) {
        		System.out.println(it.next());
    			i++;
    		}
    		System.out.println(i);

    		
    		


        } catch(FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        }
	}

}
