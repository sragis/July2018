package firstPackage;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*************String Reverse******************//
		String text = "Selenium";
		
		int len = text.length();// use a loop, starting from 0
        String reverse = "";
        for (int i=len-1; i>=0; i--) {
           reverse = reverse + text.charAt(i);
        }                
       System.out.println("******"+reverse+"*******"); // will be printed as muineleS*/
        
        //Strings can be reversed using StringBuffer's reverse property
        StringBuffer buffer = new StringBuffer(text);
        buffer.reverse();
        
        System.out.println("Using String Buffer - "+ buffer);
        
        //************************************************//
        
        //String Immutable
        
        String s1 = "knowledge";
        
        String s2 = s1.concat("base");
        
        System.out.println("current s1 "+ s1);
        
        System.out.println("current s2 "+ s2);

        //************************//
        
        String a="Hi, good morning";
        System.out.println("a 1-->"+a);
        String b=a;
        a="Have a great day!!";
        System.out.println("a 2-->"+a);
        System.out.println("b  -->"+b);
        
        //**************************
        
        String s = "Selenium";
        
        System.out.println("String s = "+ s);
        
        s.concat("With Chrome"); // This will not be saved in s's memory.
        
        s = "Web Driver";
        
        System.out.println("New String s = "+ s);
        
        s = s + " using Java";
        
        System.out.println("Modified String s = "+ s);

        //*************************
        
        //Immutable strings
        
        System.out.println("Immutable - Example");
            String myString = "abcd";
            System.out.println("myString 1-->"+ myString);
            System.out.println("myString 1 address-->"+ myString.hashCode());

            myString = "xyz";
            System.out.println("myString 2-->"+ myString);

            System.out.println("myString 2 address-->"+ myString.hashCode());
        
	
	
	//*************Reading frm scanner***********
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter User : ");
	String username = scanner.nextLine();
	System.out.println("Your username is " + username);
	
	System.out.println("Enter age :");
	int age = scanner.nextInt();
	System.out.println("Your age is " + age);
	
		
	}
	
}


