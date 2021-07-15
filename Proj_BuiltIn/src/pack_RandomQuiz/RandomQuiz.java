package pack_RandomQuiz;

public class RandomQuiz {

	public static void main(String[] args) {

		// System.out.println("[출력결과]");

		double[] random = new double[3];
		int i = 0;
		int j = 0;

		while (true) {
			random[i] = Math.floor(10 * Math.random() + 1);

		//	System.out.print((int) random[i] + " ");
			i++;
			if (i == 3) {
				if (!(random[0] == random[1] || random[1] == random[2] || random[2] == random[0])) {
					// 같은게 한개라도 있다면
					// ! : 2개의 쌍을 비교했을 때 같은게 단 1개도 없음
					System.out.print((int)random[0] + " ");
					System.out.print((int)random[1] + " ");
					System.out.print((int)random[2] + " ");
					break;
				} else {
					i = 0;
				}
			}
		}
	}

}
