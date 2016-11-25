import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1010 {
	static int[][] M = new int[31][31];
	static int T;

	public static void memo(int l, int r) {
		for (int i = 0; i < l; i++) {
			M[i][0] = 1;
		}
		for (int j = 0; j < r; j++) {
			M[j][j] = 1;
		}

		for (int i = 1; i < l; i++) {
			for (int j = 1; j < r; j++) {
				M[i][j] = M[i-1][j-1] + M[i - 1][j];
			}
		}
	}

	public static void main(String[] args) throws Exception {
		memo(31, 31);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String[] temp = br.readLine().split(" ");
			int l = Integer.parseInt(temp[0]);
			int r = Integer.parseInt(temp[1]);
			System.out.println(M[r][l]);
		}
	}
}
