class Ejer05 {
    public static void main(String[] args) {
        var adenina = 0.0;
        var timina = 0.0;
        var citosina = 0.0;
        var guanina = 0.0;
        var porAde = 0.0;
        var porTim = 0.0;
        var porCit = 0.0;
        var porGuan = 0.0;
        var sum = 0.0;
        Console.writeLine("Ingrese la cantidad de Adenina");
        adenina = Double.parseDouble(Console.readLine());
        Console.writeLine("Ingrese la cantidad de Timina");
        timina = Double.parseDouble(Console.readLine());
        Console.writeLine("Ingrese la cantidad de Citosina");
        citosina = Double.parseDouble(Console.readLine());
        Console.writeLine("Ingrese la cantidad de Guanina");
        guanina = Double.parseDouble(Console.readLine());
        sum = adenina + timina + citosina + guanina;
        porAde = adenina / sum * 100;
        porTim = timina / sum * 100;
        porCit = citosina / sum * 100;
        porGuan = guanina / sum * 100;
        Console.writeLine("El porcentaje de composicion de la Adenina es:%f ", porAde);
        Console.writeLine("El porcentaje de composicion de la Timina es:%f ", porTim);
        Console.writeLine("El porcentaje de composicion de la Citosina es:%f", porCit);
        Console.writeLine("El porcentaje de composicion de la Guanina es:%f", porGuan);

    }

}
