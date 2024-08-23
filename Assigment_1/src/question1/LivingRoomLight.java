package question1;

public class LivingRoomLight implements Light {
    private int brightness_level_kitchen;

    @Override
    public void on() {
        brightness_level_kitchen = 100;
        System.out.println("Living Room light is ON at full brightness.");
    }

    public void off() {
        brightness_level_kitchen = 0;
        System.out.println("Living Room light is OFF");
    }

    public void dim(int level) {
        brightness_level_kitchen = level;
        System.out.println("Living Room light dimmed to " + brightness_level_kitchen + "%.");
    }
    public int getBrightness() {
        return brightness_level_kitchen;
    }
}
