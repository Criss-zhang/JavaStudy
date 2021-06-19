package chapter15;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockTest {
    public static void main(String[] args) throws Exception{
        try (
                final FileOutputStream fileOutputStream = new FileOutputStream("FileLockTest.txt");
                final FileChannel channel = fileOutputStream.getChannel();
                ){
            final FileLock fileLock = channel.tryLock();
            Thread.sleep(2000);
            fileLock.release();
        }
    }

}
