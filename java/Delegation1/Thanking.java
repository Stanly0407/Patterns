package Delegation1;

public class Thanking implements ISendComment {

    @Override
    public void sendComment() {
        System.out.println("Thank you for your positive feedback!");
    }
}
