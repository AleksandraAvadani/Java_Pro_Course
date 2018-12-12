package net.ukr.avadani.sasha;

public class Test {
    @MyAnnotation(parOne = 4, parTwo = 10)
    public void testMethod(int a, int b) {
        int sum = a + b;
        for (int i = 0; i < sum; i++) {
            System.out.println("Hello");
        }
    }
}
