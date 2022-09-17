import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        Scanner sum = new Scanner(System.in);
        System.out.println("Введите сумму кредита в рублях: ");
        double s = sum.nextDouble();            // ввод суммы кредита

        Scanner time = new Scanner(System.in);
        System.out.println("Введите срок кредита в годах: ");
        double t = time.nextDouble();          // ввод срока кредита.

        Scanner prcent = new Scanner(System.in);
        System.out.println("Введите процент годовых: ");
        double p = prcent.nextDouble();        // При вводе дробного числа, используйте запятую, а не точку.

        CalcCredit num = new CalcCredit();
        int r = num.calc(s, t, p);

        System.out.println("Ваш ежемесячный платеж составит примерно: " + r + " рублей.");
    }
}
