class Ejer15 {
    public static void main(String[] args) {
        var gasVehiculo = 0;
        var gasLim = 0;
        Console.writeLine("Ingrese la emision de gases generada por el vehiculo");
        gasVehiculo = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la emision de gases permitida en la zona");
        gasLim = Integer.parseInt(Console.readLine());
        if (gasVehiculo > gasLim) {
            Console.writeLine("Excede el limite de particulas de la zona");
        } else {
            Console.writeLine("No excede el limite de particulas de la zona");
        }
    }

}
