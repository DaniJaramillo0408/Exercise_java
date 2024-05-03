
class Trabajo05 {
    public static void main(String[] args) {
        var edad = 0;
        Console.writeLine("Ingrese la edad");
        edad = Integer.parseInt(Console.readLine());
        if (edad <= 12) {
            Console.writeLine("Es aplicable para el descuento del 50 porciento");
        } else if ((edad > 12) && (edad < 18)) {
            Console.writeLine("Es aplicable para el descuento del 25 porciento");

        } else {
            Console.writeLine("No es aplicable");
        }
    }

}
