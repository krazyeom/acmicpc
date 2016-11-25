import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2167 {
	static int[][] V = new int[301][301];
	static int T;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		for (int n = 1; n <= N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int m = 1; m <= M; m++) {
				int a = Integer.parseInt(st.nextToken());
				V[n][m] = V[n][m - 1] + V[n - 1][m] + a - V[n - 1][m - 1];
			}
		}

		int C = Integer.parseInt(br.readLine());

		for (int i = 1; i <= C; i++) {
			String[] tt = br.readLine().split(" ");
			int x1 = Integer.parseInt(tt[0]);
			int y1 = Integer.parseInt(tt[1]);
			int x2 = Integer.parseInt(tt[2]);
			int y2 = Integer.parseInt(tt[3]);

			int ret = V[x2][y2] - V[x1 - 1][y2] - V[x2][y1 - 1] + V[x1 - 1][y1 - 1];

			System.out.println(ret);
		}
	}
}
