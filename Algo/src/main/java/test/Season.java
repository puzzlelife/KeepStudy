package test;

public enum Season {
    SPRING("春天",1),SUMMER("夏天",2),AUTUMN("秋天",3),WINTER("冬天",4);

    private String season;
    private int index;

    Season(String season, int index) {
        this.season = season;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getSeason() {
        return season;
    }


}
