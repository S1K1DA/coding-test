import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int m3 = 10000 + a * 1000; // 주사위3개 같
        int m1 = Math.max(Math.max(a, b), c) * 100; // 주사위 다 다름 젤 높은거
        
        if(a == b && b == c) {
            System.out.println(m3);
        } else if(a == b || a == c || b == c) {
            int same = (a == b || a == c) ? a : b;
            System.out.println(1000 + same * 100); 
        } else {
            System.out.println(m1); 
        }
    }
}