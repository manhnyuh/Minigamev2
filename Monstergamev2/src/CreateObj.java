public class CreateObj {
    private int hp;
    private int atk;
    private int def;

    public CreateObj(int hp, int atk, int def) {
        this.hp=hp;
        this.atk=atk;
        this.def=def;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp -= hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}

