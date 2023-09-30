import java.util.Scanner;

public class TP02 {

        public static void main(final String[] args) {
        Scanner tp02 = new Scanner(System.in);
        String nama = tp02.nextLine();

        int tahunLahir = tp02.nextInt();
        int tahunSekarang = java.time.Year.now().getValue() - 1;
        int usia = tahunSekarang - tahunLahir;

        System.out.println("Halo, " + nama + ".");
        System.out.println("Ternyata usiamu baru " +  usia + " tahun ya!");
        tp02.close();
    }
}