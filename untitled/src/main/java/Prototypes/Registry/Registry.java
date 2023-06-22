package Prototypes.Registry;

import Prototypes.Student;

import java.util.HashMap;

public class Registry {
    private static HashMap<String, Student> register = new HashMap<>();
    public static void put(String name, Student s){
        register.put(name, s);
    }
    public static void remove(String name){
        register.remove(name);
    }
    public static Student get(String name){
        return register.get(name);
    }

}
