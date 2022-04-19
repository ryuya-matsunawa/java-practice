import java.util.Scanner;

public class CoinCaseMain {
    public static void main(String[] args) {
		// インスタンス化
		CoinCase coinCase = new CoinCase();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("硬貨の種類を入力してください");
			int coin = scanner.nextInt();
			System.out.println("硬貨の枚数を入力してください");
			int count = scanner.nextInt();
			// 硬貨の種類を枚数を渡してcount500などの変数に枚数を追加する
			coinCase.AddCoins(coin, count);
		}
		scanner.close();
		
		System.out.println("500円硬貨は" + coinCase.GetCount(500) + "枚で" + coinCase.GetAmount(500) + "円です。");
		System.out.println("100円硬貨は" + coinCase.GetCount(100) + "枚で" + coinCase.GetAmount(100) + "円です。");
		System.out.println("50円硬貨は" + coinCase.GetCount(50) + "枚で" + coinCase.GetAmount(50) + "円です。");
		System.out.println("10円硬貨は" + coinCase.GetCount(10) + "枚で" + coinCase.GetAmount(10) + "円です。");
		System.out.println("5円硬貨は" + coinCase.GetCount(5) + "枚で" + coinCase.GetAmount(5) + "円です。");
		System.out.println("1円硬貨は" + coinCase.GetCount(1) + "枚で" + coinCase.GetAmount(1) + "円です。");
		
		System.out.println("合計枚数は" + coinCase.GetCount() + "枚です。");
		System.out.println("総額は" + coinCase.GetAmount() + "円です。");
	}
}
