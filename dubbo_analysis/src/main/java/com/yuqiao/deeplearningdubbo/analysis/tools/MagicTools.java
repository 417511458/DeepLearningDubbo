package com.yuqiao.deeplearningdubbo.analysis.tools;


import org.apache.dubbo.common.io.Bytes;

public class MagicTools {
    public static void main(String[] args) {
        short MAGIC = (short) 0xdabb;

        for (int i = 0;i < 10;i++) {
            byte MAGIC_HIGH = Bytes.short2bytes(MAGIC)[0];
            byte MAGIC_LOW = Bytes.short2bytes(MAGIC)[1];
            System.out.println(MAGIC_HIGH + "," + MAGIC_LOW);
        }
    }
}
