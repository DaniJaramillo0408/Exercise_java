class Ejer03 {
    public static void main(String[] args) {
        var vol = 0.0;
        var rad = 0.0;
        var height = 0.0;

        Console.writeLine("Ingrese el radio de la base");
        rad = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la altura del cilindro");
        height = Float.parseFloat(Console.readLine());
        vol = 3.1416 + (rad * rad) * height;
        Console.writeLine("El volumen del cilindro es:%f", vol);

    }

}
