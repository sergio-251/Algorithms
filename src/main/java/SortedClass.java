

public class SortedClass<E> {

    private MyArray<E> data;

    public SortedClass(MyArray<E> dataIn) {
        this.data = dataIn.copyData(dataIn);
    }


    public MyArray<E> bubbleSorted() {
        long a = System.nanoTime();
        E k;
        for (int i = 0; i < data.getCurrentSize() - 1; i++) {
            for (int j = i; j < data.getCurrentSize(); j++) {
                if ((Integer)data.getData()[j] < (Integer)data.getData()[i]) {
                    swap(i, j);
                }
            }
        }
        System.out.println("Bubble-sorted timing is " + (System.nanoTime() - a) / 1000.0f + " microSec :");
        return data;
    }

    public MyArray<E> selectSorted() {
        long a = System.nanoTime();
        for (int i = 0; i < this.data.getCurrentSize() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < this.data.getCurrentSize(); j++) {
                if ((Integer)this.data.getData()[j] < (Integer) this.data.getData()[min]) {
                   min = j;
                }
            }
            swap(min, i);
        }
        System.out.println("Select-sorted timing is " + (System.nanoTime() - a) / 1000.0f + " microSec :");
        return data;
    }

    public MyArray<E> addSorted() {
        long a = System.nanoTime();
        for (int i = 1; i < this.data.getCurrentSize() - 1; i++) {
            E t = this.data.getData()[i];
            int index = i;
           while (index > 0 && (Integer)this.data.getData()[i - 1] >  (Integer)t) {
               this.data.getData()[i] =  this.data.getData()[i - 1];
               index--;
           }
           this.data.getData()[index] = t;
        }
        System.out.println("Add-sorted timing is " + (System.nanoTime() - a) / 1000.0f + " microSec :");
        return data;
    }

    private void swap(int index1, int index2) {
        E k = (E) data.getData()[index2];
        data.getData()[index2] = data.getData()[index1];
        data.getData()[index1] = k;
    }

}
