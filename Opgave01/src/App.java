public class App {

    public static void main(String[] args) {

        Barbarian fofstelr = new Barbarian("Fofstelr",1);
        Weapon longsword = new Weapon("Longsword");
        fofstelr.addWeapon(longsword);

        Wizard orlemaex = new Wizard("Orlemaex",5);
        Spell fireball = new Spell(150,Duration.INSTANTANEOUS);
        orlemaex.addSpell(fireball);

        Weapon shortbow = new Ranged("Shortbow",80);
        fofstelr.addWeapon(shortbow);

        for (Weapon weapon : fofstelr.getWeapons()) {
            if (weapon.getClass().equals(Ranged.class)) {
                ((Ranged) weapon).getRange();
            }
        }

    }
}
