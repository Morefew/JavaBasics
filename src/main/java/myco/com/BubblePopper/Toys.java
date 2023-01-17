package myco.com.BubblePopper;

public abstract class Toys {
    private int batteriesCount;
    private String batteriesType;
    private String toyCategory;
    private String name;
    private String manufacturer;
    private String sizeHeigth;
    private String sizeWidth;
    private String sizeLength;
    private String color;

    public Toys(){

    }
    public Toys(int batteriesCount, String batteriesType, String toyCategory, String name, String manufacturer, String sizeHeigth, String sizeWidth, String sizeLength, String color) {
        this.batteriesCount = batteriesCount;
        this.batteriesType = batteriesType;
        this.toyCategory = toyCategory;
        this.name = name;
        this.manufacturer = manufacturer;
        this.sizeHeigth = sizeHeigth;
        this.sizeWidth = sizeWidth;
        this.sizeLength = sizeLength;
        this.color = color;
    }

    public int getBatteriesCount() {
        return batteriesCount;
    }

    public void setBatteriesCount(int batteriesCount) {
        this.batteriesCount = batteriesCount;
    }

    public String getBatteriesType() {
        return batteriesType;
    }

    public void setBatteriesType(String batteriesType) {
        this.batteriesType = batteriesType;
    }

    public String getToyCategory() {
        return toyCategory;
    }

    public void setToyCategory(String toyCategory) {
        this.toyCategory = toyCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSizeHeigth() {
        return sizeHeigth;
    }

    public void setSizeHeigth(String sizeHeigth) {
        this.sizeHeigth = sizeHeigth;
    }

    public String getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(String sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public String getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(String sizeLength) {
        this.sizeLength = sizeLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

