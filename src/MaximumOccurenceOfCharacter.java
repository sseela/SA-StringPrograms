import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceOfCharacter {
	
	public static void main(String[] args) {
		String str = "Mahabar";
		char[] charArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c: charArr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		int largest = Integer.MIN_VALUE;
		char key = 0;
		for(char c: charArr) {
			if(map.get(c) > largest) {
				largest = map.get(c);
				key = c;
			}
		}
		System.out.println("key is: "+key+" value is: "+largest);
	}
}
