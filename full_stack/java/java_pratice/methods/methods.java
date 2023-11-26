/* methods */ 
 /* method--> syntax
    acces-modifier  static-or-nonstatic return-type method-name(parameters)
    {
     //method body
     return type
    } 
    */

class Bank{
     static int currentBalance =1000;    //variable creation 
    public static void greetcustomer()
   {
        System.out.println("hello how are you welcome");
    }
     //creating 2-methods non-static 1-static
   
     public void desposite(int amount){                 //deposite money(input type and name) 
        currentBalance = currentBalance+amount;        // to current balance we add money and store in currentbalance
       System.out.println("amount is deposited sucessfully");
     }

     public static void withDraw(int amount){        //static method 
        currentBalance = currentBalance-amount;  //withdraw ammount 
         System.out.println("amount is withDraw sucessfully");
     }

     public  int getCurrentBalance(){   //we are returning some value so we give type int
        
        return  currentBalance;

     }

     //main method 
     public static void main(String[] args) {
        Bank bank = new Bank();    //we create a object to call non static method desposite
        greetcustomer();    // customer greeting 
        System.out.println("current balance is :" +  bank.getCurrentBalance()); //before deposit          
        bank.desposite(500); // depositing money accesed by object name
        System.out.println("current balance is :" +  bank.getCurrentBalance());  //afer  deposit  // non static so we accesed with bank object
        withDraw(200); //non static not  accesed by object name
        System.out.println("current balance is :" +  bank.getCurrentBalance());
    }
}

/*method overloading */


class addition {

    public int add(int a, int b){
          return a+b;
    }

    public int add(int a, int b, int c){
          return a+b+c;
    }

     public double add(double a,double b, double c){
          return a+b+c;
    }

    
    class method_overloading{
     public static void main(String[] args) {
        addition sum = new addition();
        int r1 = sum.add(1,2);
        System.out.print(r1);
    }

    }
}