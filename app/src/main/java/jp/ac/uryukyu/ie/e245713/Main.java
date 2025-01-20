package jp.ac.uryukyu.ie.e245713;

import java.util.Scanner;

/**
 * じゃんけんゲームを動かすためのクラス。
 */
public class Main {
    public static void main(String[] args) {
        Janken janken = new Janken();
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんを始めます！手を選んでください:");
        System.out.println("0: ROCK (グー), 1: PAPER (パー), 2: SCISSORS (チョキ)");

        // プレイヤーの手を入力
        int playerChoice = scanner.nextInt();
        Janken.Hand playerHand = Janken.Hand.fromInt(playerChoice);

        // CPUの手を生成
        Janken.Hand cpuHand = janken.generateCpuHand();

        // 手を表示
        System.out.println("あなたの手: " + playerHand);
        System.out.println("CPUの手: " + cpuHand);

        // 勝敗判定
        String result = janken.judge(playerHand, cpuHand);
        System.out.println("結果: " + result);

        scanner.close();
    }
}
