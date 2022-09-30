import java.util.Scanner;

public class D220930 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int c = a[i]+b[i];
            System.out.println("Case #"+(i+1)+": "+c);
        }
    }
}
