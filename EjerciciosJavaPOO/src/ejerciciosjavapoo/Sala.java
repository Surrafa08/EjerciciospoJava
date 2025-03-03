package ejerciciosjavapoo;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    private int capacidadTotal;
    private int asientosOcupados;
    private ArrayList<Integer> asientosReservados;
    private Scanner scanner;

    public Sala(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.asientosOcupados = 0;
        this.asientosReservados = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public boolean hayDisponibilidad() {
        return asientosOcupados < capacidadTotal;
    }

    public void reservarAsiento() {
        if (hayDisponibilidad()) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            int numeroAsiento; 
            while (true) {
                System.out.print("Ingrese el numero de asiento que desea reservar: ");
                numeroAsiento = scanner.nextInt();
                scanner.nextLine();
                if (numeroAsiento < 1 || numeroAsiento > capacidadTotal) {
                    System.out.println("Numero de asiento invalido. Intente de nuevo.");
                } else if (asientosReservados.contains(numeroAsiento)) {
                    System.out.println("El asiento " + numeroAsiento + " ya esta ocupado. Elige otro.");
                } else {
                    break;
                }
            }
            Usuario user = new Usuario(nombre, numeroAsiento); 
            user.sentarse();
            user.mostrarInfo();
            asientosReservados.add(numeroAsiento);
            asientosOcupados++;
            System.out.println("Reserva confirmada. Asientos ocupados: " + asientosOcupados + "/" + capacidadTotal);
        } else {
            System.out.println("No hay asientos disponibles.");
        }
    }
}
