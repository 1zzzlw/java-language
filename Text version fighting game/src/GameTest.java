public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role r1 = new Role("乔峰", 100, '男');
        //创建第二个角色
        Role r2 = new Role("鸠摩智", 100, '男');

        r1.show();
        r2.show();

        //开始格斗
        while (true) {

            //r1攻击r2
            r1.attack(r2);
            //判断r2的血量是否为0,为0则结束循环
            if (r2.getBlood() == 0) {
                System.out.println(r2.getName() + "被打败了");
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            //判断r1的血量是否为0,为0则结束循环
            if (r1.getBlood() == 0) {
                System.out.println(r1.getName() + "被打败了");
                break;
            }

        }
    }
}
