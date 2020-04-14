package q2580;
import java.util.*;

public class Main3 {
    static int[][] board = new int[9][9];
    static ArrayList<int[]> list = new ArrayList<>(); // 빈칸의 좌표를 삽입
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                if((board[i][j] = sc.nextInt())==0) // 입력값이 0이면
                    list.add(new int[]{i, j}); // 리스트에 삽입
        //입력 끝    
        sudoku(0);
    }
    static void sudoku(int count){
        if(count == list.size()){ // 빈 칸을 모두 채우면
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++)
                    System.out.print(board[i][j] + " ");
                System.out.println();
            }
            System.exit(0); // 출력 후 종료
        }
        int y = list.get(count)[0];
        int x = list.get(count)[1];
        for(int i=1; i<=9; i++){
            if (isPromising(x, y, i)) {
                board[y][x] = i; // 가능하면 넣고
                sudoku(count+1);
                board[y][x] = 0; // 안되면 초기화
            }
        }
    }
    static boolean isPromising(int x, int y, int num){
        // x축 검사
        for(int i=0; i<9; i++)
            if (num == board[y][i]) return false;
        // y축 검사
        for(int i=0; i<9; i++)
            if (num == board[i][x]) return false;
        // 작은 사각형 검사
        int x_ = x/3*3; // 작은 사각형 첫 x좌표
        int y_ = y/3*3; // 작은 사각형 첫 y좌표
        for(int i= y_; i<y_+3; i++)
            for(int j= x_; j<x_+3; j++)
                if(num == board[i][j]) return false;
        return true;
    }
}