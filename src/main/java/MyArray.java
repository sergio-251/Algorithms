import java.util.Arrays;
import java.util.Objects;

public class MyArray<E> {
    private static final int DEFAULT_SIZE = 1000000;
    private E[] data;
    private int currentSize;

    public MyArray() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public MyArray(int n) {
        if (n < 1) throw new IllegalArgumentException("Parameter " + n + " is invalid!");
        this.data = (E[]) new Object[n];
        this.currentSize = 0;
    }

    public void add(E value) {
        checkSize();
        this.data[this.currentSize] = value;
        this.currentSize++;
    }

    public boolean remove(int index){
        if (index < 0 || index > this.currentSize - 1) return false;
        for (int i = index; i < this.currentSize - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[--this.currentSize] = null;
        return true;
    }

    public int indexOfValue(E value) {
        for (int i = 0; i < this.currentSize; i++) {
            if (Objects.equals(this.data[i], value)) return i;
        }
        return -1;
    }

    public E valueOfIndex(int index) {
        if (checkIndex(index)) {
           return this.data[index];
        }
        throw new ArrayIndexOutOfBoundsException("Index " + " index " + " is invalid!");
    }

    public boolean contains(E value) {
        return indexOfValue(value) > - 1;
    }

    public int length() {
        return this.data.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        if (this.currentSize == 0) {
            result.append("]");
            return result.toString();
        }
        for (int i = 0; i < this.currentSize; i++) {
            if (i % 40 == 0 && i != 0) result.append("\n");
            result.append(this.data[i] + (i == (this.currentSize - 1) ? "]" : ", "));
        }
        return result.toString();
    }


    /**
     * Fills an array of random elements on a segment [0; a] if a >= 0, and [a; 0] if a < 0
     * @param a argument to the right border of the line segment
     */

    @SuppressWarnings("unchecked")
    public void randomGenerate(int a) {
        for (int i = 0; i < this.data.length; i++) {
            add((E) new Integer(Math.round((float) (a * Math.random()))));
        }
    }

    public E[] getData() {
        return data;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    private void checkSize() {
        if (this.currentSize == this.data.length) {
            this.data = Arrays.copyOf(this.data, 2 * this.data.length);
        }

    }

    public MyArray<E> copyData(MyArray<E> dataIn) {
        MyArray<E> copy = new MyArray<>(dataIn.length());
        copy.setCurrentSize(dataIn.getCurrentSize());
        for (int i = 0; i < dataIn.getCurrentSize(); i++) {
            copy.getData()[i] = dataIn.getData()[i];
        }
        return copy;
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index <= (this.currentSize - 1);
    }

}
