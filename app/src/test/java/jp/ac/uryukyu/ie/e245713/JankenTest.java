package jp.ac.uryukyu.ie.e245713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Solverクラスのテスト。
 */
public class JankenTest
{
    @Test
    public void testJudge() {
        Janken janken = new Janken();

        // プレイヤー: ROCK, CPU: SCISSORS -> 勝ち
        assertEquals("Win", janken.judge(Janken.Hand.ROCK, Janken.Hand.SCISSORS));

        // プレイヤー: ROCK, CPU: PAPER -> 負け
        assertEquals("Lose", janken.judge(Janken.Hand.ROCK, Janken.Hand.PAPER));

        // プレイヤー: ROCK, CPU: ROCK -> 引き分け
        assertEquals("Draw", janken.judge(Janken.Hand.ROCK, Janken.Hand.ROCK));
    }
}

