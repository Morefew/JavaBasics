package myco.com.BubblePopper;

public class BubblePopper {
        public static void main(String[] args) {

                Popper largie = new Popper("largie");

                Bubble soapie = new Bubble("soapie", "medium", "turquoise");

                largie.setBubble(soapie);
                largie.blow(largie.getBubble());
                largie.asks();
                soapie.reply();
                soapie.asks();
                largie.reply();
                largie.pop(soapie);
        }
}
