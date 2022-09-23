import java.util.Scanner;

public class D220923 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caseNo = scan.nextInt();
        int num;
        float[] result = new float[caseNo];
        for (int i = 0; i < caseNo; i++) {
            int total = 0;
            float teamAve;
            int cntStu = 0;

            num = scan.nextInt();
            int[] student = new int[num];
            for (int j = 0; j < num; j++) {
                student[j] = scan.nextInt();
                total += student[j];
            }
            teamAve = (float) total / num;

            /* 팀 평균을 넘은 학생이 몇명인지 구해야함 */
            for (int j = 0; j < num; j++) {
                if(student[j] > teamAve){
                    cntStu += 1;
                }
            }
            result[i] =  (float) cntStu / num * 100;

        }

        for (int i = 0; i < caseNo; i++) {
            System.out.printf("%.3f%% \n", result[i]);
        }
    }
}
