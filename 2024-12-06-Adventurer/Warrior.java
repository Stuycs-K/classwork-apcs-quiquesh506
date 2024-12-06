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
    
}