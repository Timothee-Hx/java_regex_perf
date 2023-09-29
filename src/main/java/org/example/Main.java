package org.example;

public class Main {
    public static void main(String[] args) {

        String email1 = "tim.ttt@ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd.......................................................................................................";
        String email2 = "timddd@gmail.com";
        // regex
        String regexPlugin = "^$|(?:[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        String regexProblem = "[a-z]+@[a-z]+([a-z\\.]+\\.)+[a-z]+\n";
        System.out.println("regexPlugin: " + regexPlugin);
        long startTime1 = System.currentTimeMillis();
        Boolean match1 = email1.matches(regexPlugin);
        long endTime1 = System.currentTimeMillis();
        long duration1 = (endTime1 - startTime1);
        System.out.println("email1: "+email1);
        System.out.println(" duration1 millisecond: " + duration1);

        System.out.println("match1 email1 : " + match1);

        long startTime2 = System.currentTimeMillis();
        Boolean match2 = email2.matches(regexPlugin);
        long endTime2 = System.currentTimeMillis();
        long duration2 = (endTime2 - startTime2);
        System.out.println("email2: "+ email2 );
        System.out.println(" duration2 millisecond: " + duration2);
        System.out.println("match2 email2: " + match2);

        // print vm capabilities
        System.out.println("VM capabilities:");
        System.out.println("VM name: " + System.getProperty("java.vm.name"));
        System.out.println("VM vendor: " + System.getProperty("java.vm.vendor"));
        System.out.println("VM version: " + System.getProperty("java.vm.version"));
        // memory
        System.out.println("VM max memory: " + Runtime.getRuntime().maxMemory());
        System.out.println("VM total memory: " + Runtime.getRuntime().totalMemory());

    }
}