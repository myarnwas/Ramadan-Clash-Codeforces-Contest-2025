import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 

        int[] charCount = new int[26];

        for (char c : input.toCharArray()) {
            charCount[c - 'a']++;
        }

        boolean allOdd = true;
        boolean allEven = true;

        for (int count : charCount) {
            if (count > 0) { 
                if (count % 2 == 0) {
                    allOdd = false;
                } else {
                    allEven = false;
                }
            }
        }

        if (allOdd) {
            System.out.println(1); // odd
        } else if (allEven) {
            System.out.println(0); // even
        } else {
            System.out.println("0/1"); // neither

        }

      
    }
}
