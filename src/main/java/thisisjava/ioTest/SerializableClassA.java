package thisisjava.ioTest;

import java.io.Serializable;

public class SerializableClassA implements Serializable {
    int field1;
    SerializableClassB field2 = new SerializableClassB();
    static int field3;
    transient int field4;
}
