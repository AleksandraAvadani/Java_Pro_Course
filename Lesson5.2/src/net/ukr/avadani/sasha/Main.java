package net.ukr.avadani.sasha;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TextConteiner tc = new TextConteiner("Hi");
        Saver sv =new Saver();
        Class<?> cl = sv.getClass();

        try{
            Field field = cl.getDeclaredField("text");
            Method[] methods = cl.getDeclaredMethods();
            MyAnnotationOne mOne=field.getAnnotation(MyAnnotationOne.class);
            sv.setText(mOne.text());
            for(Method method:methods){
                if(method.isAnnotationPresent(MyAnnotationTwo.class)) {
                    MyAnnotationTwo mTwo = method.getAnnotation(MyAnnotationTwo.class);
                    method.invoke(sv, tc.getText());
                }
            }
        }
        catch (NoSuchFieldException|InvocationTargetException|IllegalArgumentException|IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
