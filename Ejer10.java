class Ejer10 {
    public static void main(String[] args) {
        var edad = 0;
        Console.writeLine("Ingrese la edad");
        edad = Integer.parseInt(Console.readLine());
        if (edad > 18) {
            Console.writeLine("Se le permite el ingreso");
        } else {
            Console.writeLine("No se le permite el ingreso");
        }

    }

}
