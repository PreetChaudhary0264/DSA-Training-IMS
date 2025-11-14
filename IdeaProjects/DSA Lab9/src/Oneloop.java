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

        int var = 3;
        for(int i = 1; i <= 7; i++){
            for(int j = 1; j <= 4; j++) {
                if (i < 5) {
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <= var) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if(i >= 5)var--;
            System.out.println();
        }
 
        System.out.println();
        System.out.println(" 4th pattern...HEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEHEEHHEHEHE");
        System.out.println();

        int mid = 3;
        int left = 3;
        int right = 3;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 7; j++){
                if(j == mid){
                    if(i % 2 == 0){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    if(j >= left && j <= right){
                        if(i % 2 == 1){
                            if(j % 2 == 0){
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }else{
                            if(j % 2 == 1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            left--;
            right++;
            System.out.println();
        }
    }
}
