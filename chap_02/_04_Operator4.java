package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true

        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        System.out.println((5>3) && (3>1));
        System.out.println((5>3) || (3<1));

        System.out.println(1<3 && 3<5);

        System.out.println(!true);
        System.out.println(!(5>3));
        System.out.println(!(5==5));
        System.out.println(!(5==3));
    }
}
