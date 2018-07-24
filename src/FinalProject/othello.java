package FinalProject;



import java.util.Scanner;

public class othello { // ������
	
	static void board(int tcount, int x, int y, String board[][]) {             // ������ �÷����� �� 15 X 15

		System.out.print(" ");
		for(int i = 65; i < 73; i++) { 											// ���� ���� �� ���ڸ� ���
			System.out.print("   " + (char)i); 										// " "3ĭ ������ ���̸� ����.
		}
		System.out.println();													// ���� �ٷ� ����
		System.out.println("  ����������������������������������");	
		for(int i = 1; i < 9; i++) {											// ���� ���� �� ���ڿ� Ʋ ���
			System.out.print((char)((char)i + '@') + " ");						// ���� �ڸ� ����. (��ĭ)
			for(int j = 0; j < 9 ; j++) {										// ���� �����ٰ� ��ǥ �迭�� ���.
				if(j != 8) {
					System.out.print("��" + board[i-1][j]);		
				}
				else {	
					System.out.print("��");
					System.out.print("\n");											// ���� �����ϸ� ����
					if(i !=8)														// ������ ���
						System.out.println("  ����������������������������������");	// board�迭�� �ִ� ������ ���� �ٰ� ���� ���.
				}
			}
		}
		System.out.println("  ����������������������������������");				// board�迭�� �ִ� ������ ���� �ٰ� ���� ���.
	}

