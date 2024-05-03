class Ejer04 {
    public static void main(String[] args) {
        var not1 = 0.0;
        var por1 = 0.0;
        var not2 = 0.0;
        var por2 = 0.0;
        var not3 = 0.0;
        var por3 = 0.0;
        var pond = 0.0;

        Console.writeLine("Ingrese la primera nota");
        not1 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el porcentaje que vale la primera nota");
        por1 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la segunda nota");
        not2 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el porcentaje que vale la segunda nota");
        por2 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la tercera nota");
        not3 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el porventaje que vale la tercera nota");
        por3 = Float.parseFloat(Console.readLine());
        pond = (((not1 * por1) + (not2 * por2) + (not3 * por3)) / (por1 + por2 + por3));
        Console.writeLine("El promedio ponderado de las notas es:%f ", pond);

    }

}
