package question_2;

public abstract class Beverages {
    private boolean wantsExtras;
/**Implement the methods boil Water() and pourInCup().line6 to line 12**/
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
    protected abstract void brew();//abstract method brew() this method have't body
    protected abstract void addCondiments();//abstract method addCondiments()this method have't body
    protected abstract void addExtras();//additional abstract method addExtras()
}

