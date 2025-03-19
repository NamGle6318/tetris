package tetris;

// 구현할 것
// 1. 타이틀 화면
// 2. 게임판
// 3. 블록이 떨어지고 배치되는 로직
// 4. 한 줄이 가득차면 삭제

public class Board {
    // 보드 크기 설정 및 보드 배열 만들기
    private final int WIDTH = 10;
    private final int HEIGHT = 20;
    private char[][] board;

    // 생성자
    public Board() {
        board = new char[HEIGHT][WIDTH];
        initBoard();
    }
    private void initBoard() { // board 초기화 
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }
    
}
