import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // قراءة عدد الحالات
        scanner.nextLine(); // لتفادي مشكلة القراءة بعد nextInt
        
        while (t-- > 0) {
            String s = scanner.nextLine(); // قراءة السلسلة
            // تحويل السلسلة إلى أحرف كبيرة والتحقق إذا كانت تساوي "YES"
            if (s.toUpperCase().equals("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
