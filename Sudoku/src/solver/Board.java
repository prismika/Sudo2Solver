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
	public int getSize(){return size;}
	public int getHeight(){return size*size;}
}
