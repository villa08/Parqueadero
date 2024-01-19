public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 2.5);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("XYZ789", "Honda", "Civic");

        parqueadero.parquearCarro(carro1, 0, 0);
        parqueadero.parquearCarro(carro2, 2, 5);

        // Intentar estacionar en un espacio ocupado
        Carro carro3 = new Carro("DEF456", "Ford", "Focus");
        parqueadero.parquearCarro(carro3, 0, 0);

        // Calcular costo por tiempo
        System.out.println("Costo por tiempo para " + carro1.getPlaca() + ": $" + parqueadero.cobrarPorTiempo(carro1, 3));
        System.out.println("Costo por tiempo para " + carro2.getPlaca() + ": $" + parqueadero.cobrarPorTiempo(carro2, 2));

        // Mostrar estado del parqueadero
        System.out.println("\nEstado del Parqueadero:");
        parqueadero.mostrarEstadoParqueadero();
    }
}