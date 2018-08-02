package observer;

import java.util.Observable;

/**
 * 房价主题（被观察者）
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class House extends Observable{
    private double price;

    public House(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.price != price){
            this.price = price;
            //设置房价变化
            setChanged();
            //通知房价关注者，并充值变化状态
            this.notifyObservers(price);
        }

    }

    @Override
    public String toString() {
        return "当前房价为："+price;
    }
}
