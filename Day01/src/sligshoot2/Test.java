package sligshoot2;





/**
 * 姬动兴
 * 2021/3/1
 */
public class Test {
    public static void main(String[] args) {
        SlingShoot  shoot=new SlingShoot();
        shoot.shoot(new RedBird());
        shoot.shoot(new BlueBird());
        shoot.shoot(new Flyable() {
            @Override
            public void fly() {
                System.out.println("绿色正在飞行");
            }
        });

    }
}
