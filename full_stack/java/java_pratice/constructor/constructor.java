package full_stack.java.java_pratice.constructor;

public class constructor {
    public static void main(String[] args) {
     constructor obj= new  constructor(10);    /*object --constructor*/
     System.out.println(obj);
    }

    public constructor(){
       System.out.println("hello");

    }
     public constructor(int a){
       System.out.println(a);
    }
}
