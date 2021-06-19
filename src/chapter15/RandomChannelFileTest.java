package chapter15;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class RandomChannelFileTest {
    public static void main(String[] args) throws Exception{
        final File file = new File("hello.txt");
        try (
                 RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
                 FileChannel channel = randomAccessFile.getChannel();
                ){
             MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            channel.position(file.length());
            channel.write(buffer);
            System.out.println("write over");
        }
    }
}
