package debugging;

import entities.ADTIntegerStack;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            ADTIntegerStack stack = new ADTIntegerStack(10);

            System.out.println(stack.getTop());

            for (int i = 0; i < stack.getLENGTH() / 2; i++) {
                stack.push(sc.nextInt());
            }

            System.out.println(stack);

            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();

            System.out.println(stack);

            System.out.println(stack.getTop());

            System.out.println();

            System.out.println(stack.contains(1));

            System.out.println();

            System.out.println(stack.getElements());

            System.out.println();
        }
        catch (IllegalArgumentException | IllegalStateException | NoSuchElementException exception) {
            System.err.println(exception.getMessage());
        }
    }
}