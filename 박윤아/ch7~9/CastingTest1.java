class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car) fe; 형변환 생략
//        car.water();    // 에러 Car타입의 참조변수 -> water() 호출x
        fe2 = (FireEngine) car;     // 자손타입 <- 조상타입
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive(){
        System.out.println("drive, Brrr");
    }
    void stop(){
        System.out.println("stop!");
    }
}
class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
