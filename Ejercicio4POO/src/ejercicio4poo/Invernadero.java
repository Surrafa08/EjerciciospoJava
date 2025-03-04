package ejercicio4poo;

public class Invernadero {
    private SensorTemperatura sensor;

    public Invernadero() {
        sensor = new SensorTemperatura();
    }

    public void monitorear() {
        while (true) { 
            double temperatura = sensor.leerTemperatura();
            mostrarTemperatura(temperatura);
            
            if (temperatura < 10) {
                controlarDispositivo("calefactor", true);
            } else if (temperatura > 25) {
                controlarDispositivo("ventilador", true);
            } else {
                controlarDispositivo("calefactor", false);
                controlarDispositivo("ventilador", false);
                mostrarEstadoNormal();
                break; 
            }
            esperar(5000);
        }
    }

    private void mostrarTemperatura(double temperatura) {
        System.out.println("\nTemperatura actual = " + temperatura + "C");
    }

    private void controlarDispositivo(String dispositivo, boolean encender) {
        String estado = encender ? "prendido" : "apagado";
        System.out.println("Estado: " + dispositivo + " " + estado);
    }

    private void mostrarEstadoNormal() {
        System.out.println("Estado: Invernadero normal");
        System.out.println("Invernadero se apagara");
    }

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            System.out.println("Error, pero sigue funcionando");
        }
    }
}
