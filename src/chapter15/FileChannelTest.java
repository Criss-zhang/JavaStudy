package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {
    public static void main(String[] args) {
        final File file = new File("路径/chapter15/FileChannelTest.java");
        try (
                final FileChannel inChannel = new FileInputStream(file).getChannel();
                final FileChannel outChannel = new FileOutputStream("channel.txt").getChannel();
                ){
            final MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            outChannel.write(buffer);
            System.out.println("---------");
            System.out.println(buffer);
            System.out.println("---------");
            buffer.clear();
            final Charset charset = Charset.forName("GBK");
            final CharBuffer charBuffer = charset.newDecoder().decode(buffer);
            System.out.println(charBuffer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
