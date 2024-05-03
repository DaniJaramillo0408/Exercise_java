class Trabajo01 {
    public static void main(String[] args) {
        var lad1 = 0;
        var lad2 = 0;
        var lad3 = 0;
        Console.writeLine("Ingrese el valor del primer lado");
        lad1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el valor del segundo lado");
        lad2 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el valor del tercer lado");
        lad3 = Integer.parseInt(Console.readLine());

        if (lad1 == lad2 && lad2 == lad3 )
            Console.writeLine("El triangulo es equilatero");

        else if (lad1 != lad2 && lad2 != lad3 && lad3 != lad1)
            Console.writeLine("El triangulo es escaleno");

        else
            Console.write("Es un tringulo isoseles");

    }

}
