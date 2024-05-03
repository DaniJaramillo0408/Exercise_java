class Ejer18 {
    public static void main(String[] args) {
        var hora1 = 0.0;
        var hora2 = 0.0;
        Console.writeLine("Ingrese la primera hora");
        hora1 = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la segunda hora");
        hora2 = Float.parseFloat(Console.readLine());
        if (hora1 != hora2) {
            Console.writeLine("Las horas no son las mismas");

        } else {
            Console.writeLine("Las horas son las mismas");
        }
    }

}
