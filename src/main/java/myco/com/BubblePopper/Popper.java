package myco.com.BubblePopper;

public class Popper extends Toys implements Chatting {

    private String name;
    private String type;
    private String size;
    private String color;

//  private List<Bubble> bubbles;

    Bubble bubble;

    public Popper(String name){
            this.name = name;
    }

    public Popper(int batteriesCount, String batteriesType, String toyCategory, String name, String manufacturer, String sizeHeigth, String sizeWidth, String sizeLength, String color) {
        super(batteriesCount, batteriesType, toyCategory, name, manufacturer, sizeHeigth, sizeWidth, sizeLength, color);
    }

//        public Popper(String name, String type, String size, String color) {
//            super();
//            this.name = name;
//            this.type = type;
//            this.size = size;
//            this.color = color;
//        }


    public void pop(Bubble bubble) {
        System.out.println(this.getName() + " has popped " + bubble.getName());
    }

    public void blow(Bubble bubble) {
        System.out.println(this.getName() + " has blown " + bubble.getName());
    }

    @Override
    public void asks() {
        System.out.println(this.getName() + " asks " + bubble.getName() + " Hello, how are you?");
    }

    @Override
    public void reply() {
        System.out.println(this.getName() + " replies " + bubble.getName() + " I'm still kicking");
    }

    public void setBubble(Bubble bubble) {
        this.bubble = bubble;
    }

//        public void setBubbles(List<Bubble> bubbles) {
//            this.bubbles = bubbles;
//        }

    public String getName() {
        return name;
    }

    public Bubble getBubble() {
        return bubble;
    }
}
