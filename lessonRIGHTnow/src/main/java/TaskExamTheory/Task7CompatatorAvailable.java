package TaskExamTheory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task7CompatatorAvailable {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("Test2.txt");
             InputStream is2 = new FileInputStream("Test1.txt")) {
            List<InputStream> list = new ArrayList<>();

            list.add(is);
            list.add(is2);

            Collections.sort(list,new MyComp());
            System.out.println(list.get(0).available() + " " + list.get(1).available());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static class MyComp implements Comparator<InputStream> {

        public int compare(InputStream o1, InputStream o2) {
            try {
                return o1.available()-o2.available();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
