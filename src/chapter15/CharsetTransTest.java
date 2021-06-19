package chapter15;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class CharsetTransTest {
    public static void main(String[] args)throws Exception {
        final Charset cn = Charset.forName("GBK");
        final CharsetEncoder charsetEncoder = cn.newEncoder();
        final CharsetDecoder charsetDecoder = cn.newDecoder();
        final CharBuffer charBuffer = CharBuffer.allocate(5);
        charBuffer.put('c');
        charBuffer.put('r');
        charBuffer.put('i');
        charBuffer.put('s');
        charBuffer.flip();
        final ByteBuffer byteBuffer = charsetEncoder.encode(charBuffer);
        //书里面此处是byteBuffer.capacity（）,应该是limit，因为limit的值是当前数组存放元素的长度，而capacity是最大容量，很容易数组下标越界
        for (int i = 0 ; i <byteBuffer.limit();i++){
            System.out.println(byteBuffer.get(i)+"  ");
        }
        System.out.println("---");
        System.out.println(charsetDecoder.decode(byteBuffer));
    }
}
