

public class Status extends Delivery {
    String code,description;

    public Status(String code, String description,int weight, int qunatity, int priceitem) {
        super(description, weight, qunatity, priceitem);
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}