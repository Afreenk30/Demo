package demo1;


import java.io.*; 
import java.util.*; 


public class Ascending {
	
	static String directory= "/Untitled/Users/akarikat/Downloads/Javafsd/storage";  	public static void ascendingOrder() { 
	 	 
 	 	File[] files = new File(directory).listFiles();  	 	Set<String> a = new TreeSet<>();  	 	for(File file : files) { 
 	 	 	if (!file.isFile()) { 
 	 	 	 	continue; 
 	 	 	} 
 	 	 	a.add(file.getName()); 
 	 	} 
 	 	a.forEach(i->System.out.println(i)); 
 
 	} 


}
