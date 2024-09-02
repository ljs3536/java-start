package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //전위 증감연산자 사용
        b = ++a;    //a의 값을 먼저 증가하고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;

        //후위 증감연산자 사용
        b = a++;    //a의 현재값을 b에 먼저 대입하고, 그 후 a값을 증가
        System.out.println("a = " + a + ", b = " + b);
    }
}
