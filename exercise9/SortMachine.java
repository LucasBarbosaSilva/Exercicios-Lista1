package exercise9;

public abstract class SortMachine {
    private int[] list;

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public SortMachine(int[] list){
        this.list = list;
    }

    abstract String sort();
}