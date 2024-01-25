//public class skipachar {
//
//
//    public static void main(String[] args) {
//        String s = "abgdajdjase";
//        check(s,0,"");
//    }
//
//    public static void check( String p,int index,String d) {
//        if(index == p.length()){
//            System.out.println(d);
//            return ;
//        }
//        char c = p.charAt(index);
//        if(c=='a'){
//            check(p,index+1,d);
//        }
//        else {
//            d += c;
//            check(p,index+1,d);
//        }
//
//
//    }
//}

public class skipachar {
    public static void main(String[] args) {
        String inputString = "ajnsjapplejd";
        check(inputString, "", 0);
    }

    public static void check(String s, String p, int index) {
        // Base case: If we have reached the end of the string
        if (index == s.length()) {
            System.out.println(p);
            return;
        }

        // Check if the substring starting at the current index matches "apple"
        if (index + 5 <= s.length() && s.substring(index, index +5).equals("apple")) {
            // If it matches, skip "apple" and continue recursion
            check(s, p, index +5);
        } else {
            // If it doesn't match, add the current character to the result string and continue recursion
            p += s.charAt(index);
            check(s, p, index + 1);
        }
    }
}
