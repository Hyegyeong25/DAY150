import java.util.Scanner;

public class D220927 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); // 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용
        int b = scan.nextInt(); // 재료비와 인건비 등 총 B만원의 가변 비용
        int c = scan.nextInt(); // 노트북 가격이 C만원
        long i = 1;

        while(true){
            if( (c*i) > (a+b*i) ) {
                break;
            } else if( i > 2100000000 ){
                i = -1;
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
