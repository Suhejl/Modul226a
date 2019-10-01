package ch.tbz.modul404.exception_exercise;

import java.util.Scanner;

public class Stacktest {

    public static void main(String[] args) {

        int input;
        boolean isRunning = true;
        int newValue;
        Stack stack = new Stack();
        Scanner inputValue = new Scanner(System.in);
        do {
            try {

                System.out.println("[1] Show Stack index\n [2] Push new Value\n [3] Display Stack\n [4] Get Size\n [0] Exit");
                input = Integer.parseInt(inputValue.nextLine());
                switch (input) {
                    case 1:
                        System.out.println(stack.pop());
                        break;
                    case 2:
                        System.out.println("Please input a value:");
                        newValue = Integer.parseInt(inputValue.nextLine());
                        stack.push(newValue);
                        break;
                    case 3:
                        stack.display();
                        break;
                    case 4:
                        System.out.println("Size of Stack: " + stack.size());
                        break;
                    case 0:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Wrong Number");
                }

            } catch (StackOverflow e) {
                e.printStackTrace();
            } catch (StackUnderflow e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
            }
        } while (isRunning);

    }
}
