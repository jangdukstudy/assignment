class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1 ();
        System.out.println("method1() 수행 마치고 main으로 돌아옴");
    }
    static void method1 (){
        try {
            System.out.println("method1() 호출됨");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally 블럭 실행됨");
        }
    }
}
