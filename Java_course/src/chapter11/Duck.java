package chapter11;
//Challenge10
public class Duck extends Animal{
    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    @Override
    String makeSound(){
        return "quack";
    }
}
