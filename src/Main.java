import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Location> locationMap = new HashMap<String, Location>();
		LocationManagerHashMap hashManager;
		Scanner input = new Scanner(System.in);
		String temp = "", tempArr[];

		System.out.println("도시, 경도, 위도를 입력하세요.");

		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			temp = input.nextLine();
			tempArr = temp.replace(" ", "").split(",");
			locationMap.put(tempArr[0],
					new Location(tempArr[0], Float.parseFloat(tempArr[1]), Float.parseFloat(tempArr[2])));
		}

		System.out.println("-------------------------------");
		for (String key : locationMap.keySet()) {
			Location tempLoc = locationMap.get(key);
			System.out.printf("%-8s %-8.1f %.1f\n", tempLoc.getCity(), tempLoc.getLatitude(), tempLoc.getLongitude());
		}
		System.out.println("-------------------------------");

		hashManager = new LocationManagerHashMap(locationMap);
		while (true) {
			System.out.print("도시 이름 >> ");
			temp = input.nextLine();
			if (!(temp.equals("그만")))
				System.out.println(hashManager.getLocationData(temp));
			else
				break;
		}

		System.out.println("프로그램을 종료합니다.");
		input.close();
	}
}
