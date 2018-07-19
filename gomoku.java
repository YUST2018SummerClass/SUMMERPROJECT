package summerproject;

import java.util.Scanner;

public class gomoku { //오목 최종
	
	static void board(int tcount, int x, int y, String board[][]) {             // 오목을 플레이할 판 15 X 15

		for(int i = 65; i < 80; i++) { 											// 판의 가로 줄 숫자를 출력
		System.out.print("   " + (char)i); 										// " "3칸 숫자의 길이를 맞춤.
		}
		System.out.println(); 													// 다음 줄로 개행
		for(int i = 1; i < 16; i++) {											// 판의 세로 줄 숫자와 틀 출력
				System.out.print((char)((char)i + '@') + "  ");									// 일의 자리 숫자. (두칸)
			for(int j = 0 ; j < 15 ; j++) {										// 판의 가로줄과 좌표 배열을 출력.
				if(j !=14) {
				System.out.print(board[i-1][j]+"--");							// board배열에 있는 값들을 가로 줄과 같이 출력.
				}
				else {										
				System.out.print(board[i-1][j] + "\n");						// 끝에 도달하면 개행
				if(i !=15)														// 세로줄 출력
				System.out.println("   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |");		
				}
			}
		}
	}
	static void checkwin(int x, int y, int tcount, String board[][]) {			// 승리를 확인하는 메소드
		int wcount = 0;
		
		if(tcount % 2 == 0) {													// tcount가 짝수일 경우(백)
			if(true) {															// 좌표값 기준 세로 라인의 아래 부분 오목 확인
				for(int i = 0; i < 5; i++) {									
					if((x - i) < 0) {											// x - i의 값이 판을 넘어가면 break.
						break;
					}
					if(board[x - i][y] != "○") {								// 좌표값 기준 세로의 아래 라인을 확인. 없을 경우 break.
						break;													
					} 
					else if(board[x - i][y] == "○"){							// 좌표값 세로의 아래 라인을 확인하며 있을 경우 wcount를 증가.
						wcount++;
						if(wcount == 6) {										// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
							System.out.println("게임 종료. 백 승");
						}
					}
				}
				for(int i = 0; i < 5; i++) {									// 좌표값 기준 세로 라인의 윗 부분 오목 확인
					if((x + i) > 15) {											// x + i의 값이 판을 넘어가면 break.
						break;
					}
					if(board[x + i][y] != "○") {								// 좌표값 기준 세로의 윗 라인을 확인. 없을 경우 break.
						break;
					} 
					else if(board[x + i][y] == "○"){							// 좌표값 기준 세로의 윗 라인을 확인하며 있을 경우 wcount를 증가.
						wcount++;
						if(wcount == 6) {										// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
							System.out.println("게임 종료. 백 승");
						}
					}
				}
			}
			wcount = 0;															// wcount 값 초기화.
			if(true) { // 가로
				for(int i = 0; i < 5; i++) {									// 좌표값 기준 가로 라인의 왼쪽 부분 오목 확인. 
					if((y - i) < 0) {											// y - i의 값이 판을 넘어가면 break.
						break;
					}
					if(board[x][y - i] != "○") {								// 좌표값 기준 가로 라인의 왼쪽을 확인. 없을 경우 break.
						break;													
					} 
					else if(board[x][y - i] == "○"){							// 좌표값 기준 가로 라인의 오른쪽 라인을 확인하며 있을 경우 wcount를 증가.
						wcount++;
						if(wcount == 6) {												// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
							System.out.println("게임 종료. 백 승");
						}		
					}
				}
				for(int i = 0; i < 5; i++) {									// 좌표값 기준 가로 라인의 오른쪽 부분 오목 확인.
					if((y + 1) > 15) {											// y + i의 값이 판을 넘어가면 break.
						break;
					}
					if(board[x][y + i] != "○") {								// 좌표값 기준 가로 라인의 오른쪽 라인을 확인. 없을 경우 break.
						break;
					} 
					else if(board[x][y + i] == "○"){							// 좌표값 기준 가로 라인의 오른쪽 라인을 확인하며 있을 경우 wcount를 증가.
						wcount++;
						if(wcount == 6) {												// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
							System.out.println("게임 종료. 백 승");
						}		
					}
				}
			}	
			wcount = 0;															// wcount 값 초기화.
			if(true) { // / 왼쪽 아래와 오른쪽 위
				for(int i = 0; i < 5; i++) {									
					if((x - i) < 0) {											// x - i의 값이 판을 넘어가면 break.
						break;
					}
					if((y + i) > 15) {											// y + i의 값이 판을 넘어가면 break.
						break;						
					}
					if(board[x - i][y + i] != "○") {							// 좌표값 기준 대각선 오른쪽 위를 확인. 없을 경우 break.
						break;													
					} 
					else if(board[x - i][y + i] == "○"){							// 좌표값 기준 대각선 오른쪽 위를 확인하며 있을 경우 wcount를 증가.
						wcount++;
						if(wcount == 6) {												// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
							System.out.println("게임 종료. 백 승");
						}		
					}
				}
				for(int i = 0; i < 5; i++) {									// 좌표값 기준 대각선 왼쪽 아래 라인 오목 확인
					if((x + i) > 15) {											// x + i의 값이 판을 넘어가면 break.
						break;
					}
					if((y - i) < 0) {											// y - i의 값이 판을 넘어가면 break.
						break;						
					}
					if(board[x + i][y - i] != "○") {							// 좌표값 기준 대각선 왼쪽 아래 라인을 확인. 없을 경우 break.
						break;
					} 
					else if(board[x + i][y - i] == "○"){							// 좌표값 기준 왼쪽 아래 라인을 확인하며 있을 경우 wcount를 증가
						wcount++;
						if(wcount == 6) {												// wcount를 바탕으로 좌표값의 대각선 라인이 오목일 경우 승리 출력
							System.out.println("게임 종료. 백 승");
						}	
					}
				}
			}
			wcount = 0;															// wcount 값 초기화
			if(true) { // \
					for(int i = 0; i < 5; i++) {									
						if((x - i) < 0) {										// x - i의 값이 판을 넘어가면 break.
							break;
						}
						if((y - i) < 0) {										// y - i의 값이 판을 넘어가면 break.
							break;
						}
						if(board[x - i][y - i] != "○") {						// 좌표값 기준 대각선 왼쪽 아래를 확인. 없을 경우 break.
							break;													
						} 
						else if(board[x - i][y - i] == "○"){					// 좌표값 기준 대각선 왼쪽 아래를 확인하며 있을 경우 wcount를 증가.
							wcount++;
							if(wcount == 6) {												// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
								System.out.println("게임 종료. 백 승");
							}		
						}
					}
					for(int i = 0; i < 5; i++) {								// 좌표값 기준 대각선 오른쪽 위 라인 오목 확인
						if((x + i) > 15) {										// x + i의 값이 판을 넘어가면 break.
							break;
						}
						if((y + i) > 15) {										// y + i의 값이 판을 넘어가면 break.
							break;
						}
						if(board[x + i][y + i] != "○") {						// 좌표값 기준 대각선 오른쪽 위 라인을 확인. 없을 경우 break.
							break;
						} 
						else if(board[x + i][y + i] == "○"){					// 좌표값 기준 오른쪽 위 라인을 확인하며 있을 경우 wcount를 증가
							wcount++;
							if(wcount == 6) {									// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력
								System.out.println("게임 종료. 백 승");
							}				
						}
					}
				}
			wcount = 0;															// wcount 값 초기화
			}
		
		
			if(tcount % 2 == 1) {	
				if(true) {														// 좌표값 기준 세로 라인의 아래 부분 오목 확인
					for(int i = 0; i < 5; i++) {									
						if((x - i) < 0) {										// x - i의 값이 판을 넘어가면 break.
							break;
						}
						if(board[x - i][y] != "●") {							// 좌표값 기준 세로의 아래 라인을 확인. 없을 경우 break.
							break;													
						} 
						else if(board[x - i][y] == "●"){						// 좌표값 세로의 아래 라인을 확인하며 있을 경우 wcount를 증가.
							wcount++;
							if(wcount == 6) {											// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
								System.out.println("게임 종료. 흑 승");
							}
						}
					}
					for(int i = 0; i < 5; i++) {								// 좌표값 기준 세로 라인의 윗 부분 오목 확인
						if((x + i) > 14) {										// x + i의 값이 판을 넘어가면 break.
							break;
						}
						if(board[x + i][y] != "●") {							// 좌표값 기준 세로의 윗 라인을 확인. 없을 경우 break.
							break;
						} 
						else if(board[x + i][y] == "●"){						// 좌표값 기준 세로의 윗 라인을 확인하며 있을 경우 wcount를 증가.
							wcount++;
							if(wcount == 6) {											// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
								System.out.println("게임 종료. 흑 승");
							}
						}
					}
				}
				wcount = 0;														// wcount 값 초기화.
				if(true) { // 가로
					for(int i = 0; i < 5; i++) {								// 좌표값 기준 가로 라인의 왼쪽 부분 오목 확인. 
						if((y - i) < 0)											// y - i의 값이 판을 넘어가면 break.
							break;
						if(board[x][y - i] != "●") {							// 좌표값 기준 가로 라인의 왼쪽을 확인. 없을 경우 break.
							break;													
						} 
						else if(board[x][y - i] == "●"){						// 좌표값 기준 가로 라인의 오른쪽 라인을 확인하며 있을 경우 wcount를 증가.
							wcount++;
							if(wcount == 6) {											// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
								System.out.println("게임 종료. 흑 승");
							}	
						}
					}
					for(int i = 0; i < 5; i++) {								// 좌표값 기준 가로 라인의 오른쪽 부분 오목 확인.
						if((y + 1) > 14) {										// y + i의 값이 판을 넘어가면 break.
							break;
						}
						if(board[x][y + i] != "●") {							// 좌표값 기준 가로 라인의 오른쪽 라인을 확인. 없을 경우 break.
							break;
						} 
						else if(board[x][y + i] == "●"){						// 좌표값 기준 가로 라인의 오른쪽 라인을 확인하며 있을 경우 wcount를 증가.
							wcount++;
							if(wcount == 6) {											// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
								System.out.println("게임 종료. 흑 승");
							}		
						}
					}
				}
				wcount = 0;														// wcount 값 초기화.
				if(true) { // / 왼쪽 아래와 오른쪽 위
					for(int i = 0; i < 5; i++) {									
						if((x - i) < 0) {										// x - i의 값이 판을 넘어가면 break.
							break;
						}
						if((y + i) > 14) {										// y + i의 값이 판을 넘어가면 break.
							break;						
						}
						if(board[x - i][y + i] != "●") {						// 좌표값 기준 대각선 오른쪽 위를 확인. 없을 경우 break.
							break;													
						} 
						else if(board[x - i][y + i] == "●"){						// 좌표값 기준 대각선 오른쪽 위를 확인하며 있을 경우 wcount를 증가.
							wcount++;
							if(wcount == 6) {											// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
								System.out.println("게임 종료. 흑 승");
							}
						}
					}
					for(int i = 0; i < 5; i++) {								// 좌표값 기준 대각선 왼쪽 아래 라인 오목 확인
						if((x + i) > 14) {										// x + i의 값이 판을 넘어가면 break.
							break;
						}
						if((y - i) < 0) {										// y - i의 값이 판을 넘어가면 break.
							break;						
						}
						if(board[x + i][y - i] != "●") {						// 좌표값 기준 대각선 왼쪽 아래 라인을 확인. 없을 경우 break.
							break;
						} 
						else if(board[x + i][y - i ] == "●"){						// 좌표값 기준 왼쪽 아래 라인을 확인하며 있을 경우 wcount를 증가
							wcount++;
							if(wcount == 6) {											// wcount를 바탕으로 좌표값의 대각선 라인이 오목일 경우 승리 출력
								System.out.println("게임 종료. 흑 승");
							}	
						}
					}
				}
				wcount = 0;														// wcount 값 초기화
				if(true) { // \
						for(int i = 0; i < 5; i++) {									
							if((x - i) < 0) {									// x - i의 값이 판을 넘어가면 break.
								break;
							}
							if((y - i) < 0) {									// y - i의 값이 판을 넘어가면 break.
								break;
							}
							if(board[x - i][y - i] != "●") {					// 좌표값 기준 대각선 왼쪽 아래를 확인. 없을 경우 break.
								break;													
							} 
							else if(board[x - i][y - i] == "●"){				// 좌표값 기준 대각선 왼쪽 아래를 확인하며 있을 경우 wcount를 증가.
								wcount++;
								if(wcount == 6) {											// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력.
									System.out.println("게임 종료. 흑 승");
								}
							}
						}
						for(int i = 0; i < 5; i++) {							// 좌표값 기준 대각선 오른쪽 위 라인 오목 확인
							if((x + i) > 14) {									// x + i의 값이 판을 넘어가면 break.
								break;
							}
							if((y + i) > 14) {									// y + i의 값이 판을 넘어가면 break.
								break;
							}
							if(board[x + i][y + i] != "●") {					// 좌표값 기준 대각선 오른쪽 위 라인을 확인. 없을 경우 break.
								break;
							} 
							else if(board[x + i][y + i] == "●"){				// 좌표값 기준 오른쪽 위 라인을 확인하며 있을 경우 wcount를 증가
								wcount++;
								if(wcount == 6) {										// wcount를 바탕으로 좌표값의 라인이 오목일 경우 승리 출력
									System.out.println("게임 종료. 흑 승");
								}				
							}
						}
					}
				wcount = 0;														// wcount 값 초기화
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[][] board = new String [15][15];			       					// char형의 15x15 배열. 돌을 출력하기 위해 char
		int tcount = 0, x = 0, y = 0;											// count=턴을 계산 (x,y)=입력 받은 위치
		String input;															// Scanner로 받은 좌표를 저장할 변수
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				board[i][j] = "|-";            					    	      	// 입력받을 좌표에 '+'를 넣어 판의 형태를 만듬.
			}
		}
		
		
		System.out.println("오목 게임");
		board(tcount, x, y,board);												// 판 보여주기
		while(true) {
			System.out.println("원하는 위치를 입력하세요.");
			input = sc.nextLine();												// 입력한 값을 input에 저장
		
			if(input.length() == 2) {											// 입력한 값의 길이를 확인
				x = input.charAt(0) - '@'; 										// 입력받은 문자를 x,y에 저장 charAt
				y = input.charAt(1) - '@';										// 문자를 계산 가능한 정수로 변환.(-'0')
				x--;
				y--;
				if(input.length() != 2 || x < 0 || x > 15 || y < 0 ||
						y > 15 || board[x][y] =="●" || board[x][y] =="○") {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				tcount++;
				if(tcount % 2 != 0) {											// count를 계산
					board[x][y] = "●";											// 홀수 일 경우 검은 돌
				}
				if(tcount % 2 == 0) {
					board[x][y] = "○";											// 짝수일 경우 흰 돌
				}
				checkwin(x, y, tcount, board);
				board(tcount,x,y,board);
			}
		}
	}	
}

