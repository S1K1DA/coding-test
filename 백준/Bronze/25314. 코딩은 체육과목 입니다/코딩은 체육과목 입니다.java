import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt(); //  Byte
        int l = b / 4; // 4바이트 Long 반복
        
        for(int i=0; i<l; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}