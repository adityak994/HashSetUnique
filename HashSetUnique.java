import java.util.HashSet;

public class HashSetUnique {

    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add unique values to the set
        numbers.add(4);

        numbers.add(7);

        numbers.add(91);

        numbers.add(8);

        numbers.add(52);

        numbers.add(4);

        numbers.add(91);

        System.out.println("Unique stored numbers are " + numbers);

    }
}
