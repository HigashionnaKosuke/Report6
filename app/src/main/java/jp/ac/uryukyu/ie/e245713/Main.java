package jp.ac.uryukyu.ie.e245713;
import java.util.Scanner;

/**
 * じゃんけん＋あっち向いてホイゲームを実行するクラス。
 */
public class Main {
    public static void main(String[] args) {
        Janken janken = new Janken();
        AcchiMuiteHoi acchiMuiteHoi = new AcchiMuiteHoi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんを始めます！手を選んでください:");
        System.out.println("0: ROCK (グー), 1: PAPER (パー), 2: SCISSORS (チョキ)");

        // じゃんけん部分
        int playerChoice = scanner.nextInt();
        Janken.Hand playerHand = Janken.Hand.fromInt(playerChoice);
        Janken.Hand cpuHand = janken.generateCpuHand();

        System.out.println("あなたの手: " + playerHand);
        System.out.println("CPUの手: " + cpuHand);

        String jankenResult = janken.judge(playerHand, cpuHand);
        System.out.println("じゃんけん結果: " + jankenResult);

        if (jankenResult.equals("Draw")) {
            System.out.println("引き分けです。再度じゃんけんを行ってください。");
            main(args); // 再起呼び出しでリトライ
            return;

        } else if (jankenResult.equals("Win")) {
            System.out.println("あっち向いてホイ！方向を選んでください:");
            System.out.println("0: UP, 1: DOWN, 2: LEFT, 3: RIGHT");

            int playerDirectionChoice = scanner.nextInt();
            AcchiMuiteHoi.Direction playerDirection = AcchiMuiteHoi.Direction.fromInt(playerDirectionChoice);
            AcchiMuiteHoi.Direction cpuDirection = acchiMuiteHoi.generateCpuDirection();

            System.out.println("あなたの方向: " + playerDirection);
            System.out.println("CPUの方向: " + cpuDirection);

            boolean acchiResult = acchiMuiteHoi.judge(playerDirection, cpuDirection);

            if (acchiResult){
                System.out.println("勝利しました！");
            } else {
                System.out.println("方向が違いました。再度じゃんけんを行ってください。");
                main(args); // 再起呼び出しでリトライ
                return;
            }
        } else {
            System.out.println("あっち向いてホイ！方向を選んでください:");
            System.out.println("0: UP, 1: DOWN, 2: LEFT, 3: RIGHT");

            int playerDirectionChoice = scanner.nextInt();
            AcchiMuiteHoi.Direction playerDirection = AcchiMuiteHoi.Direction.fromInt(playerDirectionChoice);
            AcchiMuiteHoi.Direction cpuDirection = acchiMuiteHoi.generateCpuDirection();

            System.out.println("あなたの方向: " + playerDirection);
            System.out.println("CPUの方向: " + cpuDirection);

            boolean acchiResult = acchiMuiteHoi.judge(playerDirection, cpuDirection);

            if (acchiResult){
                System.out.println("負けました！");
            } else {
                System.out.println("方向が違いました。再度じゃんけんを行ってください。");
                main(args); // 再起呼び出しでリトライ
                return;
            }
        }
    }       
}



