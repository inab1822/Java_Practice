package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int arr = 120;
        int child = 115;



        String answer = child >= arr ? "키가 "+child+"cm 이므로 탑승 가능합니다." : "키가"+child+"cm 이므로 탑승 불가능합니다.";
        System.out.println(answer);
        child = 121;
        answer = child >= arr ? "키가 "+child+"cm 이므로 탑승 가능합니다." : "키가"+child+"cm 이므로 탑승 불가능합니다.";
        System.out.println(answer);
    }
}
