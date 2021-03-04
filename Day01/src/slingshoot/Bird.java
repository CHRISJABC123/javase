package slingshoot;

/**
 * 姬动兴
 * 2021/3/1
 */
public abstract class Bird {
    //把各种颜色小鸟抽象为Bird小鸟类, 小鸟有飞行的操作, 但是不同颜色小鸟飞行方式不同, 即Bird鸟类有飞行的操作无法具体实现,该操作可以定义为抽象方法
    public abstract void fly();
}

