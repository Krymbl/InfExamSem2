package TaskExamTheory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;

// TODO написать компаратор,
//  который сравнивает два инпутстрима по методу available()

public class Task7ComparatorAvailible {
    public static void main(String[] args) {
        try (InputStream is1 = new FileInputStream("Test1.txt");
             InputStream is2 = new FileInputStream("Test2.txt"))   {
            InputCheck ic = new InputCheck();
            System.out.println(ic.compare(is1,is2));

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    /// ОТВЕТ!!!!
    public static class InputCheck implements Comparator<InputStream> {
        public int compare(InputStream is1, InputStream is2) {
            try {
                return is1.available() - is2.available();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    /// КОНЕЦ ОТВЕТ!!!!
}
