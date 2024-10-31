

class FlagSemafor extends AlatKomunikasi {
    private String color;

    public FlagSemafor(String brand, String color) {
        super(brand);
        this.color = color;
    }

    @Override
    public void displayInfo() {
       System.out.println("Ini flag ");
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return this.color;
    }

    
}