package visitor.dispatch.stat;

/**
 * 墨子骑马
 *  静态分配： 方法的重载
 *  动态分配： 子类方法的重写
 *
 * @author songjunbao
 * @createdate 2018/1/21
 */
public class Mozi {
    public void ride(Horse horse){
        System.out.println("骑马");
    }

    public void ride(BlackHorse horse){
        System.out.println("骑马"+horse.color());
    }

    public void ride(WhiteHorse horse){
        System.out.println("骑马"+horse.color());
    }

    public static void main(String[] args) {
        BlackHorse bh = new BlackHorse();
        Horse wh = new WhiteHorse();
        Mozi mozi = new Mozi();
        mozi.ride(wh);
        mozi.ride(bh);

    }

}
