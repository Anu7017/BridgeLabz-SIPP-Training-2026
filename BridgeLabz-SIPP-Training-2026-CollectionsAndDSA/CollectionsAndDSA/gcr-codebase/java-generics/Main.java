import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Age", 21);
        System.out.println(p.getFirst() + " " + p.getSecond());

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st.pop());

        Integer[] arr = { 5, 9, 2, 7 };
        System.out.println(GenericUtils.findMax(arr));

        Repository<String> repo = new Repository<>();
        repo.add("Java");
        repo.add("Generics");
        System.out.println(repo.getAll());

        List<String> list = Arrays.asList("A", "B", "C");
        GenericUtils.printList(list);
    }
}
