/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author      : 공경배
 * @version     : 1.0
 */
public class Movie {
	private String title;
	private int limitage;
	
	public Movie(String title, int limitage) {
		this.title = title;
		this.limitage = limitage;
	}


	public String getTitle() {
		return title;
	}
	public int getLimitage() {
		return limitage;
	}
	
	public void buyTicket(int age) throws Exception{
		if(age<limitage) {
			throw new Exception(title + "은/는 " + limitage + "세 이상 관람가입니다."); 
		}
		else if(age>=limitage) {
			System.out.println(title + "즐감하세요.");
		}
		
	}
	
	
}
