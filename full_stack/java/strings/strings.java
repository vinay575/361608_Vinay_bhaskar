class stg {
    public static void main(String[] args) {
        String greeting = "hello";                            // string
        System.out.println(greeting);
        String a = "vinay";
        String b = "bhaskar";
        System.out.println("Hello " + a + " and " + b);          // concat
        String text = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(text.length());                   // length
        String d = "hello";
        System.out.println(d.toUpperCase());
        System.out.println(d.toLowerCase());               // string upper or lower
        String bol = "hello how are you i am fine";
        System.out.println(bol.indexOf("you"));          // find indexOf
        int x = 10;
        String y = "12";                                  // number and string concat
        System.out.println(x + y);
        String m = "hello\nworld";                       // \n
        System.out.println(m);  
        String q = "hello\tworld";                        // \t
        System.out.println(q);
        String txt = "Hel\blo World!";
        System.out.println(txt);                           // \b
        String firstName = "vinay ";
        String lastName = "chitturi ";
        System.out.println(firstName.concat(lastName)); // concat();
    }
}
