import java.util.Scanner;

public class D221024 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); //양꼬치
        int k = s.nextInt(); //음료수

        // 1인분 = 12000, 음료 = 2000
        int service = n/10;
        int res = (n*12000)+(k*2000)-(service*2000);
        System.out.println(res);


    }
}
