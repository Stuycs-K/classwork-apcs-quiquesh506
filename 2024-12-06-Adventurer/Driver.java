public class Driver {
    public static void main(String[] args) {
        Warrior t1 = new Warrior("henry", 20, 10);
        Warrior t2 = new Warrior("alex");
        System.out.println(t2.getHP());
        System.out.println(t1.attack(t2));
        System.out.println(t2.getHP());

        System.out.println(t1.support(t2));
        System.out.println(t2.getHP());

        System.out.println(t1.specialAttack(t2));
        t1.restoreSpecial(20);
        System.out.println(t1.specialAttack(t2));
        System.out.println(t2.getHP());
    }
}