class Dadoshasta100 extends Terminal {
    public static void main(String[] args) {
        var siono = "";
        var turno1 = 0;
        var win = false;
        var totalHumano = 0;
        var totalMaquina = 0;
        var usuario = "";

        printLine("Ingrese el nombre del jugador");
        usuario = scanLine();
        while (win = true) {
            var dado1 = (int) (1 + Math.random() * 6);
            var dado2 = (int) (1 + Math.random() * 6);

            if (turno1 == 0) {
                printLine("Turno de la Maquina");
                dado1 = (int) (1 + Math.random() * 6);
                dado2 = (int) (1 + Math.random() * 6);
                printLine("Los resultados son: %d ,%d ", dado1, dado2);

                if (dado1 == 1 || dado2 == 1) {
                    dado1 = 0;
                    dado2 = 0;
                    printLine("No me quiero salir >:c");
                    turno1 = 0;
                }
                if (dado1 == 1 && dado2 == 1) {
                    totalMaquina = 0;
                    printLine("No me quiero salir >:c");
                    turno1 = 0;
                } else {
                    totalMaquina += dado1 + dado2;
                }
                turno1 = 1;
                
                printLine("Llevas %d puntos", totalMaquina);

            }
            if (turno1 == 1) {
                printLine("Turno de: %s", usuario);
                dado1 = (int) (1 + Math.random() * 6);
                dado2 = (int) (1 + Math.random() * 6);
                printLine("Los resultados son: %d ,%d ", dado1, dado2);
                if (dado1 == 1 || dado2 == 1) {
                    dado1 = 0;
                    dado2 = 0;
                }
                if (dado1 == 1 && dado2 == 1) {
                    totalHumano = 0;
                } else {
                    totalHumano += dado1 + dado2;

                }

                if (turno1 == 1) {
                    printLine("¿Quiere continuar lanzando los dados?(Si o No)");
                    siono = scanLine().toUpperCase();
                    if (siono == "SI") {
                        turno1 = 1;
                    } else if (siono == "NO") {
                        turno1 = 0;
                    } else {
                        printLine("Ponga bien el dato gran mk");
                    }
                }
                
                printLine("Llevas %d puntos", totalHumano);

            }
            if (totalMaquina == 100 || totalHumano == 100) {
                win = true;

            }

        }

        if (totalMaquina == 100) {
            printLine("Gano la maquina, ni pa eso servis");
        } else
            ;
        printLine("Gano: %s", usuario);

    }
}
