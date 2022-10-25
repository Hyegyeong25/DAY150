import java.util.Scanner;

public class D221025 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String phone_number = s.next();
        Solution s2 = new Solution();
        System.out.println(s2.solution(phone_number));
    }
}
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String star = "";
        for(int i = 0; i < phone_number.length()-4; i++)
            star += "*";
        answer = star+phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}
