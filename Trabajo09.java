class Trabajo09 {
    public static void main(String[] args) {
        var numAzar = 0;
        var num1 = 0;
        numAzar = (int) (1 + Math.random() * 100);
        Console.writeLine("Ingrese el numero");
        num1 = Integer.parseInt(Console.readLine());
        if (num1 == numAzar) {
                Console.writeLine("Acerto el numero");
                } else {
                if (num1 > numAzar) {
                Console.writeLine("Es mayor al numero");
                } else if (num1 < numAzar) {
                Console.writeLine("Es menor al numero");
                }
                num1 = Integer.parseInt(Console.readLine());
        if (num1 == numAzar) {
                Console.writeLine("Acerto el numero");
                } else {
                if (num1 > numAzar) {
                    Console.writeLine("Es mayor al numero");
                } else if (num1 < numAzar) {
                    Console.writeLine("Es menor al numero");
                }
                num1 = Integer.parseInt(Console.readLine());
         if (num1 == numAzar) {
                    Console.writeLine("Acerto el numero");
                } else {
                if (num1 > numAzar) {
                        Console.writeLine("Es mayor al numero");
                } else if (num1 < numAzar) {
                        Console.writeLine("Es menor al numero");
                }

                }
            }
        }
    }
}