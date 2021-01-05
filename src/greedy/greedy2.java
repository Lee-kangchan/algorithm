package greedy;

public class greedy2 {
    public int solution(String name) {
        int answer = 0;
        int prev = 'A';
        int ans =1  ;
        for(int i= 0 ; i < name.length(); i++){
            if(name.charAt(i)=='A'){
                ans++;
            }
            int F = name.charAt(i) - 'A';
            int B = 1+ 'Z' - name.charAt(i);
            answer += F>B ? B : F;
        }




        return answer + name.length() - ans ;
    }

    public static void main(String[] args) {
        int prev = 'A';
        int next = 'Z';
        greedy2 greedy2 = new greedy2();
        System.out.println(prev);
        System.out.println(next);
        System.out.println(greedy2.solution("JEROEN"));
        System.out.println(greedy2.solution("JAN"));
    }
}
