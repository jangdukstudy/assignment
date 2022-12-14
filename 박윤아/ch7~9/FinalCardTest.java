class Card{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card(String kind, int num){
        KIND = kind;
        NUMBER = num;
    }
    Card() {
        this("HEART", 1);
    }
    public String toString(){
        return KIND + " " + NUMBER;
    }
}
class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("Heart", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);  // 위에서 출력형식 바꿔줌
    }
}
