import java.util.Comparator;

public class CompareExample {

    public static void main(String[] args) {
        Comparator<Integer> Digit = new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j) {
                if (i > j) {
                    return 1;
                } else if (i < j) {
                    return -1;
                } else {
                    return 0; 
                }
            }
        };

        int value1 = 9;
        int value2 = 1;
        int result = Digit.compare(value1, value2);
        System.out.println("Comparison result: " + result);
    }
}
