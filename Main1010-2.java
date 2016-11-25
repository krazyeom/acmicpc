import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1010 {
	static int T;
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			String[] temp = br.readLine().split(" ");
			int l = Integer.parseInt(temp[0]);
			int r = Integer.parseInt(temp[1]);
			int ret = 1;
			for (int i = 0; i < l;i++){
				ret = ret * (r-i) / (i+1);
			}
			System.out.println(ret);
		}
	}
}
