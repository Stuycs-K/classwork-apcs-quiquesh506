public class ColorDemo {
    public static final String DEFAULT = "\u001b[0m";
    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";

    public static final String RED_B = "\u001b[48;2;100;0;0m";
    public static final String ORANGE_B = "\u001b[48;2;255;165;0m";
    public static final String YELLOW_B = "\u001b[48;2;255;255;0m";
    public static final String GREEN_B = "\u001b[48;2;0;255;0m";
    public static final String BLUE_B = "\u001b[48;2;0;0;255m";
    public static final String INDIGO_B = "\u001b[48;2;86;5;145m";
    public static final String VIOLET_B = "\u001b[48;2;143;0;255m";

    public static final String RED_T = "\u001b[38;2;100;0;0m";
    public static final String ORANGE_T = "\u001b[38;2;255;165;0m";
    public static final String YELLOW_T = "\u001b[38;2;255;255;0m";
    public static final String GREEN_T = "\u001b[38;2;0;255;0m";
    public static final String BLUE_T = "\u001b[38;2;0;0;255m";
    public static final String INDIGO_T = "\u001b[38;2;86;5;145m";
    public static final String VIOLET_T = "\u001b[38;2;143;0;255m";

    public static void main (String[] args) {
        // System.out.print("\u001b[31m");
        // System.out.println("silly monkeys");
        System.out.print("A " + RED_T + "r" + ORANGE_T + "a" + YELLOW_T + "i" + GREEN_T + "n" + BLUE_T + "b" + INDIGO_T + "o" + VIOLET_T + "w" + DEFAULT +
         "is formed by the " + YELLOW_B + "sunlight" + DEFAULT + "\nShining through raindrops so small.\n");
        System.out.print("The rain bends the light from the sunshine,\nAnd colors the " + BLUE_T + "sky" + DEFAULT + "for us all.\n");
        System.out.print(RED_B + "Red, " + ORANGE_B + "orange, " + YELLOW_B + "yellow, " + GREEN_B + "green, " + BLUE_B + "blue, " + INDIGO_B + "indigo, " + VIOLET_B + "violet" + DEFAULT);
        System.out.print(" is what we see.\nRainbow colors,\nAre made with light bending you see!\n");

    }
}