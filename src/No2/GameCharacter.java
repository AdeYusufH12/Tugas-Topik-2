package No2;

public class GameCharacter {
    private String nama;
    private int lifePoint, attackhitPoint, attackkickPoint;

    public GameCharacter(String nama, int attackhitPoint, int attackkickPoint) {
        this.nama = nama;
        this.lifePoint = 100;
        this.attackhitPoint = attackhitPoint;
        this.attackkickPoint = attackkickPoint;
    }

    public String getNama() {
        return nama;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void hit(GameCharacter karB) {
        karB.lifePoint -= this.attackhitPoint;
    }

    public void kick(GameCharacter karB) {
        karB.lifePoint -= this.attackkickPoint;
    }
}
