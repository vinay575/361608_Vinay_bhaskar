
class A {

    public A(){        //Default constructor
        System.out.println("hello this is default class");
    }
  
    public A(int a){     //Parameterized constructor
        super();
        System.out.println("hello this is another one");
    }

}

public class sup
{
public static void main (String [] args){

    A obj = new A(5);    // when we give parameters it invoke Parameterized constructor
}
}