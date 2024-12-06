public class Warrior extends Adventurer {
    private int focus;

    public String getSpecialName() {
        return "focus";
    }
    public int getSpecial() {
        return focus;
    }
    public void setSpecial(int n) {
        focus = n;
    }
    public int getSpecialMax() {
        return 100;
    }

    public String attack(Adventurer other) {
      other.applyDamage(5);
      return "hit " + other.getName() + "for 5 damage";
    }


}
