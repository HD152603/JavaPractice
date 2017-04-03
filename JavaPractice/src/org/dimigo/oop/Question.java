/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author      : 공경배
 * @version     : 1.0
 */
public class Question {

	public static void main(String[] args) {
		String[] que = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
		String[] ans = {"에드시런", "박보영", "물리"};
		
		StringBuilder sb = new StringBuilder("<< 결과 출력 >> \n");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println( (i+1) + "."+que[i]);
			String answer = scanner.nextLine();
			System.out.println((ans[i].equals(answer))?"정답입니다!":"틀렸습니다!");
			sb.append(que[i]).append(ans[i]).append("입니다. \n");
		}

		System.out.println(sb);
	}

}
