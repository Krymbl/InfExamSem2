package TaskExamPractice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//TODO Напишите метод, который получает класс C
// и вызывает у него все методы, которые содержат в названии подстроку f.
public class Task6Method {
    public static void main(String[] args) {
        try {
            methodAction(Student.class, "get");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /// ОТВЕТ!!!!
    public static void methodAction(Class clazz, String f) throws Exception {
        Method[] methods = clazz.getMethods();
        Object object = clazz.getConstructor().newInstance();
        for (Method m : methods) {
            if (m.getName().toUpperCase().contains(f.toUpperCase())) {
                System.out.println(m.getName());
                m.invoke(object);

            }
        }
    }
    /// КОНЕЦ ОТВЕТ!!!!
}
