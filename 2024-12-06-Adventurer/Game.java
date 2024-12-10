import java.util.Scanner;

public class Game {
  public static void main(String args[]) {
    CodeWarrior bot = new CodeWarrior("Big Billy", 20, "java");
    Warrior player = new Warrior("player", 2, 15);

    Scanner input = new Scanner(System.in);

    while (bot.getHP() > 0 && player.getHP() > 0) {
      System.out.println("\n" + player + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax());
      System.out.println("" + bot + ", " + bot.getHP() + "/" + bot.getmaxHP() + " HP, " + bot.getSpecial() + "/" + bot.getSpecialMax());


      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

      //Scanner input = new Scanner(System.in);

      boolean valid = false;

      while (!valid) {
        
        String choice = input.nextLine();
        if (choice.equals("a")) {
          System.out.println(player.attack(bot));
          valid = true;
        }else if (choice.equals("sp")) {
          System.out.println(player.specialAttack(bot));
          valid = true;
        }else if (choice.equals("su")) {
          System.out.println(player.support());
          valid = true;
        } else if (choice.equals("quit")) {
          input.close();
          return;
        } else {
          System.out.println("please input one of the following options:\nType: (a)ttack / (sp)ecial / (su)pport / quit");

        }
        
      }
      
      if (bot.getHP() > 0) {
        int botChoice = (int)(Math.random() * 3);
        if (botChoice == 0) {
          System.out.println(bot.attack(player));
        } else if (botChoice == 1) {
          System.out.println(bot.specialAttack(player));
        } else {
          System.out.println(bot.support());
        }
      }

    }
    input.close();
    if (bot.getHP() > 0) {
      System.out.println("Winner: " + bot);
    } else {
      System.out.println("Winner: " + player);
    }
  }
}
