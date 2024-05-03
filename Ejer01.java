class Ejer01 {
    public static void main(String[] args) {
        var principal = 0;
        var rates = 0.0; // Citar variables primero
        var duration = 0;
        var finAmount = 0.0;

        Console.writeLine("Ingrese el dato principal");
        principal = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la tasa anual");
        rates = Double.parseDouble(Console.readLine()); // Mostrar en pantalla el texto,mostrar variable y tomar info
        Console.writeLine("Ingrese la duracion en años");
        duration = Integer.parseInt(Console.readLine());
        finAmount = principal * Math.pow(1 + rates / 100, duration); // cod para elevar
        Console.writeLine("El monto final es: %f", finAmount); // %f:decimales,%s: cadenas texto,%d: enteros

    }
}