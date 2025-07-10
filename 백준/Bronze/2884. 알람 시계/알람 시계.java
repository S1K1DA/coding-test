import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt(); // 시
        int m = sc.nextInt(); // 분
        
        if(m >= 45) {
            m -= 45;
        } else {
            m += 15;
            h -= 1;
            
            if(h < 0) {
                h = 23;
            }
        }
        System.out.println(h + " " + m);
    } 
}