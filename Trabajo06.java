class Trabajo06 {
    public static void main(String[] args) {
        var salario = 0;
        var impuest = 0.0;
        var precfin = 0.0;
        Console.writeLine("Ingrese su salario anual");
        salario = Integer.parseInt(Console.readLine());
        if (salario <= 10000) {
            Console.writeLine("No se aplica impuesto");
        } else if ((salario > 10001) && (salario < 50000)) {
            impuest = salario * 0.1;
            precfin = salario - impuest;
            Console.writeLine("El salario actual con impuesto es:%f", precfin);
        } else if (salario > 50000) {
            impuest = salario * 0.2;
            precfin = salario - impuest;
            Console.writeLine("El salario actual con impuesto es:%f", precfin);
        }
    }

}
