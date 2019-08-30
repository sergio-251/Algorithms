public class StartClass {

    public static final int MAX_LEVEL = 4;
    public static final int MAX_TREES = 20;
    public static final int MIN_RND = -20;
    public static final int MAX_RND = 20;


    public static void main(String[] args) {
        MyTree[] dataTree = new MyTree[MAX_TREES];
        int countBalanced = 0;
        for (int i = 0; i < MAX_TREES; i++) {
            dataTree[i] = new MyTree<Integer>();
            dataTree[i].generateToLevel(MAX_LEVEL, MIN_RND, MAX_RND);
            if (dataTree[i].isBalancedTree()) countBalanced++;
        }
        System.out.println("Percent of balanced trees is " + (float) countBalanced / MAX_TREES * 100 + "%");



    }
}
