package Doesnt_have_to_do_anything_with_class;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StBuilder {
    public static void main(String[] args) {
        String abc = "hello Hello World";
        StringTokenizer st = new StringTokenizer(abc);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
