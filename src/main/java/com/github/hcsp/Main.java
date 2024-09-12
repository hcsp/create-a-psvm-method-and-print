package com.github.hcsp;

public class Main {
    // Create a public static void main(String[] args) method here
    // and print "Hello" to standard output (System.out)
    // 在这里创建一个public static void main(String[] args)方法，在标准输出（System.out）打印"Hello"
    public static void main(String[] args) {
        Cat cat1= new Cat("cat1");
        Cat cat2= new Cat();
        cat2.name = "cat2";
        System.out.println(cat1.name);
        System.out.println(cat2.name);
    }
}
