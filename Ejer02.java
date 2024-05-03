class Ejer02 {
    public static void main(String[] args) {
        var speed = 0.0;
        var accel = 0.0;
        var time = 0.0;
        var dist = 0.0;
        Console.writeLine("Por favor ingrese los datos en el sistema MKS(metro, kilogramo, segundo)");
        Console.writeLine("Ingrese la velocidad inicial");
        speed = Float.parseFloat(Console.readLine()); // Float.parseFloat variable decimal menor
        Console.writeLine("Ingrese la aceleracion");
        accel = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese el tiempo");
        time = Float.parseFloat(Console.readLine());
        dist = speed * time + 0.5 * accel * time * time;
        Console.writeLine("La distancia recorrida es :%f", dist);

    }

}