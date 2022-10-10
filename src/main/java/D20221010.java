import java.util.Scanner;

/**
 * 날짜 : 2022-10-10
 */
public class D20221010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); // test case
        int[] res = new int[t]; // result

        for (int i = 0; i < t; i++) {

            String ox = scan.next();
            int count = 0; // 점수 카운트

            for (int j = 0; j < ox.length(); j++) {
                if(ox.charAt(j) == 'O'){
                    count++;
                    res[i] += count;
                } else {
                    count = 0; //점수 초기화
                }
            }
        }

        for (int i = 0; i < t; i++) {
            System.out.println(res[i]);
        }
    }
}