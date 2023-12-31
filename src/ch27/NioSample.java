package ch27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {
    public static void main(String[] args) {
        NioSample sample = new NioSample();
        sample.basicWriteAndRead();
    }

    private void basicWriteAndRead() {
        String fileName = "C:\\Users\\USER\\Desktop\\text\\nio.txt";
        try {
            writeFile(fileName, "My first NIO Sample");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFile(String fileName) throws Exception {
        FileChannel channel = new FileInputStream(fileName).getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print((char)buffer.get());
        }
        channel.close();
    }

    private void writeFile(String fileName, String data) throws Exception {
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] dataBytes = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(dataBytes);
        channel.write(buffer);
        channel.close();
    }
}
