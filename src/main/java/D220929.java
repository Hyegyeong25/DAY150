import java.util.*;

public class D220929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        // 수 10개를 입력 받아 42로 나눈 나머지를 구하자
        for (int i = 0; i < 10; i++) {
            int n  = scan.nextInt();
            arr.add(n % 42); //42로 나눈 나머지를 담음
        }

        Set<Integer> set = new HashSet<>(arr); // 중복제거

        System.out.println(set.size());
    }
}
