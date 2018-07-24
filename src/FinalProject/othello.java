package FinalProject;



import java.util.Scanner;

public class othello { // 오델로
	
	static void board(int tcount, int x, int y, String board[][]) {             // 오목을 플레이할 판 15 X 15

		System.out.print(" ");
		for(int i = 65; i < 73; i++) { 											// 판의 가로 줄 숫자를 출력
			System.out.print("   " + (char)i); 										// " "3칸 숫자의 길이를 맞춤.
		}
		System.out.println();													// 다음 줄로 개행
		System.out.println("  ┌─┬─┬─┬─┬─┬─┬─┬─┐");	
		for(int i = 1; i < 9; i++) {											// 판의 세로 줄 숫자와 틀 출력
			System.out.print((char)((char)i + '@') + " ");						// 일의 자리 숫자. (두칸)
			for(int j = 0; j < 9 ; j++) {										// 판의 가로줄과 좌표 배열을 출력.
				if(j != 8) {
					System.out.print("│" + board[i-1][j]);		
				}
				else {	
					System.out.print("│");
					System.out.print("\n");											// 끝에 도달하면 개행
					if(i !=8)														// 세로줄 출력
						System.out.println("  ├─┼─┼─┼─┼─┼─┼─┼─┤");	// board배열에 있는 값들을 가로 줄과 같이 출력.
				}
			}
		}
		System.out.println("  └─┴─┴─┴─┴─┴─┴─┴─┘");				// board배열에 있는 값들을 가로 줄과 같이 출력.
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
				if(board[x+NB[i][0]][y+NB[i][1]] == "●") {
					switch (i) {
					case 0 : // -1, -1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < y; k++) {
								if(board[x - j][y - k] == "○") {
									for(int l = x, u = y; l > x - j && u > y - k;l--, u--) {
										board[l][u] = "○";
									}
								}
							}
						}
						break;
					case 1 : // -1, 0
						for(int j = 1; j < x; j++) {
							if(board[x - j][y] == "○") {
								for(int l = x; l > x - j;l--) {							
									board[l][y] = "○";
								}
							}
						}
						break;
					case 2 : // -1, +1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(x - j >= 0 && y + k < 8) {
									if(board[x - j][y + k] == "○") {
										for(int l = x, u = y; l > x - j && u < y +k;l--, u++) {
											board[l][u] = "○";
										}
									}
								}
							}
						}
						break;
					case 3 : // 0, -1
						for(int k = 1; k < y ; k++) {
							if(board[x][y - k] == "○") {
								for(int u = y; u > y - k; u--) {
									board[x][u] = "○";
								}
							}
						}
						break;
					case 4 :   // 0, +1
						for(int k = 1; k < 8 - y; k++) {
							if(board[x][y + k] == "○") {
								for(int u = y; u < y + k; u++) {
									board[x][u] = "○";
								}
							}
						}
						break;
					case 5 : // +1, -1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < y; k++) {
								if(x + j < 8 && y - k >= 0) {
									if(board[x + j][y - k] == "○") {
										for(int l = x, u = y; l < x + j && u > y - k;l++, u--) {
											board[l][u] = "○";
										}
									}
								}
							}
						}
						break;
					case 6 : // +1 , 0
						for(int j = 1; j < 8 - x; j++) {
								if(board[x + j][y] == "○") {
									for(int l = x; l < x + j;l++) {
										board[l][y] = "○";
									}
								}
						}
						break;
					case 7 : // +1, +1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(board[x + j][y + k] == "○") {
									for(int l = x, u = y; l < x + j && u < y + k;l++, u++) {
										board[l][u] = "○";
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
				if(board[x+NB[i][0]][y+NB[i][1]] == "○") {
					switch (i) {
					case 0 : // -1, -1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < y; k++) {
								if(board[x - j][y - k] == "●") {
									for(int l = x, u = y; l > x - j && u > y - k;l--, u--) {
										board[l][u] = "●";
									}
								}
							}
						}
						break;
					case 1 : // -1, 0
						for(int j = 1; j < x; j++) {
							if(board[x - j][y] == "●") {
								for(int l = x; l > x - j;l--) {							
									board[l][y] = "●";
								}
							}
						}
						break;
					case 2 : // -1, +1
						for(int j = 1; j < x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(x - j >= 0 && y + k < 8) {
									if(board[x - j][y + k] == "●") {
										for(int l = x, u = y; l > x - j && u < y +k;l--, u++) {
											board[l][u] = "●";
										}
									}
								}
							}
						}
						break;
					case 3 : // 0, -1
						for(int k = 1; k < y ; k++) {
							if(board[x][y - k] == "●") {
								for(int u = y; u > y - k; u--) {
									board[x][u] = "●";
								}
							}
						}
						break;
					case 4 :   // 0, +1
						for(int k = 1; k < 8 - y; k++) {
							if(board[x][y + k] == "●") {
								for(int u = y; u < y + k; u++) {
									board[x][u] = "●";
								}
							}
						}
						break;
					case 5 : // +1, -1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < y; k++) {
								if(x + j < 8 && y - k >= 0) {
									if(board[x + j][y - k] == "●") {
										for(int l = x, u = y; l < x + j && u > y - k;l++, u--) {
											board[l][u] = "●";
										}
									}
								}
							}
						}
						break;
					case 6 : // +1 , 0
						for(int j = 1; j < 8 - x; j++) {
								if(board[x + j][y] == "●") {
									for(int l = x; l < x + j;l++) {
										board[l][y] = "●";
									}
								}
						}
						break;
					case 7 : // +1, +1
						for(int j = 1; j < 8 - x; j++) {
							for(int k = 1; k < 8 - y; k++) {
								if(board[x + j][y + k] == "●") {
									for(int l = x, u = y; l < x + j && u < y + k;l++, u++) {
										board[l][u] = "●";
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
		int tcount = 0, x = 0, y = 0;											// count=턴을 계산 (x,y)=입력 받은 위치
		String input;															// Scanner로 받은 좌표를 저장할 변수
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = "  ";            					    	      	// 입력받을 좌표에 '  '를 넣어 판의 형태를 만듬.(두칸)
			}
		}
		board[3][3] = board[4][4] = "○";
		board[3][4] = board[4][3] = "●";
		
		System.out.println("오델로 게임");
		board(tcount, x, y,board);												// 판 보여주기
		while(true) {
			System.out.println("원하는 위치를 입력하세요.");
			input = sc.nextLine();												// 입력한 값을 input에 저장
			if(input.length() == 2) {											// 입력한 값의 길이를 확인
				x = input.charAt(0) - '@'; 										// 입력받은 문자를 x,y에 저장 charAt
				y = input.charAt(1) - '@';										// 문자를 계산 가능한 정수로 변환.(-'0')
				x--;
				y--;
				if(input.length() != 2 || x < 0 || x > 8 || y < 0 ||
						y > 8 || board[x][y] =="●" || board[x][y] =="○") {
					System.out.println("잘못된 입력입니다.");
					checkwin(board);
//					continue;
				}
				
				tcount++;
				if(tcount % 2 == 1) {											// count를 계산
					board[x][y] = "●";											// 홀수 일 경우 검은 돌
				}
				if(tcount % 2 == 0) {
					board[x][y] = "○";											// 짝수일 경우 흰 돌
				}
				changes(board,x,y,tcount);										// 돌 뒤집는 메소드 호출.
			}
		}	
	}

	private static void checkwin(String[][] board) {
		// TODO Auto-generated method stub
		int bcount = 0,wcount = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(board[i][j] == "●") {
					bcount++;
				}
				if(board[i][j] == "○") {
					wcount++; 
				}
			}
		}
		System.out.printf("흑 : %d,  백 : %d \n",bcount, wcount);
		if(bcount > wcount) {
			System.out.println("흑 승");
		}
		else {
			System.out.println("백 승");
		}
	}
}