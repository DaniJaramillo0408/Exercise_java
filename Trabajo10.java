class Trabajo10 {
    public static void main(String[] args) {
        var dia = "";
        var ciudad = "";
        var placa = "";
        var ultimo = '?';
        Console.writeLine("Ingrese la placa del vehiculo ");
        placa = Console.readLine();
        ultimo = placa.charAt(5);
        Console.writeLine("Ingrese el dia de la semana ");
        dia = Console.readLine().toUpperCase();

        if (dia.equals("LUNES") && (ultimo == '0' || ultimo == '1')
                || (dia.equals("MARTES") && (ultimo == '2' || ultimo == '3'))
                || (dia.equals("MIERCOLES") && (ultimo == '4' || ultimo == '5'))
                || (dia.equals("JUEVES") && (ultimo == '6' || ultimo == '7'))
                || (dia.equals("VIERNES") && (ultimo == '8' || ultimo == '9'))) {

            ciudad = "Manizales";

        }
        if (dia.equals("LUNES") && (ultimo == '0' || ultimo == '9')
                || (dia.equals("MARTES") && (ultimo == '1' || ultimo == '8'))
                || (dia.equals("MIERCOLES") && (ultimo == '2' || ultimo == '7'))
                || (dia.equals("JUEVES") && (ultimo == '3' || ultimo == '6'))
                || (dia.equals("VIERNES") && (ultimo == '4' || ultimo == '5'))) {

            ciudad = ciudad + " Pereira";

        }
        if (dia.equals("LUNES") && (ultimo == '8' || ultimo == '9')
                || (dia.equals("MARTES") && (ultimo == '6' || ultimo == '7'))
                || (dia.equals("MIERCOLES") && (ultimo == '4' || ultimo == '5'))
                || (dia.equals("JUEVES") && (ultimo == '2' || ultimo == '3'))
                || (dia.equals("VIERNES") && (ultimo == '0' || ultimo == '1'))) {

            ciudad = ciudad + " Medellin";
        }
        if (dia.equals("LUNES") && (ultimo == '1' || ultimo == '2')
                || (dia.equals("MARTES") && (ultimo == '3' || ultimo == '4'))
                || (dia.equals("MIERCOLES") && (ultimo == '5' || ultimo == '6'))
                || (dia.equals("JUEVES") && (ultimo == '7' || ultimo == '8'))
                || (dia.equals("VIERNES") && (ultimo == '9' || ultimo == '0'))) {

            ciudad = ciudad + " Barranquilla";

        }
        if (dia.equals("LUNES") && (ultimo == '8' || ultimo == '9')
                || (dia.equals("MARTES") && (ultimo == '0' || ultimo == '1'))
                || (dia.equals("MIERCOLES") && (ultimo == '2' || ultimo == '3'))
                || (dia.equals("JUEVES") && (ultimo == '4' || ultimo == '5'))
                || (dia.equals("VIERNES") && (ultimo == '6' || ultimo == '7'))) {

            ciudad = ciudad + " Armenia";
        }
        if (dia.equals("LUNES") && (ultimo == '2' || ultimo == '7')
                || (dia.equals("MARTES") && (ultimo == '3' || ultimo == '8'))
                || (dia.equals("MIERCOLES") && (ultimo == '4' || ultimo == '9'))
                || (dia.equals("JUEVES") && (ultimo == '0' || ultimo == '5'))
                || (dia.equals("VIERNES") && (ultimo == '1' || ultimo == '6'))) {

            ciudad = ciudad + " Bogota";
        }
        if (dia.equals("LUNES") && (ultimo == '3' || ultimo == '4')
                || (dia.equals("MARTES") && (ultimo == '5' || ultimo == '6'))
                || (dia.equals("MIERCOLES") && (ultimo == '7' || ultimo == '8'))
                || (dia.equals("JUEVES") && (ultimo == '9' || ultimo == '0'))
                || (dia.equals("VIERNES") && (ultimo == '1' || ultimo == '2'))) {

            ciudad = ciudad + " Bucaramanga";
        }
        if (dia.equals("LUNES") && (ultimo == '1' || ultimo == '6')
                || (dia.equals("MARTES") && (ultimo == '2' || ultimo == '7'))
                || (dia.equals("MIERCOLES") && (ultimo == '3' || ultimo == '8'))
                || (dia.equals("JUEVES") && (ultimo == '4' || ultimo == '9'))
                || (dia.equals("VIERNES") && (ultimo == '0' || ultimo == '5'))) {

            ciudad = ciudad + " Cartagena";
        }

        Console.writeLine("Las ciudades donde tienes pico y placa son: %s", ciudad);
    }
}
