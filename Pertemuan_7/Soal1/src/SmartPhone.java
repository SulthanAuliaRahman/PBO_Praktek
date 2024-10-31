

class Smartphone extends AlatKomunikasi implements Electronic, Internet {
    private String operatingSystem;

    public Smartphone(String brand, String operatingSystem) {
        super(brand);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        System.out.println("Device: Smartphone, Brand: " + brand + ", OS: " + operatingSystem);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " smartphone ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " smartphone  OFF.");
    }

    @Override
    public void wifi() {
        System.out.println("Coneceted to internet");
    }
}