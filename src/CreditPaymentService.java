
public class CreditPaymentService {


    public float calculate(float creditmoney, double percentagerate, long limitperiod) {

        double a1 = (1 + percentagerate);
        float b1 = limitperiod;

        
        float creditPaymentservice = (float) ((percentagerate * Math.pow(a1, b1)) / (Math.pow(a1, b1) - 1) * creditmoney);

        return (float) creditPaymentservice;
    }
}
