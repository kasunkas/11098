package question1;

/**
 * 3.Implement two concrete classes named KitchenRoomLight and LivingRoomLight, using the Light interface, and overriding methods on(), off(), and dim(int level) in each class.
 * Additionally, keep track of the current brightness level in each class.
 **/
public class KitchenRoomLight implements Light {
    private int brightness_level_kitchen;

    @Override
    public void on() {
        brightness_level_kitchen = 100;
        System.out.println("Kitchen Room light is ON at full brightness.");
    }

    public void off() {
        brightness_level_kitchen = 0;
        System.out.println("Kitchen Room light is OFF");
    }

    public void dim(int level) {
        brightness_level_kitchen = level;
        System.out.println("Kitchen Room light dimmed to " + brightness_level_kitchen + "%.");
    }
    public int getBrightness() {
        return brightness_level_kitchen;
    }

}
