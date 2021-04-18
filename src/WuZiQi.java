import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WuZiQi {
    private static final int BOARD_SIZE =5;
    private String[][] board;

    public  void init(){
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0;i<BOARD_SIZE;i++){
            for (int j =0 ;j <BOARD_SIZE;j++){
                board[i][j]="＋";
            }
        }
    }

    public void printBoard(){
        for (int i = 0;i<BOARD_SIZE;i++){
            for (int j = 0;j <BOARD_SIZE;j++){
                System.out.print(board[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args)throws Exception {
        WuZiQi wuZiQi = new WuZiQi();
        wuZiQi.init();
        wuZiQi.printBoard();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = bufferedReader.readLine()) != null){
            String[] split = input.split(",");
            int xPos = Integer.parseInt(split[0]);
            int yPos = Integer.parseInt(split[1]);
            wuZiQi.board[xPos-1][yPos-1] = "○";
            wuZiQi.printBoard();
            System.out.println("------");
        }
    }

}
