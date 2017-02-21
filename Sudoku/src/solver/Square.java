package solver;

import java.util.BitSet;

public class Square {
	private BitSet poss;
	Square(int boardSize){
		poss = new BitSet(boardSize*boardSize);
		poss.set(0,boardSize*boardSize-1);
	}
	Square(Square original){
		BitSet newPoss = new BitSet(poss.size());
		for(int i = 0; i < poss.size(); i++){
			newPoss.set(i,poss.get(i));
		}
		this.poss = newPoss;
	}
	public void removePossibility(int newVal) throws SquareContradictionException{
		poss.clear(newVal-1);
		if(poss.cardinality()==0){
			throw new SquareContradictionException("Square contradicted upon removal of: " + newVal);
		}
	}
	public int[] getPossibilities(){
		int[] reply = new int[poss.cardinality()];
		int counter = 0;
		for(int i = 0; i < poss.size(); i++){
			if(poss.get(i))
				reply[counter++] = i+1;
		}
		return reply;
	}
	public int getPossibilityNumber(){
		return poss.cardinality();
	}
	public boolean checkPossibility(int check){
		return poss.get(check-1);
	}
	public boolean hasValue(){
		return poss.cardinality()==1;
	}
	public int getValue(){
		if(hasValue()){
			for(int i = 0; i < poss.size(); i++){
				if(poss.get(i))	return i+1;
			}
		}
		return 0;
	}
	public void setValue(int val){
		poss.clear();
		poss.set(val-1);
	}
	public Square clone(){
		return new Square(this);
	}
}
