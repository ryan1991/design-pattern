package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 房价关注者
 *
 * @author songjunbao
 * @createdate 2018/1/14
 */
public class HousePriceObserver implements Observer {
    //姓名
    private String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {

        if(o instanceof House){
            System.out.println("购房者："+name +"观察到房价已经调整为："+arg);
        }
    }
}
