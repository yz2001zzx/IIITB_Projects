import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public test() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int n = s.nextInt();

        int i;
        for(i = 0; i < n; ++i) {
            list.add(s.nextInt());
        }

        reverseArrayList(list);

        for(i = 0; i < list.size(); ++i) {
            PrintStream var10000 = System.out;
            Object var10001 = list.get(i);
            var10000.print(var10001 + " ");
        }

    }

    static void reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList();

        int i;
        for(i = list.size() - 1; i >= 0; --i) {
            newlist.add((Integer)list.get(i));
        }

        for(i = 0; i < list.size(); ++i) {
            list.set(i, (Integer)newlist.get(i));
        }

    }

