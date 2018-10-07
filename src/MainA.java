import java.io.PrintWriter;

public class MainA {
	static FastScanner sc;
	static PrintWriter out;
	public static void main(String[] args){
		sc = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		//out.println(solve());
		out.flush();
	}

	static void solve(){
		int N = sc.nextInt();
		if(N==1) out.println("Hello World");
		else out.println(sc.nextInt()+sc.nextInt());
	}
}