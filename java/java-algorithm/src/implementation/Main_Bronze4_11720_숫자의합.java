package implementation;

import java.io.*;
import java.util.StringTokenizer;

public class Main_Bronze4_11720_숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 1 <= N <= 100
        char[] num = br.readLine().toCharArray();

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans += num[i] - '0';
        }

        sb.append(ans);

        bw.write(sb.toString());
        bw.flush();

        br.close();
        bw.close();
    }
}
