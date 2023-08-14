public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer();
        Singer singer = new Singer();
        PopSinger popSinger = new PopSinger();

        dancer.dance();
        singer.sing();
        popSinger.sing();
        popSinger.dance();
    }
}
