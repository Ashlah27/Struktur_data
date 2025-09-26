import java.util.Scanner;

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char item) {
        stackArray[++top] = item;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

class pembalik {
    String kata;
    char[] arrayHuruf;

    public pembalik(String kata) {
        this.kata = kata;
        this.arrayHuruf = kata.toCharArray();
    }

    public char[] kata() {
        return arrayHuruf;
    }
}

public class AppPembalik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan kata : ");
        String kata = scanner.nextLine();
        pembalik pembalik = new pembalik(kata);

        char[] hurufArray = pembalik.kata();

        Stack stack = new Stack(hurufArray.length);

        for (int i = 0; i < (hurufArray.length); i++) {
            stack.push(hurufArray[i]);
        }

        System.out.print("Kebalikan : ");
        while (!stack.isEmpty()) {
            char value = stack.pop();
            System.out.print(value);
        }
    }
}
