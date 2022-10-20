import java.util.Scanner;

public class D221020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = n / 2;
        int b = n % 2;
        String subak = "수박";
        String su = "수";
        String answer = "";

        for (int i = 0; i < a; i++) answer += subak;
        if(b!=0) answer += su;
        System.out.println(answer);
    }
}
