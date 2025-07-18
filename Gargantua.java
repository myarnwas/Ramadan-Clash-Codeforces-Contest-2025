import java.util.Scanner;

public class Gargantua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // قراءة المدخلات
        int A = sc.nextInt(); // عمر ليو قبل السفر
        int X = sc.nextInt(); // عامل تباطؤ الزمن
        int Y = sc.nextInt(); // عدد سنوات إيما على ميلر

        // حساب عمر ليو عند عودة إيما
        int leoAge = A + (X * Y);

        // طباعة النتيجة
        System.out.println(leoAge);
    }
}
