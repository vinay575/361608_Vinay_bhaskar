public class ComparableExample implements Comparable<ComparableExample> {
   
    public int age;

    public ComparableExample(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(ComparableExample o) {
        int ageThis = this.age;
        int ageOther = o.age;

        int ageComparison = Integer.compare(ageThis, ageOther);

        if (ageComparison > 0) {
            return 1;
        } else if (ageComparison < 0) {
            return -1;
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        // Creating instances of Object
        ComparableExample obj1 = new ComparableExample(25);
        ComparableExample obj2 = new ComparableExample(37);

        // Performing comparison
        int result = obj1.compareTo(obj2);

        // Printing the result
        System.out.println("Comparison result: " + result);
    }
}
