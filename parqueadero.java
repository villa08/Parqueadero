class Parqueadero {
    private Carro[][] espacios;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        espacios = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila >= 0 && fila < espacios.length && columna >= 0 && columna < espacios[0].length) {
            if (espacios[fila][columna] == null) {
                espacios[fila][columna] = carro;
                return true;
            } else {
                System.out.println("El espacio ya está ocupado.");
            }
        } else {
            System.out.println("Ubicación no válida.");
        }
        return false;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (Carro[] fila : espacios) {
            for (Carro carro : fila) {
                if (carro != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
