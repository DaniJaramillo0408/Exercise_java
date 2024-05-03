class Ejer16 {
    public static void main(String[] args) {
        var team1 = 0;
        var team2 = 0;
        Console.writeLine("Ingrese la cantidad de puntos anotados por el primer equipo");
        team1 = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese la cantidad de puntos anotados por el segundo equipo");
        team2 = Integer.parseInt(Console.readLine());
        if (team1 == team2) {
            Console.writeLine("Se va a tiempo extra");
        } else {
            Console.writeLine("No se va a tiempo extra");

        }
    }

}
