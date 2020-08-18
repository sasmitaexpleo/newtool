import java.util.Random;

public class creatingrandomid {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int count = 100000;

        Random objGenerator = new Random();
        for (int iCount = 0; iCount < count; iCount++) {
            int randomNumber = objGenerator.nextInt(100000);
            System.out.println("Random No : " + randomNumber);
        }

    }

}
