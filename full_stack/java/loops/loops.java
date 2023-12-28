package full_stack.java.loops;


class Switch{                                //while loop
    public static void main (String [] args){

        int i = 1;
        while(i<=4)
        {
            System.out.println("hi"+i);
            i++;
        }
    }
}
class Switch2{            //inner loop for  while
    public static void main (String [] args){

        int i = 1;
        while(i<=4)
        {                   
            System.out.println("hi"+i);
            int j = 1;               // new variable j 
            while (j<=3) {           //j condition 
                 System.out.println("this is innerloop"+j);
                 j++;
            }                 //next go to outer loop
            i++;
        }
    }
}

//de while loop
class Switch3{
    public static void main (String [] args){
        int i= 0;
        do{
            System.out.println("hi"+i);
            i++;
        }
        while(i<=3);
}
}
  class loop1{
    public static void main (String [] args){

        for (int i=1;i<=7;i++){
            System.out.println("Day"+i);
            for (int j=1;j<=4;j++){
                System.out.println("hi"+(j+1));
            }
        }
    }}
