

public class ServicePackage extends PaymentService{
    String Service;
    int Value;

    public String getService() {
        return this.Service;
    }

    public void setService(String Service) {
        this.Service = Service;
    }

    public int getValue() {
        return this.Value;
    }

    public void setValue(int Value) {
        this.Value = Value;
    }
    
}