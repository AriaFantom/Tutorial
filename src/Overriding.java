    // Runtime time Polymorphism
    // Overriding
    
public class Overriding {
    void run() {
        System.out.println("Vechile is running");
    }
}

class Vechile extends Overriding {
  
  void run() {
        System.out.println("Vechile is Stopped");
    }
    public static void main(String[] args) {
        Vechile a = new Vechile();
        a.run();
    }
}