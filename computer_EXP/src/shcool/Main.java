package shcool;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Student> students = new Vector<Student>();
		Scanner input = new Scanner(System.in);
		String temp = "", tempArr[];

		System.out.println("4명의 이름, 전공, 학번, 학점 입력");
		for (int i = 0; i < 4; i++) {
			temp = input.nextLine();
			tempArr = temp.replace(" ", "").split(",");
			students.add(
					new Student(tempArr[0], tempArr[1], Integer.parseInt(tempArr[2]), Float.parseFloat(tempArr[3])));
		}

		System.out.println("---------------------------------------------");
		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student tempStu = iter.next();
			System.out.printf("이름:%-5s 전공:%-6s 학번:%-5d 학점평균:%.2f\n", tempStu.getName(), tempStu.getMajor(),
					tempStu.getClassNum(), tempStu.getCredit());
		}
		System.out.println("---------------------------------------------");

		iter = students.iterator();
		System.out.print("장학생: ");
		while (iter.hasNext()) {
			Student tempStu = iter.next();
			if (tempStu.getCredit() >= 4.0f)
				System.out.printf(" %s ", tempStu.getName());
		}

		while (true) {
			System.out.print("\n학생 이름 >>");
			temp = input.nextLine();
			if (temp.equals("그만")) {
				break;
			} else {
				iter = students.iterator();
				while (iter.hasNext()) {
					Student tempStu = iter.next();
					if (tempStu.getName().equals(temp)) {
						System.out.printf("이름:%-5s 전공:%-6s 학번:%-5d 학점평균:%.2f\n", tempStu.getName(), tempStu.getMajor(),
								tempStu.getClassNum(), tempStu.getCredit());
						break;
					}
				}
			}
		}

		System.out.println("프로그램을 종료합니다.");
		input.close();
	}
}
