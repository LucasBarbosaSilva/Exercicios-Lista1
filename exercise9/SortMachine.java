package exercise9;

public abstract class SortMachine {
    private int[] list;

    public SortMachine(int[] list){
        this.list = list;
    }

    abstract int[] sort(int[] list);
}