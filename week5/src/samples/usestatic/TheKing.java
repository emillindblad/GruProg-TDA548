package samples.usestatic;

import java.util.Calendar;

/*
    Initialization order when static is involved

    Order is:
    - All static variables in written order
    - All instance variables in written order
    - Constructor is run

 */
public class TheKing {


    public static final TheKing THE_KING = new TheKing();
    private final int beltSize;
    private static final int currentYear = Calendar.getInstance()
            .get(Calendar.YEAR);

    private TheKing() {
        beltSize = currentYear - 1930;
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("TheKing wears a size " +
                THE_KING.beltSize() + " belt.");
    }

}
