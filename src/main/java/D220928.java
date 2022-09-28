import java.util.Scanner;

public class D220928 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 주어진 방 위치
        int line = 1;
        int honeycomb = 1;

        /* 2~7, 8~19, 20~37 등 몇 번째 라인에서 만들어진 벌집인지 구하기 */
        while(N > honeycomb){
            honeycomb = honeycomb + (6*line);
            line++;
        }
        System.out.println(line);
    }
}
