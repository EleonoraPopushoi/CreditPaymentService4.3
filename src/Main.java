public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float creditmoney = 1_000_000;
        float percentagerate = 0.008F;
        long limitperiod1 = 12;
        long limitperiod2 = 24;
        long limitperiod3 = 36;



        float Paymentservice1 = service.calculate(creditmoney = 1_000_000, percentagerate = 0.008F, limitperiod1 = 12);
        System.out.println(Paymentservice1);

        float Paymentservice2 = service.calculate(creditmoney = 1_000_000, percentagerate = 0.008F, limitperiod2 = 24);
        System.out.println(Paymentservice2);

        float Paymentservice3 = service.calculate(creditmoney = 1_000_000, percentagerate = 0.008F, limitperiod3 = 36);
        System.out.println(Paymentservice3);

    }

}



