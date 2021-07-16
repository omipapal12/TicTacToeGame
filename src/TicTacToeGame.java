import java.util.Scanner;
public class TicTacToeGame {
	public static char[] createBoard() {
		char[] board = new char[10];
		for(int i = 0; i<10; i++) {
			board[i]=' ';
		}
		return board;
}
	private static char UserLetter(){
		Scanner scan = new Scanner(System.in);
	 	System.out.println("Enter choice X or O");
	 	char UserLetter = scan.next().charAt(0);
	 	return UserLetter;
 }
	public static void showBoard(char[] board) { 
		 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		 System.out.println("    |-----|-----|-----| "); 
		 System.out.println("    |  "+board[1]+"  |  "+board[2]+"  |  "+board[3]+"  |"); 
		 System.out.println("    |-----|-----|-----| "); 
		 System.out.println("    |  "+board[4]+"  |  "+board[5]+"  |  "+board[6]+"  |"); 
		 System.out.println("    |-----|-----|-----| "); 
		 System.out.println("    |  "+board[7]+"  |  "+board[8]+"  |  "+board[9]+"  |"); 
		 System.out.println("    |-----|-----|-----| "); System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");	    
		 } 
	public static void main(String[] args) {
		System.out.println("WELCOME TO THE TIC_TAC_TOE_GAME");
		char[] board=createBoard();
		UserLetter();
		showBoard(board);
	}
}