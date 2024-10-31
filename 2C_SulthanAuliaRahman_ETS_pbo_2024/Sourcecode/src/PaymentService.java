

public abstract class PaymentService {
    String payment_status,payment_method;
    String Valid1="qris";
    String Valid2="ovo";
    String Valid3="cash";

    public String getPayment_status() {
        return this.payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getPayment_method() {
        return this.payment_method;
    }

    public void setPayment_method(String payment_method) {
        if (payment_method == Valid1 ) {
            this.payment_method = payment_method;
        }else if (payment_method == Valid2) {
            this.payment_method = payment_method;
        }else if (payment_method == Valid1){
            this.payment_method = payment_method;
        }else
        {
            System.out.println("Pembayaran Tidak valid Coba qris/ovo/cash");
        }
        
    }
    
}