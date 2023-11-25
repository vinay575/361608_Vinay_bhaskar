class conditon{                                  //if else
    public static void main (String[]args){
        int a = 10;
        int b = 20;

        if(a<b && a<=20){
         System.out.println(a+b);
        }
        else
        { System.out.println(a-b);
        
        }
       
       int c = 10;
        int d = 20;

        if(c>d){
         System.out.println(c);
        }
        else

        { 
            System.out.println(d);

        }   
    }
}

class type2{                                 //if else if 
    public static void main(String[]args){
         
         int a = 10;
         int b = 20; 
         int c = 30;

         if (a>b && a>c){
            System.out.println(a);
         }
         else if (b>a || b>c){
            System.out.println(b);
         }
          else 
            System.out.println(c);
    }
}