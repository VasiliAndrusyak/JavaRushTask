package com.javarush.task.task14.task1421;

public final class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}
