package Class19;

import java.sql.SQLOutput;

public class Animal {
    String color;
    String texture;
    int legs;
    int eyes;
    String pattern;

    public Animal(String color, String texture, int legs, int eyes, String pattern) {
        this.color = color;
        this.texture = texture;
        this.legs = legs;
        this.eyes = eyes;
        this.pattern = pattern;
    }

    public void printInfo() {
        System.out.println("color: " + color);
        System.out.println("texture: " + texture);
        System.out.println("legs: " + legs);
        System.out.println("eyes: " + eyes);
        System.out.println("pattern: " + pattern);
        }
}