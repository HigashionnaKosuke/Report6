package jp.ac.uryukyu.ie.e245713;

import java.util.Random;

/**
 * あっち向いてホイのロジックを管理するクラス。
 */
public class AcchiMuiteHoi {
    private final Random random = new Random();

    /**
     * あっち向いてホイの方向を表す列挙型。
     */
    public enum Direction {
        UP, DOWN, LEFT, RIGHT;

        public static Direction fromInt(int index) {
            return values()[index];
        }
    }

    /**
     * CPUの方向をランダムに生成する。
     * @return CPUの方向。
     */
    public Direction generateCpuDirection() {
        return Direction.fromInt(random.nextInt(4));
    }

    /**
     * あっち向いてホイの勝敗を判定する。
     * @param playerDirection プレイヤーの方向。
     * @param cpuDirection CPUの方向。
     * @return 勝敗結果（true: 勝利, false: 敗北）。
     */
    public boolean judge(Direction playerDirection, Direction cpuDirection) {
        return playerDirection == cpuDirection;
    }
}
