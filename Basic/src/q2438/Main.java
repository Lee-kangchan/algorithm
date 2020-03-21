package q2438;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine().trim());
		
		for(int i = 1 ; i <=T ; i++) {
            for(int j = 1 ; j <=i ; j++) {
            	bw.write("*");
            }
            bw.write("\n");
		}
        bw.flush();
        bw.close();
}
}