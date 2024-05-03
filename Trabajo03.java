class Trabajo03 {
    public static void main(String[] args) {
        var peso = 0.0;
        var unidad = '?';
        var pesoX = 0.0;
        Console.writeLine("Ingresa la unidad a la que deseas pasar el peso (Gramos,Libras)");
        unidad = Console.readLine().toUpperCase().charAt(0);
        Console.writeLine("Ingrese el peso que desea pasar");
        peso = Float.parseFloat(Console.readLine());

        if (unidad == 'G') {
            pesoX = peso * 1000;

        } else if (unidad == 'L') {
            pesoX = peso * 2.204;

        }
        Console.writeLine("El peso es:%f", pesoX);

    }
}
