class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product() {}
}

class Tv2 extends Product {
    Tv2() {super(100);}
    public String toString() {return "TV";}
}
class Computer extends Product {
    Computer() {super(200);}
    public String toString() {return "computer";}
}
class Audio extends Product {
    Audio() {super(50);}
    public String toString() {return "audio";}
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if (money < p.price){
            System.out.println("잔액 부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    void summary(){
        int sum = 0;
        String itemList = "";
        for(int i=0; i<item.length; i++){
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += item[i] + ",";
        }
        System.out.println("구입 물품 총금액 " + sum);
        System.out.println("구입 제품 " + itemList);
    }
}
class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv2());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}
