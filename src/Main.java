public class Main {
    public static void main(String[] args) {
        HiloSimple hSimple = new HiloSimple();
        hSimple.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Fuera del hilo...");
        }
    }
}