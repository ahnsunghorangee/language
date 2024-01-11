package algorithm.boj.datastructure.treemap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_Gold4_7662_���߿켱����ť {

	static int T; // �׽�Ʈ ���̽�
	static int K; // ���� ����, K <= 1,000,000

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		T = Integer.parseInt(st.nextToken());

		while (T > 0) {
			K = Integer.parseInt(br.readLine());
			TreeMap<Long, Long> tm = new TreeMap<>();

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				char op = st.nextToken().charAt(0); // ������ I �Ǵ� D
				long n = Long.parseLong(st.nextToken()); // ����

				if (op == 'I') {
					if (tm.containsKey(n)) {
						tm.put(n, tm.get(n) + 1);
					} else {
						tm.put(n, 1L);
					}
				} else { // D
					if(tm.isEmpty()) {
						continue;
					}
					
					if(n == -1) { // �ּڰ� ����
						long minKey = tm.firstKey();
						long minVal = tm.get(minKey) - 1;

						if (minVal == 0) {
							tm.remove(minKey);
						} else {
							tm.put(minKey, minVal);
						}
					} else { // �ִ� ����
						long maxKey = tm.lastKey();
						long maxVal = tm.get(maxKey) - 1;
						
						if(maxVal == 0 ) {
							tm.remove(maxKey);
						} else {
							tm.put(maxKey, maxVal);
						}
					}
					
				}

			}

			if (tm.isEmpty()) {
				sb.append("EMPTY").append("\n");
			} else {
				sb.append(tm.lastKey() + " " + tm.firstKey()).append("\n");
			}

			T--;
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
