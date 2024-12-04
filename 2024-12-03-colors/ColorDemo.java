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
        System.out.print("A ");

    }
}