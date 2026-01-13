package TH.AC.SAU;
import java.util.Scanner;

public class Testf {
    public static void main(String[] args) {
        int score;
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ป้อนคะแนน: ");
        score = scanner.nextInt();
        System.out.println("---------------------------");
        result = score >= 50 ? "ผ่าน" : "ไม่ผ่าน";

        System.out.println("ผลคะแนนคือ: "+ result);
    }
}
