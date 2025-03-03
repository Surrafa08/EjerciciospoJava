package ejerciciosjavapoo;

class Asientos {
    int numeroAsiento;
    boolean ocupado;

    public Asientos(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.ocupado = false;
    }

    public void sentarse() {
        if (!ocupado) {
            ocupado = true;
            System.out.println("Tu asiento te espera " + numeroAsiento);
        } else {
            System.out.println("El asiento " + numeroAsiento + " ya esta ocupado.");
        }
    }
}
