package chapter15;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class ReadFile {
    public static void main(String[] args) {
        try (
                FileInputStream fileInputStream = new FileInputStream("路径/chapter15/ReadFile.java");
                final FileChannel channel = fileInputStream.getChannel();
                ){
            final ByteBuffer byteBuffer = ByteBuffer.allocateDirect(256);
            while (channel.read(byteBuffer) != -1){
                byteBuffer.flip();
                final Charset charset = Charset.forName("GBK");
                final CharsetDecoder charsetDecoder = charset.newDecoder();
                final CharBuffer charBuffer = charsetDecoder.decode(byteBuffer);
                System.out.println(charBuffer);
                byteBuffer.clear();
            }
        }catch (Exception e){

        }
    }
}
