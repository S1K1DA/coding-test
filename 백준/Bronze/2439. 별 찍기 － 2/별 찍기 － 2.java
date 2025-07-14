import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=N; i++) {
            // 공백
            for(int x=1; x<=N-i; x++) {
                bw.write(" ");
            }
            for(int x=1; x<=i; x++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}