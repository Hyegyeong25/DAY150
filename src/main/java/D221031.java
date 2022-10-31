public class D221031 {
    public static void main(String[] args) {
        int[] ingredient = {1};
        System.out.println(solution(ingredient));
    }
    public static int solution(int[] ingredient) {
        int answer = 0;
        if(ingredient.length > 4){
            for (int i = 0; i < ingredient.length-3; i++) {
                if(ingredient[i] == 1 && ingredient[i+1] == 2 && ingredient[i+2] == 3 && ingredient[i+3] == 1){
                    answer += 1;
                }
            }
        }

        return answer;
    }
}

