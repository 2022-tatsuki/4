import java.util.Random;

public class Main {
    public static void main(String[] args) {


        String[] hands = {"グー", "チョキ", "パー"};
        String[] judges = {"勝ち", "あいこ", "負け"};

        Random rockScissorsPapers = new Random();
        Random match = new Random();
        String hand = hands[rockScissorsPapers.nextInt(3)];
        System.out.println(hand);
        String judge = judges[match.nextInt(3)];
        System.out.println(judge);


    }
}
