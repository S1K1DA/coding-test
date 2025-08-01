import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니 수
        int M = Integer.parseInt(st.nextToken()); // 교환 횟수
        int[] basket = new int[N + 1]; // 1번부터 시작

        // 초기 상태 세팅
        for (int i = 1; i <= N; i++) {
            basket[i] = i;
        }

        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 바구니 i와 j의 공 교환
            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= N; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
    }
}