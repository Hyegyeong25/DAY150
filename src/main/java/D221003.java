import java.util.Scanner;

public class D221003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt(); //test count
        for (int i = 0; i < t; i++) {
            int h = scan.nextInt();
            int w = scan.nextInt();
            int n = scan.nextInt(); //배정받는 순서
            int r1 = 0;
            int r2 = 0;

            if(n % h != 0){
                r1 = n / h + 1; // 방번호
                r2 = n % h; // 층번호
            } else {
                r1 = n / h;
                r2 = h;
            }
            System.out.printf("%d%02d \n", r2, r1);
        }
    }
}
