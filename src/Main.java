public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000; // 1 млн руб
        int creditPeriodMonthOne = 12; // 1 год
        double percentRate = 9.99; // процентная ставка
        double monthPaymentFirst = (int) service.calculate(credit, creditPeriodMonthOne, percentRate);
        System.out.println("Ежемесячный платеж равен " + (int) monthPaymentFirst + " рублей");

        int creditPeriodMonthTwo = 24; // 2 года
        double monthPaymentSecond = (int) service.calculate(credit, creditPeriodMonthTwo, percentRate);
        System.out.println("Ежемесячный платеж равен " + (int) monthPaymentSecond + " рублей");

        int creditPeriodMonthThree = 36; // 3 года
        double monthPaymentThird = (int) service.calculate(credit, creditPeriodMonthThree, percentRate);
        System.out.println("Ежемесячный платеж равен " + (int) monthPaymentThird + " рублей");
    }
}