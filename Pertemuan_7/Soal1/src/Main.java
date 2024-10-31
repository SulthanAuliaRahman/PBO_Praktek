public class Main {
    public static void main(String[] args) {
        Radio myRadio = new Radio("Sony", 101.1);
        Smartphone mySmartphone = new Smartphone("Samsung", "Android");
        FlagSemafor myFlagSemafor = new FlagSemafor("SignalCo", "Red");

        myRadio.displayInfo();
        myRadio.turnOn();
        myRadio.turnOff();

        System.out.println();

        mySmartphone.displayInfo();
        mySmartphone.turnOn();
        mySmartphone.turnOff();

        System.out.println();

        myFlagSemafor.displayInfo();
    }
}
