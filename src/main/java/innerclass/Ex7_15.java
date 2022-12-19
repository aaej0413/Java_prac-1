package innerclass;
/*
외부 클래스가 아닌 다른 클래스에서 내부 클래스를 생성하고, 내부 클래스의 멤버에 접근하는 예제
 */
class Outer2 {
    class InstanceInner {
        int iv = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }
    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}
public class Ex7_15 {
    public static void main(String[] args) {
        // 인스턴스 클래스의 인스턴스를 생성하려면
        // 외부 클래스의 인스턴스를 먼저 생성해야 한다.
        Outer2 oc = new Outer2();
        Outer2.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);

        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}
