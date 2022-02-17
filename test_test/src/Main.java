public class Main {

    public static void main(String[] args) {
        Mouse mouse = new Mouse(2);
        Mouse mouse1 = new Mouse(3);
        Mouse mouse2 = new Mouse(4);

        Cat barsik = new Cat("Барсик", "black", 12, 5, 3);
        Cat murzik = new Cat("Мурзик", "white", 8, 7, 2);


        murzik.catchMousses(mouse);
        barsik.catchMousses(mouse1);
        barsik.catchMousses(mouse2);
        barsik.catchMousses(mouse2);
        barsik.catchMousses(mouse2);
        barsik.catchMousses(mouse2);

        System.out.println(murzik);
        System.out.println(barsik);
//
//        murzik.attackCat(barsik);
//        System.out.println();
//        System.out.println(murzik);
//        System.out.println(barsik);

    }
}
