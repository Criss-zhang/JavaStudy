package chapter7.homework.homework4;

import java.util.ListResourceBundle;

public class mess_zh_CN extends ListResourceBundle {
    private final Object myData[][] = {
            {"speak","{0},你好，今天{1}"}
    };

    /**
     * Returns an array in which each item is a pair of objects in an
     * {@code Object} array. The first element of each pair is
     * the key, which must be a {@code String}, and the second
     * element is the value associated with that key.  See the class
     * description for details.
     *
     * @return an array of an {@code Object} array representing a
     * key-value pair.
     */
    @Override
    protected Object[][] getContents() {
        return myData;
    }
}
