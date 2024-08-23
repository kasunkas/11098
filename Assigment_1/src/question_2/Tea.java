package question_2;

public class Tea extends Beverages{


    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void addExtras() {
        //no, any extras giving the output
    }
}
