

class Radio extends AlatKomunikasi implements Electronic {
    private double frequency;

    public Radio(String brand, double frequency) {
        super(brand);
        this.frequency = frequency;
    }

    @Override
    public void displayInfo() {
        System.out.println("Device: Radio, Brand: " + brand + ", Frequency: " + frequency + " MHz");
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " radio ON.");
    }

    @Override
    public void turnOff() {
        System.out.println(brand + " radio  OFF.");
    }
}