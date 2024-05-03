class Trabajo13 extends Terminal {
    public static void main(String[] args) {
        var numRom = "";
        var numRomTemp = "";
        var numAra = 0;

        printLine("Ingrese el numero romano entre I y MMMCMXCIX");
        numRom = scanLine().toUpperCase();
        numRomTemp = numRom;

        if (numRomTemp.startsWith("MMM")) {
            numAra = numAra + 3000;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("MM")) {
            numAra = numAra + 2000;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("M")) {
            numAra = numAra + 1000;
            numRomTemp = numRomTemp.substring(1);
        }

        if (numRomTemp.startsWith("CM")) {
            numAra = numAra + 900;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("DCCC")) {
            numAra = numAra + 800;
            numRomTemp = numRomTemp.substring(4);
        } else if (numRomTemp.startsWith("DCC")) {
            numAra = numAra + 700;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("DC")) {
            numAra = numAra + 600;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("D")) {
            numAra = numAra + 500;
            numRomTemp = numRomTemp.substring(1);
        } else if (numRomTemp.startsWith("CD")) {
            numAra = numAra + 400;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("CCC")) {
            numAra = numAra + 300;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("CC")) {
            numAra = numAra + 200;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("C")) {
            numAra = numAra + 100;
            numRomTemp = numRomTemp.substring(1);
        }

        if (numRomTemp.startsWith("XC")) {
            numAra = numAra + 90;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("LXXX")) {
            numAra = numAra + 80;
            numRomTemp = numRomTemp.substring(4);
        } else if (numRomTemp.startsWith("LXX")) {
            numAra = numAra + 70;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("LX")) {
            numAra = numAra + 60;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("L")) {
            numAra = numAra + 50;
            numRomTemp = numRomTemp.substring(1);
        } else if (numRomTemp.startsWith("XL")) {
            numAra = numAra + 40;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("XXX")) {
            numAra = numAra + 30;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("XX")) {
            numAra = numAra + 20;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("X")) {
            numAra = numAra + 10;
            numRomTemp = numRomTemp.substring(1);
        }

        if (numRomTemp.startsWith("IX")) {
            numAra = numAra + 9;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("VIII")) {
            numAra = numAra + 8;
            numRomTemp.substring(4);
        } else if (numRomTemp.startsWith("VII")) {
            numAra = numAra + 7;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("VI")) {
            numAra = numAra + 6;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("V")) {
            numAra = numAra + 5;
            numRomTemp = numRomTemp.substring(1);
        } else if (numRomTemp.startsWith("IV")) {
            numAra = numAra + 4;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("III")) {
            numAra = numAra + 3;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("II")) {
            numAra = numAra + 2;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("I")) {
            numAra = numAra + 1;
            numRomTemp = numRomTemp.substring(1);
        }

        if (numRomTemp.isEmpty()) {
            
            printLine("el numero romano %s en numero arabigo %d", numRom, numAra);

        } else

            printLine("Error al ingresar los datos");

    }

}
