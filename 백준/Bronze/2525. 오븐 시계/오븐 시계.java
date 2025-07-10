import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt(); // 시
        int m = sc.nextInt(); // 분
        int t = sc.nextInt(); // 오븐타이머시간
        int tm = (h * 60) + m + t; // 전체 분
        
        h = (tm / 60) % 24; // 시
        m = tm % 60; // 분
        
        System.out.println(h + " " + m);
    }
}