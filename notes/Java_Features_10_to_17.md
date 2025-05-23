# Important Java Features from Version 10 to 17

This document covers the major features introduced in Java from version 10 to 17, with explanations, examples, and common applications.

---

## Java 10 (March 2018)

### 1. Local-Variable Type Inference (`var`)
**Explanation:**  
Allows using `var` for local variables, making code more concise. The compiler infers the type based on the right-hand side.

**Example:**
```java
var list = new ArrayList<String>(); // inferred as ArrayList<String>
for (var item : list) {
    System.out.println(item);
}
```

**Applications:**  
- Cleaner code, especially for complex generics.
- Useful in streams, lambdas, and variable declarations with obvious initializers.

---

## Java 11 (September 2018)

### 1. New String Methods
**Explanation:**  
Several handy string methods were added: `isBlank()`, `lines()`, `strip()`, `repeat()`, `stripLeading()`, `stripTrailing()`.

**Example:**
```java
String s = " Java ";
s.isBlank(); // false
s.strip(); // "Java"
"Hello\nWorld".lines().forEach(System.out::println);
```

**Applications:**  
String processing and validation, more readable and concise code.

---

### 2. Local-Variable Syntax for Lambda Parameters
**Explanation:**  
Allows using `var` in lambda parameters for consistency and annotations.

**Example:**
```java
(var x, var y) -> x + y
```

**Applications:**  
Adding annotations to lambda parameters.

---

### 3. HTTP Client (Standard)
**Explanation:**  
The new HTTP client API (introduced as incubator in Java 9) becomes standard.

**Example:**
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://api.github.com"))
    .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

**Applications:**  
REST calls, web scraping, microservices communication.

---

## Java 12 (March 2019)

### 1. Switch Expressions (Preview)
**Explanation:**  
Switch statements can now return values, making them more concise.

**Example:**
```java
int numLetters = switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> 6;
    case TUESDAY                -> 7;
    default                     -> 8;
};
```

**Applications:**  
Mapping enums or values, reducing boilerplate in conditional logic.

---

## Java 13 (September 2019)

### 1. Text Blocks (Preview)
**Explanation:**  
Multi-line string literals for easier handling of text like JSON, XML, or SQL.

**Example:**
```java
String json = """
    {
      "name": "Alice",
      "age": 25
    }
    """;
```

**Applications:**  
Configuration files, SQL queries, JSON/XML manipulation.

---

## Java 14 (March 2020)

### 1. Switch Expressions (Standard)
**Explanation:**  
Switch expressions are now a standard feature, allowing returns and pattern matching (preview).

**Example:**  
See Java 12 example.

---

### 2. Records (Preview)
**Explanation:**  
Concise syntax for immutable data carriers.

**Example:**
```java
record Point(int x, int y) {}
Point p = new Point(1, 2);
System.out.println(p.x()); // 1
```

**Applications:**  
Value objects, DTOs, event objects.

---

### 3. Helpful NullPointerExceptions
**Explanation:**  
NullPointerExceptions now describe which variable was null, making debugging easier.

**Example:**
```
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
```

**Applications:**  
Faster debugging and error resolution.

---

## Java 15 (September 2020)

### 1. Text Blocks (Standard)
**Explanation:**  
Text blocks become a standard feature.

**Example:**  
See Java 13 example.

---

### 2. Sealed Classes (Preview)
**Explanation:**  
Restrict which other classes or interfaces may extend or implement them.

**Example:**
```java
public sealed class Shape permits Circle, Square {}

final class Circle extends Shape {}
final class Square extends Shape {}
```

**Applications:**  
Domain modeling with controlled class hierarchies, algebraic data types.

---

## Java 16 (March 2021)

### 1. Records (Standard)
**Explanation:**  
Records become a standard feature.

**Example:**  
See Java 14 example.

---

### 2. Pattern Matching for instanceof (Standard)
**Explanation:**  
Simplifies type checks and casting.

**Example:**
```java
if (obj instanceof String s) {
    System.out.println(s.toUpperCase());
}
```

**Applications:**  
Cleaner code, less boilerplate in type checks.

---

### 3. Sealed Classes (Second Preview)
- See Java 15.

---

## Java 17 (September 2021, LTS)

### 1. Sealed Classes (Standard)
**Explanation:**  
Sealed classes are now a standard feature.

**Example:**  
See Java 15 example.

---

### 2. Pattern Matching for switch (Preview)
**Explanation:**  
Allows switch statements to match object patterns, not just values.

**Example:**
```java
static String formatterPatternSwitch(Object o) {
    return switch (o) {
        case Integer i -> String.format("int %d", i);
        case Long l    -> String.format("long %d", l);
        case Double d  -> String.format("double %f", d);
        case String s  -> String.format("String %s", s);
        default        -> o.toString();
    };
}
```

**Applications:**  
Advanced pattern matching, data processing, parsing.

---

### 3. Strong Encapsulation of JDK Internals
**Explanation:**  
Internal APIs are strongly encapsulated, increasing security and reliability.

**Applications:**  
Applications must use only public APIs. Prevents accidental dependency on internal classes.

---

### 4. Foreign Function & Memory API (Incubator)
**Explanation:**  
Enables Java programs to interoperate with code and data outside the JVM.

**Applications:**  
Calling native libraries, high-performance computing.

---

## Summary Table

| Version | Feature                                      | Application                        |
|---------|----------------------------------------------|------------------------------------|
| 10      | var for type inference                       | Cleaner code, generics             |
| 11      | New String methods, HTTP Client              | String tasks, REST, web APIs       |
| 12      | Switch Expressions (preview)                 | Conditional logic, mapping         |
| 13      | Text Blocks (preview)                        | Multi-line strings                 |
| 14      | Switch Expressions, Records (preview)        | Concise conditionals, DTOs         |
| 15      | Text Blocks, Sealed Classes (preview)        | Multi-line, class hierarchy        |
| 16      | Records, Pattern Matching for instanceof     | Value objects, cleaner type checks |
| 17      | Sealed Classes, Pattern Matching for switch  | Domain modeling, pattern matching  |

---

## References

- [Java 10 Release Notes](https://www.oracle.com/java/technologies/javase/10-relnote-issues.html)
- [Java 11 Release Notes](https://www.oracle.com/java/technologies/javase/11-relnote-issues.html)
- [Java 17 Release Notes](https://www.oracle.com/java/technologies/javase/17-relnote-issues.html)
