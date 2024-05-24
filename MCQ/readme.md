## MCQ-1
```java
public static void main(String[] args) {
    String str = "guvi";
    System.out.println(str.toUpperCase());
}
```

---

## MCQ-2
```java
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = x + y;
        System.out.println("The sum is: " + sum);
    }
}
```

---

## MCQ-3
```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
```

---

## MCQ-4
```java
public class Main {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Tom"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
```

---

## MCQ-5
```java
public static void main(String[] args) {
    int number = 10;
    if (number % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }
}
```

---

## MCQ-6
```java
public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    System.out.println("The sum is: " + sum);
}
```

---

## MCQ-7
```java
public static void main(String[] args) {
    int x = 5;
    int y = 10;
    int max = (x > y) ? x : y;
    System.out.println("The maximum number is: " + max);
}
```

---

## MCQ-8
```java
public static void main(String[] args) {
    int number = 5;
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }
    System.out.println("The factorial of " + number + " is: " + factorial);
}
```

---

## MCQ-9
```java
public static void main(String[] args) {
    int a = 5;
    System.out.println(a++ + ++a - ++a - a--);
}
```

---

## MCQ-10
```java
public static void main(String[] args) {
    String str1 = "Guvi";
    String str2 = "guvi";
    if (str1.equalsIgnoreCase(str2)) {
        System.out.println("Equal");
    } else {
        System.out.println("Not Equal");
    }
}
```