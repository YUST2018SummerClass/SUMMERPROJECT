/*
 ぜ貲 : 寰瞪渠橾 (瞪撩��, 梯渠⑷, 憮艙橾, 寰撮��)
 婁跡 : JAVA, 2018 罹葷з晦
 Щ煎薛お : JAVA蒂 濩嬴塭 Щ煎薛お
 */

package FinalProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Battleship{
	
	public static void how() {
		System.out.printf("HOW??\n\n");
		System.out.printf("1. 瞪爵縑 餌辨 腆 渡褐曖 寡蒂 謝ル 鼻縑 殮溘п 輿撮蹂.\n\n");
		System.out.printf("**************************************************************\n");
		System.out.printf("* 贖 寡 3偃, 醞除 寡 3偃, 濛擎 寡 4偃蒂 殮溘п 輿衛賊 腌棲棻.*\n");
		System.out.printf("*       寡 殮溘擎 陛煎, 撮煎還檜 橾纂ж罹撿 м棲棻.          *\n");
		System.out.printf("**************************************************************\n\n");
		System.out.printf("2. 啪歜檜 衛濛腎賊, 謝ル 鼻縑 高擊 殮溘ж罹 鼻渠ら曖 寡曖 嬪纂蒂 蜃邊棲棻.\n\n");
	}
	
	public static void main(String[] args) {
		int a;
		System.out.printf("BATTLE SHIP!\n\n");/*詭景 檣攪む檜蝶*/
		System.out.printf("1.啪歜 衛濛\n");
		System.out.printf("2.啪歜 寞徹\n");
		System.out.printf("3.啪歜 謙猿\n");
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
		//10*10 っ縑, 陝 部縑 還 寡縑 場剪釭 蜃蹺剪釭 ж賊 釭陞 熱 氈戲棲, 0,0擊 輿賊 -1煎 釭陞 熱 氈棻萇 雖 彰嬪蒂 慇橫陳 熱 氈朝 唳辦蒂 寞雖ж堅濠, 闡У攪陛 濠翕戲煎 寡嬪纂蒂 撲薑й 陽
		// 謝ル高擊 撲薑п輿晦嬪п 摹樹и 寡翮檜棻.
		
		t = z = 0; // T朝 TURN
		plife = clife = 19; // 贖寡 3偃 (9蘊), 醞除寡 3偃 (6蘊), 濛擎 寡 (4偃)
		f1[5] = 4;
		
		// 

		for (a = 0; a < 100; a++)
			f[a] = ' ';
			System.out.printf("  __________________________________________________ \n");
			System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
			System.out.printf("A");
		for (a = 0; a < 10; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("B");
		for (; a < 20; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("C");
		for (; a < 30; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("D");
		for (; a < 40; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("E");
		for (; a < 50; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("F");
		for (; a < 60; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("G");
		for (; a < 70; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("H");
		for (; a < 80; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("I");
		for (; a < 90; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			System.out.printf("J");
		for (; a < 100; a++)
			System.out.printf("太_%c_", f[a]);
			System.out.printf("太\n\n");
			
		/*贖寡*/for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.printf("贖 寡曖 y謝ル 高 殮溘 :");
					y=sc.next().charAt(0);
				
					switch (y) {
						case 'A': {
							System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
							x = sc.nextInt();
							if (x < 10) {
								if (x >= 0) {
									b[i][j] = x;
									f[x] = 'B';
									fp[x] = x;
									
									System.out.printf("  __________________________________________________ \n");
									System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
								System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
								System.out.printf("太\n\n");
						}
					}
				}break;
				case 'B': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x = sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 10;
							f[x + 10] = 'B';
							fp[x+10] = x+10;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'C': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 20;
							f[x + 20] = 'B';
							fp[x+20] = x+20;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'D': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 30;
							f[x + 30] = 'B';
							fp[x+30] = x+30;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'E': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 40;
							f[x + 40] = 'B';
							fp[x+40] = x+40;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'F': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 50;
							f[x + 50] = 'B';
							fp[x+50] = x+50;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'G': {
					
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 60;
							f[x + 60] = 'B';
							fp[x+60] = x+60;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'H': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 70;
							f[x + 70] = 'B';
							fp[x+70] = x+70;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'I': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 80;
							f[x + 80] = 'B';
							fp[x+80] = x+80;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'J': {
					System.out.printf("\n贖 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 90;
							f[x + 90] = 'B';
							fp[x+90] = x+90;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						} // 殮溘 嫡擎 謝ル曖 嬪纂蒂 爾罹輿晦 嬪и 濛機
					}
				}break;
				}
			}
		}
		/*醞除寡*/for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf("醞除 寡曖 y謝ル 殮溘 : ");
				y = sc.next().charAt(0);
				switch (y) {
				case 'A': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x;
							f[x] = 'M';
							fp[x] = x;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'B': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 10;
							f[x + 10] = 'M';
							fp[x+10] = x+10;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'C': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 20;
							f[x + 20] = 'M';
							fp[x+20] = x+20;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'D': {
					
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 30;
							f[x + 30] = 'M';
							fp[x+30] = x+30;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'E': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 40;
							f[x + 40] = 'M';
							fp[x+40] = x+40;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'F': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 50;
							f[x + 50] = 'M';
							fp[x+50] = x+50;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'G': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 60;
							f[x + 60] = 'M';
							fp[x+60] = x+60;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'H': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 70;
							f[x + 70] = 'M';
							fp[x+70] = x+70;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'I': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 80;
							f[x + 80] = 'M';
							fp[x+80] = x+80;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				case 'J': {
					System.out.printf("\n醞除 寡曖 x謝ル 高 殮溘 :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 90;
							f[x + 90] = 'M';
							fp[x+90] = x+90;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("太_%c_", f[a]);
							System.out.printf("太\n\n");
						}
					}
				}break;
				}
			}
		}
		/*濛擎寡*/for (j = 0; j < 4; j++) {
			System.out.printf("濛擎 寡 y謝ル 高 殮溘 :");
			y=sc.next().charAt(0);
			switch (y) {
			case 'A': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x;
						f[x] = 'S';
						fp[x] = x;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'B': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 10;
						f[x + 10] = 'S';
						fp[x+10] = x+10;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'C': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 20;
						f[x + 20] = 'S';
						fp[x+20] = x+20;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'D': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 30;
						f[x + 30] = 'S';
						fp[x+30] = x+30;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'E': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 40;
						f[x + 40] = 'S';
						fp[x+40] = x+40;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'F': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 50;
						f[x + 50] = 'S';
						fp[x+50] = x+50;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'G': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 60;
						f[x + 60] = 'S';
						fp[x+60] = x+60;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'H': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 70;
						f[x + 70] = 'S';
						fp[x+70] = x+70;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'I': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 80;
						f[x + 80] = 'S';
						fp[x+80] = x+80;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			case 'J': {
				System.out.printf("\n濛擎 寡曖 x謝ル 高 殮溘 :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 90;
						f[x + 90] = 'S';
						fp[x+90] = x+90;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("太_%c_", f[a]);
						System.out.printf("太\n\n");
					}
				}
			}break;
			}
		}
			Math.random(); // COMPUTER陛 10*10 っ 謝ル縑憮 歜曖曖 濠葬縑 贖 寡 3偃蒂 場晦 嬪и 濛機戲煎, 陛遴等 璋濠蒂 唸薑п輿朝 濛機
			/*贖寡*/for (a = 0; a < 3; a++) {
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
			/*醞除寡*/	for (a = 0; a < 3; a++) {
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
			/*濛擎寡*/	for (a = 0; a < 4; a++) {
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
		System.out.printf("\n\t\t\t啪歜檜 衛濛腎歷蝗棲棻!\n\n");
		while (true) {
			if (clife == 0) {
				System.out.printf("PLAYER WIN!\n");
			}
			if (plife == 0) {
				System.out.printf("COMPUTER WIN!\n\n");
			}
			System.out.printf("  __________________________________________________\t __________________________________________________\n");
			System.out.printf(" 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\t 太_0_太_1_太_2_太_3_太_4_太_5_太_6_太_7_太_8_太_9_太\n\n");
			System.out.printf("A");
			for (a = 0; a < 10; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tA");
			for (ba = 0; ba < 10; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("B");
			for (; a < 20; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tB");
			for (; ba < 20; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("C");
			for (; a < 30; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tC");
			for (; ba < 30; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("D");
			for (; a < 40; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tD");
			for (; ba < 40; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("E");
			for (; a < 50; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tE");
			for (; ba < 50; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("F");
			for (; a < 60; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tF");
			for (; ba < 60; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("G");
			for (; a < 70; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tG");
			for (; ba < 70; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("H");
			for (; a < 80; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tH");
			for (; ba < 80; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("I");
			for (; a < 90; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tI");
			for (; ba < 90; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			System.out.printf("J");
			for (; a < 100; a++)
				System.out.printf("太_%c_", f[a]);
			System.out.printf("太");
			System.out.printf("\tJ");
			for (; ba < 100; ba++)
				System.out.printf("太_%c_", f1[ba]);
			System.out.printf("太\n\n");
			p = 1;
			if (p % 2 != 0) {
				System.out.printf("奢問й y謝ル 殮溘:");
				y=sc.next().charAt(0);
				switch (y) {
				case 'A': {
					System.out.printf("x 謝ル 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x;
						}
					}
				}break;
				case 'B': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 10;
						}
					}
				}break;
				case 'C': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 20;
						}
					}
				}break;
				case 'D': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 30;
						}
					}
				}break;
				case 'E': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 40;
						}
					}
				}break;
				case 'F': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 50;
						}
					}
				}break;
				case 'G': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 60;
						}
					}
				}break;
				case 'H': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 70;
						}
					}
				}break;
				case 'I': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 80;
						}
					}
				}break;
				case 'J': {
					System.out.printf("寡曖 x謝ル 高 殮溘:");
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
						break loops; // 頂陛 蜃鏡擊 陽 闡У攪曖 跡獗擊 梗朝 濛機
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
				System.out.printf("闡У攪曖 奢問 嬪纂:%d\n", ca);
			}
		}
	}

}
	//battleship 贗楚蝶曖 彰輿 寰縑朝 , "S"蒂 ship戲煎 ル衛, Map 寰縑 謝ル菟擊 '*', 綿蜃鏡擊 陽 '_'蒂 ル衛м棲棻.
	/*public static void MakingBattleShip(final char[][] battleShip, final double level, final int seed){
		final Random maker = new Random();
		int randomNumber = 0;
		double mylevel = level; 
		mylevel *= seed;
		// 晦�蛻� 高縑 評塭 寡菟擊 褻薑л
		
		for(int i = 0; i<battleShip.length; i++){
			for(int j =0; j<battleShip[0].length; j++){ // 衛濛 彰嬪 撲薑
				randomNumber = maker.nextInt(seed); // seed朝 0睡攪 衛濛и棻.
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
			for(int j=0; j < counter[i].length; j++){ // 衛濛 彰輿 撲薑
				if(j == 0 || i == 0 || j==battleShip[0].length-1||i==battleShip.length-1){
					counter[i][j] = '=';
			} else if(counter[i][j] != '=');{
				counter[i][j] = '*';
				}
			}
		}	return counter;

	}
	private static void print(final char [][] Print){
		System.out.println("⑷營 裘殮棲棻.");
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
			for(int j=0; j<battleShip[0].length; j++){ //衛濛 彰輿蒂 虜蛙棲棻.
				if(battleShip[i][j] == 'S'){
					countBattleShip++;
				}
			}
		}
		return countBattleShip;
	}
	
	public static boolean Evaluation(final int y, final int x, final char[][] battleShip){
		boolean hit = false; // default 撲薑
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
			int y=0; // 殮溘擊 嬪и x,y謝ル 蟾晦�� 殮棲棻.
			
			System.out.println("\n(**-1蒂 舒滲 殮溘й 唳辦 濠翕戲煎 謝ル 高檜 撲薑 腌棲棻.**)"
			+"\nX,Y 謝ル 高擊 殮溘п輿撮蹂 : ");
			
			while(!((x > 0) && (x < battleShip.length-1)) && (!((y>0) && (y<battleShip[0].length-1))) || !pass){
				x = sc.nextInt();
				y = sc.nextInt();
				if (x == -1 || y == -1){
					x = maker.nextInt(counter.length-2)+1;
					y = maker.nextInt(counter[0].length-2)+1;
					break;
				}
				if(x <=0 || x > battleShip.length -2){
					System.out.println("澀跤脹 殮溘殮棲棻. X謝ル蒂 棻衛 殮溘п輿撮蹂 !");
				} else if (y <=0 || y > battleShip[0].length-2){
					System.out.println("澀跤脹 殮溘殮棲棻. Y謝ル蒂 棻衛 殮溘п輿撮蹂 !");
				} else if(counter[x][y]=='H' || counter[x][y]=='_'){
					System.out.println("澀跤脹 殮溘殮棲棻 (檜嘐 だ惚腎歷剪釭 綿蜃擎 掘除殮棲棻)" + "\n棻衛 殮溘п輿撮蹂 :");
					pass = false;
				} else {
					pass = true;
				}
			}
			hit=Evaluation(x, y, battleShip);
			newGuess--;
			
			if(hit){
				System.out.print("\n 蹴ж萄董棲棻! 貲醞ж樟蝗棲棻! : \n");
				counter[x][y] = 'H';
				countBattleShip--;
			} else {
				System.out.print("\n 綿蜃蹺樟蝗棲棻. : \n");
				counter[x][y] = '_';
			}
			print(counter);
		}
		if(countBattleShip==0){
			System.out.println("\n蝓葬ж樟蝗棲棻~~!!!!");
		} else {
			System.out.println("\nぬ寡ж樟蝗棲棻.");
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
			System.out.print("ч擊 殮溘ж撮蹂 : ");
			cols = sc.nextInt();
			System.out.print("翮擊 殮溘ж撮蹂 : ");
			rows = sc.nextInt();
			battleShip = new char[cols+2][rows+2];
			counter = new char[cols+2][rows+2];
			System.out.print("溯漣擊 殮溘ж撮蹂 (0~1) **模熱煎 殮溘** : ");
            while (!(level > 0 && level < 1)) {
            	level = sc.nextDouble();
                //if user inputs the wrong number
                if (!(level > 0 && level < 1)) {
                    System.out.print("棻衛 溯漣擊 殮溘п輿撮蹂 (0~1): ");
		}
	}
            System.out.print("晦�虜� 殮溘ж撮蹂 : ");
            guess=sc.nextInt();
            System.out.print("陪熱蒂 殮溘ж撮蹂 : ");
            seed=sc.nextInt(); 
            MakingBattleShip(battleShip, level, seed);// MakingBattleShip
            counter = MakingCounter(counter);
            playGame(battleShip, counter, guess, seed);
            System.out.println("\n0廓擊 殮溘ж衛賊 啪歜檜 謙猿腌棲棻. ");
            System.out.println("\n1廓擊 殮溘ж衛賊 啪歜檜 營偃腌棲棻. ");
            System.out.println("\n2廓擊 殮溘ж衛賊 啪歜檜 營衛濛腌棲棻. ");
            option = sc.nextInt();
            while (option > 2 || option < 0) {
                System.out.print("澀跤 殮溘ж樟蝗棲棻. 棻衛 殮溘п輿撮蹂: ");
                option = sc.nextInt();
            }
            if (option == 1) {
                //guess again and continue without dumping out the value
                System.out.println("\n 晦�虜� 殮溘ж衛螃 : ");
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

public static void Gamestart(){ // 啪歜曖 陪檜紫蒂 殮溘м棲棻. 棻艇 л熱菟擊 ��轎ж貊 啪歜 餌辨濠曖 殮溘擊 檗朝 醞褕 晦棟 殮棲棻.
	Scanner scan = new Scanner(System.in);
	System.out.print("1睡攪 3梱雖曖 陪檜紫蒂 殮溘п輿撮蹂 : ");
	createMap(scan.nextInt());
	int counting = 10;
	random();
	int u;
	int c;
	
	while (counting > 0 && win == false) {
		System.out.println("\n**陴擎 晦�葩� "+ counting + "�� 殮棲棻.**");
		showing();
		System.out.print("\n\nX謝ル蒂 殮溘п 輿撮蹂 : ");
		u = scan.nextInt()-1;
		System.out.print("\nY謝ル蒂 殮溘п 輿撮蹂 : ");
		
		c = scan.nextInt()-1;
		Evaluation(u,c);
		counting--;
	}
}

	public static void showing(){ //啪歜曖 裘檜釭, 鼻�窕� 轎問ж朝 晦棟殮棲棻.
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
			System.out.println("\n***X謝ル, Y謝ル 賅舒 5檜頂 璋濠蒂 殮溘п輿撮蹂***");
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
			System.out.println("問蹺ж樟蝗棲棻~~~ 蝓葬蒂 蹴ж萄董棲棻!!");
			win = true;
	} else {
		gameMap[y][x] = "X";
	}
	}
}*/