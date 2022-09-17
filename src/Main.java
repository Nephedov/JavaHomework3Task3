import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sum1 = new Scanner(System.in);
        System.out.println("Введите сумму кредита в рублях: ");
        double sum = sum1.nextDouble();            // ввод суммы кредита

        Scanner time1 = new Scanner(System.in);
        System.out.println("Введите срок кредита в годах: ");
        double time = time1.nextDouble();          // ввод срока кредита.

        Scanner prcent1 = new Scanner(System.in);
        System.out.println("Введите процент годовых: ");
        double prcent = prcent1.nextDouble();      // При вводе дробного числа, используйте запятую, а не точку.

        CalcCredit num = new CalcCredit();
        int payment = num.calc(sum, time, prcent);

        System.out.println("Ваш ежемесячный платеж составит примерно: " + payment + " рублей.");
    }
}
