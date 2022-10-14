public class MiHilo implements Runnable {
    String nombreHilo;
    MiHilo(String nombre){
        nombreHilo = nombre;
    }
    @Override
    public void run() {
        System.out.println("Comenzando " + nombreHilo);
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("En " + nombreHilo + ", el recuento " + i);
            }
        }catch(InterruptedException exc){
            System.out.println(nombreHilo + " interrumpido");
        }
        System.out.println("Terminado " + nombreHilo);
    }
}
