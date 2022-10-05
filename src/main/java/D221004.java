import java.util.Scanner;

public class D221004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int line = 1;
        int parent = 1;
        int child = 1;
        int arr = 1;

        while(x > arr){
            line++;
            arr = line+arr;
        }
        if(line % 2 == 0) { //짝수
            child = line;
            parent = 1;
            for (int i = arr; i > x; i--) {
                child--;
                parent++;
            }
        } else {  //홀수
            parent = line;
            child = 1;
            for (int i = arr; i > x; i--) {
                parent--;
                child++;
            }
        }
        System.out.println(child+"/"+parent);
    }
}
