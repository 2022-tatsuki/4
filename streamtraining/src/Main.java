import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = namesList.stream()
                .filter(name -> name.contains("a")).toList();
        result.forEach(System.out::println);

    }
}
