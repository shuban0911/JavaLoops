
import java.io.*;
import java.util.*;

public class StringSplit {
	
			public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        String[] tokens = s.split("[^\\w,]");
	        System.out.println(tokens.length);
	        for(int i=0;i<tokens.length;i++){
	        System.out.println(tokens[i]);
	        }
	        // Write your code here.
	        scan.close();
	    }
	}



