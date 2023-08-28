package JavaBasics.StaticMethodsPractice;

//Write an infinite loop using do while condition.
public class InfiniteLoopIndoWhile {
    static int num = 1;

    static void doWhileLoop() {
        do {
            System.out.println("your num is still 1");
            num++;
        } while (num >= 0);
    }
}
