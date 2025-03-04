package ejercicio5poo;
import java.util.Random;

public class SensorDeMovimiento {
    public static Random random = new Random();
    public static int numeroAleatorio = random.nextInt(2) + 1;
    public static int numerosensor=random.nextInt(2)+1;
    public static String tiempo;
    
    public SensorDeMovimiento(){
        switch (SensorDeMovimiento.numeroAleatorio) {
            case 1:
                SensorDeMovimiento.tiempo="Noche";
                System.out.println("1");
                break;
            case 2:
                SensorDeMovimiento.tiempo="Dia";
                System.out.println("2");
                break;
            default:
                throw new AssertionError();
        }
        SensorDeMovimiento.validarsensor();
    }
    
    public static void validarsensor(){
        int avisos=0;
        for (int i=1;i<=3;i++){
            int numerosensor=random.nextInt(2)+1;
            if (numerosensor==1 && SensorDeMovimiento.tiempo.equals("Noche")){
                System.out.println(".");
                avisos+=1;
            }else if(numerosensor!=1 || !SensorDeMovimiento.tiempo.equals("Noche")){
                System.out.println("No se detecto nada");
            }
        }
        
        if(avisos>=2){
            Alarma.PrenderAlarma();
        }
    }
}