class Ejer12 {
    public static void main(String[] args) {
        var pesoLim = 0;
        var pesoAct = 0;

        Console.writeLine("Ingrese el peso actual del ascensor");
        pesoAct = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el peso maximo que puede recibir el ascensor");
        pesoLim = Integer.parseInt(Console.readLine());
        if (pesoAct > pesoLim) {
            Console.writeLine("Si excede el limite");
        } else {
            Console.writeLine("No excede el limite");
        }

    }

}
