import java.util.Vector;
//capacity of vector increases upon adding new element it increase size to 100%  10->20->40->80
class Vprtc {
    public static void main(String[] args) {

        // Create a Vector of Strings
        Vector<String> v1 = new Vector<>();
        // Add elements to the Vector
        v1.add("Element 1");
        v1.add("Element 2");
        v1.add("Element 3");

        Vector<String> v2 = new Vector<>();
        // Add elements to the Vector
        v2.add("vinay");
        v2.add("Element 2");
      
        
        // Print the Vector elements
        System.out.println(v1); //prints all elements in list 
        System.out.println(v1.size());   //size  of elements present in list 
        System.out.println(v1.capacity()); //prints capacity of Array 
        System.out.println(v1.get(2)); // Retrieval of elements from  the list 
        v1.remove(1); //Deletion of elements from  the list using index 
        v1.remove("Element 1");//Deletion of elements from  the list using object name
        System.out.println(v1); 
        System.out.println(v1.contains("Element 2"));//Verification of elements in the list returns trur or false
        v2.set(1, "teja"); // it replace the valve with the given value with give index
        System.out.println(v2); 
        System.out.println(v2.indexOf("teja"));//to know index 
    }
}

    // ---------- major properties:------
 /*Addition of elements into the list 
      -->v1.addAll(v2);   //here the all values in v2 goes to v1, added after v1 values
      -->v1.addAll(0,v2); // here the v2 values are added before v1
 */
  /* Retrieval of elements from  the list 
      --> System.out.println(v1.get(2)); //we use .get method to get perticular value get takes input index 
  */
  /* Deletion of elements from  the list 
      -->v1.remove(1); //Deletion of elements from  the list using index 
      -->v1.remove("Element 1");//Deletion of elements from  the list using object name
      -->v1.removeAll(v2);//Deletion of elements which are added by v2
      -->v1.clear()//it delets entire list
      */
  /*Verification of elements in the list 
      -->System.out.println(v1.contains("Element 2")) //check weather the specifed element present in list
      -->System.out.println(v1.containsAll(v2)) //check weather if the added list elements are present in list
   */
  /*Updation of elements in the list 
     -->v2.set(1, "vinay"); // it replace the valve with the given value with give index
   */