/*
 ���� : �������� (����ȣ, �����, ������, �ȼ���)
 ���� : JAVA, 2018 �����б�
 ������Ʈ : JAVA�� ��ƶ� ������Ʈ
 */

package FinalProject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Battleship{
	
	public static void how() {
		System.out.printf("HOW??\n\n");
		System.out.printf("1. ���￡ ��� �� ����� �踦 ��ǥ �� �Է��� �ּ���.\n\n");
		System.out.printf("**************************************************************\n");
		System.out.printf("* ū �� 3��, �߰� �� 3��, ���� �� 4���� �Է��� �ֽø� �˴ϴ�.*\n");
		System.out.printf("*       �� �Է��� ����, �������� ��ġ�Ͽ��� �մϴ�.          *\n");
		System.out.printf("**************************************************************\n\n");
		System.out.printf("2. ������ ���۵Ǹ�, ��ǥ �� ���� �Է��Ͽ� ������� ���� ��ġ�� ����ϴ�.\n\n");
	}
	
	public static void main(String[] args) {
		int a;
		System.out.printf("BATTLE SHIP!\n\n");/*�޴� �������̽�*/
		System.out.printf("1.���� ����\n");
		System.out.printf("2.���� ���\n");
		System.out.printf("3.���� ����\n");
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
		//10*10 �ǿ�, �� ���� �� �迡 ���ų� ���߰ų� �ϸ� ���� �� ������, 0,0�� �ָ� -1�� ���� �� �ִٵ� �� ������ ��� �� �ִ� ��츦 �����ϰ���, ��ǻ�Ͱ� �ڵ����� ����ġ�� ������ ��
		// ��ǥ���� �������ֱ����� ������ �迭�̴�.
		
		t = z = 0; // T�� TURN
		plife = clife = 19; // ū�� 3�� (9ĭ), �߰��� 3�� (6ĭ), ���� �� (4��)
		f1[5] = 4;
		
		// 

		for (a = 0; a < 100; a++)
			f[a] = ' ';
			System.out.printf("  __________________________________________________ \n");
			System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
			System.out.printf("A");
		for (a = 0; a < 10; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("B");
		for (; a < 20; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("C");
		for (; a < 30; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("D");
		for (; a < 40; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("E");
		for (; a < 50; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("F");
		for (; a < 60; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("G");
		for (; a < 70; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("H");
		for (; a < 80; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("I");
		for (; a < 90; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			System.out.printf("J");
		for (; a < 100; a++)
			System.out.printf("��_%c_", f[a]);
			System.out.printf("��\n\n");
			
		/*ū��*/for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					System.out.printf("ū ���� y��ǥ �� �Է� :");
					y=sc.next().charAt(0);
				
					switch (y) {
						case 'A': {
							System.out.printf("\nū ���� x��ǥ �� �Է� :");
							x = sc.nextInt();
							if (x < 10) {
								if (x >= 0) {
									b[i][j] = x;
									f[x] = 'B';
									fp[x] = x;
									
									System.out.printf("  __________________________________________________ \n");
									System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
								System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
								System.out.printf("��\n\n");
						}
					}
				}break;
				case 'B': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x = sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 10;
							f[x + 10] = 'B';
							fp[x+10] = x+10;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'C': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 20;
							f[x + 20] = 'B';
							fp[x+20] = x+20;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'D': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 30;
							f[x + 30] = 'B';
							fp[x+30] = x+30;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'E': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 40;
							f[x + 40] = 'B';
							fp[x+40] = x+40;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'F': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 50;
							f[x + 50] = 'B';
							fp[x+50] = x+50;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'G': {
					
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 60;
							f[x + 60] = 'B';
							fp[x+60] = x+60;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'H': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 70;
							f[x + 70] = 'B';
							fp[x+70] = x+70;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'I': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 80;
							f[x + 80] = 'B';
							fp[x+80] = x+80;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'J': {
					System.out.printf("\nū ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							b[i][j] = x + 90;
							f[x + 90] = 'B';
							fp[x+90] = x+90;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						} // �Է� ���� ��ǥ�� ��ġ�� �����ֱ� ���� �۾�
					}
				}break;
				}
			}
		}
		/*�߰���*/for (i = 0; i < 3; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf("�߰� ���� y��ǥ �Է� : ");
				y = sc.next().charAt(0);
				switch (y) {
				case 'A': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x;
							f[x] = 'M';
							fp[x] = x;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'B': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 10;
							f[x + 10] = 'M';
							fp[x+10] = x+10;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'C': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 20;
							f[x + 20] = 'M';
							fp[x+20] = x+20;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'D': {
					
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 30;
							f[x + 30] = 'M';
							fp[x+30] = x+30;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'E': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 40;
							f[x + 40] = 'M';
							fp[x+40] = x+40;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'F': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 50;
							f[x + 50] = 'M';
							fp[x+50] = x+50;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'G': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 60;
							f[x + 60] = 'M';
							fp[x+60] = x+60;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("I\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'H': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 70;
							f[x + 70] = 'M';
							fp[x+70] = x+70;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'I': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 80;
							f[x + 80] = 'M';
							fp[x+80] = x+80;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				case 'J': {
					System.out.printf("\n�߰� ���� x��ǥ �� �Է� :");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							m[i][j] = x + 90;
							f[x + 90] = 'M';
							fp[x+90] = x+90;
							
							System.out.printf("  __________________________________________________ \n");
							System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
							System.out.printf("A");
							for (a = 0; a < 10; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("B");
							for (; a < 20; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("C");
							for (; a < 30; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("D");
							for (; a < 40; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("E");
							for (; a < 50; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("F");
							for (; a < 60; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("G");
							for (; a < 70; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("H");
							for (; a < 80; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("I");
							for (; a < 90; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
							System.out.printf("J");
							for (; a < 100; a++)
								System.out.printf("��_%c_", f[a]);
							System.out.printf("��\n\n");
						}
					}
				}break;
				}
			}
		}
		/*������*/for (j = 0; j < 4; j++) {
			System.out.printf("���� �� y��ǥ �� �Է� :");
			y=sc.next().charAt(0);
			switch (y) {
			case 'A': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x;
						f[x] = 'S';
						fp[x] = x;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'B': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 10;
						f[x + 10] = 'S';
						fp[x+10] = x+10;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'C': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 20;
						f[x + 20] = 'S';
						fp[x+20] = x+20;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'D': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 30;
						f[x + 30] = 'S';
						fp[x+30] = x+30;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'E': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 40;
						f[x + 40] = 'S';
						fp[x+40] = x+40;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'F': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 50;
						f[x + 50] = 'S';
						fp[x+50] = x+50;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'G': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 60;
						f[x + 60] = 'S';
						fp[x+60] = x+60;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'H': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 70;
						f[x + 70] = 'S';
						fp[x+70] = x+70;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'I': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 80;
						f[x + 80] = 'S';
						fp[x+80] = x+80;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			case 'J': {
				System.out.printf("\n���� ���� x��ǥ �� �Է� :");
				x=sc.nextInt();
				if (x < 10) {
					if (x >= 0) {
						s[j] = x + 90;
						f[x + 90] = 'S';
						fp[x+90] = x+90;
						
						System.out.printf("  __________________________________________________ \n");
						System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
						System.out.printf("A");
						for (a = 0; a < 10; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("B");
						for (; a < 20; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("C");
						for (; a < 30; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("D");
						for (; a < 40; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("E");
						for (; a < 50; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("F");
						for (; a < 60; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("G");
						for (; a < 70; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("H");
						for (; a < 80; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("I");
						for (; a < 90; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
						System.out.printf("J");
						for (; a < 100; a++)
							System.out.printf("��_%c_", f[a]);
						System.out.printf("��\n\n");
					}
				}
			}break;
			}
		}
			Math.random(); // COMPUTER�� 10*10 �� ��ǥ���� ������ �ڸ��� ū �� 3���� ���� ���� �۾�����, ��� ���ڸ� �������ִ� �۾�
			/*ū��*/for (a = 0; a < 3; a++) {
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
			/*�߰���*/	for (a = 0; a < 3; a++) {
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
			/*������*/	for (a = 0; a < 4; a++) {
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
		System.out.printf("\n\t\t\t������ ���۵Ǿ����ϴ�!\n\n");
		while (true) {
			if (clife == 0) {
				System.out.printf("PLAYER WIN!\n");
			}
			if (plife == 0) {
				System.out.printf("COMPUTER WIN!\n\n");
			}
			System.out.printf("  __________________________________________________\t __________________________________________________\n");
			System.out.printf(" ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\t ��_0_��_1_��_2_��_3_��_4_��_5_��_6_��_7_��_8_��_9_��\n\n");
			System.out.printf("A");
			for (a = 0; a < 10; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tA");
			for (ba = 0; ba < 10; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("B");
			for (; a < 20; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tB");
			for (; ba < 20; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("C");
			for (; a < 30; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tC");
			for (; ba < 30; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("D");
			for (; a < 40; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tD");
			for (; ba < 40; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("E");
			for (; a < 50; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tE");
			for (; ba < 50; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("F");
			for (; a < 60; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tF");
			for (; ba < 60; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("G");
			for (; a < 70; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tG");
			for (; ba < 70; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("H");
			for (; a < 80; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tH");
			for (; ba < 80; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("I");
			for (; a < 90; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tI");
			for (; ba < 90; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			System.out.printf("J");
			for (; a < 100; a++)
				System.out.printf("��_%c_", f[a]);
			System.out.printf("��");
			System.out.printf("\tJ");
			for (; ba < 100; ba++)
				System.out.printf("��_%c_", f1[ba]);
			System.out.printf("��\n\n");
			p = 1;
			if (p % 2 != 0) {
				System.out.printf("������ y��ǥ �Է�:");
				y=sc.next().charAt(0);
				switch (y) {
				case 'A': {
					System.out.printf("x ��ǥ �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x;
						}
					}
				}break;
				case 'B': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 10;
						}
					}
				}break;
				case 'C': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 20;
						}
					}
				}break;
				case 'D': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 30;
						}
					}
				}break;
				case 'E': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 40;
						}
					}
				}break;
				case 'F': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 50;
						}
					}
				}break;
				case 'G': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 60;
						}
					}
				}break;
				case 'H': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 70;
						}
					}
				}break;
				case 'I': {
					System.out.printf("���� x��ǥ �� �Է�:");
					x=sc.nextInt();
					if (x < 10) {
						if (x >= 0) {
							a = x + 80;
						}
					}
				}break;
				case 'J': {
					System.out.printf("���� x��ǥ �� �Է�:");
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
						break loops; // ���� ������ �� ��ǻ���� ����� ��� �۾�
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
				System.out.printf("��ǻ���� ���� ��ġ:%d\n", ca);
			}
		}
	}

}
	//battleship Ŭ������ ���� �ȿ��� , "S"�� ship���� ǥ��, Map �ȿ� ��ǥ���� '*', �������� �� '_'�� ǥ���մϴ�.
	/*public static void MakingBattleShip(final char[][] battleShip, final double level, final int seed){
		final Random maker = new Random();
		int randomNumber = 0;
		double mylevel = level; 
		mylevel *= seed;
		// ��ȸ�� ���� ���� ����� ������
		
		for(int i = 0; i<battleShip.length; i++){
			for(int j =0; j<battleShip[0].length; j++){ // ���� ���� ����
				randomNumber = maker.nextInt(seed); // seed�� 0���� �����Ѵ�.
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
			for(int j=0; j < counter[i].length; j++){ // ���� ���� ����
				if(j == 0 || i == 0 || j==battleShip[0].length-1||i==battleShip.length-1){
					counter[i][j] = '=';
			} else if(counter[i][j] != '=');{
				counter[i][j] = '*';
				}
			}
		}	return counter;

	}
	private static void print(final char [][] Print){
		System.out.println("���� ���Դϴ�.");
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
			for(int j=0; j<battleShip[0].length; j++){ //���� ���ָ� ����ϴ�.
				if(battleShip[i][j] == 'S'){
					countBattleShip++;
				}
			}
		}
		return countBattleShip;
	}
	
	public static boolean Evaluation(final int y, final int x, final char[][] battleShip){
		boolean hit = false; // default ����
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
			int y=0; // �Է��� ���� x,y��ǥ �ʱ�ȭ �Դϴ�.
			
			System.out.println("\n(**-1�� �κ� �Է��� ��� �ڵ����� ��ǥ ���� ���� �˴ϴ�.**)"
			+"\nX,Y ��ǥ ���� �Է����ּ��� : ");
			
			while(!((x > 0) && (x < battleShip.length-1)) && (!((y>0) && (y<battleShip[0].length-1))) || !pass){
				x = sc.nextInt();
				y = sc.nextInt();
				if (x == -1 || y == -1){
					x = maker.nextInt(counter.length-2)+1;
					y = maker.nextInt(counter[0].length-2)+1;
					break;
				}
				if(x <=0 || x > battleShip.length -2){
					System.out.println("�߸��� �Է��Դϴ�. X��ǥ�� �ٽ� �Է����ּ��� !");
				} else if (y <=0 || y > battleShip[0].length-2){
					System.out.println("�߸��� �Է��Դϴ�. Y��ǥ�� �ٽ� �Է����ּ��� !");
				} else if(counter[x][y]=='H' || counter[x][y]=='_'){
					System.out.println("�߸��� �Է��Դϴ� (�̹� �ı��Ǿ��ų� ������ �����Դϴ�)" + "\n�ٽ� �Է����ּ��� :");
					pass = false;
				} else {
					pass = true;
				}
			}
			hit=Evaluation(x, y, battleShip);
			newGuess--;
			
			if(hit){
				System.out.print("\n ���ϵ帳�ϴ�! �����ϼ̽��ϴ�! : \n");
				counter[x][y] = 'H';
				countBattleShip--;
			} else {
				System.out.print("\n �����߼̽��ϴ�. : \n");
				counter[x][y] = '_';
			}
			print(counter);
		}
		if(countBattleShip==0){
			System.out.println("\n�¸��ϼ̽��ϴ�~~!!!!");
		} else {
			System.out.println("\n�й��ϼ̽��ϴ�.");
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
			System.out.print("���� �Է��ϼ��� : ");
			cols = sc.nextInt();
			System.out.print("���� �Է��ϼ��� : ");
			rows = sc.nextInt();
			battleShip = new char[cols+2][rows+2];
			counter = new char[cols+2][rows+2];
			System.out.print("������ �Է��ϼ��� (0~1) **�Ҽ��� �Է�** : ");
            while (!(level > 0 && level < 1)) {
            	level = sc.nextDouble();
                //if user inputs the wrong number
                if (!(level > 0 && level < 1)) {
                    System.out.print("�ٽ� ������ �Է����ּ��� (0~1): ");
		}
	}
            System.out.print("��ȸ�� �Է��ϼ��� : ");
            guess=sc.nextInt();
            System.out.print("������ �Է��ϼ��� : ");
            seed=sc.nextInt(); 
            MakingBattleShip(battleShip, level, seed);// MakingBattleShip
            counter = MakingCounter(counter);
            playGame(battleShip, counter, guess, seed);
            System.out.println("\n0���� �Է��Ͻø� ������ ����˴ϴ�. ");
            System.out.println("\n1���� �Է��Ͻø� ������ �簳�˴ϴ�. ");
            System.out.println("\n2���� �Է��Ͻø� ������ ����۵˴ϴ�. ");
            option = sc.nextInt();
            while (option > 2 || option < 0) {
                System.out.print("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���: ");
                option = sc.nextInt();
            }
            if (option == 1) {
                //guess again and continue without dumping out the value
                System.out.println("\n ��ȸ�� �Է��Ͻÿ� : ");
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

public static void Gamestart(){ // ������ ���̵��� �Է��մϴ�. �ٸ� �Լ����� ȣ���ϸ� ���� ������� �Է��� �д� �߽� ��� �Դϴ�.
	Scanner scan = new Scanner(System.in);
	System.out.print("1���� 3������ ���̵��� �Է����ּ��� : ");
	createMap(scan.nextInt());
	int counting = 10;
	random();
	int u;
	int c;
	
	while (counting > 0 && win == false) {
		System.out.println("\n**���� ��ȸ�� "+ counting + "ȸ �Դϴ�.**");
		showing();
		System.out.print("\n\nX��ǥ�� �Է��� �ּ��� : ");
		u = scan.nextInt()-1;
		System.out.print("\nY��ǥ�� �Է��� �ּ��� : ");
		
		c = scan.nextInt()-1;
		Evaluation(u,c);
		counting--;
	}
}

	public static void showing(){ //������ ���̳�, ��Ȳ�� ����ϴ� ����Դϴ�.
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
			System.out.println("\n***X��ǥ, Y��ǥ ��� 5�̳� ���ڸ� �Է����ּ���***");
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
			System.out.println("�����ϼ̽��ϴ�~~~ �¸��� ���ϵ帳�ϴ�!!");
			win = true;
	} else {
		gameMap[y][x] = "X";
	}
	}
}*/