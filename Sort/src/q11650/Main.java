package q11650;


import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = sc.nextInt();
		int A[][] = new int[T][2];
		
		for(int i = 0 ; i <T ; i ++) {
			A[i][0]= sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		
		int M;
		for(int i = 0 ; i <T ; i ++) {
			int am =i;
			for(int j = i ; j< T ; j++) {
				if(A[am][0]>=A[j][0]) {
					if(A[am][1]>=A[j][1]) {
						am = j;
					}
				}
			}
			int w=A[i][0] , W=A[i][1];
			A[i][0] = A[am][0];
			A[i][1] = A[am][1];
			A[am][0] = w;
			A[am][1] = W;
			System.out.println(A[i][0]+" "+A[i][1]);
		}
		

		
		
	
	
	}

}

