public class Driver {
    static public void main(String args[]) {
        System.out.print(Text.CLEAR_SCREEN);
        
        drawBorder();

        Text.wait(10000);
        System.out.print(Text.RESET);

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
    }
}