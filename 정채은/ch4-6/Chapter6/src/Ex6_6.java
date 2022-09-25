class Ex6_6 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiplay(5L, 3L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}

class MyMath {
    long add(long a, long b) {
        long result = a+b;

        return result;
    }
    long subtract(long a, long b) {return a-b;}
    long multiplay(long a, long b) {return a*b;}
    long divide(long a, long b) {return a/b;}
}