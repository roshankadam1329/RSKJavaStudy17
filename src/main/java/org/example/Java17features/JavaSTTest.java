package org.example.Java17features;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class JavaSTTest {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("--------------------------------------------");
    String str = "Hello";
    String str2 = "Hello";
    System.out.println(str == str2);
    System.out.println("--------------------------------------------");
    String str3 = new String("Hello");
    System.out.println(str == str3);
    System.out.println("--------------------------------------------");
  }

  // important Java features implementation from version 11 to 17

  // Java 9 version | write code for it
  //  Factory Methods for Collections: List.of(), Set.of(), Map.of().
  //  Optional Improvements: Optional.or(), Optional.stream().
  //Private Methods in Interfaces: Allowed private methods in interfaces.
  //Stream API Enhancements: Methods like takeWhile(), dropWhile(), and ofNullable().
  //Try-With-Resources Improvement: Simplified resource management.

  void java9fetures() {
    // Factory Methods for Collections
    List<String> list = List.of("A", "B", "C");
    Set<String> set = Set.of("A", "B", "C");
    Map<String, String> map = Map.of("key1", "value1", "key2", "value2");

    // Optional Improvements
    Optional<String> optional = Optional.ofNullable(null);
    optional.ifPresent(System.out::println);

    // Stream API Enhancements
    Stream<String> stream = Stream.of("A", "B", "C");
    stream.takeWhile(s -> s.equals("A")).forEach(System.out::println);
    stream.dropWhile(s -> s.equals("A")).forEach(System.out::println);

    // Try-With-Resources Improvement
    try (Stream<String> stream2 = Stream.of("A", "B", "C")) {
      stream2.forEach(System.out::println);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }


  // What is use of private method in interface? Why it is introduced?
  // Private methods in interfaces are used to share common code between default methods
  // in the interface. This allows for code reuse and cleaner interfaces.
  // It was introduced to reduce code duplication and improve maintainability of interfaces.
  // It allows you to define helper methods that can be used by multiple default methods
  // without exposing them to the implementing classes.

}
