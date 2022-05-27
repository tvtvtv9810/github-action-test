package com.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Calc {

    public static int sum(int... values){
        return IntStream.of(values).sum();
    }
}

