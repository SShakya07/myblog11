package com.myblog.myblog11;

public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        int test = testClass.test();
        System.out.println(test);
    }
    public int  test(){
        int otp = SampleTest.test1();
        return otp;
//        int x=10;
//        return x*x;
    }
}
