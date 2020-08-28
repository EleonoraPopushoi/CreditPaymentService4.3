
public class CreditPaymentService {
    public double calculate(float creditmoney, double percentagerate, int limitperiod) {

        float creditpaymentservice = creditmoney * (percentagerate * (1 + percentagerate) ^ limitperiod / ((1 + percentagerate) ^ limitperiod - 1));
    }
}
