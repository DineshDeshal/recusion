public class permitution {
    public static void main(String[] args) {
        String str = "abc";
        check(str,"",0);
    }

    public static void check(String str,String permutation,int ind) {
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char common = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            check(newstr,permutation+common,ind+1);
        }


    }
}