package question_3;

public class Triangle implements Shape{
    @Override
    public void draw() {
        int height =8;//height= 8stars
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
