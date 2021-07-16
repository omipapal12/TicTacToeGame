
public class TicTacToeGame {
	public static char[] CreateBoard() {
		char[] board = new char[10];
		for( int i=1;i<10;i++) {
			board[i]=' ';
		}
		return board;
}
	public static void main(String[] args) {
		System.out.println("WELCOME TO THE TIC_TAC_TOE_GAME");
		char[] board=CreateBoard();
}
}