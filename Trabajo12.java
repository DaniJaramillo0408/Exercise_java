class Trabajo12 {
    public static void main(String[] args) {
        var jug1 = "";
        var jug2 = "";
        var jug3 = "";
        var jug4 = "";
        var jug5 = "";
        var jug6 = "";
        var jug7 = "";
        var jug8 = "";
        var res1 = 0;
        var res2 = 0;
        var res3 = 0;
        var res4 = 0;
        var res5 = 0;
        var res6 = 0;
        var win1 = "";
        var win2 = "";
        var win3 = "";
        var win4 = "";
        var winFin = "";
        var winFin2 = "";

        Console.writeLine("Ingrese el nombre de la jugadora de rank #1");
        jug1 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #2");
        jug2 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #3");
        jug3 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #4");
        jug4 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #5");
        jug5 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #6");
        jug6 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #7");
        jug7 = Console.readLine();
        Console.writeLine("Ingrese el nombre de la jugadora de rank #8");
        jug8 = Console.readLine();

        Console.writeLine("El primer partido es: %s", jug1 + " vs " + jug8);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res2 = Integer.parseInt(Console.readLine());
        if (res1 > res2) {
            Console.writeLine("Ganadora: %s", jug1);
            win1 = jug1;
        } else {

            Console.writeLine("Ganadora: %s", jug8);
            win1 = jug8;
        }

        Console.writeLine("El segundo partido es: %s", jug4 + " vs " + jug5);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res2 = Integer.parseInt(Console.readLine());
        if (res1 > res2) {
            Console.writeLine("Ganadora: %s", jug4);
            win2 = jug4;
        } else {

            Console.writeLine("Ganadora: %s", jug5);
            win2 = jug5;
        }

        Console.writeLine("El tercero partido es: %s", jug6 + " vs " + jug3);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res2 = Integer.parseInt(Console.readLine());
        if (res1 > res2) {
            Console.writeLine("Ganadora: %s", jug6);
            win3 = jug6;
        } else {

            Console.writeLine("Ganadora: %s", jug3);
            win3 = jug3;
        }

        Console.writeLine("El cuarto partido es: %s", jug7 + " vs " + jug2);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res2 = Integer.parseInt(Console.readLine());
        if (res1 > res2) {
            Console.writeLine("Ganadora: %s", jug7);
            win4 = jug7;
        } else {

            Console.writeLine("Ganadora: %s", jug2);
            win4 = jug2;
        }

        Console.writeLine("El primer de la semifinal es: %s", win1 + " vs " + win2);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res3 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res4 = Integer.parseInt(Console.readLine());
        if (res3 > res4) {
            Console.writeLine("Ganadora: %s", win1);
            winFin = win1;

        } else {

            Console.writeLine("Ganadora: %s", win2);
            winFin = win2;
        }

        Console.writeLine("El sengundo partido de la semifinal es: %s", win3 + " vs " + win4);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res3 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res4 = Integer.parseInt(Console.readLine());
        if (res3 > res4) {
            Console.writeLine("Ganadora: %s", win3);
            winFin2 = win3;

        } else {

            Console.writeLine("Ganadora: %s", win4);
            winFin2 = win4;
        }

        Console.writeLine("La final es: %s", winFin + " vs " + winFin2);
        Console.writeLine("Ingrese el resultado de la primera jugadora");
        res5 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el resultado de la segunda jugadora");
        res6 = Integer.parseInt(Console.readLine());
        if (res5 > res6) {
            Console.writeLine("Ganadora: %s", winFin);

        } else {

            Console.writeLine("La Ganadora del torneo es: %s", winFin2);
            
        }

    }

}
