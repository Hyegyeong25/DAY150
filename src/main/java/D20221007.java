import java.util.Scanner;

/**
 * 날짜 : 2022-10-07
 * 시간 : 오후 12:58
 */
public class D20221007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //정수의 갯su
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(sum(a));
    }

    static long sum(int[] a) {

        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}