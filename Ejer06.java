class Ejer06 {
    public static void main(String[] args) {
        var cost = 0;
        var sale = 0;
        var rev = 0;
        var rev1 = 0;
        Console.writeLine("Ingrese el costo del producto");
        cost = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el precio de venta del producto");
        sale = Integer.parseInt(Console.readLine());
        rev = sale - cost;
        rev1 = rev / cost * 100;
        Console.writeLine("El porcentaje de ganancia del producto es:%d", rev1);
    }

}
