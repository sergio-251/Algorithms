
public class StartClass {
    public static final int COUNT_THINGS = 5;
    public static Thing[] dataThings;
    public static int maxWeight;
    public static int maxPrice;


    public static void main(String[] args) {
        System.out.println("Первое задание");
        System.out.println(pow(2, -4));
        System.out.println("Второе задание");
        initThings();
        System.out.println("Max price of thing is " + bestPrice(COUNT_THINGS - 1, 4));
    }

    private static float pow(int n, int m) {
        if (n == 0 && m == 0) throw new IllegalArgumentException("Zero to the degree zero does not exist");
        if (m == 1 || n == 1 || (n == 0 && m != 0)) return n;
        if (m == 0) return 1;
        if (m < 0) return 1 / (n * pow(n, -m - 1));
        return n * pow(n, m -1);
    }

    private static int bestPrice(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (dataThings[i].weight > W) {
            return bestPrice(i - 1, W);
        } else {
            return Math.max(bestPrice(i - 1, W), bestPrice(i - 1, W - dataThings[i].weight) + dataThings[i].price);
        }
    }

    private static void initThings() {
        dataThings = new Thing[COUNT_THINGS];
        dataThings[0] = new Thing("Книга", 1, 600);
        dataThings[1] = new Thing("Бинокль", 2, 5000);
        dataThings[2] = new Thing("Аптечка", 4, 1500);
        dataThings[3] = new Thing("Ноутбук", 2, 40000);
        dataThings[4] = new Thing("Котелок", 1, 500);
    }

    static class Thing {
        String name;
        int weight;
        int price;

        public Thing(String name, int weight, int price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }
    }
}
