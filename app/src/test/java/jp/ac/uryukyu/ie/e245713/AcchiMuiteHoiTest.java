package jp.ac.uryukyu.ie.e245713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * AcchiMuiteHoiクラスのテスト。
 */
public class AcchiMuiteHoiTest {
    @Test
    public void testGenerateCpuDirection() {
        AcchiMuiteHoi game = new AcchiMuiteHoi();
        AcchiMuiteHoi.Direction cpuDirection = game.generateCpuDirection();
        assertNotNull(cpuDirection, "CPUの方向がnullであってはならない");
    }
    //テスト
    @Test
    public void testJudge() {
        AcchiMuiteHoi game = new AcchiMuiteHoi();

        // プレイヤーとCPUの方向が一致する場合
        assertTrue(game.judge(AcchiMuiteHoi.Direction.UP, AcchiMuiteHoi.Direction.UP));
        assertTrue(game.judge(AcchiMuiteHoi.Direction.DOWN, AcchiMuiteHoi.Direction.DOWN));
        assertTrue(game.judge(AcchiMuiteHoi.Direction.LEFT, AcchiMuiteHoi.Direction.LEFT));
        assertTrue(game.judge(AcchiMuiteHoi.Direction.RIGHT, AcchiMuiteHoi.Direction.RIGHT));

        // プレイヤーとCPUの方向が異なる場合
        assertFalse(game.judge(AcchiMuiteHoi.Direction.UP, AcchiMuiteHoi.Direction.DOWN));
        assertFalse(game.judge(AcchiMuiteHoi.Direction.LEFT, AcchiMuiteHoi.Direction.RIGHT));
    }
}
