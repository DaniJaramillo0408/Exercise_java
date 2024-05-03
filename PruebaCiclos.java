class PruebaCiclos extends Terminal {
    public static void main(String[] args) {
        var cont = 1;
        var numRepes = 0;
        var suma = 1;
        printLine("Ingrese el limite superior (superior a 1)");
        numRepes = Integer.parseInt(scanLine());
        while (cont <= numRepes * 2) {
            suma *= cont;
            cont += 1;
        }
        printLine("La sumatoria es: %d", suma);
    }
}
