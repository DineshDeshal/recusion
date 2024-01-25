//public class subsets {
//    public static void main(String[] args) {
//        String s = "abc";
//        subset(s,"",0);
//    }
//
//    public static void subset(String p,String d,int index) {
//        if(index==p.length()){
//            System.out.println(d);
//            return;
//        }
//        char c = p.charAt(index);
//        subset(p,d+c,index+1);
//        subset(p,d,index+1);
//
//    }
//}

// UniQue subsets..

import java.util.HashMap;
import java.util.HashSet;

public class subsets {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        check("aaa", "", 0, set);
    }

    public static void check(String str, String ns, int index, HashSet<String> set) {
        if (index == str.length()) {

            return;
        }

        if (!set.contains(ns)) {

            set.add(ns);
            System.out.println(ns);
        }

        char l = str.charAt(index);
        check(str, ns + l, index + 1, set);
        check(str, ns, index + 1, set);
    }
}

