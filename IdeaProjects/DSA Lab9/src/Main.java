import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\IdeaProjects\\DSA Lab9\\src\\Main.java"));
//        Scanner sc = new Scanner("How are u");  //scanner is a buffer
        int cnt = 0;
        while(sc.hasNext()){
            System.out.println(sc.next());
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}