package thisisjava.ioTest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NonSerializableChild extends NonSerializableParent implements Serializable {
    public String field2;

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.writeUTF(field1);
        oos.defaultWriteObject();
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        field1 = ois.readUTF();
        ois.defaultReadObject();
    }

}
