public class Dice {
    public static void main(String[] args) {
        check("",4);
    }

    public static void check(String s,int target) {
        if(target==0){
            System.out.println(s);
            return ;
        }
        for(int i=1; i<=6 && i<=target; i++){
            check(s+i,target-i);
        }
    }
}
