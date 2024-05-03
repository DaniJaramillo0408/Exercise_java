import java.util.Random;

class NumAleatorio extends Terminal {
    public static void main(String[] args) {
        Random random = new Random();
        var num1 = 0;
        var cont = 1;
        printLine("El juego consiste en adivinar un numero aleatorio, entonces ");
        printLine("Ingrese el numero entre 1 y 15");
        printLine("Tiene 3 intentos");

        int numeroAleatorio = random.nextInt(15) + 1;

        while ((num1 != numeroAleatorio) && (cont <= 3)) {
            num1 = Integer.parseInt(readLine());
            if (num1 < numeroAleatorio) {
                printLine("El numero es mayor");
            } else if (num1 > numeroAleatorio) {
                printLine("El numero es menor");
            }
            printLine("Intento: %d", cont);
            cont += 1;
        }

        if (num1 != numeroAleatorio) {
            printLine("Fallo el numero era %d", numeroAleatorio);
        }else
        printLine("El numero coincide %d con %d", num1, numeroAleatorio);
    }
}
