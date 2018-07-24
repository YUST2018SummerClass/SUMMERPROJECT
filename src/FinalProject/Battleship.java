/*
 팀명 : 안전대일 (전성호, 김대현, 서영일, 안세휘)
 과목 : JAVA, 2018 여름학기
 프로젝트 : JAVA를 잡아라 프로젝트
 */

package FinalProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Battleship{
	
	public static void how() {
		System.out.printf("HOW??\n\n");
		System.out.printf("1. 전쟁에 사용 될 당신의 배를 좌표 상에 입력해 주세요.\n\n");
		System.out.printf("**************************************************************\n");
		System.out.printf("* 큰 배 3개, 중간 배 3개, 작은 배 4개를 입력해 주시면 됩니다.*\n");
		System.out.printf("*       배 입력은 가로, 세로줄이 일치하여야 합니다.          *\n");
		System.out.printf("**************************************************************\n\n");
		System.out.printf("2. 게임이 시작되면, 좌표 상에 값을 입력하여 상대편의 배의 위치를 맞춥니다.\n\n");
	}
	
	public static void main(String[] args) {
		int a;
		System.out.printf("BATTLE SHIP!\n\n");/*메뉴 인터페이스*/
		System.out.printf("1.게임 시작\n");
		System.out.printf("2.게임 방법\n");
		System.out.printf("3.게임 종료\n");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		if (a == 1) {
			Game();
		}
		else if (a == 2) {
			how();
			main(args);
		}
		else
			System.out.printf("END\n");
	}

	public static void Game() {
		char y;
		Scanner sc = new Scanner(System.in);
		int t,z, x, i, j, p, k, a, plife, clife, ba, ca, num, num1, numb, numm, nums, rand_num = 0, rand_numc,rand_num1;
		int[][] b = new int[3][3];
		int[][] m = new int[3][2];
		int[] s = new int[4];
		int[] f = new int[100];
		int[][] b1 = new int[3][3];
		int[][] m1 = new int[3][2];
		int[] s1 = new int[4];
		int[] f1 = new int[100];
		int[] c = new int[100];
		int[] f2 = new int[100];
		int[] coms = new int[19];
		int[] fp = new int[100];
		int[] q = { 1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,91,92,93,94,95,96,97,98,99,19,29,39,49,59,69,79,89 }; 
		//10*10 판에, 각 끝에 줄 배에 놓거나 맞추거나 하면 나갈 수 있으니, 0,0을 주면 -1로 나갈 수 있다든 지 범위를 벗어날 수 있는 경우를 방지하고자, 컴퓨터가 자동으로 배위치를 설정할 때
		// 좌표값을 설정해주기위해 선언한 배열이다.
		
		t = z = 0; // T는 TURN
		plife = clife = 19; // 큰배 3개 (9칸), 중간배 3개 (6칸), 작은 배 (4개)
		f1[5] = 4;
		
		// 

		for (a = 0; a < 100; a++)
			f[a] = ' ';
			System.out.printf("  __________________________________________________ \n");
			System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
			System.out.printf("A");
		for (a = 0; a < 10; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("B");
		for (; a < 20; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("C");
		for (; a < 30; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("D");
		for (; a < 40; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("E");
		for (; a < 50; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("F");
		for (; a < 60; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("G");
		for (; a < 70; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("H");
		for (; a < 80; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("I");
		for (; a < 90; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("J");
		for (; a < 100; a++)
			System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ\n\n");
			
		/*큰배*/for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.printf("큰 배의 y좌표 값 입력 :");
					y=sc.next().charAt(0);
				
					switch (y) {
						case 'A': {
							System.out.printf("\n큰 배의 x좌표 값 입력 :");
							x = sc.nextInt();
							if (x < 10) {
								if (x >= 0) {
									b[i][j] = x;
									f[x] = 'B';
									fp[x] = x;
									
									System.out.printf("  __________________________________________________ \n");
									System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
								System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
								System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'B': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x = sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 10;
							f[x + 10] = 'B';
							fp[x+10] = x+10;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'C': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 20;
							f[x + 20] = 'B';
							fp[x+20] = x+20;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'D': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 30;
							f[x + 30] = 'B';
							fp[x+30] = x+30;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'E': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 40;
							f[x + 40] = 'B';
							fp[x+40] = x+40;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'F': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 50;
							f[x + 50] = 'B';
							fp[x+50] = x+50;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'G': {
					
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 60;
							f[x + 60] = 'B';
							fp[x+60] = x+60;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'H': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 70;
							f[x + 70] = 'B';
							fp[x+70] = x+70;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'I': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 80;
							f[x + 80] = 'B';
							fp[x+80] = x+80;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'J': {
					System.out.printf("\n큰 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 90;
							f[x + 90] = 'B';
							fp[x+90] = x+90;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						} // 입력 받은 좌표의 위치를 보여주기 위한 작업
					}
				}break;
				}
			}
		}
		/*중간배*/for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf("중간 배의 y좌표 입력 : ");
				y = sc.next().charAt(0);
				switch (y) {
				case 'A': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x;
							f[x] = 'M';
							fp[x] = x;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'B': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 10;
							f[x + 10] = 'M';
							fp[x+10] = x+10;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'C': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 20;
							f[x + 20] = 'M';
							fp[x+20] = x+20;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'D': {
					
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 30;
							f[x + 30] = 'M';
							fp[x+30] = x+30;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'E': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 40;
							f[x + 40] = 'M';
							fp[x+40] = x+40;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'F': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 50;
							f[x + 50] = 'M';
							fp[x+50] = x+50;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'G': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 60;
							f[x + 60] = 'M';
							fp[x+60] = x+60;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'H': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 70;
							f[x + 70] = 'M';
							fp[x+70] = x+70;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'I': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 80;
							f[x + 80] = 'M';
							fp[x+80] = x+80;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				case 'J': {
					System.out.printf("\n중간 배의 x좌표 값 입력 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 90;
							f[x + 90] = 'M';
							fp[x+90] = x+90;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("ㅣ_%c_", f[a]);
							System.out.printf("ㅣ\n\n");
						}
					}
				}break;
				}
			}
		}
		/*작은배*/for (j = 0; j < 4; j++) {
			System.out.printf("작은 배 y좌표 값 입력 :");
			y=sc.next().charAt(0);
			switch (y) {
			case 'A': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x;
						f[x] = 'S';
						fp[x] = x;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'B': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 10;
						f[x + 10] = 'S';
						fp[x+10] = x+10;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'C': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 20;
						f[x + 20] = 'S';
						fp[x+20] = x+20;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'D': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 30;
						f[x + 30] = 'S';
						fp[x+30] = x+30;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'E': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 40;
						f[x + 40] = 'S';
						fp[x+40] = x+40;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'F': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 50;
						f[x + 50] = 'S';
						fp[x+50] = x+50;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'G': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 60;
						f[x + 60] = 'S';
						fp[x+60] = x+60;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'H': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 70;
						f[x + 70] = 'S';
						fp[x+70] = x+70;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'I': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 80;
						f[x + 80] = 'S';
						fp[x+80] = x+80;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			case 'J': {
				System.out.printf("\n작은 배의 x좌표 값 입력 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 90;
						f[x + 90] = 'S';
						fp[x+90] = x+90;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("ㅣ_%c_", f[a]);
						System.out.printf("ㅣ\n\n");
					}
				}
			}break;
			}
		}
			Math.random(); // COMPUTER가 10*10 판 좌표에서 임의의 자리에 큰 배 3개를 놓기 위한 작업으로, 가운데 숫자를 결정해주는 작업
			/*큰배*/for (a = 0; a < 3; a++) {
				rand_num = (int)(Math.random()*99)+1;
				for (j = 0; j < 35; j++) {
					if (rand_num == q[j]) {
						rand_num = (int)(Math.random()*99)+1;
					}
				}
				for (j = 0; j < 3; j++) {
					for (z = 0; z < 3; z++) {
						if (rand_num == b1[j][z]) {
							rand_num = (int)(Math.random()*99)+1;
							j = 0;
							z = 0;
						}
					}
				}
				coms[t]=b1[a][1] = rand_num;
				t++;
				rand_num1 = (int)(Math.random()*4)+1;
				if (rand_num1 % 2 == 0) {
					coms[t] = b1[a][0] = rand_num + 10;
					t++;
					coms[t] = b1[a][2] = rand_num - 10;
					t++;
				}
				if (rand_num1 % 2 != 0) {
					coms[t] = b1[a][0] = rand_num + 1;
					t++;
					coms[t] = b1[a][2] = rand_num - 1;
					t++;
				}
			}
			/*중간배*/	for (a = 0; a < 3; a++) {
				rand_num = (int)(Math.random()*99)+1;
				for (j = 0; j < 35; j++) {
					if (rand_num == q[j]) {
						rand_num = (int)(Math.random()*99)+1;
					}
				}
				for (j = 0; j < 3; j++) {
					for (z = 0; z < 3; z++) {
						if (rand_num == b1[j][z]) {
							rand_num = (int)(Math.random()*99)+1;
							j = 0;
							z = 0;
						}
					}
				}
				for (j = 0; j < 3; j++) {
					for (z = 0; z < 2; z++) {
						if (rand_num == m1[j][z]) {
							rand_num = (int)(Math.random()*99)+1;
							j = 0;
							z = 0;
						}
					}
				}
				coms[t] = m1[a][1] = rand_num;
				t++;
				rand_num1 = (int)(Math.random()*4)+1;
				if (rand_num1 % 2 == 0) {
					coms[t] = m1[a][0] = rand_num + 10;
					t++;

				}
				if (rand_num1 % 2 != 0) {
					coms[t] = m1[a][0] = rand_num + 1;
					t++;
				}
			}
			/*작은배*/	for (a = 0; a < 4; a++) {
				rand_num = (int)(Math.random()*99)+1;
				for (j = 0; j < 35; j++) {
					if (rand_num == q[j]) {
						rand_num = (int)(Math.random()*99)+1;
					}
				}
				for (j = 0; j < 3; j++) {
					for (z = 0; z < 3; z++) {
						if (rand_num == b1[j][z]) {
							rand_num = (int)(Math.random()*99)+1;
							j = 0;
							z = 0;
						}
					}
				}
				for (j = 0; j < 3; j++) {
					for (z = 0; z < 2; z++) {
					if (rand_num == m1[j][z]) {
						if (rand_num == m1[j][z]) {
							rand_num = (int)(Math.random()*99)+1;
							j = 0;
							z = 0;
						}
					}
				}
			}
				for (j = 0; j < 3; j++) {
					for (z = 0; z < 3; z++) {
					if (rand_num == b1[j][z]) {
						rand_num = (int)(Math.random()*99)+1;
						j = 0;
						z = 0;
					}
					}
				}
				coms[t] = s1[a] = rand_num;
				t++;
			}
		for (ba = 0; ba < 100; ba++) {
			f1[ba] = ' ';
		}
		System.out.printf("\n\t\t\t게임이 시작되었습니다!\n\n");
		while (true) {
			if (clife == 0) {
				System.out.printf("PLAYER WIN!\n");
			}
			if (plife == 0) {
				System.out.printf("COMPUTER WIN!\n\n");
			}
			System.out.printf("  __________________________________________________\t __________________________________________________\n");
			System.out.printf(" ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\t ㅣ_0_ㅣ_1_ㅣ_2_ㅣ_3_ㅣ_4_ㅣ_5_ㅣ_6_ㅣ_7_ㅣ_8_ㅣ_9_ㅣ\n\n");
			System.out.printf("A");
			for (a = 0; a < 10; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tA");
			for (ba = 0; ba < 10; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("B");
			for (; a < 20; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tB");
			for (; ba < 20; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("C");
			for (; a < 30; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tC");
			for (; ba < 30; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("D");
			for (; a < 40; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tD");
			for (; ba < 40; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("E");
			for (; a < 50; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tE");
			for (; ba < 50; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("F");
			for (; a < 60; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tF");
			for (; ba < 60; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("G");
			for (; a < 70; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tG");
			for (; ba < 70; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("H");
			for (; a < 80; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tH");
			for (; ba < 80; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("I");
			for (; a < 90; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tI");
			for (; ba < 90; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			System.out.printf("J");
			for (; a < 100; a++)
				System.out.printf("ㅣ_%c_", f[a]);
			System.out.printf("ㅣ");
			System.out.printf("\tJ");
			for (; ba < 100; ba++)
				System.out.printf("ㅣ_%c_", f1[ba]);
			System.out.printf("ㅣ\n\n");
			p = 1;
			if (p % 2 != 0) {
				System.out.printf("공격할 y좌표 입력:");
				y=sc.next().charAt(0);
				switch (y) {
				case 'A': {
					System.out.printf("x 좌표 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x;
						}
					}
				}break;
				case 'B': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 10;
						}
					}
				}break;
				case 'C': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 20;
						}
					}
				}break;
				case 'D': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 30;
						}
					}
				}break;
				case 'E': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 40;
						}
					}
				}break;
				case 'F': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 50;
						}
					}
				}break;
				case 'G': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 60;
						}
					}
				}break;
				case 'H': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 70;
						}
					}
				}break;
				case 'I': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 80;
						}
					}
				}break;
				case 'J': {
					System.out.printf("배의 x좌표 값 입력:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 90;
						}
					}
				}break;
				}
				loops:
				for (i = 0; i < 19; i++) {
					if (a == coms[i]) {
						f1[a] = '!';
						p++;
						clife--;
						break loops; // 내가 맞췄을 때 컴퓨터의 목숨을 깎는 작업
					}
					if (a != coms[i]) {
						f1[a] = 'X';
					}
				}
			ab:;
				p++;
			}
			if (p % 2 == 0) {
				Math.random();
				rand_numc = (int)(Math.random()*99)+1;
				for (k = 0; k < 100; k++) {
					if (rand_numc == c[k]) {
						Math.random();
						rand_num = (int)(Math.random()*99)+1;
					}
				}
				c[z] = rand_num;
				z++;
				ca = rand_numc;
					if (ca == fp[ca]) {
						f[ca] = '!';
						p++;
						plife--;
					}
					if (ca != fp[ca]) {
						f[ca] = 'X';
					}
				p++;
				System.out.printf("컴퓨터의 공격 위치:%d\n", ca);
			}
		}
	}

}
	//battleship 클래스의 범주 안에는 , "S"를 ship으로 표시, Map 안에 좌표들을 '*', 빗맞췄을 때 '_'를 표시합니다.
	/*public static void MakingBattleShip(final char[][] battleShip, final double level, final int seed){
		final Random maker = new Random();
		int randomNumber = 0;
		double mylevel = level; 
		mylevel *= seed;
		// 기회의 값에 따라 배들을 조정함
		
		for(int i = 0; i<battleShip.length; i++){
			for(int j =0; j<battleShip[0].length; j++){ // 시작 범위 설정
				randomNumber = maker.nextInt(seed); // seed는 0부터 시작한다.
				if(j==0 || i==0 || j==battleShip[0].length-1 || i==battleShip.length -1){
					 battleShip[i][j] = '=';		 
				} else if(randomNumber < mylevel){
					battleShip[i][j] = 'S';					
				} else {
					battleShip[i][j] = '*';
				}
			}
		}
	}
	private static char[][] MakingCounter (final char[][] battleShip){
		final char[][] counter = new char[battleShip.length][];
		for(int i=0; i<battleShip.length; i++){
			counter[i] = Arrays.copyOf(battleShip[i], battleShip[i].length);
		}
		for(int i=0; i < counter.length; i++){
			for(int j=0; j < counter[i].length; j++){ // 시작 범주 설정
				if(j == 0 || i == 0 || j==battleShip[0].length-1||i==battleShip.length-1){
					counter[i][j] = '=';
			} else if(counter[i][j] != '=');{
				counter[i][j] = '*';
				}
			}
		}	return counter;

	}
	private static void print(final char [][] Print){
		System.out.println("현재 맵입니다.");
		for(int i=0; i<Print.length; i++){
			System.out.println("");
			for(int j=0; j<Print[0].length; j++){
				System.out.print(Print[i][j]);
			}
		}
	}
	
	private static int Counting(final char[][] battleShip){
		int countBattleShip = 0;
		for(int i=0; i<battleShip.length; i++){
			for(int j=0; j<battleShip[0].length; j++){ //시작 범주를 만듭니다.
				if(battleShip[i][j] == 'S'){
					countBattleShip++;
				}
			}
		}
		return countBattleShip;
	}
	
	public static boolean Evaluation(final int y, final int x, final char[][] battleShip){
		boolean hit = false; // default 설정
		if (battleShip[x][y] == 'S'){
			hit = true;
		} else if(battleShip[x][y] == '*'){
			hit = false;
		}
		return hit;
	}
	
	private static void playGame(final char[][] battleShip, final char[][] counter, final int guess, final int seed){
		final Random maker = new Random();
		final Scanner sc = new Scanner(System.in);
		int countBattleShip = Counting(battleShip);
		int newGuess = guess;
		print(counter);
		
		while((newGuess != 0) && (countBattleShip !=0)){
			boolean hit = false;
			boolean pass = false;
			
			int x=0;
			int y=0; // 입력을 위한 x,y좌표 초기화 입니다.
			
			System.out.println("\n(**-1를 두변 입력할 경우 자동으로 좌표 값이 설정 됩니다.**)"
			+"\nX,Y 좌표 값을 입력해주세요 : ");
			
			while(!((x > 0) && (x < battleShip.length-1)) && (!((y>0) && (y<battleShip[0].length-1))) || !pass){
				x = sc.nextInt();
				y = sc.nextInt();
				if (x == -1 || y == -1){
					x = maker.nextInt(counter.length-2)+1;
					y = maker.nextInt(counter[0].length-2)+1;
					break;
				}
				if(x <=0 || x > battleShip.length -2){
					System.out.println("잘못된 입력입니다. X좌표를 다시 입력해주세요 !");
				} else if (y <=0 || y > battleShip[0].length-2){
					System.out.println("잘못된 입력입니다. Y좌표를 다시 입력해주세요 !");
				} else if(counter[x][y]=='H' || counter[x][y]=='_'){
					System.out.println("잘못된 입력입니다 (이미 파괴되었거나 빗맞은 구간입니다)" + "\n다시 입력해주세요 :");
					pass = false;
				} else {
					pass = true;
				}
			}
			hit=Evaluation(x, y, battleShip);
			newGuess--;
			
			if(hit){
				System.out.print("\n 축하드립니다! 명중하셨습니다! : \n");
				counter[x][y] = 'H';
				countBattleShip--;
			} else {
				System.out.print("\n 빗맞추셨습니다. : \n");
				counter[x][y] = '_';
			}
			print(counter);
		}
		if(countBattleShip==0){
			System.out.println("\n승리하셨습니다~~!!!!");
		} else {
			System.out.println("\n패배하셨습니다.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Scanner sc = new Scanner(System.in);
		int cols=0; 
		int rows=0;
		int guess=0;
		int seed=0;
		final boolean restart = true;
		char [][] battleShip = null;
		char [][] counter = null;
		
		int option = 0;
		
		while(restart){
			double level =0;
			System.out.print("행을 입력하세요 : ");
			cols = sc.nextInt();
			System.out.print("열을 입력하세요 : ");
			rows = sc.nextInt();
			battleShip = new char[cols+2][rows+2];
			counter = new char[cols+2][rows+2];
			System.out.print("레벨을 입력하세요 (0~1) **소수로 입력** : ");
            while (!(level > 0 && level < 1)) {
            	level = sc.nextDouble();
                //if user inputs the wrong number
                if (!(level > 0 && level < 1)) {
                    System.out.print("다시 레벨을 입력해주세요 (0~1): ");
		}
	}
            System.out.print("기회를 입력하세요 : ");
            guess=sc.nextInt();
            System.out.print("난수를 입력하세요 : ");
            seed=sc.nextInt(); 
            MakingBattleShip(battleShip, level, seed);// MakingBattleShip
            counter = MakingCounter(counter);
            playGame(battleShip, counter, guess, seed);
            System.out.println("\n0번을 입력하시면 게임이 종료됩니다. ");
            System.out.println("\n1번을 입력하시면 게임이 재개됩니다. ");
            System.out.println("\n2번을 입력하시면 게임이 재시작됩니다. ");
            option = sc.nextInt();
            while (option > 2 || option < 0) {
                System.out.print("잘못 입력하셨습니다. 다시 입력해주세요: ");
                option = sc.nextInt();
            }
            if (option == 1) {
                //guess again and continue without dumping out the value
                System.out.println("\n 기회를 입력하시오 : ");
                guess = sc.nextInt();
                playGame(battleShip, counter,guess, seed);
            } else if (option == 2) {
                //just continue go back to the beginning of the main
                continue;
            } else {
                System.exit(0);
            }
		}
	}
}*/
	


