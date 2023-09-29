package org.example;

public class Main {
    public static void main(String[] args) {

        String email1 = "tim.ttt@ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd.......................................................................................................";
        String email2 = "timddd@gmail.com";
        // regex
        String regexPluginEmailAppoiment = "^$|(?:[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        String regexEmailProblem = "[a-z]+@[a-z]+([a-z\\.]+\\.)+[a-z]+";
        //https://www.baeldung.com/java-email-validation-regex
        // https://owasp.org/www-community/OWASP_Validation_Regex_Repository
        String regexEmailSafeOwasp ="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";

        System.out.println("###############   With regexEmailSafeOwasp : ##################" );
        System.out.println("\n" );

        long startTime = System.currentTimeMillis();
        Boolean match = email1.matches(regexEmailSafeOwasp);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("duration INVALID EMAIL millisecond: " + duration);
        System.out.println("match INVALID EMAIL : " + match);
        System.out.println("\n" );

         startTime = System.currentTimeMillis();
         match = email2.matches(regexEmailSafeOwasp);
         endTime = System.currentTimeMillis();
         duration = (endTime - startTime);
        System.out.println(" duration VALID EMAIL millisecond: " + duration);
        System.out.println("match2 VALID email: " + match);

        System.out.println("\n" + "\n" );


        // with regexPluginEmailAppoiment
        System.out.println("$$$$$$$$$$$$$$$$$   With regexPluginEmailAppoiment : $$$$$$$$$$$$$$$$$$$" );
        System.out.println("\n" );
        startTime = System.currentTimeMillis();
         match = email1.matches(regexPluginEmailAppoiment);
            endTime = System.currentTimeMillis();
            duration = (endTime - startTime);
        System.out.println("duration INVALID EMAIL millisecond: " + duration);
        System.out.println("match INVALID EMAIL : " + match);
        System.out.println("\n" );

         startTime = System.currentTimeMillis();
         match = email2.matches(regexPluginEmailAppoiment);
         endTime = System.currentTimeMillis();
         duration = (endTime - startTime);
        System.out.println(" duration VALID EMAIL millisecond: " + duration);
        System.out.println("match2 VALID email: " + match);
        // dropline
        System.out.println("\n" + "\n" );


        // print vm capabilities
        System.out.println("VM capabilities:");
        System.out.println("\n" );

        System.out.println("VM name: " + System.getProperty("java.vm.name"));
        System.out.println("VM vendor: " + System.getProperty("java.vm.vendor"));
        System.out.println("VM version: " + System.getProperty("java.vm.version"));
        // memory
        System.out.println("VM max memory: " + Runtime.getRuntime().maxMemory());
        System.out.println("VM total memory: " + Runtime.getRuntime().totalMemory());

    }
}