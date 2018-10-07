import java.io.PrintWriter;

public class MainC {
	static FastScanner sc;
	static PrintWriter out;
	public static void main(String[] args){
		sc = new FastScanner();
		out = new PrintWriter(System.out);
		//out.println(solve());
		solve();
		out.flush();
	}

	static void solve(){
		int N = sc.nextInt();
		int[] xList = new int[N];
		int[] yList = new int[N];
		int[] hList = new int[N];
		int idx = -1;
		for(int i=0;i<N;i++){
			xList[i] = sc.nextInt();
			yList[i] = sc.nextInt();
			hList[i] = sc.nextInt();
			if(hList[i] != 0 && idx == -1){
				idx = i;
			}
		}
		int H ;
		int tmp;
		boolean res = true;
		for(int x=0;x<=100;x++){
			for(int y=0;y<=100;y++){
				H=hList[idx] + Math.abs(x-xList[idx]) + Math.abs(y-yList[idx]);
				res = true;
				for(int i=0;i<N;i++){
					tmp = Math.max(H-Math.abs(x-xList[i]) -Math.abs(y-yList[i]), 0);
					if(tmp!=hList[i]){
						res = false;
						break;
					}
				}
				if(res){
					out.println(x + " " + y + " " + H);
					return;
				}
			}
		}

	}
}