import java.io.PrintWriter;

public class MainB {
	static FastScanner sc;
	static PrintWriter out;
	public static void main(String[] args){
		sc = new FastScanner();
		out = new PrintWriter(System.out);
		out.println(solve());
		out.flush();
	}

	static String solve(){
		int N = sc.nextInt();
		int T = sc.nextInt();
		int minCost = Integer.MAX_VALUE;
		int tmpCost;
		for(int i=0;i<N;i++){
			tmpCost = sc.nextInt();
			if(sc.nextInt()<=T && minCost > tmpCost){
				minCost = tmpCost;
			}
		}
		return (minCost == Integer.MAX_VALUE)? "TLE":String.valueOf(minCost);
	}
}