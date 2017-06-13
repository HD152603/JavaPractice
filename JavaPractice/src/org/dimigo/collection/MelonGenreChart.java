/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author      : 공경배
 * @version     : 1.0
 */
public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		String[] genreList = {"발라드", "댄스"};
 		
		List<Music> balladList = new ArrayList<Music>();
		List<Music> danceList = new ArrayList<Music>();
				
		map.put(genreList[0], balladList);
		map.put(genreList[1], danceList);
		
		balladList.add(new Music("팔레트", "아이유"));
		danceList.add(new Music("I LUV IT", "PSY"));
		danceList.add(new Music("맞지?", "언니쓰"));
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		
		System.out.println("\n-- << 댄스 2위 곡 변경 >> --");
		danceList.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("\n-- << 댄스 1위 곡 삭제 >> --");
		danceList.remove(0);
		printMap(map);
		
		System.out.println("\n-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
		
	}
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()) {
			System.out.println("["+key+"]");
			int i = 1;
			for(Music m : map.get(key)) {
				System.out.println(i+". "+m);
				i++;
			}
		}
			
			
	}

}
