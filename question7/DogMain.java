public class DogMain {
    public static void main(String args[]) {
        // Dogクラスをインスタンス化
        Dog dog = new Dog();
        // DogクラスのSetNameメソッドを引数にポチを渡して実行
        dog.SetName("ポチ");
        // DogクラスのShowProfileメソッドを実行
        dog.ShowProfile();
    }
}
