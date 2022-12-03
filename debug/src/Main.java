import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map; //Array Listをインポート

public class Main {
    public static void main(String[] args) {


        Map<Integer, String> studentById = new HashMap<>();
        studentById.put(1, "takahashi");//new　HashMapを追加
        studentById.put(2, "yamamoto");
        studentById.put(3, "nakakura");
        studentById.put(4, "suzuki");//nullをさけるため4、suzukiを追加
        System.out.println(studentById.get(2));

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);//数字を1、2、3、4に変化させた
        ids.add(2);
        ids.add(3);
        ids.add(4);

        for (int i = 1; ids.size() > i; i++) {
            String name = studentById.get(ids.get(i));
            System.out.println(name.toUpperCase());
        }

    }
}