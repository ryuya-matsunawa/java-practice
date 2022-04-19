public class CoinCase {
	private int count500 = 0;
	private int count100 = 0;
	private int count50 = 0;
	private int count10 = 0;
	private int count5 = 0;
	private int count1 = 0;
	
	// 引数：硬貨の種類と硬貨の枚数
	// 戻り値：なし
	public void AddCoins(int coin, int count) {
		switch(coin) {
			case 500:
				count500 += count;
				break;
			case 100:
				count100 += count;
				break;
			case 50:
				count50 += count;
				break;
			case 10:
				count10 += count;
				break;
			case 5:
				count5 += count;
				break;
			case 1:
				count1 += count;
				break;
		}
	}
	
	// 引数：なし
	// 戻り値：硬貨の合計枚数
	public int GetCount() {
		int sum = 0;
		sum = count500 + count100 + count50 + count10 + count5 + count1;
		return sum;
	}
	
	// 引数：硬貨の種類
	// 戻り値：硬貨の枚数
	public int GetCount(int coin) {
		int count = 0;
		switch(coin) {
			case 500:
				count = count500;
				break;
			case 100:
				count = count100;
				break;
			case 50:
				count = count50;
				break;
			case 10:
				count = count10;
				break;
			case 5:
				count = count5;
				break;
			case 1:
				count = count1;
				break;
		}
		return count;
	}
	
	// 引数：なし
	// 戻り値：総額
	public int GetAmount() {
		int sum = 0;
		sum = 500 * count500 + 100 * count100 + 50 * count50 + 10 * count10 + 5 * count5 + count1;
		return sum;
	}
	
	// 引数：硬貨の種類
	// 戻り値：硬貨ごとの合計金額
	public int GetAmount(int coin) {
		int sum = 0;
		switch(coin) {
			case 500:
				sum = 500 * count500;
				break;
			case 100:
				sum = 100 * count100;
				break;
			case 50:
				sum = 50 * count50;
				break;
			case 10:
				sum = 10 * count10;
				break;
			case 5:
				sum = 5 * count5;
				break;
			case 1:
				sum = count1;
				break;
		}
		return sum;
	}
}
