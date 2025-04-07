package arrayListFormat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Location> locationMap = new ArrayList<Location>();
		LocationManagerArrayList listManager;
		Scanner input = new Scanner(System.in);
		String temp = "", tempArr[];

		System.out.println("도시, 경도, 위도를 입력하세요.");

		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			temp = input.nextLine();
			tempArr = temp.replace(" ", "").split(",");
			locationMap.add(new Location(tempArr[0], (Float.parseFloat(tempArr[1])), (Float.parseFloat(tempArr[2]))));
		}

		System.out.println("-------------------------------");
		for (Location loc : locationMap) {
			System.out.printf("%-8s %-8.1f %.1f\n", loc.getCity(), loc.getLatitude(), loc.getLongitude());
		}
		System.out.println("-------------------------------");

		listManager = new LocationManagerArrayList(locationMap);
		while (true) {
			System.out.print("도시 이름 >> ");
			temp = input.nextLine();
			if (!(temp.equals("그만")))
				System.out.println(listManager.getLocationData(temp));
			else
				break;
		}
		
		System.out.println("프로그램을 종료합니다.");
		input.close();
	}
}
