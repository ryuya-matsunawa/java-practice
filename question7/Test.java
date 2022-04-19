class Test {
  public static void main(String[] args) {
    try {
        // argsの中には実行時引数が入る
        // args[0]；1行目
        // args[1]；2行目
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        // i / jをコンソール出力する
        System.out.println(i / j);
        // 正常に終了した場合に出力される
        System.out.println("正常");
    } catch (NumberFormatException pe) {
        // 実行時引数が文字の時
        System.out.println("数字を入力してください");
    } catch (ArrayIndexOutOfBoundsException e) {
        // 実行時引数がない時
        System.out.println("引数は2つ設定してください");
    } catch (Exception ee) {
        // 予期しない例外のとき（jに0が入るなど）
        System.out.println("予期しない例外が発生しました");
    } finally {
        // 最後に実行される処理
        System.out.println("終了");
    }
  }
}