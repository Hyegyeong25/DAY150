import java.util.Scanner;

public class D221005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();


        for (int i = 0; i < t; i++) {

            int k = scan.nextInt(); // 1
            int n = scan.nextInt(); // 3
            int[][] people = new int[k+1][n+1];

            for (int j = 0; j < k+1; j++) { // 층
                for (int l = 1; l <= n; l++) { // 호
                    if(j==0 || l==1) { // 0층일때
                        people[j][l] = l;
                    } else {
                        people[j][l] = people[j][l-1]+people[j-1][l];
                    }
                }
            }
            System.out.println(people[k][n]);
        }
    }
}
