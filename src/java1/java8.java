package java1;

public class java8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 배열 기본 (ArrayList)
        System.out.println("배열문 설명");
        String[] users = new String[3]; // 3칸짜리 새 배열 객체를 하나 생성
        users[0] = "Kim";
        users[1] = "Yang";
        users[2] = "Park";

        System.out.println(users[0]);
        System.out.println(users.length);

        int[] scores = {10, 100, 1000}; // 원소, element
        System.out.println(scores[1]);
        System.out.println(scores.length);

	}

}
