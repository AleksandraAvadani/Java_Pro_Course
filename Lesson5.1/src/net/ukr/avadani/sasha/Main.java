package net.ukr.avadani.sasha;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Test testOne = new Test();
        Class<?>test = testOne.getClass();
        try{
            Method method = test.getDeclaredMethod("testMethod", int.class, int.class);
            if(method.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation anot = method.getAnnotation(MyAnnotation.class);
                method.invoke(testOne, anot.parOne(),anot.parTwo());
            }
        }
        catch (NoSuchMethodException| IllegalArgumentException| IllegalAccessException |InvocationTargetException e){
           e.printStackTrace();
        }
    }
}
