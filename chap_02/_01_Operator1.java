package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연삼
        System.out.println(4+2); // 6
        System.out.println(4-2); // 2
        System.out.println(4*2); // 8
        System.out.println(4/2);
        System.out.println(5/2); // 5/2 는 2.5 이지만 2가 나온다. 정수만나옴
        System.out.println(2/4); // 0.5가 아닌 0이 나온다.
        System.out.println(4%2); // 나머지
        System.out.println(5%2);

        int a = 20;
        int b = 10;
        int c;
        c = a +b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a%b;
        System.out.println(c);

        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        int waiting = 0;
        System.out.println("대기 인원 : " +waiting++);
        System.out.println("대기 인원 : " +waiting++);
        System.out.println("대기 인원 : " +waiting++);
        System.out.println("총 대이 인원 : " + waiting);
    }
}
