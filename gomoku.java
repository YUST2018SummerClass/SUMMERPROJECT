package summerproject;

import java.util.Scanner;

public class gomoku { //���� ����
	
	static void board(int tcount, int x, int y, String board[][]) {             // ������ �÷����� �� 15 X 15

		for(int i = 65; i < 80; i++) { 											// ���� ���� �� ���ڸ� ���
		System.out.print("   " + (char)i); 										// " "3ĭ ������ ���̸� ����.
		}
		System.out.println(); 													// ���� �ٷ� ����
		for(int i = 1; i < 16; i++) {											// ���� ���� �� ���ڿ� Ʋ ���
				System.out.print((char)((char)i + '@') + "  ");									// ���� �ڸ� ����. (��ĭ)
			for(int j = 0 ; j < 15 ; j++) {										// ���� �����ٰ� ��ǥ �迭�� ���.
				if(j !=14) {
				System.out.print(board[i-1][j]+"--");							// board�迭�� �ִ� ������ ���� �ٰ� ���� ���.
				}
				else {										
				System.out.print(board[i-1][j] + "\n");						// ���� �����ϸ� ����
				if(i !=15)														// ������ ���
				System.out.println("   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |");		
				}
			}
		}
	}
	static void checkwin(int x, int y, int tcount, String board[][]) {			// �¸��� Ȯ���ϴ� �޼ҵ�
		int wcount = 0;
		
		if(tcount % 2 == 0) {													// tcount�� ¦���� ���(��)
			if(true) {															// ��ǥ�� ���� ���� ������ �Ʒ� �κ� ���� Ȯ��
				for(int i = 0; i < 5; i++) {									
					if((x - i) < 0) {											// x - i�� ���� ���� �Ѿ�� break.
						break;
					}
					if(board[x - i][y] != "��") {								// ��ǥ�� ���� ������ �Ʒ� ������ Ȯ��. ���� ��� break.
						break;													
					} 
					else if(board[x - i][y] == "��"){							// ��ǥ�� ������ �Ʒ� ������ Ȯ���ϸ� ���� ��� wcount�� ����.
						wcount++;
						if(wcount == 6) {										// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
							System.out.println("���� ����. �� ��");
						}
					}
				}
				for(int i = 0; i < 5; i++) {									// ��ǥ�� ���� ���� ������ �� �κ� ���� Ȯ��
					if((x + i) > 15) {											// x + i�� ���� ���� �Ѿ�� break.
						break;
					}
					if(board[x + i][y] != "��") {								// ��ǥ�� ���� ������ �� ������ Ȯ��. ���� ��� break.
						break;
					} 
					else if(board[x + i][y] == "��"){							// ��ǥ�� ���� ������ �� ������ Ȯ���ϸ� ���� ��� wcount�� ����.
						wcount++;
						if(wcount == 6) {										// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
							System.out.println("���� ����. �� ��");
						}
					}
				}
			}
			wcount = 0;															// wcount �� �ʱ�ȭ.
			if(true) { // ����
				for(int i = 0; i < 5; i++) {									// ��ǥ�� ���� ���� ������ ���� �κ� ���� Ȯ��. 
					if((y - i) < 0) {											// y - i�� ���� ���� �Ѿ�� break.
						break;
					}
					if(board[x][y - i] != "��") {								// ��ǥ�� ���� ���� ������ ������ Ȯ��. ���� ��� break.
						break;													
					} 
					else if(board[x][y - i] == "��"){							// ��ǥ�� ���� ���� ������ ������ ������ Ȯ���ϸ� ���� ��� wcount�� ����.
						wcount++;
						if(wcount == 6) {												// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
							System.out.println("���� ����. �� ��");
						}		
					}
				}
				for(int i = 0; i < 5; i++) {									// ��ǥ�� ���� ���� ������ ������ �κ� ���� Ȯ��.
					if((y + 1) > 15) {											// y + i�� ���� ���� �Ѿ�� break.
						break;
					}
					if(board[x][y + i] != "��") {								// ��ǥ�� ���� ���� ������ ������ ������ Ȯ��. ���� ��� break.
						break;
					} 
					else if(board[x][y + i] == "��"){							// ��ǥ�� ���� ���� ������ ������ ������ Ȯ���ϸ� ���� ��� wcount�� ����.
						wcount++;
						if(wcount == 6) {												// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
							System.out.println("���� ����. �� ��");
						}		
					}
				}
			}	
			wcount = 0;															// wcount �� �ʱ�ȭ.
			if(true) { // / ���� �Ʒ��� ������ ��
				for(int i = 0; i < 5; i++) {									
					if((x - i) < 0) {											// x - i�� ���� ���� �Ѿ�� break.
						break;
					}
					if((y + i) > 15) {											// y + i�� ���� ���� �Ѿ�� break.
						break;						
					}
					if(board[x - i][y + i] != "��") {							// ��ǥ�� ���� �밢�� ������ ���� Ȯ��. ���� ��� break.
						break;													
					} 
					else if(board[x - i][y + i] == "��"){							// ��ǥ�� ���� �밢�� ������ ���� Ȯ���ϸ� ���� ��� wcount�� ����.
						wcount++;
						if(wcount == 6) {												// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
							System.out.println("���� ����. �� ��");
						}		
					}
				}
				for(int i = 0; i < 5; i++) {									// ��ǥ�� ���� �밢�� ���� �Ʒ� ���� ���� Ȯ��
					if((x + i) > 15) {											// x + i�� ���� ���� �Ѿ�� break.
						break;
					}
					if((y - i) < 0) {											// y - i�� ���� ���� �Ѿ�� break.
						break;						
					}
					if(board[x + i][y - i] != "��") {							// ��ǥ�� ���� �밢�� ���� �Ʒ� ������ Ȯ��. ���� ��� break.
						break;
					} 
					else if(board[x + i][y - i] == "��"){							// ��ǥ�� ���� ���� �Ʒ� ������ Ȯ���ϸ� ���� ��� wcount�� ����
						wcount++;
						if(wcount == 6) {												// wcount�� �������� ��ǥ���� �밢�� ������ ������ ��� �¸� ���
							System.out.println("���� ����. �� ��");
						}	
					}
				}
			}
			wcount = 0;															// wcount �� �ʱ�ȭ
			if(true) { // \
					for(int i = 0; i < 5; i++) {									
						if((x - i) < 0) {										// x - i�� ���� ���� �Ѿ�� break.
							break;
						}
						if((y - i) < 0) {										// y - i�� ���� ���� �Ѿ�� break.
							break;
						}
						if(board[x - i][y - i] != "��") {						// ��ǥ�� ���� �밢�� ���� �Ʒ��� Ȯ��. ���� ��� break.
							break;													
						} 
						else if(board[x - i][y - i] == "��"){					// ��ǥ�� ���� �밢�� ���� �Ʒ��� Ȯ���ϸ� ���� ��� wcount�� ����.
							wcount++;
							if(wcount == 6) {												// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
								System.out.println("���� ����. �� ��");
							}		
						}
					}
					for(int i = 0; i < 5; i++) {								// ��ǥ�� ���� �밢�� ������ �� ���� ���� Ȯ��
						if((x + i) > 15) {										// x + i�� ���� ���� �Ѿ�� break.
							break;
						}
						if((y + i) > 15) {										// y + i�� ���� ���� �Ѿ�� break.
							break;
						}
						if(board[x + i][y + i] != "��") {						// ��ǥ�� ���� �밢�� ������ �� ������ Ȯ��. ���� ��� break.
							break;
						} 
						else if(board[x + i][y + i] == "��"){					// ��ǥ�� ���� ������ �� ������ Ȯ���ϸ� ���� ��� wcount�� ����
							wcount++;
							if(wcount == 6) {									// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���
								System.out.println("���� ����. �� ��");
							}				
						}
					}
				}
			wcount = 0;															// wcount �� �ʱ�ȭ
			}
		
		
			if(tcount % 2 == 1) {	
				if(true) {														// ��ǥ�� ���� ���� ������ �Ʒ� �κ� ���� Ȯ��
					for(int i = 0; i < 5; i++) {									
						if((x - i) < 0) {										// x - i�� ���� ���� �Ѿ�� break.
							break;
						}
						if(board[x - i][y] != "��") {							// ��ǥ�� ���� ������ �Ʒ� ������ Ȯ��. ���� ��� break.
							break;													
						} 
						else if(board[x - i][y] == "��"){						// ��ǥ�� ������ �Ʒ� ������ Ȯ���ϸ� ���� ��� wcount�� ����.
							wcount++;
							if(wcount == 6) {											// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
								System.out.println("���� ����. �� ��");
							}
						}
					}
					for(int i = 0; i < 5; i++) {								// ��ǥ�� ���� ���� ������ �� �κ� ���� Ȯ��
						if((x + i) > 14) {										// x + i�� ���� ���� �Ѿ�� break.
							break;
						}
						if(board[x + i][y] != "��") {							// ��ǥ�� ���� ������ �� ������ Ȯ��. ���� ��� break.
							break;
						} 
						else if(board[x + i][y] == "��"){						// ��ǥ�� ���� ������ �� ������ Ȯ���ϸ� ���� ��� wcount�� ����.
							wcount++;
							if(wcount == 6) {											// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
								System.out.println("���� ����. �� ��");
							}
						}
					}
				}
				wcount = 0;														// wcount �� �ʱ�ȭ.
				if(true) { // ����
					for(int i = 0; i < 5; i++) {								// ��ǥ�� ���� ���� ������ ���� �κ� ���� Ȯ��. 
						if((y - i) < 0)											// y - i�� ���� ���� �Ѿ�� break.
							break;
						if(board[x][y - i] != "��") {							// ��ǥ�� ���� ���� ������ ������ Ȯ��. ���� ��� break.
							break;													
						} 
						else if(board[x][y - i] == "��"){						// ��ǥ�� ���� ���� ������ ������ ������ Ȯ���ϸ� ���� ��� wcount�� ����.
							wcount++;
							if(wcount == 6) {											// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
								System.out.println("���� ����. �� ��");
							}	
						}
					}
					for(int i = 0; i < 5; i++) {								// ��ǥ�� ���� ���� ������ ������ �κ� ���� Ȯ��.
						if((y + 1) > 14) {										// y + i�� ���� ���� �Ѿ�� break.
							break;
						}
						if(board[x][y + i] != "��") {							// ��ǥ�� ���� ���� ������ ������ ������ Ȯ��. ���� ��� break.
							break;
						} 
						else if(board[x][y + i] == "��"){						// ��ǥ�� ���� ���� ������ ������ ������ Ȯ���ϸ� ���� ��� wcount�� ����.
							wcount++;
							if(wcount == 6) {											// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
								System.out.println("���� ����. �� ��");
							}		
						}
					}
				}
				wcount = 0;														// wcount �� �ʱ�ȭ.
				if(true) { // / ���� �Ʒ��� ������ ��
					for(int i = 0; i < 5; i++) {									
						if((x - i) < 0) {										// x - i�� ���� ���� �Ѿ�� break.
							break;
						}
						if((y + i) > 14) {										// y + i�� ���� ���� �Ѿ�� break.
							break;						
						}
						if(board[x - i][y + i] != "��") {						// ��ǥ�� ���� �밢�� ������ ���� Ȯ��. ���� ��� break.
							break;													
						} 
						else if(board[x - i][y + i] == "��"){						// ��ǥ�� ���� �밢�� ������ ���� Ȯ���ϸ� ���� ��� wcount�� ����.
							wcount++;
							if(wcount == 6) {											// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
								System.out.println("���� ����. �� ��");
							}
						}
					}
					for(int i = 0; i < 5; i++) {								// ��ǥ�� ���� �밢�� ���� �Ʒ� ���� ���� Ȯ��
						if((x + i) > 14) {										// x + i�� ���� ���� �Ѿ�� break.
							break;
						}
						if((y - i) < 0) {										// y - i�� ���� ���� �Ѿ�� break.
							break;						
						}
						if(board[x + i][y - i] != "��") {						// ��ǥ�� ���� �밢�� ���� �Ʒ� ������ Ȯ��. ���� ��� break.
							break;
						} 
						else if(board[x + i][y - i ] == "��"){						// ��ǥ�� ���� ���� �Ʒ� ������ Ȯ���ϸ� ���� ��� wcount�� ����
							wcount++;
							if(wcount == 6) {											// wcount�� �������� ��ǥ���� �밢�� ������ ������ ��� �¸� ���
								System.out.println("���� ����. �� ��");
							}	
						}
					}
				}
				wcount = 0;														// wcount �� �ʱ�ȭ
				if(true) { // \
						for(int i = 0; i < 5; i++) {									
							if((x - i) < 0) {									// x - i�� ���� ���� �Ѿ�� break.
								break;
							}
							if((y - i) < 0) {									// y - i�� ���� ���� �Ѿ�� break.
								break;
							}
							if(board[x - i][y - i] != "��") {					// ��ǥ�� ���� �밢�� ���� �Ʒ��� Ȯ��. ���� ��� break.
								break;													
							} 
							else if(board[x - i][y - i] == "��"){				// ��ǥ�� ���� �밢�� ���� �Ʒ��� Ȯ���ϸ� ���� ��� wcount�� ����.
								wcount++;
								if(wcount == 6) {											// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���.
									System.out.println("���� ����. �� ��");
								}
							}
						}
						for(int i = 0; i < 5; i++) {							// ��ǥ�� ���� �밢�� ������ �� ���� ���� Ȯ��
							if((x + i) > 14) {									// x + i�� ���� ���� �Ѿ�� break.
								break;
							}
							if((y + i) > 14) {									// y + i�� ���� ���� �Ѿ�� break.
								break;
							}
							if(board[x + i][y + i] != "��") {					// ��ǥ�� ���� �밢�� ������ �� ������ Ȯ��. ���� ��� break.
								break;
							} 
							else if(board[x + i][y + i] == "��"){				// ��ǥ�� ���� ������ �� ������ Ȯ���ϸ� ���� ��� wcount�� ����
								wcount++;
								if(wcount == 6) {										// wcount�� �������� ��ǥ���� ������ ������ ��� �¸� ���
									System.out.println("���� ����. �� ��");
								}				
							}
						}
					}
				wcount = 0;														// wcount �� �ʱ�ȭ
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[][] board = new String [15][15];			       					// char���� 15x15 �迭. ���� ����ϱ� ���� char
		int tcount = 0, x = 0, y = 0;											// count=���� ��� (x,y)=�Է� ���� ��ġ
		String input;															// Scanner�� ���� ��ǥ�� ������ ����
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = "|-";            					    	      	// �Է¹��� ��ǥ�� '+'�� �־� ���� ���¸� ����.
			}
		}
		
		
		System.out.println("���� ����");
		board(tcount, x, y,board);												// �� �����ֱ�
		while(true) {
			System.out.println("���ϴ� ��ġ�� �Է��ϼ���.");
			input = sc.nextLine();												// �Է��� ���� input�� ����
		
			if(input.length() == 2) {											// �Է��� ���� ���̸� Ȯ��
				x = input.charAt(0) - '@'; 										// �Է¹��� ���ڸ� x,y�� ���� charAt
				y = input.charAt(1) - '@';										// ���ڸ� ��� ������ ������ ��ȯ.(-'0')
				x--;
				y--;
				if(input.length() != 2 || x < 0 || x > 15 || y < 0 ||
						y > 15 || board[x][y] =="��" || board[x][y] =="��") {
					System.out.println("�߸��� �Է��Դϴ�.");
					continue;
				}
				tcount++;
				if(tcount % 2 != 0) {											// count�� ���
					board[x][y] = "��";											// Ȧ�� �� ��� ���� ��
				}
				if(tcount % 2 == 0) {
					board[x][y] = "��";											// ¦���� ��� �� ��
				}
				checkwin(x, y, tcount, board);
				board(tcount,x,y,board);
			}
		}
	}	
}

