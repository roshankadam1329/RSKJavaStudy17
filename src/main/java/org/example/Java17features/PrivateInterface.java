package org.example.Java17features;

/*
  // What is use of private method in interface? Why it is introduced?
  // Private methods in interfaces are used to share common code between default methods
  // in the interface. This allows for code reuse and cleaner interfaces.
  // It was introduced to reduce code duplication and improve maintainability of interfaces.
  // It allows you to define helper methods that can be used by multiple default methods
  // without exposing them to the implementing classes.
 */

public interface PrivateInterface {

  private void privateMethod() {
    System.out.println("Private method in interface");
  }

  default void defaultMethod() {
    System.out.println("Default method in interface");
    privateMethod();
  }

  private static void privateMethodStatic() {
    System.out.println("Private static method in interface");
  }

  static void staticMethod() {
    privateMethodStatic();
    System.out.println("Static method in interface");
  }
}
