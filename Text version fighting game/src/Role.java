import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;

    //容颜数组
    String[] boyfaces = {"风流俊雅", "气字轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //攻击描述数组
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。" };

    //受伤描述数组
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去" };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int n = r.nextInt(boyfaces.length);
            this.face = boyfaces[n];
        } else {
            int n = r.nextInt(girlfaces.length);
            this.face = girlfaces[n];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random r = new Random();
        int n = r.nextInt(attacks_desc.length);
        String KungFu = attacks_desc[n];

        //输出一个攻击的效果,this表示方法的调用者
        System.out.printf(KungFu, this.getName(), role.getName());
        System.out.println();

        //计算造成的伤害1 ~ 20
        int hurt = r.nextInt(20) + 1;
        //计算剩余血量
        int remainBlood = role.getBlood() - hurt;
        //检查剩余血量,防止为负数
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改被打的这个人的血量
        role.setBlood(remainBlood);

        //输出受伤的效果
        //血量 > 90 用0索引的描述
        //血量 70 ~ 90 用1索引的描述
        //血量 50 ~70 用2索引的描述
        //血量 40 ~ 50 用3索引的描述
        //血量 30 ~ 40 用4索引的描述
        //血量 15 ~ 30 用5索引的描述
        //血量 < 15 用6索引的描述
        if (remainBlood >= 90) {
            System.out.printf(injureds_desc[0], role.getName());
        }
        else if (remainBlood < 90 && remainBlood >= 70) {
            System.out.printf(injureds_desc[1], role.getName());
        }
        else if (remainBlood < 70 && remainBlood >= 50) {
            System.out.printf(injureds_desc[2], role.getName());
        }
        else if (remainBlood < 50 && remainBlood >= 40) {
            System.out.printf(injureds_desc[3], role.getName());
        }
        else if (remainBlood < 40 && remainBlood >= 30) {
            System.out.printf(injureds_desc[4], role.getName());
        }
        else if (remainBlood < 30 && remainBlood >= 15) {
            System.out.printf(injureds_desc[5], role.getName());
        }
        else {
            System.out.printf(injureds_desc[6], role.getName());
        }
        System.out.println();
    }

    public void show() {
        System.out.println("姓名为" + this.getName());
        System.out.println("血量为" + this.getBlood());
        System.out.println("性别为" + this.getGender());
        System.out.println("长相为" + this.getFace());
    }

}
