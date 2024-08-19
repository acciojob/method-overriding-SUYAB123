package com.driver;
public class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
public class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
      B objB = new B();
        System.out.println(objB.meth()); 
}
