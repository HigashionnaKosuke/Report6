package jp.ac.uryukyu.ie.e245713;

import java.util.Random;

public class Janken {
    private final Random random = new Random();

    
    //プレイヤーの手を表す列挙型。
    public enum Hand {
        ROCK, PAPER, SCISSORS;
         
        public static Hand fromInt(int index) {
            return values()[index];
        }
    }

    
    //CPUの手をランダムに生成する。
    public Hand generateCpuHand() {
        int randomIndex = random.nextInt(3); // 0〜2のランダムな数値
        return Hand.fromInt(randomIndex);
    }

    
    //勝敗を判定する。
    public String judge(Hand playerHand, Hand cpuHand) {
        if (playerHand == cpuHand) {
            return "Draw";
        } else if (
            (playerHand == Hand.ROCK && cpuHand == Hand.SCISSORS) ||
            (playerHand == Hand.PAPER && cpuHand == Hand.ROCK) ||
            (playerHand == Hand.SCISSORS && cpuHand == Hand.PAPER)
        ) {
            return "Win";
        } else {
            return "Lose";
        }
    }
}