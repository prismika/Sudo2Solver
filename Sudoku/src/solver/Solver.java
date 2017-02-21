package solver;

import java.util.LinkedList;

public class Solver {
	public Solver(){
	}
	
	public Board solve(Board b){	//Empty spaces in queue are filled with board height + 1
		int height = b.getHeight();
		int[][] queue = new int[height*height][2];
		int queueCounter = 0;
		for(int val = 2; val < height; val++){
			for(int i = 0; i<height; i++){
				for(int j = 0; j < height; j++){
					if(b.getSquare(i, j).getPossibilityNumber() == val){
						queue[queueCounter++][0] = i;
						queue[queueCounter++][1] = j;
					}
				}
			}
		}
		while(queueCounter<queue.length){
			queue[queueCounter][0]=height+1;
			queue[queueCounter++][1]=height+1;
		}
		return recurse(b);
	}
	
	private Board recurse(Board b, int[][] q){//TODO MAKE COPY OF BOARD NOT ORIGINAL maybe. Check. Okay maybe not.
		if(isSolved(b)){
			return b;
		}
		//TODO InsertionSort would probably be faster than bucketSort but my solution is so elegant tho
		//Sort squares into a new queue by possibility number
		int[] bucket = new int[b.getHeight()+1];
		for(int[] coords : q){
			bucket[b.getSquare(coords[0], coords[1]).getPossibilityNumber()]++;
		}
		//Format bucket so that each entry is the sum of previous bucket sizes
		for(int i = 1; i < bucket.length; i++){
			bucket[i] = bucket[i] + bucket[i-1];
		}
		//Fill queue according to bucket indices
		int[][] queue = new int[q.length][2];
		for(int[] coords : q){
			Square look = b.getSquare(coords[0], coords[1]);
			queue[bucket[look.getPossibilityNumber()]++] = coords;
		}
		//Fill remaining spots with height+1 delimiters
		for(int i = bucket[b.getHeight()]; i < queue.length; i++){
			queue[i][0] = b.getHeight()+1;
			queue[i][1] = b.getHeight()+1;
		}
		
		//Run hypotheticals
		int i = 0;
		while(queue[i][0] <= b.getHeight()){
			int[] check = queue[i].clone();
			LinkedList<int[]> attempt = new LinkedList<>();
			attempt.add(check);
			
			for(int newVal : b.getSquare(check[0], check[1]).getPossibilities()){
				Board clone = new Board(b.getSize(), b);
				clone.setSquare(check[0], check[1], newVal);
				try{
					deduce(clone, attempt);
				}catch(SquareContradictionException e){
					return null;
				}
				Board recursedBoard = recurse(clone, queue);
				if(recursedBoard != null){
					return recursedBoard;
				}
			}
			i++;
		}
		
		throw new SquareContradictionException("Recurse found no solutions and no contradictions");
	}
	
	private boolean isSolved(Board b){
		//TODO
		
		return false;
	}
	private void deduce(Board b, LinkedList<int[]> queue){
		//TODO
		
		
	}
}

