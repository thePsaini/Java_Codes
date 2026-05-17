import java.util.*;

public class basic_project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];

        // initialize board
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        char player = 'X';

while(true){
            // print board
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Player " + player + " enter row and column:");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // check valid move
            if(board[row][col] != '-') {
                System.out.println("Invalid move, try again!");
                continue;
            }

            board[row][col] = player;

            // check win
            boolean win = false;

            // rows
            for(int i = 0; i < 3; i++) {
                if(board[i][0] == player &&
                   board[i][1] == player &&
                   board[i][2] == player) {
                    win = true;
                }
            }

            // columns
            for(int j = 0; j < 3; j++) {
                if(board[0][j] == player &&
                   board[1][j] == player &&
                   board[2][j] == player) {
                    win = true;
                }
            }

            // diagonals
            if(board[0][0] == player &&
               board[1][1] == player &&
               board[2][2] == player) {
                win = true;
            }

            if(board[0][2] == player &&
               board[1][1] == player &&
               board[2][0] == player) {
                win = true;
            }
            
            if(win){
                //final board
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Player: "+player+" wins!");
                break;
            }
            
            //draw
            boolean draw = true;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    if(board[i][j] == '-'){
                        draw = false;
                    }
                }
            }
            
            if(draw == true){
                System.out.print("Game Draw!");
                break;
            }
            
            
            //Swtiching of player
            if(player == 'X'){
                player = 'O';
            }else{
                player = 'X';
            }
        
}
            
    }
}
