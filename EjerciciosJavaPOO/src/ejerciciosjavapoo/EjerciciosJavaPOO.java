package ejerciciosjavapoo;

public class EjerciciosJavaPOO {
    public static void main(String[] args) {
        Sala sala = new Sala(10);
        Reserva reserva = new Reserva();
        System.out.println("Bienvenido a la sala vip de CineCraft de Colombia elige tu asiento por favor");

        while (sala.hayDisponibilidad()) {
            boolean continuar = reserva.realizarReserva(sala);
            if (!continuar) {
                break;
            }
        }
        System.out.println("Tenkius");
    }
}
