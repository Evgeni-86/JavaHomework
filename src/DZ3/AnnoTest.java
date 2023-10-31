package DZ3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AnnoTest {
    public static void main(String[] args) {

//        System.out.println(checker(Test.class));

//        Class<APrinter> current = APrinter.class;
//        try {
//            Method methodPrint = current.getDeclaredMethod("print", int.class);
//            methodPrint.setAccessible(true);
//            methodPrint.invoke(new APrinter(), 10);
//
//        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }

        getInterface(String.class);
    }

    public static boolean checker(Class<?> className) {
        return className.isAnnotationPresent(IsLike.class);
    }

    public static void getInterface(Class<?> clasName) {
        while (clasName != null) {
            Class<?>[] interfaces = clasName.getInterfaces();
            for (Class<?> currentInterface : interfaces) {
                System.out.println(currentInterface.getName());
            }
            clasName = clasName.getSuperclass();
        }
    }
}


