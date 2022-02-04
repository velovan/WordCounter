package Count;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[]args){
		
	   countWord("resources/foo.txt");
	}
	
	public static void countWord(String fileName){
		
 	   try{
	         File f = new File(fileName);
	         ArrayList arr = new ArrayList();
	         HashMap<String, Integer> listOfWords = new HashMap<String, Integer>(); 
	         Scanner in = new Scanner(f);
	         int i = 0;
	        while(in.hasNext()){
	         String s = in.next().toLowerCase(); 
	         arr.add(s);
	        }
	         Iterator itr = arr.iterator();
	        while(itr.hasNext()){
	     	 i++;
	         listOfWords.put((String) itr.next(), i); 
	        }
	         Set<Object> uniqueValues = new HashSet<Object>(listOfWords.values()); 
	         System.out.println("The number of unique words: " + uniqueValues.size());
 	  } catch (FileNotFoundException ex) {
          System.out.println("Unable to open file !!!'" + fileName + "'");
      } catch (IOException ex) {
          System.out.println("Error reading file !!!'" + fileName + "'");
      }
   }
	
}
