package FinalProject;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		boolean t = true;
		gomoku gomoku = new gomoku();
		Battleship Battleship = new Battleship();
		othello othello = new othello();
		
		while(t) {	
			System.out.println("진행할 게임을 입력하세요.\n 1. 오목\n 2.오델로\n 3.배틀쉽 \n 4. 종료");
			input = sc.nextInt();
			switch(input) {
			case 1 :
				gomoku.main(args);
				break;
			case 2 :
				othello.main(args);
				break;
			case 3 :
				Battleship.main(args);
				break;
			case 4 :
				System.out.println("게임 종료");
				t = false;
				break;
			}
		}

	}
}
