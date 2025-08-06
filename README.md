# Java Dynamic Proxy Example – README

This project demonstrates the concept of **Java Dynamic Proxies** using a real-world example of a `Man` class implementing a `Person` interface. Let's break down all the concepts and the flow involved in the program, including Java fundamentals like classes, interfaces, `this`, `@Override`, and dynamic proxying.

---

## 🔍 Key Java Concepts

### ✅ Class
A **class** is a blueprint for creating objects. It contains fields (attributes) and methods (behavior). In this project, `Man` is a class representing a person with name, age, city, and country.

### ✅ Interface
An **interface** in Java defines a contract. Classes that implement an interface agree to provide implementations for its methods. `Person` is an interface that `Man` implements.

### ✅ @Override
The `@Override` annotation is used to indicate that a method is being overridden from a superclass or interface. For example, `introduce()` in `Man` overrides the interface method.

### ✅ this Keyword
The `this` keyword refers to the current object. Used when you want to refer to instance variables inside methods (especially if parameters have the same name).

### ✅ Abstract Class (Mentioned for clarity)
An **abstract class** is a class that cannot be instantiated on its own and may have abstract (unimplemented) methods. Unlike interfaces, it can contain both implemented and unimplemented methods.

### ✅ Static Method (Mentioned for clarity)
A **static method** belongs to the class rather than the object. It can be called without creating an instance.

---

## 🧠 Concept Behind This Project – Java Dynamic Proxies

### 🔗 What is a Dynamic Proxy?
A **dynamic proxy** allows us to intercept method calls on an interface and define custom behavior before or after invoking the actual method. This is useful for logging, transaction management, security checks, etc.

### ✅ InvocationHandler
This interface defines one method: `invoke()`. You use it to specify what happens when a method is called on a proxy object.

**Real-world Analogy**: Imagine you're a celebrity (the real object), and your manager (proxy) handles your calls, interviews, and messages. Before every call, the manager announces "This is on behalf of the celebrity", and then either handles it themselves or passes it to you. That's what a dynamic proxy is.

---

## 📦 Project Structure & Working

- **`Person.java` (Interface)**: Defines three methods – `introduce()`, `sayAge()`, and `sayWhereFrom()`.
- **`Man.java` (Implements Person)**: Implements all methods. Represents the actual object.
- **`PersonInvocationHandler.java`**: Intercepts calls using `invoke()` and forwards them using `method.invoke(person, args)`.
- **`Main.java`**: 
  - Creates an instance of `Man`
  - Uses `Proxy.newProxyInstance()` to create a dynamic proxy object.
  - Calls the method using the proxy – which is intercepted by `PersonInvocationHandler`.

### 🔄 Flow of Execution
1. Main method calls `introduce()` via proxy.
2. Proxy intercepts it using `invoke()` in `PersonInvocationHandler`.
3. Handler logs the method name.
4. Forwards the call to the actual `Man` object.

---

## 📘 Summary

- **Java Classes and Interfaces** provide modular code design.
- **Dynamic Proxies** intercept and extend method behavior at runtime.
- **InvocationHandler** controls the behavior of proxy instances.
- Useful in frameworks like Spring AOP, Hibernate, and JDK proxies.

This example teaches **clean code structure**, **reflection**, and **AOP fundamentals** in a beginner-friendly way.

---

Created by: Atharva Kumar
