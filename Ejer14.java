class Ejer14 {
    public static void main(String[] args) {
        var altPuente = 0.0;
        var altVehiulo = 0.0;

        Console.writeLine("Ingrese la altura del vehiculo");
        altVehiulo = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la altura del puente");
        altPuente = Float.parseFloat(Console.readLine());
        if (altVehiulo < altPuente) {
            Console.writeLine("Puede pasar por el puente");
        } else {
            Console.writeLine("No puede pasar por el puente");
        }

    }

}
