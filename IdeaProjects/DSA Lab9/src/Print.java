public class Print {
    public static void main(String[] args) {
        printTable(5,1);
    }
    public static void  printTable(int num,int i){
        if(i > 10)return;
        System.out.println(num + " * " + i + " = " + num*i);
        printTable(num,i+1);
    }
}
