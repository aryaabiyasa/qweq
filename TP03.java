import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int T = input.nextInt();

        int jatahPerOrang = N / (T + 1);
        int sisaPermen = N % (T + 1);

        System.out.println(jatahPerOrang);
        System.out.println(sisaPermen);

        input.close();
    }
}