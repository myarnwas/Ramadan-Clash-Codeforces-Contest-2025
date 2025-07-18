import java.util.Scanner;

public class AntonWouldApprove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // قراءة عدد الحالات
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // طول السلسلة
            String s = sc.next(); // السلسلة الثنائية

            // العدّاد للتغييرات
            int changes = 0;

            // المرور على السلسلة لإزالة الأنماط
            for (int i = 0; i < n - 2; i++) {
                // التحقق من الأنماط "101" أو "010"
                if ((s.charAt(i) == '1' && s.charAt(i + 1) == '0' && s.charAt(i + 2) == '1') ||
                    (s.charAt(i) == '0' && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '0')) {
                    changes++; // زيادة عدد التغييرات
                    i += 2; // تجاوز الحروف التي تم التعديل عليها
                }
            }

            // طباعة عدد التغييرات المطلوبة
            System.out.println(changes);
        }
    }
}
