package com.example.aop.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\a.txt");
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        int read = channel.read(allocate);
        allocate.flip();
        while(allocate.remaining()>0){
            byte b = allocate.get();
            System.out.print((char) b);
        }
        fileInputStream.close();
    }
}
