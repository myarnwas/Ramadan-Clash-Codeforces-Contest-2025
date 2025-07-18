import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // عدد الاختبارات
        StringBuilder sb = new StringBuilder(); // لتجميع النتائج
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            
            // حساب عدد القيم التي تقبل القسمة على m
            long k = n / m;
            
            // حساب المجموع باستخدام الصيغة الرياضية
            long sum = m * k * (k + 1) / 2;
            
            // إضافة النتيجة
            sb.append(sum).append("\n");
        }
        
        // طباعة النتائج
        System.out.print(sb);
    }
}
