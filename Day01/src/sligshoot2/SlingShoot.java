package sligshoot2;



/**
 * 姬动兴
 * 2021/3/1
 */
public class SlingShoot {
    //弹弓可以把能飞的物体给弹出去, 需要通过参数接收一个能飞的物体.  物体是否能飞根据是否实现了Flyable接口, 如果一个类实现了Flyable接口就具有了飞行功能
    //方法参数可以定义为Flyable接口引用
    public void shoot(Flyable flyable){
        flyable.fly();
    }
}
