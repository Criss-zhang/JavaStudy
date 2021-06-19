package chapter15;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class BufferTest {
    public static void main(String[] args) {
        final CharBuffer charBuffer = CharBuffer.allocate(8);
        System.out.println("capacity:"+charBuffer.capacity());
        System.out.println("limit"+charBuffer.limit());
        System.out.println("position"+charBuffer.position());
        charBuffer.put('a');
        charBuffer.put('b');
        charBuffer.put('c');
        System.out.println("new position is :"+charBuffer.position());
        charBuffer.flip();
        System.out.println("after flip limit is :"+charBuffer.limit());
        System.out.println("after flip the position is :"+charBuffer.position());
        System.out.println("new capacity is:"+charBuffer.capacity());
        System.out.println(charBuffer.get());
        System.out.println(charBuffer.get());
        System.out.println(charBuffer.get());
        System.out.println("new position is :"+charBuffer.position());
        charBuffer.clear();
        System.out.println("clear后的limit"+charBuffer.limit());
        System.out.println("clear后的position"+charBuffer.position());
        System.out.println("clear后，buffer内的数据没被清除，他们的数据："+charBuffer.get(2));
        System.out.println("执行绝对读取后的位置"+charBuffer.position());

        final ByteBuffer byteBuffer = ByteBuffer.allocateDirect(12);

    }
}
