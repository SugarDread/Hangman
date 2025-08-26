public enum Difficulty {
    EASY("1", 1),
    MEDIUM("2", 2),
    HARD("3", 3);

    private final String index;
    private final int value;
    Difficulty(String index, int value)
    {
        this.index = index;
        this.value = value;
    }
    public String getIndex()
    {
        return index;
    }
    public int getValue()
    {
        return value;
    }
    public static Difficulty fromIndex(String index)
    {
        for (Difficulty d : values())
        {
            if (d.index.equals(index)){
                return d;
            }
        }
        throw new IllegalArgumentException("Invalid option");
    }
}
