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
			System.out.println("������ ������ �Է��ϼ���.\n 1. ����\n 2.������\n 3.��Ʋ�� \n 4. ����");
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
				System.out.println("���� ����");
				t = false;
				break;
			}
		}

	}
}
