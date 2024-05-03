class Ejer13 {
    public static void main(String[] args) {
        var altAct = 0.0;
        var altNece = 0.0;
        Console.writeLine("Ingrese la altura actual");
        altAct = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la altura requerida");
        altNece = Float.parseFloat(Console.readLine());
        if (altAct > altNece) {
            Console.writeLine("Se le permite el ingreso");

        } else {
            Console.writeLine("No se le permite el ingreso");
        }

    }

}
