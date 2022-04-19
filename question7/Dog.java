public class Dog {
    // private：Dogクラス内で使われるのでprivate
    private String Name;

    // public：Main.javaで呼び出すのでpublic
    // void：戻り値がない（returnがいらない）時の型
    // SetName：メソッド名
    // String name：文字列型のnameを引数とする
    public void SetName(String name) {
        // メンバ変数のNameに引数で受け取ったnameを代入する
        Name = name;
    }

    // ShowProfileはメソッド名
    public void ShowProfile() {
        System.out.println("名前は" + Name + "です。");
    }
}
