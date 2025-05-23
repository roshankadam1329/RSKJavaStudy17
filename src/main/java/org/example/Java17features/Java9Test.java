package org.example.Java17features;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Java9Test {

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

    new Java9Test().java9fetures();
  }

  // important Java features implementation from version 11 to 17

  // Java 9 version | write code for it
  //  Factory Methods for Collections: List.of(), Set.of(), Map.of().
  //  Optional Improvements: Optional.or(), Optional.stream().
  //Private Methods in Interfaces: Allowed private methods in interfaces. (Check interface for more...)


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
    List<String> stream = List.of("A", "B", "C");
    System.out.println("TakeWhile :");
    stream.stream().takeWhile(s -> s.equals("A")).forEach(System.out::println);
    System.out.println("DropWhile :");
    stream.stream().dropWhile(s -> s.equals("A")).forEach(System.out::println);

    // Try-With-Resources Improvement
    /*
    ### Benefits of Try-With-Resources:
1. **Automatic Resource Management**: Resources (e.g., files, streams, sockets) are automatically closed at the end of the `try` block, reducing the risk of resource leaks.
2. **Simplified Code**: Eliminates the need for explicit `finally` blocks to close resources, making the code cleaner and more readable.
3. **Error Handling**: Ensures that resources are closed even if an exception occurs, improving robustness.
4. **Multiple Resources**: Supports managing multiple resources in a single `try` block.
5. **Reduced Boilerplate**: Reduces repetitive code for resource cleanup.

### Applications of Try-With-Resources:
1. **File Handling**: Reading/writing files using classes like `BufferedReader`, `FileReader`, `FileWriter`, etc.
2. **Database Connections**: Managing `Connection`, `Statement`, and `ResultSet` objects in JDBC.
3. **Network Connections**: Managing `HttpURLConnection` or `Socket` objects.
4. **Streams**: Handling `InputStream`, `OutputStream`, and `Reader`/`Writer` objects.
5. **Custom Resources**: Managing any custom class that implements the `AutoCloseable` or `Closeable` interface.
     */
    try (Stream<String> stream2 = Stream.of("A", "B", "C")) {
      System.out.println("Stream with try-with-resources:");
      stream2.forEach(System.out::println);
    } catch (Exception e) {
      e.printStackTrace();
    }

    // iterate with Predicate example
    Stream.iterate(1, n -> n < 10, n -> n + 2)
        .forEach(System.out::println); // Output: 1, 3, 5, 7, 9

  }

}
