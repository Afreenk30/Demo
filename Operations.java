package demo1;
import java.io.*;
import java.nio.file.*;
import java.util.*; 
import demo1.App;


public class Operations {


static Scanner sn = new Scanner(System.in);
static String directory = "/Untitled/Users/dsreelek/Downloads/Javafsd/storage";
public static void FileOperations() {
	System.out.println("");
	System.out.println("Press 1 to Add a file"); System.out.println("Press 2 to Delete a file"); System.out.println("Press 3 to Search a file"); System.out.println("Press 4 to go Back to the Main Menu");
	String choice = sn.nextLine(); handle1(choice);
}
public static void handle1(String num) { switch(num) {
case "1":
System.out.println("You selected Add Operation"); add();
break;
case "2":
System.out.println("You selected Delete Operation"); delete();
break;
case "3":
System.out.println("You selected Search Operation"); search();
break; case "4":
	System.out.println("Going Back to Main Menu"); App.main();
	break;
	default:
	System.out.println("Invalid input");
	} FileOperations();
}
private static void search() {
	// TODO Auto-generated method stub
	
}
private static void delete() {
	// TODO Auto-generated method stub
	
}
private static void add() {
	// TODO Auto-generated method stub
	
}
public static void handle11(String num) { switch(num) {
case "1":
System.out.println("You selected Add Operation"); add();
break;
case "2":
System.out.println("You selected Delete Operation"); delete();
break;
case "3":
System.out.println("You selected Search Operation"); search();
break; case "4":
	System.out.println("Going Back to Main Menu"); App.main();
	break;
	default:
	System.out.println("Invalid input");
	} FileOperations();
}
public static void handle111(String num) { switch(num) {
case "1":
System.out.println("You selected Add Operation"); add();
break;
case "2":
System.out.println("You selected Delete Operation"); delete();
break;
case "3":
System.out.println("You selected Search Operation"); search();
break; case "4":
	System.out.println("Going Back to Main Menu"); App.main();
	break;
	default:
	System.out.println("Invalid input");
	} FileOperations();
}
public static void handle(String num) { switch(num) {
case "1":
System.out.println("You selected Add Operation"); add();
break;
case "2":
System.out.println("You selected Delete Operation"); delete();
break;
case "3":
System.out.println("You selected Search Operation"); search();
break; case "4":
	System.out.println("Going Back to Main Menu"); App.main();
	break;
	default:
	System.out.println("Invalid input");
	} FileOperations();
}
}