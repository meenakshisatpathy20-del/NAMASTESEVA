package strategies;

public class NetBankingPayment
        implements PaymentStrategy {

    private String bankName;

    public NetBankingPayment(
            String bankName) {

        this.bankName = bankName;
    }

    @Override
    public void pay(
            double amount) {

        System.out.println(
                "Paid ₹" +
                amount +
                " using Net Banking : " +
                bankName
        );
    }
}