package TaskExamTheory;

import java.lang.reflect.Method;

public class Task6Method {

    static String f = "get";
    public static void main(String[] args)  {
       myMethods(Student.class);

    }

    public static void myMethods(Class c) {
        Method[] method = c.getMethods();
        try {
            Object object = c.getConstructor().newInstance();
            for(Method methX : method) {
                if(methX.getName().contains(f)) {
                    methX.invoke(object);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }





    }

}
