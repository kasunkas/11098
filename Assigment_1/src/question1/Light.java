package question1;

/**
 * 2.Create an Interface called Light with method signatures on(), off(), and dim(int level)
 * to adjust brightness.
 **/
public interface Light {
    void on();//create on method

    void off();//create off method

    void dim(int level);//create dim method

    int getBrightness();
}
