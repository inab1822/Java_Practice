package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "나도코딩";
        // 위 두줄의 코드를 한줄로하면
        // String name = "나도코딩"; 이 된다.

        // 정수형 변수
        int hour = 15;

        System.out.println(name +  "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다");
        System.out.println(name +  "님, 배송이 완료되었습니다.");

        //실수값 변수
        double score = 90.5;

        //한글자만 표현할때는 char로 선언하고 작은 따옴표로 감싼다.
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점수입니다.");
        System.out.println(name+"님의 학점은  " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험의 합격했을까요?" + pass);

        double d = 3.14123456789; // 3.14123456789
        // float f = 3.14; 를 입력하면 오류가 뜬다.
        // float형 변수에 저장할 수 없기 때문.
        // 이때 저장할 값 뒤에 대문자나 소문자 f 를 쓰면 된다.
        float f = 3.14123456789F; // 3.1412346
        System.out.println(d);
        System.out.println(f);

        // int는 약 -21억 ~ +21억의 정수만 저장가능
        // int i = 1000000000000;
        // 아래 값은 int형 자료이기에 long형자료에 바로 저장할 수 없다.
        // 들어갈 값 마지막에 대문자나 소문자 L을 붙인다.
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

        // int, long, float, double, char, String, boolean

    }
}
