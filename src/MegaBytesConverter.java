public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int resultMb = kiloBytes / 1024;
            int restKb = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    resultMb + " MB and " +
                    restKb + " KB");

        } else System.out.println("Invalid Value");
    }
}
