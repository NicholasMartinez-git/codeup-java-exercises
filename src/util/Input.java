package util;
import java.util.Scanner;

public class Input {
    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("please enter a string");
        return this.sc.next();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.sc.next();
    }
}
