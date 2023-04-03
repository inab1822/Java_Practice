package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        System.out.println(5<3 ? "맞습니다" : "아닙니다");

        int x = 3;
        int y = 6;
        int max = (x>y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);


        x= 3;
        y = 4;
        boolean b = (x==y) ? true : false;
        System.out.println(b);

        String s = (x!=y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
