import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int min = Integer.parseInt(input[0]);
        int max = Integer.parseInt(input[0]);

        for (int i = 1; i < n; i++) {
            int val = Integer.parseInt(input[i]);
            min = Math.min(min, val);
            max = Math.max(max, val);
        }

        System.out.println(min + " " + max);
    }
}