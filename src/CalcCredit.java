public class CalcCredit {
    public static int calc (double sum, double time, double percent){

    double i = percent / 12 / 100;       //вычисление процента для расчетов
    double month = time * 12;            // перевод лет в месяца
    double y = Math.pow((1 + i), month); // промежуточная переменная для моего личного удобства
    double k = i * y / (y - 1);          // рассчет коэффициента аннуитета
    int a = (int) (k * sum);             //расчет ежемесячного платежа

    return a;

    }
}
