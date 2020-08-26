//Program to check valid Phone No and Email-id

import java.util.regex.*;
import java.util.*;

public class Regex_Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to validate ? Press '1' for Phone Number, '2' for email-id ");
		int x = sc.nextInt();
		if(x ==1) {
		           System.out.println("Enter the Phone MNumber which you want to validate. Disc It will only tell whether it's a valid phone number or not, can't say the authenticity");
		           String s = sc.next();
		           Pattern p = Pattern.compile("0?[6-9][0-9]{9}");
		           Matcher m = p.matcher(s);
	               if(m.find()&&m.group().equals(s)){
                        System.out.println("This can be a valid Phone Number");
		           }
	              else {
	            	  System.out.print("invalid number");
	               }
		
	             }
		else if(x ==2) {
			           System.out.println("Enter the Phone MNumber which you want to validate. Disc It will only tell whether it's a valid phone number or not, can't say the authenticity");
	                   Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9.-]{1,64}@[a-zA-Z0-9]*[.][a-zA-Z0-9]+");
	                   
	                   String s = sc.next();
	                   Matcher m = p.matcher(s);
	                    
                       if(m.find()&&m.group().equals(s))
                         {
                           System.out.println("Can be a valid email-id");
	                      }
                       else {
         	                  System.out.print("invalid Email");
                           }
			           }
		

}
}
