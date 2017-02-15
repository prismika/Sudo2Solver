package solver;

public class Board {
	/**
	 * The two dimensional array of square values
	 */
	private Square[][] board;
	
	/**
	 * Size of the game 
	 * (ex. a normal Sudoku is a size 3 game)
	 */
	private int gameSize;
	
	/**
	 * Constructor builds the size of the board
	 * with a specific number of squares.
	 * Each square is initialized with zero values
	 * and the not values will be added later.
	 * @param gameSize
	 */
	public Board(int gameSize){
		
		board = new Square[gameSize*gameSize][gameSize*gameSize];
		
		this.gameSize = gameSize;
		
		// Builds game board with Squares objects
		for(int i = 0; i < gameSize*gameSize; i++){
			for(int j = 0; j < gameSize*gameSize; j++){
				
				board[i][j] = new Square();
				
			}
		}
		
	}
	/**
	 * Getter method for board object
	 * @return board
	 * 		Returns the given board		*/
	public Square[][] getBoard(){
		return board;
	}
	
	
}
