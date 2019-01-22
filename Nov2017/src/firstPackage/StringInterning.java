package firstPackage;

public class StringInterning {
	
	    public static void main(String[] args) {
	        String s1 = "Test";
	        String s2 = "Test";
	        String s3 = new String("Test");
	        final String s4 = s3.intern();	// .intern() will look in String pool for same object, if so returns the ref of that object
	        								// else creates a new reference. s4 will be in String Constant pool in heap
	        								// s3 is in heap
	        String s5 = new String("Tests");
	        final String s6 = s5.intern();
	        
	        System.out.println(s1 == s2); //true
	        System.out.println(s2 == s3); //false
	        System.out.println(s3 == s4); // false
	        System.out.println(s1 == s3); //false
	        System.out.println(s1 == s4); // true -> s4 looks for same objects in string pool during interning
	        System.out.println(s1.equals(s2)); //true
	        System.out.println(s2.equals(s3)); //true
	        System.out.println(s3.equals(s4));//true
	        System.out.println(s1.equals(s4));//true
	        System.out.println(s1.equals(s3)); //true
	        
	        System.out.println(s1 == s6); //false
	        System.out.println(s5 == s6); // false
	        System.out.println(s1.equals(s6)); //false
	        System.out.println(s5.equals(s3));//false
	    }

	}
/*true
false
false
false
true
true
true
true
true
true
false
false
false
false*/ 
