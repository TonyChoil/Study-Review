package class_and_object;

public class Monster {

    String kind; // 몬스터의 이름
    int hp; //몬스터의 체력

    public void setInfo(String name){

        this.kind = name;
    }

    public void sethp(int hp) {

        if(hp > 0) {

            this.hp = hp;
        } else {

            this.hp = 0;
        }
    }

    public String getInfo() {

        return "몬스터의 이름은 " + this.kind + "이고, 체력은 " + this.hp + "입니다.";
    }
}
