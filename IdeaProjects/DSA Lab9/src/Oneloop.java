import java.sql.SQLOutput;

public class Oneloop {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--){
            for(int j = 1; j < 6; j++){
                if(j >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" 2nd pattern...HEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEEHHEHEHE");
        System.out.println();

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(i == 2 || i == 3){
                    if(j > 1 && j < 4){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(" 3rd pattern...HEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEEHHEHEHE");
        System.out.println();
    }
}
