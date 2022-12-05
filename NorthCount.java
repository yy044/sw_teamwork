import javax.swing.*;
import java.awt.*;

public class NorthCount extends JPanel {
	
	public static int[][] numbers; // = {{-1,-1,1,1,1,-1},{-1,1,1,1,1,1}}; // 하트
	public JLabel label;
	private FiveRows five;//원래는 rows
	private TenRows ten;
	private FifteenRows fift;
	
	public NorthCount(FiveRows f) {
		five = f;
		setLayout(new GridLayout(2,6));
		numbers = getNorthFive();
		for(int i=0; i<2; i++) {
			for(int j=0; j<6; j++) {
				if(numbers[i][j] == -1)
					add(new JLabel(" "));
				else
					add(new JLabel(" " + numbers[i][j] + " "));
			}
		}
	}
	
	public NorthCount(TenRows t) {
		ten = t;
		setLayout(new GridLayout(4,13));
		numbers = getNorthTen();
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				if(numbers[i][j] == -1)
					add(new JLabel(" "));
				else
					add(new JLabel(" " + numbers[i][j] + " "));
			}
		}
	}
	
	public NorthCount(FifteenRows ft) {
		fift = ft;
		setLayout(new GridLayout(3,17));
		numbers = getNorthFift();
		for(int i=0; i<3; i++) {
			for(int j=0; j<17; j++) {
				if(numbers[i][j] == -1)
					add(new JLabel(" "));
				else
					add(new JLabel(" " + numbers[i][j] + " "));
			}
		}
	}
	
	public int[][] getNorthFive(){
		int[][] numbers1 = {{-1,-1,1,1,1,-1},{-1,1,1,1,1,1}}; // 하트
		int[][] numbers2 = {{-1,-1,-1,-1,-1,-1},{-1,0,2,5,1,1}}; // 음표
		int[][] numbers3 = {{-1,-1,2,-1,2,-1},{-1,1,1,5,1,1}}; // 전투기
		int[][] numbers4 = {{-1,-1,-1,-1,-1,-1},{-1,2,3,4,3,5}}; // 하이힐
		if(five.ranNum == 0)
			return numbers1;
		else if(five.ranNum == 1)
			return numbers2;
		else if(five.ranNum ==2)
			return numbers3;
		else
			return numbers4;
	}
	
	public int[][] getNorthTen(){
		int[][] numbers1 = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,2,2,-1,-1,-1,-1,-1,-1,2,2},{-1,-1,-1,3,3,4,4,9,9,5,6,4,4}}; // 야자수
		int[][] numbers2 = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,2,3,-1,6,4,1,1,-1,-1},{-1,-1,-1,2,4,5,10,1,1,1,1,3,3}}; // 홍학
		int[][] numbers3 = {{-1,-1,-1,-1,-1,1,-1,-1,-1,-1,1,-1,-1},{-1,-1,-1,-1,-1,1,1,1,2,-1,1,1,1},{-1,-1,-1,1,1,1,1,2,2,-1,1,1,1},{-1,-1,-1,1,1,1,1,1,1,9,1,1,1}}; // 떨어지는 사과
		int[][] numbers4 = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,3,2,4,-1,-1,-1,-1,-1},{-1,-1,-1,4,6,4,7,5,10,10,8,6,4}}; // 볼링공
		if(ten.ranNum == 0)
			return numbers1;
		else if(ten.ranNum == 1)
			return numbers2;
		else if(ten.ranNum ==2)
			return numbers3;
		else
			return numbers4;
	}
	
	public int[][] getNorthFift(){
		int[][] numbers1 = {{-1,-1,-1,-1,-1,1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,3,5,5,5,12,-1,11,-1,1,1,-1,-1,-1,-1,1},{-1,-1,2,2,2,1,1,11,1,14,6,5,14,14,14,14,4}};//고무장화
		int[][] numbers2 = {{-1,-1,-1,-1,-1,-1,-1,3,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1,2,4,4,4,4,-1,4,4,-1,-1,-1},{-1,-1,1,3,3,2,4,4,9,9,4,15,5,4,4,3,2}};//우산
		int[][] numbers3 = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,8,9,8,12,13,12,8,9,8,11,12,11,8,9,8}};//들소
		int[][] numbers4 = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,3,5,6,-1,7,-1,-1,-1,-1,-1,-1,-1},{-1,-1,3,5,9,6,3,5,15,4,12,11,10,9,6,5,3}};//카푸치노
		if(fift.ranNum == 0)
			return numbers1;
		else if(fift.ranNum == 1)
			return numbers2;
		else if(fift.ranNum ==2)
			return numbers3;
		else
			return numbers4;
	}
	
	//label.setHorizontalAlignment(JLabel.RIGHT);
	/*setText("<html>"+numbers[0][0]+"<br>"+"<br>"+numbers[1][0]+"<br>"+"<br>"+numbers[2][0]+numbers[2][1]+numbers[2][2]+
			"<br>"+"<br>"+numbers[3][0]+"<br>"+"<br>"+numbers[3][1]+"<br>"+"<br>"+numbers[4][0]+"<html>");
	setHorizontalAlignment(JLabel.RIGHT);
	
	Font font = new Font("Sanserif", Font.PLAIN, 30);
	setFont(font);*/

}