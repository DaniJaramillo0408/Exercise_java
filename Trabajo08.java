class Trabajo08 {
    public static void main(String[] args) {
        var num1 = 0;
        var num2 = 0;
        var num3 = 0;
        Console.writeLine("Ingrese el primer numero(Entero)");
        num1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el segundo numero(Entero)");
        num2 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el tercero numero(Entero)");
        num3 = Integer.parseInt(Console.readLine());
        if (num1 >= num2 && num1 >= num3) {
            Console.writeLine("El numero mayor es:" + num1);

        } else if (num2 > num1 && num2 > num3) {
            Console.writeLine("El numero mayor es:" + num2);

        }else 
        Console.writeLine("El numero mayor es:" + num3);
        
    }

}
