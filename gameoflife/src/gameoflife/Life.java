package gameoflife;

public class Life {
	boolean[][] board;
	
	/**
	 * 
	 * @param rows
	 * @param cols
	 */
	
	Life(int rows, int cols){
		board = new boolean[rows][cols];
		for(int row = 0; row < board.length; row++) {
			for (int column = 0; column < board[row].length;column++) {
				board[row][column] = Math.random() > 0.9; 
			}
		}
		
	}
	/**
	 * 
	 * @param rows the row number of the square
	 * @param cols the column number of the square
	 * @return the number of live neighbors of the square
	 */
	
	int FindNeighbors(int rows,int cols) {
		int[][] twod = {{ -1,-1},
						{ -1, 0 }, 
						{ -1, 1 }, 
						{ 0, -1 }, 
						{ 0, 1 }, 
						{ 1, -1 }, 
						{ 1, 0 },
						{ 1, 1 }
						};		
		int neighbors = 0;
		for (int i=0; i < twod.length; i++) {
			int r = rows + twod[i][0];
			int c = cols + twod[i][1]; 
			// r,c represent the neighbor cells in our board. Twod array represents a small fraction of the cell in our board that we wanna test. 
			if (r >=0 && r < board.length && c >= 0 && c < board[0].length && board[r][c]) {
				neighbors++;
			}
		}
		
		
		return neighbors;
	}
	
	/**
	 * Live cell with 0 or 1 neighbors: dies from loneliness
	 * Live cell with 2 or 3 neighbors: continues to live
	 * Live cell with more than 3 neighbors: dies of overcrowding.
	 * Dead cell with exactly three neighbors: a new life is formed
	 */
	void update() {
		//create a board to house the next generation
		boolean[][] newboard= new boolean[board.length][board[0].length];
		
		//visit each cell in current in current board and apply rules 
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length; col++ ) {
				int neighbors = FindNeighbors(row, col);
				if (board[row][col]) {
					newboard[row][col] = (neighbors == 2 || neighbors == 3);
				}else {
					newboard [row][col] = (neighbors == 3);
 				}
			}
		}
		board = newboard;
	}
	void printBoard() {
        // clear the display...
		 try
		    {
		        final String os = System.getProperty("os.name");

		        if (os.contains("Windows"))
		        {
		            Runtime.getRuntime().exec("cls");
		        }
		        else
		        {
		            Runtime.getRuntime().exec("clear");
		        }
		    }catch (final Exception e)
		    {
		        //  Handle any exceptions.
		    }
        
        // print each row a column at a time...
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col])
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }   
    }
	
	
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	final int ROWS = 24;  
        final int COLUMNS = 80;  
        final int GENERATIONS = 500;
        
        Life life = new Life(ROWS, COLUMNS);
        life.printBoard();
        
        // Loop for the number of generations: update, print, sleep...
        for (int generation = 0; generation < GENERATIONS; generation++) {
            life.update();
            life.printBoard();
            try { Thread.sleep(5); } catch (InterruptedException e) { }
        }
        

	}

}
