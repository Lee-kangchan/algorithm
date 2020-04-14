package q2580;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main2 {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<xy> XY = new ArrayList<xy>(); 
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[9][9];
		for(int i=0;i<9;i++) {
			String []S = bf.readLine().trim().split(" ");
			for( int j =0 ; j< 9 ; j++) {
			A[i][j] = Integer.parseInt(S[j]);
				if(A[i][j]==0) {
					XY.add(new xy(j,i));
				}
			}

		}

		solve(A,0);
		
		
	}
	
	public static Boolean T(int A[][] , int a, int b) {
		for(int i =0 ; i < 9 ; i++) {
			if(b == i ) continue;
			
			if(A[a][b] == A[a][i]) {
				return false;
			}
		}
		
		return true;
	}
	public static Boolean S(int A[][], int a, int b) {
		
		for(int i =0 ; i < 9 ; i++) {
			if(a == i ) continue;
			
			if(A[a][b] == A[i][b]) {
				return false;
			}
		}
		
		return true;
	}
	public static Boolean U(int A[][], int a, int b) {
		int X = (a/3)*3;
		int Y = (b/3)*3;
		
		for(int i =0  ; i <3 ; i++) {
			for (int j =0 ; j < 3 ; j++) {
				if(a == X+i && b == Y+j) continue;
				if(A[X+i][Y+j]==A[a][b]) {
					return false;
				}
			}
		}
		return true;
	}
	public static void solve(int A[][], int count) {
		if(count == XY.size()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++)
					System.out.print(A[i][j] + " ");
				System.out.println();
			}

		}
		int y = XY.get(count).y;
		int x = XY.get(count).x;
		
		for(int i=0; i<9; i++) {
			if(S(A,x,y)&&U(A,x,y)&&T(A,x,y)) {
				A[y][x] = i;
				solve(A,count+1);
				A[y][x] = 0;
			}
		}
	}

}
class xy{
	int x;
	int y;
	
	xy(int x,int y){
		this.x = x;
		this.y = y;
	}
}


