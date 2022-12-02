import java.util.Random;

public class FifteenRows {
	
	public int[][] solution1 = {{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,1,1,1,1,1,1,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,1,1,1,1,1,1},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,1,1,1,1,1,1,1,0,0,1,1,1,1,0},{1,1,1,1,1,1,1,1,1,0,1,1,1,1,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},{0,1,1,1,1,0,0,1,1,1,1,1,1,1,1},{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{1,1,1,0,0,0,0,1,1,1,1,1,1,1,1},{1,1,1,1,1,0,0,0,0,0,0,0,0,0,0}};
	public int[][] solution2 = {{0,0,0,0,0,0,1,1,1,1,1,1,1,0,0},{0,0,0,0,0,1,1,1,1,1,1,1,1,1,0},{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,1,1,1,0,1,0,0,0,0,0},{0,0,0,0,0,1,1,1,0,1,0,0,0,0,0},{0,0,0,0,0,1,1,1,0,1,0,0,0,0,0},{1,1,0,0,0,1,1,1,0,1,1,0,0,0,0},{0,1,1,0,0,0,1,1,0,1,1,1,0,0,0},{0,1,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0},{0,0,0,0,1,1,1,1,1,1,0,0,0,0,0}}; 
	public int[][] solution3 = {{0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,0,0,0,0},{0,0,1,1,1,1,1,1,1,1,1,0,0,0,0},{0,1,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,1,1,1,1,1,1,1,0,1,1,1,1,1,0},{0,1,1,1,1,1,1,1,0,0,1,1,1,1,0},{0,1,1,1,1,1,1,1,1,1,0,1,0,0,0},{0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{1,1,1,1,0,1,1,0,1,1,1,0,0,0,0},{1,0,1,0,0,1,1,0,1,1,0,0,0,0,0},{1,0,1,0,0,0,1,0,0,1,0,0,0,0,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
	public int[][] solution4 = {{0,0,0,0,1,1,1,1,1,1,1,1,1,0,0},{0,0,0,1,1,1,0,0,0,0,0,1,1,1,0},{0,0,0,1,1,0,0,0,0,0,0,0,1,1,0},{0,1,1,1,1,0,0,0,0,0,0,0,1,1,0},{1,1,1,1,1,1,0,0,0,0,0,1,1,1,0},{1,1,0,1,1,1,1,1,1,1,1,1,1,1,0},{1,1,0,1,0,1,1,1,1,1,1,1,1,1,0},{0,1,1,1,0,0,0,1,1,1,1,1,1,1,0},{0,0,1,1,0,0,1,1,1,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{0,0,0,1,1,1,1,1,1,1,1,1,1,1,0},{0,0,0,0,1,1,1,1,1,1,1,1,1,0,0}};
	public int ranNum;
	
	public FifteenRows() {
		int[][] solution1 = {{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,1,1,1,1,1,1,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,1,1,1,1,1,1},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,0,0,0,1,1,1,1,0,0,1,1,1,1,0},{0,1,1,1,1,1,1,1,0,0,1,1,1,1,0},{1,1,1,1,1,1,1,1,1,0,1,1,1,1,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},{0,1,1,1,1,0,0,1,1,1,1,1,1,1,1},{0,0,0,0,0,0,1,1,1,1,1,1,1,1,1},{1,1,1,0,0,0,0,1,1,1,1,1,1,1,1},{1,1,1,1,1,0,0,0,0,0,0,0,0,0,0}};//고무장화
		int[][] solution2 = {{0,0,0,0,0,0,1,1,1,1,1,1,1,0,0},{0,0,0,0,0,1,1,1,1,1,1,1,1,1,0},{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,1,1,1,0,1,0,0,0,0,0},{0,0,0,0,0,1,1,1,0,1,0,0,0,0,0},{0,0,0,0,0,1,1,1,0,1,0,0,0,0,0},{1,1,0,0,0,1,1,1,0,1,1,0,0,0,0},{0,1,1,0,0,0,1,1,0,1,1,1,0,0,0},{0,1,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,0,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,1,0,0,0},{0,0,0,0,1,1,1,1,1,1,0,0,0,0,0}};//우산
		int[][] solution3 = {{0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},{0,0,0,0,1,1,1,1,1,1,1,0,0,0,0},{0,0,1,1,1,1,1,1,1,1,1,0,0,0,0},{0,1,1,1,1,1,1,1,1,1,1,1,0,0,0},{0,1,1,1,1,1,1,1,0,1,1,1,1,1,0},{0,1,1,1,1,1,1,1,0,0,1,1,1,1,0},{0,1,1,1,1,1,1,1,1,1,0,1,0,0,0},{0,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,0,0},{1,1,1,1,0,1,1,0,1,1,1,0,0,0,0},{1,0,1,0,0,1,1,0,1,1,0,0,0,0,0},{1,0,1,0,0,0,1,0,0,1,0,0,0,0,0},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};//들소
		int[][] solution4 = {{0,0,0,0,1,1,1,1,1,1,1,1,1,0,0},{0,0,0,1,1,1,0,0,0,0,0,1,1,1,0},{0,0,0,1,1,0,0,0,0,0,0,0,1,1,0},{0,1,1,1,1,0,0,0,0,0,0,0,1,1,0},{1,1,1,1,1,1,0,0,0,0,0,1,1,1,0},{1,1,0,1,1,1,1,1,1,1,1,1,1,1,0},{1,1,0,1,0,1,1,1,1,1,1,1,1,1,0},{0,1,1,1,0,0,0,1,1,1,1,1,1,1,0},{0,0,1,1,0,0,1,1,1,1,1,1,1,1,1},{0,1,1,1,1,0,1,1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1},{0,0,1,1,1,1,1,1,1,1,1,1,1,1,1},{0,0,0,1,1,1,1,1,1,1,1,1,1,1,0},{0,0,0,0,1,1,1,1,1,1,1,1,1,0,0}};//카푸치노
	}
	
	public int[][] getSolution(){
		Random random = new Random();
		ranNum = random.nextInt(4);
		if(ranNum == 0)
			return solution1;
		else if(ranNum == 1)
			return solution2;
		else if(ranNum == 2)
			return solution3;
		else
			return solution4;
	}


	
	
}
