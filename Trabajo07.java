class Trabajo07 {
    public static void main(String[] args) {
        var unidades = 0;
        var precio = 0;
        var descuento = 0.0;
        var total = 0.0;
        Console.writeLine("Ingrese el precio del producto");
        precio = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el numero de unidades");
        unidades = Integer.parseInt(Console.readLine());
        if (unidades <= 10) {
            Console.writeLine("No aplica descuento");

        } else if ((unidades >= 11) && (unidades <= 20)) {
            descuento = precio * 0.1;
            total = precio - descuento;
            Console.writeLine("El precio de los productos es:%f", total);
        } else if (unidades > 20) {
            descuento = precio * 0.2;
            total = precio - descuento;
            Console.writeLine("El precio de los productos es:%f", total);
        }
    }

}
