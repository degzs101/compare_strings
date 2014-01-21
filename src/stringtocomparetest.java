import java.util.Scanner; // import scanner
public class stringtocomparetest { // setup a new class
	public static void main( String args[] ){
	
	Scanner scan = new Scanner(System.in); // new scanner object
	
	
	
	System.out.print("Enter your first string\n");// enter first string
	String s1 = scan.next(); // give the string the name s1
	System.out.println("Enter your second string"); // enter second
	String s2 = scan.next();
	System.out.println( "You have entered " +  s1  + "  and " + s2 ); // print out both strings

   if (s1.equals(s2)) // if the strings are equal print statement say that they are equal
 	  System.out.println ( "strings " + s1 + " & "  + s2 + " are  equal\n");
 	  else
 		  System.out.println( "strings " + s1 + " & "  + s2 + " are not equal");
	}
// close class and method
}   



