package Zaur.abstractDZ;

public interface Speakable {
    default void speak(){
        System.out.println("ктото говорит");
    }
}
