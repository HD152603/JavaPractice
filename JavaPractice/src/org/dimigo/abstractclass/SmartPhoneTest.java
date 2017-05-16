/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author      : 공경배
 * @version     : 1.0
 */
public class SmartPhoneTest {

	
	public static void main(String[] args) {
		SmartPhone[] phone = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone p : phone) {
			System.out.println(p);
			p.turnOn();
			p.pay();
			p.useSpecialFuntion();
			p.turnOff();
		}
	}

}
