package src;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    @SuppressWarnings("checkstyle:MagicNumber")
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}