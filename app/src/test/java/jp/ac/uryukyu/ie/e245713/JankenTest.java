package jp.ac.uryukyu.ie.e245713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JankenGameクラスのテスト。
 */
public class JankenTest {
    @Test
    public void testGenerateCpuHand() {
        Janken game = new Janken();
        Janken.Hand cpuHand = game.generateCpuHand();
        assertNotNull(cpuHand, "CPUの手がnullであってはならない");
    }

    @Test
    public void testJudge() {
        Janken game = new Janken();

        // プレイヤーがROCKの場合のテスト
        assertEquals("Win", game.judge(Janken.Hand.ROCK, Janken.Hand.SCISSORS));
        assertEquals("Lose", game.judge(Janken.Hand.ROCK, Janken.Hand.PAPER));
        assertEquals("Draw", game.judge(Janken.Hand.ROCK, Janken.Hand.ROCK));

        // プレイヤーがPAPERの場合のテスト
        assertEquals("Win", game.judge(Janken.Hand.PAPER, Janken.Hand.ROCK));
        assertEquals("Lose", game.judge(Janken.Hand.PAPER, Janken.Hand.SCISSORS));
        assertEquals("Draw", game.judge(Janken.Hand.PAPER, Janken.Hand.PAPER));

        // プレイヤーがSCISSORSの場合のテスト
        assertEquals("Win", game.judge(Janken.Hand.SCISSORS, Janken.Hand.PAPER));
        assertEquals("Lose", game.judge(Janken.Hand.SCISSORS, Janken.Hand.ROCK));
        assertEquals("Draw", game.judge(Janken.Hand.SCISSORS, Janken.Hand.SCISSORS));
    }
}
