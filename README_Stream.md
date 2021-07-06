# Stream and IntStream

## Stream

- `Stream` can use several generic Type, such as ```Stream<String>``` or ```Stream<Integer>``` or ```Stream<long>``` or ```Stream<Double>```
- It almost like a `List` in the Collection (Collection Object Type).
- Stream basically can use `Object Type` only, such as `Integer`, `Double`, `String`, and `Object`.

```java
String[] stringArray = {"java", "c++", "python", "kotlin", "vue.js"};
Stream<Integer> stream = Arrays.stream(stringArray)
stream.forEach(string -> out.println(string));
```

## IntStream

- `IntStream` can use `int` type which is `primitive type`
- When the users or Developers adding new value into `IntStream` Object, then it notices to user only can add `int` type values.

```java
int[] intArray = {1, 2, 3, 4, 5, 6};
IntStream stream = intArray.of(intArray);
stream.forEach(string -> out.println(string));
```

## Which is make the code shorter, `for-loop`? `for-each`? or `stream`?

- `for-loop`

```java
String[] testArray = {"Java", "Python", "C++", "Kotlin", "Docker"};
for(int i = 0; i < testArray[i]; i++){
    out.println(testArray[i]);
}
```

- `for-each`

```java
String[] testArray = {"Java", "Python", "C++", "Kotlin", "Docker"};
for(String getValue : testArray){
    out.println(getValue);
}
```

- `stream`

```java
String[] testArray = {"Java", "Python", "C++", "Kotlin", "Docker"};
Stream<String> stream = Arrays.stream(testArray);
stream.forEach(s -> out.println(s));
```

```java
List<String> list = Arrays.asList("Java", "Python", "C++", "Kotlin", "Docker");
Stream<String> stream = list.stream();
stream.forEach(s -> out.println(s));
```