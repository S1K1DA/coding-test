import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        for(int i=0; i<T; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            
            bw.write(("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b))+"\n");
        }
        bw.flush();
    }
}