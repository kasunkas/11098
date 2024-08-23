package question_3;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        int length = 6;
        int width = 4;
        for (int i = 0; i < width; i++) {
            for (int l = 0; l < length; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

