package reflection;

import java.lang.reflect.*;

/**
 * Created by egnaro on 18/11/16.
 */
public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Class child = Child.class;

        String className = child.getSimpleName();

        System.out.println("Class name: " + className);

        int classModifier = child.getModifiers();

        System.out.println(Modifier.isPublic(classModifier));

        Class[] interfaces = child.getInterfaces();

        for (Class interfaceObj : interfaces) {
            System.out.println("Interface :: " + interfaceObj.getSimpleName());
        }

        Class classSuper = child.getSuperclass();

        System.out.println("Super class name = " + classSuper.getSimpleName());

        Method[] methods = child.getMethods();

        for (Method method : methods) {
            System.out.println("Method name = " + method.getName());
            System.out.println("Method return type =" + method.getReturnType());
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameter : parameterTypes) {
                System.out.println("return type = " + parameter.getSimpleName());
            }
            System.out.println("-------------------------------");
        }


        Constructor constructor = null;
        Object constructor2 = null;
        constructor = child.getConstructor(new Class[]{Child.class});
        constructor2 = child.getConstructor(String.class).newInstance("I am");

        Class[] constructParameters = constructor.getParameterTypes();

        for (Class parameter : constructParameters) {
            System.out.println(parameter.getSimpleName());
        }

        Child newChild = null;

        Child childObj = (Child) constructor.newInstance();
        childObj.setValue(500);
        System.out.println("Child new value is: " + childObj.getValue());

        Field privateIntValue = null;

        privateIntValue = Child.class.getDeclaredField("hello");

        privateIntValue.setAccessible(true);

        String valueOfName = (String) privateIntValue.get(childObj);

        System.out.println("Private field name is " + valueOfName);
    }
}
