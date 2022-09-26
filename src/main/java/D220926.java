import java.math.BigInteger;
import java.util.Scanner;

public class D220926 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();

        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);

        System.out.println(big1.add(big2));
    }
}