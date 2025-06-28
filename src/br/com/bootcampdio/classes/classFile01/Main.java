package br.com.bootcampdio.classes.classFile01;

public class Main {
    public static void main(String[] args) {
        Person male = new Person("Gabriel");
        System.out.println(male.getName());
        male.incAge();
        System.out.println(male.getAge());
    }
}
