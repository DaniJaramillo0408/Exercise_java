class Trabajo04 {
    public static void main(String[] args) {
        var month = 0;
        var year = 0;
        Console.writeLine("Ingrese el año");
        year = Integer.parseInt(Console.readLine());
        Console.writeLine("Ingrese el mes");
        month = Integer.parseInt(Console.readLine());

        if (month == 1) {
            Console.writeLine("El mes de enero tiene 31 dias del año %d", year);
        } else if (month == 2) {
            Console.writeLine("El mes de febrero tiene 28 dias del año %d", year);
        } else if (month == 3) {
            Console.writeLine("El mes de marzo tiene 31 dias del año %d", year);
        } else if (month == 4) {
            Console.writeLine("El mes de abril tiene 30 dias del año %d", year);
        } else if (month == 5) {
            Console.writeLine("El mes de mayo tiene 31 dias del año %d", year);
        } else if (month == 6) {
            Console.writeLine("El mes de junio tiene 30 dias del año %d", year);
        } else if (month == 7) {
            Console.writeLine("El mes de julio tiene 31 dias del año %d", year);
        } else if (month == 8) {
            Console.writeLine("El mes de agosto tiene 31 dias del año %d", year);
        } else if (month == 9) {
            Console.writeLine("El mes de septiembre tiene 30 dias del año %d", year);
        } else if (month == 10) {
            Console.writeLine("El mes de octubre tiene 31 dias del año %d", year);
        } else if (month == 11) {
            Console.writeLine("El mes de noviembre tiene 30 dias del año %d", year);
        } else if (month == 12) {
            Console.writeLine("El mes de diciembre tiene 31 dias del año %d", year);
        } else {
            Console.writeLine("DATO NO VALIDO");
        }

    }

}
/*var month=0;
var year=0;
Console.writeLine("Ingrese el año");
year= Integer.parseInt(Console.readLine());
Console.writeLine("Ingrese el mes");
month= Integer.parseInt(Console.readLine());

if (month==1 || month == 3  || month == 5  || month == 7  || month == 8  || month == 10  || month == 12) {
    Console.writeLine("El mes numero  "+ month +"  tiene 31 dias");
}else if (month==4  || month == 6  || month == 9  || month == 11) {
    Console.writeLine("El mes numero  "+ month +"  tiene 30 dias");

}else if (month == 2) {
    Console.writeLine("El mes numero  "+ month +"  tiene 28 dias");

}else
Console.writeLine("NO VALIDO");

}*/