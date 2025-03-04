package ejercicio6poo;

import java.util.Random;

public class SensorDeLuz {
    public static Random random = new Random();
    public static String mensaje1 = "las luces estan prendidas";
    public static String mensaje2 = "las luces estan apagadas";
    public boolean continuar = true;

    public SensorDeLuz() {
        while (continuar) {
            boolean noche = random.nextBoolean();
            boolean movimi = random.nextBoolean();

            if (noche && movimi) {
                new MostrarInformacion(mensaje1);
            } else {
                new MostrarInformacion(mensaje2);
            }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("botar error");
            }
        }
    }
}