class Trabajo02 {
    public static void main(String[] args) {
        var precioArt = 0;
        var categ = '?';
        var precioFin = 0f;

        Console.writeLine("Ingrese la categoria (A,B,C)");
        categ = Console.readLine().toUpperCase().charAt(0);
        Console.writeLine("Ingrese el precio del articulo");
        precioArt = Integer.parseInt(Console.readLine());
        if (categ == 'A') {
            precioFin = precioArt * 0.90f;

        } else if (categ == 'B') {
            precioFin = precioArt * 0.80f;

        } else if (categ == 'C') {
            precioFin = precioArt * 0.70f;
        }

        Console.writeLine("El precio del articulo es: %f", precioFin);
    }

}
