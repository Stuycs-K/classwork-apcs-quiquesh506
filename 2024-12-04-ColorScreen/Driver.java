import java.util.ArrayList;

public class Driver {
    static public void main(String args[]) {
        System.out.print(Text.CLEAR_SCREEN);
        
        drawBorder();
        drawInts();

        Text.wait(5000);
        System.out.print(Text.RESET);

        Text.go(31, 0);
    }
    static public void drawBorder() {
        Text.go(0,0);
        for (int i = 0; i < 80; i++) {
            
            Text.color(Text.background(Text.RED));
            System.out.print(" ");
        }
        Text.go(1,0);

        for(int i = 0; i < 30;  i++) {
            Text.go(1+i, 0);
            System.out.print(" ");
            Text.go(1+i, 80);
            System.out.print(" ");
        }
        Text.go(30,0);
        for (int i = 0; i < 80; i++) {
            
            Text.color(Text.background(Text.RED));
            System.out.print(" ");
        }
        Text.color(Text.background(Text.BLACK));
    }

    public static void drawInts() {
        ArrayList<Integer> list = createRandomArray(3);
        //Text.go(1,0);
        int j = 0;
        for (double i = 18.85; i < 72.0; i += 18.75) {
            
            Text.go(2, (int) i);
            if (list.get(j) < 25) {
                Text.color(Text.RED, Text.BRIGHT);
            } else if (list.get(j) > 75) {
                Text.color(Text.GREEN, Text.BRIGHT);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(list.get(j));
            j++;
        }
        Text.go(3,2);
        for (int i = 0; i < 78; i++) {
            Text.color(Text.WHITE, Text.background(Text.RED));
            System.out.print(".");
        }
    }

    public static ArrayList<Integer>createRandomArray(int size) {
        ArrayList<Integer> list = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
        int rand = (int)(Math.random() * 100);
      //list.add("banana");
        list.add(rand);
        
        }
        return list;
    }

}