import java.util.HashSet;
import java.util.Set;

public class Find_distinct_elem {
    public static void main(String[] args) {
        int arr[]={2,6,3,5,2,4};
        Set<Integer> s1=new HashSet<>();
        for(int x:arr)
                s1.add(x);

        System.out.println(s1.size());
    }
}
