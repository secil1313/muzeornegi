package service;

import utils.HibernateUtil;

public class Main {

    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
    }
}
