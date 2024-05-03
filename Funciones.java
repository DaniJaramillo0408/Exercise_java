public class Funciones extends Terminal {
    public static void main(String[] args) {

        var nombre = "";
        var edad = 0;
        printLine("Ingrese su nombre y su edad respectivamente");
        nombre = readLine();
        edad = Integer.parseInt(Console.readLine());
        printLine("Ingrese dos numeros los cuales quiera sumar");
        var a = Integer.parseInt(readLine());
        var b = Integer.parseInt(readLine());

        //saludar(nombre, edad);
        sumar(a, b);
        if (sumar(a , b) == true){
            printLine("La funcion  es god");
        }else
        printLine("si ya entendi");

        

    }

    /*Se tiene que poner en el main para que se ejecute la funcion */

    public static boolean sumar(int a, int b){
       return (a + b == 0);
    }

    static void saludar(String nombre, int edad){
        printLine("Hola %s tu edad es %d", nombre, edad);
    }

}
