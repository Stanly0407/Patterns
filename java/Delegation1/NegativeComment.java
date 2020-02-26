package Delegation1;

public class NegativeComment implements ISendComment {
    @Override
    public void sendComment() {
        System.out.println("We apologise are disappointing You!\n" +
                "We promise to work better!");
    }
}
