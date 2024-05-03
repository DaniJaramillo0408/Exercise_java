class Ejer19 {
    public static void main(String[] args) {
        var nota1 = 0.0;
        var notaNec = 0.0;
        Console.writeLine("Ingrese la nota");
        nota1 = Float.parseFloat(Console.readLine());
        notaNec = (60 * 5) / 100;
        if (nota1 >= notaNec) {
            Console.writeLine("Aprueba");
        } else {
            Console.writeLine("No aprueba");
        }

    }

}
