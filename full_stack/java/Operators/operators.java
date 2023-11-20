class Arithmetic{
    //Arithmetic Operators
    public static void main(String[]args){
        int x = 10;
        int y = 20;
        System.out.println("Adds together two values:"+(x + y));
        System.out.println("Subtracts one value from another:"+(x - y));
        System.out.println("Multiplies two values:"+(x * y));
        System.out.println("Divides one value by another:"+(x / y));
        System.out.println("Returns the division remainder:"+(x % y));
        int a = 10;
        ++a;
        System.out.println("Increases the value of a variable by 1:"+(a));
        int z = 10;
        --z;
        System.out.println("Decreases the value of a variable by 1:"+(z));
    }
}

class Assignment{
    //Assignment operators
    public static void main(String[]args){
        int  a= 5;
        System.out.println(a);
        int b = 5;
         b+= 5;
        System.out.println(b);
        int  c= 5;
         c-= 3;
        System.out.println(c);
        int  d= 5;
         d*= 4;
        System.out.println(d);
        int  e= 5;
         e/= 2;
        System.out.println(e);
        int  f= 5;
         f%= 7;
        System.out.println(f);
        int  g= 5;
         g&=1;
        System.out.println(g);
        int  h= 5;
         h|=2;
        System.out.println(h);
        int i= 5;
          i^=3;
        System.out.println(i);
        int  j= 5;
          j>>=4;
        System.out.println(j);
        int  k= 5;
          k<<=3;
        System.out.println(k);
    }
}

class Comparison{
    //Comparison operators
    public static void main(String[]args){
    int x = 10;
    int y = 12;
    System.out.println(x == y);
    System.out.println(x != y);
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x >= y);
    System.out.println(x <= y);      
    }
}

class Logical{
    //Logical operators
    public static void main(String[]args){
        int a = 10;
        int b = 20;
        if (a>5 && b<30){
            System.out.println("both are true");   //&&	Returns true if both statements are true
        }else
        System.out.println("not satisf"); 
    
        int c = 10;
        int d = 20;
        System.out.println(c>10 || d<20);    // ||  Returns true if one of the statements is true	

        int e = 10;
        int f = 20;
        System.out.println (!(e>10 && f<20));  // !	Reverse the result, returns false if the result is true

    }
}