/*package Battle;

import java.util.Random;
import java.util.Scanner;

public class Battleship{
	static String[][] gameMap;
	static int User = 0;
	static int Computer = 0;
	static boolean win = false;

public static void main(String[] args){
	Gamestart();
	}

public static void Gamestart(){ // 게임의 난이도를 입력합니다. 다른 함수들을 호출하며 게임 사용자의 입력을 읽는 중심 기능 입니다.
	Scanner scan = new Scanner(System.in);
	System.out.print("1부터 3까지의 난이도를 입력해주세요 : ");
	createMap(scan.nextInt());
	int counting = 10;
	random();
	int u;
	int c;
	
	while (counting > 0 && win == false) {
		System.out.println("\n**남은 기회는 "+ counting + "회 입니다.**");
		showing();
		System.out.print("\n\nX좌표를 입력해 주세요 : ");
		u = scan.nextInt()-1;
		System.out.print("\nY좌표를 입력해 주세요 : ");
		
		c = scan.nextInt()-1;
		Evaluation(u,c);
		counting--;
	}
}

	public static void showing(){ //게임의 맵이나, 상황을 출격하는 기능입니다.
		for(int i=0; i<gameMap.length; i++){
			System.out.println("");
			for(int j=0; j<gameMap.length; j++){
				System.out.print(gameMap[i][j]);
			}
		}
	}
	
	public static void createMap(int difficulty){ // 
		if(difficulty < 2){
			gameMap = new String[5][5];
			System.out.println("\n***X좌표, Y좌표 모두 5이내 숫자를 입력해주세요***");
		} else if(difficulty < 3){
			gameMap = new String[6][6];
		} else{
			gameMap = new String[7][7];
		}
		
		for(int i=0;  i< gameMap.length; i++) {
			for(int j=0; j<gameMap.length;  j++) {
				gameMap[i][j] = "0";
			}
		}
	}
	
	public static void random(){
		Random random = new Random();
		
		User = random.nextInt(gameMap.length);
		Computer = random.nextInt(gameMap.length);
	}
	
	public static void Evaluation(int x, int y){
		if(x == User && y == Computer) {
			System.out.println("격추하셨습니다~~~ 승리를 축하드립니다!!");
			win = true;
	} else {
		gameMap[y][x] = "X";
	}
	}
}*/