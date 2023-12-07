class stg {
    public static void main(String[] args) {
        // string
        String greeting = "hello";                           
        System.out.println(greeting);
        // charAt   
        String name = "Java";
        char ch=name.charAt(1);                         
        System.out.println(ch); 
        //contains() 
        String aname="Hello how are you ";  
        System.out.println(aname.contains("how"));  
        System.out.println(aname.contains("hi"));    
        //endsWith() 
        String s1="Hello how are you ";  
        System.out.println(s1.endsWith("u"));  
        System.out.println(s1.endsWith("t"));  
        //startsWith() 
        String e1="vinay bhaskar is a good boy";    
        System.out.println(e1.startsWith("vi"));  // true  
        System.out.println(e1.startsWith("vinay"));   // true  
        System.out.println(e1.startsWith("Vinay"));  // false as 'v' and 'V' are different   
        //equals()
        String a1="javatpoint";  
        String a2="javatpoint";  
        String a3="JAVATPOINT";  
        System.out.println(a1.equals(a2));//true because content and case is same  
        System.out.println(a1.equals(a3));//false because case is not same 
        //equalsIgnoreCase() 
        String b1="vinay";  
        String b2="vinay";  
        String b3="VINAY";  
        System.out.println(b1.equalsIgnoreCase(b2));//true because content and case both are same  
        System.out.println(b1.equalsIgnoreCase(b3));//true because case is ignored  
        //isEmpty() 
        String c1="";  
        String c2="vinay";  
        System.out.println(c1.isEmpty());  
        System.out.println(c2.isEmpty());  
        //replace(char old, char new) 
        String d1="Hello this is vinay";  
        String replaceString=d1.replace('i','e');//replaces all occurrences of 'a' to 'e'  
        System.out.println(replaceString); 
        //substring() 
        String f1="vinay";  
        System.out.println(f1.substring(2,4));//returns va  
        System.out.println(f1.substring(2));//returns vatpoint  
        // trim() 
        String g1=" vinay   ";  
        System.out.println(g1+"bhaskar");//without trim()  
        System.out.println(g1.trim()+"bhaskar");//with trim()  
        //valueOf()
        int value=30;  
        String k1=String.valueOf(value);  
        System.out.println(k1);//concatenating string with 10  
        // concat
        String a = "vinay";
        String b = "bhaskar";
        System.out.println("Hello " + a + " and " + b);  
        // length      
        String text = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(text.length());    
         // string upper or lower               
        String d = "hello";
        System.out.println(d.toUpperCase());
        System.out.println(d.toLowerCase());    
        // find indexOf          
        String bol = "hello how are you i am fine";
        System.out.println(bol.indexOf("you"));  
        // number and string concat      
        int x = 10;
        String y = "12";                                
        System.out.println(x + y);
        // \n
        String m = "hello\nworld";                       
        System.out.println(m);  
         // \t
        String q = "hello\tworld";                       
        System.out.println(q);
        // \b
        String txt = "Hel\blo World!";
        System.out.println(txt);  
         // concat();                     
        String firstName = "vinay ";
        String lastName = "chitturi ";
        System.out.println(firstName.concat(lastName));
    }
}
