public class Overloading {

    // **method/function overloading**
    // Compile time Polymorphism

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        
        int a = 3;
        int b = 4;
        int c = 5;
        double a1 = 2.4;
        double b1 = 3.4;
        double c1 = 5.5;

        Overloading j = new Overloading();

        System.out.println(j.add(a, b));
        System.out.println(j.add(a, b, c));
        System.out.println(j.add(a1, b1, c1));
        
    }
}
