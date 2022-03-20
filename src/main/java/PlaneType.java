public enum PlaneType {

    BOEING747(1,100, 400),
    JUMBOJET(2,150, 600),
    CONCORDE(3,50, 250),
    PIPER(4, 2, 4);

    private int value;
    private int capacity;
    private int totalWeight;

    PlaneType(int value, int capacity, int totalWeight) {
        this.value = value;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getValue() {
        return value;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
