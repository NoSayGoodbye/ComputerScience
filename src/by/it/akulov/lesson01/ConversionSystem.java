package by.it.akulov.lesson01;

public class ConversionSystem {
    private static void Conversion(byte i) {
        String bin = Integer.toBinaryString(i);
        String oct = Integer.toOctalString(i);
        String hex = Integer.toHexString(i);
        if (bin.length() > 8) {
            bin = bin.substring(bin.length() - 8);
        }
        bin = String.format("%8s", bin).replace(" ", "0");
        oct = String.format("%11s", oct).replace(" ", "0");
        hex = String.format("%8s", hex).replace(" ", "0");
        System.out.printf("| %4d | %8s | %11s | %8s |%n", i, bin, oct, hex);
    }

    public static void main(String[] args) {
        System.out.println("|==========================================|");
        System.out.println("|  DEC |      BIN |         OCT |      HEX |");
        System.out.println("|==========================================|");
        for (byte i = 0; i != -1; i++) {
            Conversion(i);
        }
        // дополнительный вывод -1
        byte i1 = -1;
        Conversion(i1);
        System.out.print("|==========================================|");
    }
}
