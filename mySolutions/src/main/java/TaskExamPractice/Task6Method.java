package TaskExamPractice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task6Method {
    public static void main(String[] args) {
        try {
            methodAction(Student.class, "get");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

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
}
