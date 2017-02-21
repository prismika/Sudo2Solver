package solver;

public class Checker {

	/**
	 * Board that is being checked in class Checker
	 */
	Board board;
	
	/**
	 * Wither the board is true or not
	 */
	
	/**
	 * Constructor checks the whole board and returns wither it's correct or not
	 * 
	 * @param boardToBeChecked
	 * 		Board in question.	*/
	public Checker(Board boardToBeChecked){
		this.board = boardToBeChecked;
	}
	
	/**
	 * Checks every row in the specified board and if 
	 * there are some matching numbers returns false;
	 * 
	 * @return boolean value of wither the row is true or false
	 * 		Checks 
	 */
	public boolean rowsPass(int row){
		// TODO 
		return false;
	}
	
	/**
	 * Checks the column in the specified board and if
	 * there are some matching numbers returns false; 
	 * 
	 * @return boolean value wither col is true or false
	 */
	public boolean columnsPass(int col){
		//TODO
		return false;
	}
	
	/**
	 * Checks the block in the specified row and column 
	 * and returns wither it's true or false;
	 * 
	 * @return boolean value wither the block is true or false
	 */
	public boolean blocksPass(int row, int col){
		// TODO 
		return false;
	}
	
	/**
	 * Checks whole board and returns wither the board is true or
	 * false.  This should be implemented in the recursive method.
	 */
	public boolean checkBoard(int row, int col){
		//TODO
		return false;
	}
	
}
