class Trabajo11 {
    public static void main(String[] args) {
        var numNor = 0;
        var numRom = "";
        var umil = 0;
        var decenas = 0;
        var centenas = 0;
        var unidades = 0;
        var res = 0;
        var res2 = 0;
        Console.writeLine("Ingrese el numero que desea transformar a numero romano(entre 1 y 3.999 )");
        numNor = Integer.parseInt(Console.readLine());

        umil = numNor / 1000;
        if (umil == 1) {
            numRom = numRom + "M";
        } else if (umil == 2) {
            numRom = numRom + "MM";
        } else if (umil == 3) {
            numRom = numRom + "MMM";
        }

        res = numNor % 1000;
        centenas = res / 100;
        if (centenas == 1) {
            numRom = numRom + "C";
        } else if (centenas == 2) {
            numRom = numRom + "CC";
        } else if (centenas == 3) {
            numRom = numRom + "CCC";
        } else if (centenas == 4) {
            numRom = numRom + "CD";
        } else if (centenas == 5) {
            numRom = numRom + "D";
        } else if (centenas == 6) {
            numRom = numRom + "DC";
        } else if (centenas == 7) {
            numRom = numRom + "DCC";
        } else if (centenas == 8) {
            numRom = numRom + "DCCC";
        } else if (centenas == 9) {
            numRom = numRom + "CM";
        }

        res2 = numNor % 100;
        decenas = res2 / 10;
        if (decenas == 1) {
            numRom = numRom + "X";
        } else if (decenas == 2) {
            numRom = numRom + "XX";
        } else if (decenas == 3) {
            numRom = numRom + "XXX";
        } else if (decenas == 4) {
            numRom = numRom + "XL";
        } else if (decenas == 5) {
            numRom = numRom + "L";
        } else if (decenas == 6) {
            numRom = numRom + "LX";
        } else if (decenas == 7) {
            numRom = numRom + "LXX";
        } else if (decenas == 8) {
            numRom = numRom + "LXXX";
        } else if (decenas == 9) {
            numRom = numRom + "XC";
        }

        unidades = numNor % 10;
        if (unidades == 1) {
            numRom = numRom + "I";
        } else if (unidades == 2) {
            numRom = numRom + "II";
        } else if (unidades == 3) {
            numRom = numRom + "III";
        } else if (unidades == 4) {
            numRom = numRom + "IV";
        } else if (unidades == 5) {
            numRom = numRom + "V";
        } else if (unidades == 6) {
            numRom = numRom + "VI";
        } else if (unidades == 7) {
            numRom = numRom + "VII";
        } else if (unidades == 8) {
            numRom = numRom + "VIII";
        } else if (unidades == 9) {
            numRom = numRom + "IX";
        }

        Console.writeLine("El numero romano es: %s", numRom);
    }
}
