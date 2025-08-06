package com.mavenprojectdemo;

import com.mavenprojectdemo.classes.Man;
import com.mavenprojectdemo.classes.Person;
import com.mavenprojectdemo.classes.PersonInvocationHandler;

import java.lang.reflect.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Man mohan = new Man(" Mohan", 30, "delhi", "india");

        ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();

        Class[] interfaces = mohan.getClass().getInterfaces();

        Person proxyMohan = (Person) Proxy.newProxyInstance(mohanClassLoader, interfaces, new PersonInvocationHandler(mohan));


        proxyMohan.introduce("Mohan");
        proxyMohan.sayAge(30);
        proxyMohan.sayWhereFrom("Delhi", "India");


    }
}