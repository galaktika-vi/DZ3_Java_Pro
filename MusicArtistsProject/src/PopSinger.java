public class PopSinger implements Singable, Dancable {
    @Override
    public void sing() {
        System.out.println("PopSinger is singing");
    }

    @Override
    public void dance() {
        System.out.println("PopSinger is dancing");
    }
}