	static void changes(String[][] board, int x, int y, int tcount) {
	// TODO Auto-generated method stub
		final int[][] NB = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	
		if(tcount % 2 == 0) {
			for(int i = 0; i < NB.length; i++) {
				if((x == 0 && i < 3) || (x == 8 && i < 4) || (y == 0 && i == 0) || (y == 0 && i ==3) 
						|| ( y == 0 && i == 5) || (y == 8 && i == 2) || (y == 8 && i == 4) 
						|| (y == 8 && i == 7)) {
					continue;
				}
				if(board[x+NB[i][0]][y+NB[i][1]] == "��") {
					switch (i) {
					case 0 : // -1, -1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < y; k++) {
								if(board[x - j][y - k] == "��") {
									for(int l = x, u = y; l > x - j && u > y - k;l--, u--) {
										board[l][u] = "��";
									}
								}
							}
						}
						break;
					case 1 : // -1, 0
						for(int j = 1; j < x; j++) {
							if(board[x - j][y] == "��") {
								for(int l = x; l > x - j;l--) {							
									board[l][y] = "��";
								}
							}
						}
						break;
					case 2 : // -1, +1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(x - j >= 0 && y + k < 8) {
									if(board[x - j][y + k] == "��") {
										for(int l = x, u = y; l > x - j && u < y +k;l--, u++) {
											board[l][u] = "��";
										}
									}
								}
							}
						}
						break;
					case 3 : // 0, -1
						for(int k = 1; k < y ; k++) {
							if(board[x][y - k] == "��") {
								for(int u = y; u > y - k; u--) {
									board[x][u] = "��";
								}
							}
						}
						break;
					case 4 :   // 0, +1
						for(int k = 1; k < 8 - y; k++) {
							if(board[x][y + k] == "��") {
								for(int u = y; u < y + k; u++) {
									board[x][u] = "��";
								}
							}
						}
						break;
					case 5 : // +1, -1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < y; k++) {
								if(x + j < 8 && y - k >= 0) {
									if(board[x + j][y - k] == "��") {
										for(int l = x, u = y; l < x + j && u > y - k;l++, u--) {
											board[l][u] = "��";
										}
									}
								}
							}
						}
						break;
					case 6 : // +1 , 0
						for(int j = 1; j < 8 - x; j++) {
								if(board[x + j][y] == "��") {
									for(int l = x; l < x + j;l++) {
										board[l][y] = "��";
									}
								}
						}
						break;
					case 7 : // +1, +1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(board[x + j][y + k] == "��") {
									for(int l = x, u = y; l < x + j && u < y + k;l++, u++) {
										board[l][u] = "��";
									}
								}
							}
						}
						break;
					}
				}
			}	
		}
		if(tcount % 2 == 1) {
			for(int i = 0; i < NB.length; i++) {
				if(board[x+NB[i][0]][y+NB[i][1]] == "��") {
					switch (i) {
					case 0 : // -1, -1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < y; k++) {
								if(board[x - j][y - k] == "��") {
									for(int l = x, u = y; l > x - j && u > y - k;l--, u--) {
										board[l][u] = "��";
									}
								}
							}
						}
						break;
					case 1 : // -1, 0
						for(int j = 1; j < x; j++) {
							if(board[x - j][y] == "��") {
								for(int l = x; l > x - j;l--) {							
									board[l][y] = "��";
								}
							}
						}
						break;
					case 2 : // -1, +1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(x - j >= 0 && y + k < 8) {
									if(board[x - j][y + k] == "��") {
										for(int l = x, u = y; l > x - j && u < y +k;l--, u++) {
											board[l][u] = "��";
										}
									}
								}
							}
						}
						break;
					case 3 : // 0, -1
						for(int k = 1; k < y ; k++) {
							if(board[x][y - k] == "��") {
								for(int u = y; u > y - k; u--) {
									board[x][u] = "��";
								}
							}
						}
						break;
					case 4 :   // 0, +1
						for(int k = 1; k < 8 - y; k++) {
							if(board[x][y + k] == "��") {
								for(int u = y; u < y + k; u++) {
									board[x][u] = "��";
								}
							}
						}
						break;
					case 5 : // +1, -1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < y; k++) {
								if(x + j < 8 && y - k >= 0) {
									if(board[x + j][y - k] == "��") {
										for(int l = x, u = y; l < x + j && u > y - k;l++, u--) {
											board[l][u] = "��";
										}
									}
								}
							}
						}
						break;
					case 6 : // +1 , 0
						for(int j = 1; j < 8 - x; j++) {
								if(board[x + j][y] == "��") {
									for(int l = x; l < x + j;l++) {
										board[l][y] = "��";
									}
								}
						}
						break;
					case 7 : // +1, +1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(board[x + j][y + k] == "��") {
									for(int l = x, u = y; l < x + j && u < y + k;l++, u++) {
										board[l][u] = "��";
									}
								}
							}
						}
						break;
					}
				}
			}	
		}
		board(tcount,x,y,board);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[][] board = new String[8][8];
		int tcount = 0, x = 0, y = 0;											// count=���� ��� (x,y)=�Է� ���� ��ġ
		String input;															// Scanner�� ���� ��ǥ�� ������ ����
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = "  ";            					    	      	// �Է¹��� ��ǥ�� '  '�� �־� ���� ���¸� ����.(��ĭ)
			}
		}
		board[3][3] = board[4][4] = "��";
		board[3][4] = board[4][3] = "��";
		
		System.out.println("������ ����");
		board(tcount, x, y,board);												// �� �����ֱ�
		while(true) {
			System.out.println("���ϴ� ��ġ�� �Է��ϼ���.");
			input = sc.nextLine();												// �Է��� ���� input�� ����
			if(input.length() == 2) {											// �Է��� ���� ���̸� Ȯ��
				x = input.charAt(0) - '@'; 										// �Է¹��� ���ڸ� x,y�� ���� charAt
				y = input.charAt(1) - '@';										// ���ڸ� ��� ������ ������ ��ȯ.(-'0')
				x--;
				y--;
				if(input.length() != 2 || x < 0 || x > 8 || y < 0 ||
						y > 8 || board[x][y] =="��" || board[x][y] =="��") {
					System.out.println("�߸��� �Է��Դϴ�.");
					checkwin(board);
//					continue;
				}
				
				tcount++;
				if(tcount % 2 == 1) {											// count�� ���
					board[x][y] = "��";											// Ȧ�� �� ��� ���� ��
				}
				if(tcount % 2 == 0) {
					board[x][y] = "��";											// ¦���� ��� �� ��
				}
				changes(board,x,y,tcount);										// �� ������ �޼ҵ� ȣ��.
			}
		}	
	}

	private static void checkwin(String[][] board) {
		// TODO Auto-generated method stub
		int bcount = 0,wcount = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(board[i][j] == "��") {
					bcount++;
				}
				if(board[i][j] == "��") {
					wcount++; 
				}
			}
		}
		System.out.printf("�� : %d,  �� : %d \n",bcount, wcount);
		if(bcount > wcount) {
			System.out.println("�� ��");
		}
		else {
			System.out.println("�� ��");
		}
	}
}