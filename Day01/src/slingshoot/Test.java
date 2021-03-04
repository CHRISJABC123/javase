package slingshoot;

/**
 * 姬动兴
 * 2021/3/1
 */
public class Test {
    public static void main(String[] args) {
        SlingShoot slingShoot=new SlingShoot();
        slingShoot.shoot(new RedBird());
        slingShoot.shoot(new BlueBird());
        slingShoot.shoot(new YellowBrid());

        slingShoot.shoot(new Bird() {
            @Override
            public void fly() {
                System.out.println("黑球可以爆炸");
            }
        });
    }
}
