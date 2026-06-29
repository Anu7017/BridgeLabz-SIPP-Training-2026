package ScenarioBasedOOPs.Inheritance;

public class Payment {
    public void pay() {
        System.out.println("Payment process");
    }
}

class Upi extends Payment{
    public void scanQR(){
        System.out.println("Scanning QR Code");
    }
}

class MainPayment{
    public static void main() {
        Payment p = new Payment();
        Upi u = new Upi();
        u.scanQR();
        u.pay();
        p.pay();
    }
}