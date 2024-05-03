class Ejer17 {
    public static void main(String[] args) {
        var temAct = 0.0;
        var temLim = 0.0;
        Console.writeLine("Ingrese la temperatura actual del dispositivo");
        temAct = Float.parseFloat(Console.readLine());
        Console.writeLine("Ingrese la temperatura limite del dispositivo");
        temLim = Float.parseFloat(Console.readLine());
        if (temAct > temLim) {
            Console.writeLine("Sobrepasa el limite de temperatura");
        } else {
            Console.writeLine("Nosobrepasa el limite de temperatura");
        }
    }
}
