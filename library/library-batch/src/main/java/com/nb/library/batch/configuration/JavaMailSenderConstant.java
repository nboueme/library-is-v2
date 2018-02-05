package com.nb.library.batch.configuration;

abstract class JavaMailSenderConstant {

    static String HOST;
    public static void setHOST(String HOST) {
        JavaMailSenderConstant.HOST = HOST;
    }

    static Integer PORT;
    public static void setPORT(Integer PORT) {
        JavaMailSenderConstant.PORT = PORT;
    }

    static String USERNAME;
    public static void setUSERNAME(String USERNAME) {
        JavaMailSenderConstant.USERNAME = USERNAME;
    }

    static String PASSWORD;
    public static void setPASSWORD(String PASSWORD) {
        JavaMailSenderConstant.PASSWORD = PASSWORD;
    }
}
