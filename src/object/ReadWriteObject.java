package object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {
    public ReadWriteObject() {

    }

    public void WriteObject(String fileName, Object obj) throws FileNotFoundException, IOException {
        ObjectOutputStream os;
        try (FileOutputStream fs = new FileOutputStream(fileName)) {
            os = new ObjectOutputStream(fs);
            os.writeObject(obj);
        }
        os.close();
    }

    /**
     *
     * @param fileName
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object ReadObject(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
        Object kq = null;
        ObjectInputStream ois;
        try (FileInputStream fi = new FileInputStream(fileName)) {
            ois = new ObjectInputStream(fi);
            kq = ois.readObject();
        }
        ois.close();
        return kq;
    }
}
