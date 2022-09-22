import java.util.Scanner;

public class D220922 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int N = s.nextInt();
        //String[] array = new String[N];
        String word = null;
        int[] alphabet = new int[30];
        int chk2 = 0;

        int[] group = new int[30]; // 그룹 번호 체크 (승인: 1, 제외 : -1, 그 외 : 0)

        for (int i = 0; i < N; i++) {
            System.out.print("단어 입력 : ");
            word = s.next();
            /** 그룹 단어 체크 */
            for (int j = 0; j < word.length(); j++) {
                int chk = word.charAt(j)-97;
                System.out.println("chk : "+chk);
                if(group[chk] != -1){
                    group[chk]+=1; // 그룹단어
                
                    if(j == word.length()-1) //라스트 단어
                        chk2 = -1;
                    else
                        chk2 = Integer.parseInt(String.valueOf(word.charAt(j+1)));

                    if(chk != chk2) {
                        alphabet[chk] += 1;
                    }

                    if(alphabet[chk] >= 2)
                        group[chk]+= -1; // 그룹 단어 제외
                }
            }
        }

        for (int i = 0; i < group.length; i++) {
            System.out.println("i : "+group[i]);
        }
    }
}
