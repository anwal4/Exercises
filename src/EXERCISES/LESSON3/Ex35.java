package EXERCISES.LESSON3;

import com.sun.xml.internal.fastinfoset.tools.StAX2SAXReader;

import java.util.*;

public class Ex35 {

    public static void main(String[] args) {

        List<Integer> l1 = new Vector<>();

        l1.add(1);
        l1.add(2);
        if (l1.size() > 10) {
            l1.add(10, 2);
        }
        Integer whatWasRemoved = l1.remove(0);
        System.out.println(whatWasRemoved);
        System.out.println(l1);
        boolean r = l1.remove(new Integer(1));
        System.out.println(r);

    }


}
