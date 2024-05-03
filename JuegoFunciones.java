class JuegoFunciones extends Terminal {
    public static void main(String[] args) {
        // en vez de poner int y cada variable se hizo este recorte de codigo para citar las variables y cambiarlas directamente de la funcion/* */
        while (true) {
            printLine("Ingrese los dos numero a comparar en su orden respectivo");
            //try catch para manejo de errores en el ingreso de datos por parte del usuario
            try {
                sumar(Integer.parseInt(readLine()), Integer.parseInt(readLine())); 
                break;
            } catch (Exception err) {
                printLine("este es tu error %s", err);
            }
        }
    }

    static void sumar(int a, int b) {
        if (a < b) {

            while (isTrue(a, b)) {// se evalua el valor booleano y entra el ciclo porque es true, y hasta no
                                  // cambias a false no sale
                a += 1;
            }
            printLine("El numero %d ya es mayor a %d", a, b);
        } else {
            printLine("%d Ya era mayor a %d", a, b);
        }
    }

    static boolean isTrue(int a, int b) {
        return (a <= b);
    }
}