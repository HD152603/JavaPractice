/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 : 초간단 게임프로그램
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author      : 공경배
 * @version     : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ad = 100;
		int choice, ran;
		String[] cla={"마법사", "영주", "기사", "농민"};
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("<< 게임 메뉴 >> \n1. 공격력 증가 \n2. 공격력 감소 \n3. 캐릭터 설정 \n9. 종료 ");
			System.out.println("-------------------");
			System.out.println("메뉴 입력 => ");
			
			choice = scanner.nextInt(); 
			
			switch(choice) {
			case 1: 
				ad+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+ad);
				break;
			case 2:
			 	ad-=100;
			 	System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+ad);
			 	break;
			case 3:
				ran = new Random().nextInt(4);
				System.out.println(cla[ran] + "(으)로 설정되었습니다. ");
				break;
			case 9 : 
				System.out.println("이제 공부하세요!");
				break;
			default : 
				System.out.println("없는 메뉴입니다!!");
			}
			if(choice==9) break;
		}
	}

}
