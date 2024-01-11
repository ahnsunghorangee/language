package algorithm.boj.implememtation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_Bronze1_14467_소가길을건너간이유1 {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 관찰 횟수, 1 <= N <= 100

		int changeCnt = 0; // 같은 번호의 소가 바뀐 위치 카운트
		int[] cowsLoc = new int[N]; // 소 위치
		for (int i = 0; i < N; i++) {
			cowsLoc[i] = -1;
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());

			if (cowsLoc[num - 1] == -1) {
				cowsLoc[num - 1] = dir;
			} else {
				if (cowsLoc[num - 1] == dir) {
					continue;
				} else {
					cowsLoc[num - 1] = dir;
					changeCnt++;
				}
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		sb.append(changeCnt);

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
