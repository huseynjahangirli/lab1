public class StaticLifetime {

    // static değişken
    static int counter = 0;

    // metot: counter'ı artır ve yazdır
    void incrementCounter() {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) {
        StaticLifetime obj1 = new StaticLifetime();
        StaticLifetime obj2 = new StaticLifetime();

        obj1.incrementCounter(); // Counter: 1
        obj2.incrementCounter(); // Counter: 2 (çünkü static)

    }

}
