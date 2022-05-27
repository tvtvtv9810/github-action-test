package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {
    
    @Test
    public void testSum(){
        
        // ■ 入力
        final int[] input = {1,2,3,4,5,6,7,8,9,10};
        // ■ 期待値
        final var expected = 55;
        // ■ 実行
        final var actual = Calc.sum(input);
        // ■ 検証
        assertEquals(expected, actual);
    }

    @Test
    public void testSum2(){
        
        // ■ 入力
        final int[] input = {1,2,3,4,5,6,7,8,9,10,11,12};
        // ■ 期待値
        final var expected = 78;
        // ■ 実行
        final var actual = Calc.sum(input);
        // ■ 検証
        assertEquals(expected, actual);
    }
}
