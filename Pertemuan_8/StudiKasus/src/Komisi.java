

public class Komisi extends PekerjaLepas {
    private Double Total_sales;
    private Double Commision_Rate;
    private Double Komisi;

    public Komisi (String eName, String eAddress, String ePhone,
                  String socSecNumber, double rate,double Commision_Rate){
      super (eName, eAddress, ePhone, socSecNumber, rate);
      this.Commision_Rate =Commision_Rate;
   }

   public void addSales (double Total_sales){
    this.Total_sales=Total_sales;
   }
   
   @Override
   public double pay(){
        Total_sales=Total_sales*Commision_Rate;
        double payment = super.pay() + Total_sales;
        Total_sales = 0.0;
      return payment;
   }

   @Override
   public String toString()
   {
      String result = super.toString();

      result += "\n Total Sales: " + Total_sales ;

      return result;
   }

}