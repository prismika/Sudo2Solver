package solver;

public class Board {
	
	private Square[][] square;
	private int size;
	public Board(int size){
		for(Square[] col : square){
			for(Square s : col){
				s = new Square(size);
			}
		}
		this.size = size;
	}
	public Board(int size, Board b){
		for(int i = 0; i < size*size; i++){
			for(int j = 0; j < size*size; j++){
				square[i][j] = new Square(b.getSquare(i, j));
			}
		}
		this.size = size;
	}
	
	public Square getSquare(int row, int col){return square[row][col];}
	public void setSquare(int row, int col, int val){square[row][col].setValue(val);}
	public int getSize(){return size;}
	public int getHeight(){return size*size;}
	
}

//
///**
// * The Board class creates and object for a Sudoku puzzle. 
// * The board represents an n x n grid of Square values.
// * 
// * @author Jacob R. Pratt the III prince of binary addition!	*/
//
//public class Board {
//	/**
//	 * The two dimensional array of square values
//	 */
//	private Square[][] board;
//	
//	/**
//	 * Size of the game 
//	 * (ex. a normal Sudoku is a size 3 game)
//	 */
//	private int gameSize;
//	
//	/**
//	 * Constructor builds the size of the board
//	 * with a specific number of squares.
//	 * Each square is initialized with zero values
//	 * and the not values will be added later.
//	 * @param gameSize
//	 */
//	public Board(int gameSize){
//		
//		board = new Square[gameSize*gameSize][gameSize*gameSize];
//		
//		this.gameSize = gameSize;
//		
//		// Builds game board with Squares objects
//		for(int i = 0; i < gameSize*gameSize; i++){
//			for(int j = 0; j < gameSize*gameSize; j++){
//				
//				board[i][j] = new Square();
//				
//			}
//		}
//		
//	}
//	/**
//	 * Getter method for board object
//	 * @return board
//	 * 		Returns the given board		*/
//	public Square[][] getBoard(){
//		return this.board;
//	}
//	
//	/**
//	 * Returns the square object
//	 * at the specific row and column 
//	 * specified by the method input
//	 * @param row
//	 * 		int of specified row
//	 * @param col
//	 * 		int of specified column
//	 * @return
//	 * 		Square object
//	 */
//	public Square getSquare(int row, int col){
//		return board[row][col];
//	}
//	
//	/**
//	 * Method returns the Square objects of 
//	 * any specified row.
//	 * 
//	 * @param row
//	 * 		Row that is being returned
//	 * @return
//	 * 		Integer array of row objects.
//	 */
//	public Square[] getRow(int row){
//		// TODO 
//		return null;
//	}
//	
//	public Square[] getColumn(int col){
//		// TODO 
//		return null;
//	}
//	
//	public Square[][] getBlock(int row, int col){
//		// TODO
//		return null;
//	}
//	
//	// 
//	
