import org.w3c.dom.ls.LSOutput;
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv extends Product{
    Tv(){
        super(100);
    }

    public String toString(){
        return "TV";
    }
}
class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
        return "컴퓨터";
    }
}
class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product){
        if(money < product.price){
            System.out.println("잔액 부족");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product + "구매함");
    }
}


public class Main {
    public static void main(String[] args){
        Buyer b = new Buyer();
        //Tv t = new Tv();
        Computer c = new Computer();
        b.buy(new Tv());
        //b.buy(t);
        b.buy(c);
        System.out.println("현재 남은 돈 : " + b.money);
    }
}


