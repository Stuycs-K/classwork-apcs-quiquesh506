public class Warrior extends Adventurer {
    private int focus;

    public Warrior(String name) {
        super(name);
        focus = 10;
    }
    public Warrior(String name, int hp) {
        super(name, hp);
        focus = 10;
    }
    public Warrior(String name, int hp, int focus) {
        super(name, hp);
        this.focus = focus;
    }

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
    public String support() {
      applyDamage(-2);
      if (getHP() > getmaxHP()) {
        setHP(getmaxHP());
      }
      return "healed themself for 2 health";
    }

    public String specialAttack(Adventurer other) {
        if (focus < 15) {
            return "could not use special, not enough focus";
        }
        other.applyDamage(9);
        return "used Mighty Strike to deal 9 damage to " + other.getName();
    }

}
