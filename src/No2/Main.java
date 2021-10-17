package No2;

public class Main {
    public static void main(String[] args) {

        GameCharacter raiden = new GameCharacter("Raiden", 10, 20);
        GameCharacter subZero = new GameCharacter("Sub Zero", 5, 25);

        //Raiden Kick subzero
        raiden.kick(subZero);

        //subZero kick raiden
        subZero.kick(raiden);

        for (int i = 0; i < 3; i++) {
            subZero.hit(raiden);
        }

        for (int i = 0; i < 4; i++) {
            raiden.hit(subZero);
        }

        System.out.println("Life Point Raiden : "+ raiden.getLifePoint());
        System.out.println("Life Point SubZero : "+ subZero.getLifePoint());


        //Penentuan pemenang
        if (raiden.getLifePoint() > subZero.getLifePoint()) {
            System.out.println("Pemenangnya : " +raiden.getNama());
        }
        else if (subZero.getLifePoint() > raiden.getLifePoint()) {
            System.out.println("Pemenangnya : "+subZero.getNama());
        }
        else {
            System.out.println("Seri / Tidak Ada Pemenangnya");
        }

    }
}
