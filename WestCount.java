import javax.swing.*;
import java.awt.*;

public class WestCount extends JPanel {
	
	public static int[][] numbers; // = {{-1,-1,0},{-1,-1,1},{1,1,1},{-1,1,1},{-1,-1,1}};
	public JLabel label;
	private FiveRows five;
	private TenRows ten;
	private FifteenRows fift;
	
	public WestCount(FiveRows f) {
		five = f;
		JLabel label = new JLabel();
		numbers = getWestFive();
		Font font = new Font("Serif", Font.PLAIN, 20);
		setLayout(new GridLayout(5,3));
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(numbers[i][j] == -1){
					//label.setFont(font);
					add(new JLabel(" "));
				}
				else {
					//label.setFont(font);
					add(new JLabel(numbers[i][j]+" "));
				}
			}
		}
	}
	
	public WestCount(TenRows t) {
		ten = t;
		JLabel label = new JLabel();
		numbers = getWestTen();
		Font font = new Font("Serif", Font.PLAIN, 20);
		setLayout(new GridLayout(10,3));
		for(int i=0; i<10; i++) {
			for(int j=0; j<5; j++) {
				if(numbers[i][j] == -1){
					//label.setFont(font);
					add(new JLabel(" "));
				}
				else {
					//label.setFont(font);
					add(new JLabel(numbers[i][j]+" "));
				}
			}
		}
	}
	
	public WestCount(FifteenRows ft) {
		fift = ft;
		JLabel label = new JLabel();
		numbers = getWestFift();
		Font font = new Font("Serif", Font.PLAIN, 20);
		setLayout(new GridLayout(15,3));
		for(int i=0; i<15; i++) {
			for(int j=0; j<3; j++) {
				if(numbers[i][j] == -1){
					//label.setFont(font);
					add(new JLabel(" "));
				}
				else {
					//label.setFont(font);
					add(new JLabel(numbers[i][j]+" "));
				}
			}
		}
	}
	
		public int[][] getWestFive(){
			int[][] numbers1 = {{-1,-1,0},{-1,-1,1},{1,1,1},{-1,1,1},{-1,-1,1}}; // 하트
			int[][] numbers2 = {{-1,-1,1},{-1,-1,2},{-1,1,1},{-1,-1,2},{-1,-1,2}}; // 음표
			int[][] numbers3 = {{-1,-1,1},{-1,-1,3},{-1,-1,5},{-1,-1,1},{-1,-1,3}}; // 전투기
			int[][] numbers4 = {{-1,-1,2},{-1,-1,3},{-1,-1,4},{-1,3,1},{-1,3,1}}; // 하이힐
			if(five.ranNum == 0)
				return numbers1;
			else if(five.ranNum == 1)
				return numbers2;
			else if(five.ranNum ==2)
				return numbers3;
			else
				return numbers4;
		}
		
		public int[][] getWestTen(){
			int[][] numbers1 = {{-1,-1,-1,3,3},{-1,-1,-1,-1,10},{-1,-1,1,6,1},{-1,-1,-1,-1,8},{-1,-1,-1,2,6},{-1,-1,2,2,3},{-1,-1,1,2,2},{-1,-1,-1,2,1},{-1,-1,-1,-1,2},{-1,-1,-1,-1,2}}; // 야자수
			int[][] numbers2 = {{-1,-1,-1,-1,3},{-1,-1,-1,-1,5},{-1,-1,-1,-1,6},{-1,-1,-1,1,3},{-1,-1,-1,-1,3},{-1,-1,-1,-1,3},{-1,-1,-1,-1,3},{-1,-1,-1,3,4},{-1,-1,3,1,2},{-1,-1,-1,4,4}}; // 홍학
			int[][] numbers3 = {{1,1,2,1,1},{-1,1,1,2,1},{-1,1,1,2,1},{-1,-1,-1,4,1},{-1,-1,-1,-1,3},{-1,-1,-1,-1,1},{-1,-1,-1,1,1},{-1,-1,-1,-1,1},{-1,-1,-1,-1,1},{-1,-1,-1,-1,10}}; // 떨어지는 사과
			int[][] numbers4 = {{-1,-1,-1,-1,4},{-1,-1,-1,-1,6},{-1,-1,-1,2,5},{-1,-1,-1,-1,10},{-1,-1,2,1,5},{-1,-1,-1,-1,10},{-1,-1,-1,-1,10},{-1,-1,-1,-1,8},{-1,-1,-1,-1,6},{-1,-1,-1,-1,4}}; // 볼링공
			if(ten.ranNum == 0)
				return numbers1;
			else if(ten.ranNum == 1)
				return numbers2;
			else if(ten.ranNum ==2)
				return numbers3;
			else
				return numbers4;
		}
		
		public int[][] getWestFift(){
			int[][] numbers1 = {{-1,4,4},{-1,4,4},{-1,6,4},{-1,4,4},{-1,4,6},{-1,4,4},{-1,4,4},{-1,7,4},{-1,9,4},{-1,-1,14},{-1,-1,15},{-1,4,8},{-1,-1,9},{-1,3,8},{-1,-1,5}};//고무장화
			int[][] numbers2 = {{-1,-1,7},{-1,-1,9},{-1,-1,11},{-1,-1,11},{-1,-1,1},{-1,-1,1},{-1,3,1},{-1,3,1},{-1,3,1},{2,3,2},{2,2,3},{-1,-1,11},{-1,-1,10},{-1,-1,8},{-1,-1,6}};//우산
			int[][] numbers3 = {{-1,-1,1},{-1,-1,3},{-1,-1,7},{-1,-1,9},{-1,-1,9},{-1,9,1},{-1,1,12},{-1,-1,15},{-1,-1,15},{-1,6,6},{-1,6,6},{-1,6,6},{-1,6,6},{-1,6,5},{-1,-1,5}};//들소
			int[][] numbers4 = {{-1,-1,3},{-1,-1,5},{-1,-1,7},{-1,-1,9},{-1,-1,9},{-1,-1,10},{-1,2,10},{4,1,7},{-1,4,9},{-1,-1,15},{-1,-1,13},{-1,-1,11},{-1,2,2},{-1,1,2},{-1,-1,1}};//카푸치노
			if(fift.ranNum == 0)
				return numbers1;
			else if(fift.ranNum == 1)
				return numbers2;
			else if(fift.ranNum ==2)
				return numbers3;
			else
				return numbers4;
		}
	}
	
	//label.setHorizontalAlignment(JLabel.RIGHT);
	/*setText("<html>"+numbers[0][0]+"<br>"+"<br>"+numbers[1][0]+"<br>"+"<br>"+numbers[2][0]+numbers[2][1]+numbers[2][2]+
			"<br>"+"<br>"+numbers[3][0]+"<br>"+"<br>"+numbers[3][1]+"<br>"+"<br>"+numbers[4][0]+"<html>");
	setHorizontalAlignment(JLabel.RIGHT);
	
	Font font = new Font("Sanserif", Font.PLAIN, 30);
	setFont(font);*/
