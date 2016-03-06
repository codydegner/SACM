import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		int[][] grid = new int[4][4];
		FileReader f = new FileReader("Question 1, Sample 3.txt");
		BufferedReader file = new BufferedReader(f);
		for (int i = 0; i < 4; i++){
			String input = file.readLine();
			String[] list = input.split(" ");
			for(int j = 0; j < list.length; j++){
				grid[i][j] = Integer.parseInt(list[j]);
			}
		}
		int input = Integer.parseInt(file.readLine());
		System.out.println(input);
		if (input == 0){
			grid = shiftLeft(grid);
		} else if (input == 1){
			grid = shiftUp(grid);
		} else if (input == 2){
			grid = shiftRight(grid);
		} else if (input == 3){
			grid = shiftDown(grid);
		}
		
		for (int [] line:grid){
			for (int ind: line){
				System.out.print(ind + " ");
			}
			System.out.println();
		}
		
		file.close();
	}
	//done
	public static int[][] shiftLeft(int[][] in){
		int[][] shift = in;
		
		for(int i = 0; i<in.length; i++){
			for(int j = 1; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i][j-1]==shift[i][j]){
						shift[i][j-1] *= 2;
						shift[i][j] = 0;
					} else if (shift[i][j-1] == 0){
						shift[i][j-1] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i<in.length; i++){
			for(int j = 1; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i][j-1] == 0){
						shift[i][j-1] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i<in.length; i++){
			for(int j = 1; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i][j-1] == 0){
						shift[i][j-1] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		return shift;
	}
	//done
	public static int[][] shiftUp(int[][] in){
		int[][] shift = in;
		
		for(int i = 1; i<in.length; i++){
			for(int j = 0; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i-1][j]==shift[i][j]){
						shift[i-1][j] *= 2;
						shift[i][j] = 0;
					} else if (shift[i-1][j] == 0){
						shift[i-1][j] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 1; i<in.length; i++){
			for(int j = 0; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i-1][j] == 0){
						shift[i-1][j] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 1; i<in.length; i++){
			for(int j = 0; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i-1][j] == 0){
						shift[i-1][j] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		return shift;
	}
	//done
	public static int[][] shiftRight(int[][] in){
		int[][] shift = in;
		
		for(int i = 0; i<in.length; i++){
			for(int j = in.length-2; j>=0; j--){
				if (shift[i][j] != 0){
					if (shift[i][j+1]==shift[i][j]){
						shift[i][j+1] *= 2;
						shift[i][j] = 0;
					} else if (shift[i][j+1] == 0){
						shift[i][j+1] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i<in.length; i++){
			for(int j = in.length-2; j>=0; j--){
				if (shift[i][j] != 0){
					if (shift[i][j+1] == 0){
						shift[i][j+1] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = 0; i<in.length; i++){
			for(int j = in.length-2; j>=0; j--){
				if (shift[i][j] != 0){
					if (shift[i][j+1] == 0){
						shift[i][j+1] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		return shift;
	}
	
	public static int[][] shiftDown(int[][] in){
		int[][] shift = in;
		
		for(int i = in.length-2; i>=0; i--){
			for(int j = 0; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i+1][j]==shift[i][j]){
						shift[i+1][j] *= 2;
						shift[i][j] = 0;
					} else if (shift[i+1][j] == 0){
						shift[i+1][j] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = in.length-2; i>=0; i--){
			for(int j = 0; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i+1][j] == 0){
						shift[i+1][j] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		for(int i = in.length-2; i>=0; i--){
			for(int j = 0; j<in.length; j++){
				if (shift[i][j] != 0){
					if (shift[i+1][j] == 0){
						shift[i+1][j] = shift[i][j];
						shift[i][j] = 0;
					}
				}
			}
		}
		
		return shift;
	}
}
