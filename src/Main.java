import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int numberOfDays = 0, j=0;
        for (int i=0;i<n;i++){
            if (read.nextInt()>0) j++;
            else {
                numberOfDays = Math.max(numberOfDays,j);
                j = 0;
            }
        }
        System.out.println(numberOfDays);
    }
    //решена задача
    //осталось сделать ничего
}