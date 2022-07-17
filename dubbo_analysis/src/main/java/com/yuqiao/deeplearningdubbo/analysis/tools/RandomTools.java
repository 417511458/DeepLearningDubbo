package com.yuqiao.deeplearningdubbo.analysis.tools;

import java.util.concurrent.ThreadLocalRandom;

public class RandomTools {
    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            System.out.println(ThreadLocalRandom.current().nextInt(3));
        }
    }
}
