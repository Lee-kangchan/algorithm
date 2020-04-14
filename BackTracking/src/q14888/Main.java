package q14888;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> result = new ArrayList<Integer>();
	static int calc[] = new int[4]; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A[] = new int[T];
		
		for(int i=0; i<T;i++) {
			A[i] = sc.nextInt();
		}
		for(int i=0; i<4 ;i++) {
			calc[i] = sc.nextInt();
		}
		calc(A,0);
		solve();
		
	}

	public static void sum(int A[],int count)  {
		if(calc[0]==0) return ;
		calc[0]--;
		A[count+1] = A[count] + A[count+1];
		calc(A,count+1);
		
	}
	public static void del(int A[],int count) {
		if(calc[1]==0) return ;
		calc[1]--;
		A[count+1] = A[count] - A[count+1];
		calc(A,count+1);
	}
	public static void mul(int A[],int count) {
		if(calc[2]==0) return ;
		calc[2]--;
		A[count+1] = A[count] * A[count+1];
		calc(A,count+1);
	}
	public static void ave(int A[],int count) {
		if(calc[3]==0) return ;
		calc[3]--;
		A[count+1] = A[count] / A[count+1];
		calc(A,count+1);
	}

	public static void calc(int A[], int count)  {
		System.out.println(A[count]);
		sum(A,count);
		
		del(A,count);
		mul(A,count);
		ave(A,count);
		for(int i=0; i<4 ; i++) {
			if(calc[i]!=0) {
				return;
			}
		}
		result.add(A[count]);
	}
	public static void solve() {
		int Max=-1000000000;
		int Min= 1000000000;
		
		for(Integer i : result) {
			Max = Max > i ? Max : i ;
			Min = Min < i ? Min : i ;
		}
		System.out.println(Max);
		System.out.println(Min);
	}
}


