package Easy_Hogwards;

public class SpellCaster {
    public void cast(String spell, SpellAction action) {
        String result = action.perform(spell);
        System.out.println(result);
    }
}
