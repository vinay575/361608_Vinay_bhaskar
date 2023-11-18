class Numbers{
    // Integer Types 
    public static void main(String[] args) {
	   byte   a = 123;                        //-->byte can store upto ranging from 0 to 255.
	   short  b =12345;                      //-->short can store upto ranging from -32,767 to 32,767;
	   int    c =2147483647;                //-->int can store upto ranging from  -2,147,483,648 to 2,147,483,647;
       long   d = 9223372036854775807l;    //-->long should end the value with an "L": can store upto ranging from  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807;
	   float  e = 12.123456f;             //-->float should end the value with an "f"
	   double f = 12.123456789012345d;   //-->double should end the value with an "d"
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(d);
	   System.out.println(e);
	   System.out.println(f);
	}
}
   class BooleanExample {
    public static void main(String[] args) {
        boolean isThisVinay = true;             //boolean gives true or false
        boolean isHeNice = false;
        
        System.out.println(isThisVinay);
        System.out.println(isHeNice);
    }
}

class  CharactersExample{
	public static void main(String[]args){
		char thisIsChar='A';                // used to store a single character. with single quotes 'A' or 'c':
		char thisIsAscii=65;                // ASCII values, you can use those to display certain characters
		String thisIsString = "vinay";      //  string used to store a sequence of characters with double "vinay"
		System.out.println(thisIsChar);
		System.out.println(thisIsAscii);
		System.out.println(thisIsString);	
	}
}

	
