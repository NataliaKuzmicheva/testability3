public class CreditPaymentService {

    public double calculate(int credit, int creditPeriodMonth, double percentRate) {
        double monthPercent = percentRate / (100 * 12);
        double monthlyPayment = credit * ((monthPercent * Math.pow((1 + monthPercent), creditPeriodMonth))) / (Math.pow((1 + monthPercent), creditPeriodMonth) - 1);
        return monthlyPayment;

    }
}