public class Main {
    public static void main(String[]args){
        CreateObj player = new Player(100, 10, 2);
        CreateObj monster = new Monster(50, 5, 0);

        while (player.getHp() > 0 && monster.getHp() > 0) {
            monster.setHp(player.getAtk() - monster.getDef());
            System.out.println(">>>Player hit monster" + (player.getAtk() - monster.getDef()) + ", monster remaining" + monster.getHp() + " hp");
            player.setHp(monster.getAtk() - player.getDef());
            System.out.println(">>>Monster hit player " + (monster.getAtk() - player.getDef()) + ", player remaining" + player.getHp() + " hp");
            System.out.println("-------------------");

        }
        if (player.getHp()<=0){
            System.out.println("Player lose!");
        }else if (monster.getHp()<=0){
            System.out.println("Player win!");
        }
    }
}
