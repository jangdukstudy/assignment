class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String c, String g, int d) {
        color = c;
        gearType= g;
        door = d;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car2 c2 = new Car2("white", "auto", 4);

        System.out.println("c1:" + c1.color + "," + c1.gearType + "," + c1.door);
        System.out.println("c2:" + c2.color + "," + c2.gearType + "," + c2.door);
    }
}
