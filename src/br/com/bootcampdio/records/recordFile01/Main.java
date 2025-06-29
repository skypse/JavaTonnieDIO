package br.com.bootcampdio.records.recordFile01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(person);
        System.out.println(person.name());
    }
}
