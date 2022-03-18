import java.util.ArrayList;
import java.util.List;

public class Test {

    public static final String IMG_BASE64 = "import java.util.ArrayList;\n" +
            "import java.util.List;";

    public static void main(String[] args) {
        add();
    }

    private static void add() {
        long startTime1 = System.nanoTime();
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            items.add(new Item(i, IMG_BASE64));
        }
        long endTime1 = System.nanoTime();
        System.out.println("add1 use time: " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        List<Item> items2 = new ArrayList<>();
        items2.addAll(items);
        long endTime2 = System.nanoTime();
        System.out.println("add2 use time: " + (endTime2 - startTime2));
    }

    static class Item {
        private int id;
        private String imgBase64;

        public Item(int id, String imgBase64) {
            this.id = id;
            this.imgBase64 = imgBase64;
        }
    }
}
