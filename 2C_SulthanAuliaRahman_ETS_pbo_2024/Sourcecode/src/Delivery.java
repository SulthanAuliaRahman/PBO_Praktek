

public class Delivery extends PaymentService{
    String name;
    int weight,qunatity,priceitem;

    public Delivery(String name, int weight, int qunatity, int priceitem) {
        this.name = name;
        this.weight = weight;
        this.qunatity = qunatity;
        this.priceitem = priceitem;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQunatity() {
        return this.qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public int getPriceitem() {
        return this.priceitem;
    }

    public void setPriceitem(int priceitem) {
        this.priceitem = priceitem;
    }



}