//public class keywordproblem {
//    public static void main(String[] args) {
//        check("12", "");  // Add a second argument, for example, an empty string
//    }
//
//    public static void check(String p, String s) {
//        if(p.isEmpty()){
//            System.out.println(s);  // Corrected to print the second parameter 's'
//            return ;
//        }
//        int digit = p.charAt(0) - '0';
//        for(int i = (digit - 1)*3; i < digit * 3; i++){
//            char ch = (char) ('a' + i);
//            check(p.substring(1),s+ch);
//        }
//    }
//}

//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class keywordproblem {
//    public static void main(String[] args) {
//        System.out.println(check("12", ""));  // Add a second argument, for example, an empty string
//    }
//
//    public static ArrayList<String> check(String p, String s) {
//        if(p.isEmpty()){
//           ArrayList<String> list = new ArrayList<>();
//           list.add(s);
//           return list;
//
//           // Corrected to print the second parameter 's'
//
//        }
//        ArrayList<String> list = new ArrayList<>();
//        int digit = p.charAt(0) - '0';
//        for(int i = (digit - 1)*3; i < digit * 3; i++){
//            char ch = (char) ('a' + i);
//         list.addAll(check(p.substring(1),s+ch));
//        }
//        return list;
//    }
//}