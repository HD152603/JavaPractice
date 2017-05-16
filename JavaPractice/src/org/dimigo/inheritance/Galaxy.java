/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ IPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author      : 공경배
 * @version     : 1.0
 */
public class Galaxy extends SmartPhone{
	
	public Galaxy() {
		super();
	}
	public Galaxy(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay() {
		System.out.println("삼성 페이로 결제합니다.");
	}
	public void useWirelessCharging(){
		System.out.println("무선 충전 기능을 사용합니다.");
	}
}
