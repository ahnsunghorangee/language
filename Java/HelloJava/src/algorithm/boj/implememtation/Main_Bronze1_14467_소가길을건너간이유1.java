package algorithm.boj.implememtation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_Bronze1_14467_�Ұ������ǳʰ�����1 {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // ���� Ƚ��, 1 <= N <= 100

		int changeCnt = 0; // ���� ��ȣ�� �Ұ� �ٲ� ��ġ ī��Ʈ
		int[] cowsLoc = new int[N]; // �� ��ġ
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
