package question_3;

public class Square implements Shape {

    @Override
    public void draw() {
        int size = 5;//length and height = 5 stars
        for (int i = 0; i < size; i++) {
            for (int l = 0; l < size; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
