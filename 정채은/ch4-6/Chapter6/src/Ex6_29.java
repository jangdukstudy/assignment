class Product {
    static int count = 0;
    int SerialNo;

    {
        ++count;
        SerialNo = count;
    }

    public Product() {}

}

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        System.out.println("p1의 제춤번호 : " +p1.SerialNo);
        System.out.println("p2의 제춤번호 : " +p2.SerialNo);
        System.out.println("p3의 제춤번호 : " +p3.SerialNo);
        System.out.println("p4의 제춤번호 : " +p4.SerialNo);
    }
}