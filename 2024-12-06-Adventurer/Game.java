import java.util.Scanner;

public class Game {
  public static void main(String args[]) {
    CodeWarrior bot = new CodeWarrior("Big Billy", 20, "java");
    Warrior player = new Warrior("player", 20, 15);

    while (bot.getHP() > 0 && player.getHP() > 0) {
      System.out.println("" + player + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax());
      System.out.println("" + bot + ", " + bot.getHP() + "/" + bot.getmaxHP() + " HP, " + bot.getSpecial() + "/" + bot.getSpecialMax());

      Scanner input = new Scanner(System.in);

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

      String choice = input.nextLine();

      boolean valid = false;

      while (!valid) {
        if (choice.equals("a")) {
          player.attack(bot);
          valid = true;
        }else if (choice.equals("sp")) {
          player.specialAttack(bot);
          valid = true;
        }else if (choice.equals("su")) {
          player.support();
          valid = true;
        } else if (choice.equals("quit")) {
          input.close();
          return;
        } else {
          System.out.println("please input one of the following options:\nType: (a)ttack / (sp)ecial / (su)pport / quit");
        }
      }

      int botChoice = (int)(Math.random() * 3);
      if (botChoice == 0) {
        bot.attack(player);
      } else if (botChoice == 1) {
        bot.specialAttack(player);
      } else {
        bot.support();
      }

      input.close();
    }
    if (bot.getHP() > 0) {
      System.out.println("Winner: " + bot);
    } else {
      System.out.println("Winner: " + player);
    }
  }
}
