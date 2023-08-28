package JavaBasics.StaticMethodsPractice;

public class CircleCircuferenceFinder {
    static int circumference;
    static int circleCircumference(int radius){
        circumference= 2*(int) Math.PI*radius;
        return circumference;
    }
}
