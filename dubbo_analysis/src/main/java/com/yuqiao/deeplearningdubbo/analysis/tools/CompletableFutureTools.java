package com.yuqiao.deeplearningdubbo.analysis.tools;


import java.util.concurrent.CompletableFuture;

public class CompletableFutureTools {
    public static void main(String[] args) throws Exception{
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                completableFuture.complete("设定值");
                completableFuture.completeExceptionally(new RuntimeException("异常值"));
            }
        }).start();
        long start = System.currentTimeMillis();
        System.out.println("正在等待返回值...");
        System.out.println(completableFuture.get());
        System.out.println("程序结束...用时" + (System.currentTimeMillis() - start) + "ms");
    }
}
