package MyFirstProgram;

public class print {

	public static void main(String[] args) {
		
		//printf() = an optional method to control,format,and display text to console window 
		//           two argument = format string + (object/ variable/value)
		//           %d [flags] [precesion] [width] [convential-character]
		
		boolean myBoolean = true; 
		char myChar ='@';
		String myString = "Bro";
		int myInt =	50;
		double myDouble = 1000;
		
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);  // this is for int %d 
		System.out.printf("%f",myDouble); // this is for double %f 
		
        System.out.printf("%d 	This is format String",123);
        
        //min num output of characters to be written as output 
        System.out.printf("Hello %10s",myString); // spacing 10 chara  can negative or postive
        
        //[precision]
        //sets num of digits of precision when outputting floating-point value 
        System.out.printf(" You have this much money %f" ,myDouble);
        System.out.printf(" You have this much money %+f" ,myDouble);
        System.out.printf(" You have this much money %,f" ,myDouble);
        
	}

}
