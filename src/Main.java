public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float creditmoney = 1_000_000;
        float percentagerate = 0.008F;
        int limitperiod1 = 12;
        int limitperiod2 = 24;
        int limitperiod3 = 36;


        float creditpaymentservice1 = (float) service.calculate(creditmoney = 1_000_000, percentagerate = 0.008F, limitperiod1 = 12);
        System.out.println(creditpaymentservice1);

        float creditpaymentservice2 = (float) service.calculate(creditmoney = 1_000_000, percentagerate = 0.008F, limitperiod2 = 24);
        System.out.println(creditpaymentservice2);

        float creditpaymentservice3 = (float) service.calculate(creditmoney = 1_000_000, percentagerate = 0.008F, limitperiod3 = 36);
        System.out.println(creditpaymentservice3);

    }

}



