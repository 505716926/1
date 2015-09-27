package a33;

public class A1 {
	public static void main(String[] args) {
		short i;
		for (i = 1; i !=10; i++) {
			int input = i;
			int remain = input % 2;
			if (remain == 0) { // 餘數為0就是偶數
				System.out.printf("%d 為偶數%n", input);
			} else {
				System.out.printf("%d 為奇數%n", input);
			}
		}
		System.out.println("@@");
		System.out.println(i);
		System.out.println("XD");
		System.out.println(i);
	}
}
