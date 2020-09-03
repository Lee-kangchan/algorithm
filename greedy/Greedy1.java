package greedy;

import java.util.ArrayList;

public class Greedy1 {
	
	public static void main(String[] args) {
		int[] lost= {2,4};
		int n  = 5;
		int[] reserve = {1,3,5};
		
		System.out.println(solution(n, lost, reserve));
		
		int[] lost2= {2,4};
		 n  = 5;
		int[] reserve2 = {3};
		
		System.out.println(solution(n, lost2, reserve2));
		
		int[] lost3= {3};
		n  = 3;
		int[] reserve3 = {1};
		
		System.out.println(solution(n, lost3, reserve3));
		
	}
	public static int solution(int n,int[] lost, int[] reserve) {
		
		int answer =0 ;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : reserve) {
			list.add(i);
		}
		
		for(int i : lost) {
			if(list.get(i-1)!=null) {
				list.remove(i-1);
				i=0;
			}
			else if(list.get(i+1)!=null) {
				list.remove(i+1);
				i=0;
			}
		}
		
		
		
		return answer;
		
	}
}
