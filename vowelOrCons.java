* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String testText = "d";
		 if(testText.equalsIgnoreCase("A")||
		 testText.equalsIgnoreCase("E")||
		 testText.equalsIgnoreCase("I")||
		 testText.equalsIgnoreCase("O")||
		 testText.equalsIgnoreCase("U")
		 ){
			 System.out.println("Vowel");
		 }
 		else {
			 System.out.println("Consonant");
		}
	}
}
