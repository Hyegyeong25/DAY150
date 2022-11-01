public class D221101 {
    public static void main(String[] args) {
        int[] numbers = {101, 27, 31, 1, 100, 100};
        System.out.println(solution(numbers));
    }
    public static int solution(int[] numbers) {

        int max1 = numbers[0], max2 = numbers[1];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max1){
                max2 = max1;
                max1 = numbers[i];
            } else if(numbers[i] > max2){
                max2 = numbers[i];
            }
        }
        int answer = max1 * max2;
        System.out.printf("%d * %d = %d \n", max1, max2, answer);
        return answer;
    }
}
