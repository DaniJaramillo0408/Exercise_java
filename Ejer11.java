class Ejer11 {
    public static void main(String[] args) {
        var edad = 0;
        Console.writeLine("Ingrese la edad");
        edad = Integer.parseInt(Console.readLine());
        if (edad > 60) {
            Console.writeLine("Se le aplica el descuento");
        } else {
            Console.writeLine("No se le aplica el decuento");
        }

    }

}
