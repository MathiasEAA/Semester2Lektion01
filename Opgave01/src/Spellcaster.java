import java.util.ArrayList;

public class Spellcaster extends Character {

    private ArrayList<Spell> spells = new ArrayList<>();

    public Spellcaster(String name, int level) {
        super(name, level);
    }

    public void addSpell(Spell spell) {
        if (!spells.contains(spell)) {
            spells.add(spell);
        }
    }
}
