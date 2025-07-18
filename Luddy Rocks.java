 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String target = "LUDDYROCKS";
        
        
        int[] targetCount = new int[26];
        for (char ch : target.toCharArray()) {
            targetCount[ch - 'A']++;
        }
        
        int t = scanner.nextInt(); 
        while (t-- > 0) {
            int n = scanner.nextInt(); 
            String s = scanner.next(); 
            
            int[] sCount = new int[26];
            for (char ch : s.toCharArray()) {
                sCount[ch - 'A']++;
            }
            
            
            boolean canForm = true;
            for (int i = 0; i < 26; i++) {
                if (sCount[i] < targetCount[i]) {
                    canForm = false;
                    break;
                }
            }
            
            System.out.println(canForm ? "YES" : "NO");
        }
        
    }
}
