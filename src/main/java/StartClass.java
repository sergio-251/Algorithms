public class StartClass {
    public static void main(String[] args) {
        MyArray<Integer> a = new MyArray<>(15);
        a.randomGenerate(50);
        SortedClass sortBubble = new SortedClass(a);
        SortedClass sortSelect = new SortedClass(a);
        SortedClass sortAdd = new SortedClass(a);
        System.out.println(sortBubble.bubbleSorted());
        System.out.println(sortSelect.selectSorted());
        System.out.println(sortSelect.addSorted());


      //  SortedClass sortSelect = new SortedClass(a);

    }
}
