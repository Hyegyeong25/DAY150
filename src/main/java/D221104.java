public class D221104 {
    public static void main(String[] args) {
        int n = 123045;
        String N = n+"";
        int answer = 0;
        for (int i = 0; i < N.length(); i++) {
            answer += Integer.parseInt(String.valueOf(N.charAt(i)));
        }

        System.out.println(answer);
    }
}
