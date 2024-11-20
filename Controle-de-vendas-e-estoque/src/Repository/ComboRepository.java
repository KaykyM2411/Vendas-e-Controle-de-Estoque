package Repository;

import Entities.Combo;

import java.util.HashSet;
import java.util.Set;

public class ComboRepository {
    private static ComboRepository instance;
    Set<Combo> combos = new HashSet<Combo>();

    private ComboRepository() {

    }
    public static ComboRepository getInstance() {
        if (instance == null) {
            instance = new ComboRepository();
        }
        return instance;
    }
    public void addCombo(Combo combo) {
        combos.add(combo);
    }
    public Set<Combo> getCombos() {
        return combos;
    }
    public void removeCombo(Combo combo) {
        combos.remove(combo);
    }
}
