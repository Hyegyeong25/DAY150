public class D221103 {
    public static void main(String[] args) {
        int money = 15000;
        System.out.println(solution(money)[0]+","+solution(money)[1]);
    }
    public static int[] solution(int money) {
        int[] answer = {money / 5500, money % 5500};
        return answer;
    }
}
