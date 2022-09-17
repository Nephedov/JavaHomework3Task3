public class CalcCredit {
    public static int calc(double sum2, double time2, double percent2) {

        double index = percent2 / 12 / 100;                            //вычисление процента для расчетов
        double month = time2 * 12;                                     // перевод лет в месяца
        double exponentiate = Math.pow((1 + index), month);            // промежуточная переменная для моего личного удобства
        double coefficient = index * exponentiate / (exponentiate - 1);// рассчет коэффициента аннуитета
        int payment2 = (int) (coefficient * sum2);                      //расчет ежемесячного платежа

        return payment2;

    }
}
