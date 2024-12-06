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
      return "hit " + other.getName() + " for 5 damage";
    }
    public String support(Adventurer other) {
      other.setHP(other.getHP() + 2);
      if (other.getHP() > other.getmaxHP()) {
        other.setHP(other.getmaxHP());
      }
      return "healed " + other.getName() + " for 2 health";
    }


}
