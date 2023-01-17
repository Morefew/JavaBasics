package myco.com.BubblePopper;

public class Bubble implements Chatting{
    private String name;
    private String size;
    private String color;

    public Bubble(String name, String size, String color) {
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void asks() {
        System.out.println(this.getName() + " asks " + " How are you?");
    }

    @Override
    public void reply() {
        System.out.println(this.getName() + " replies " + " It's a great day");
    }

}
