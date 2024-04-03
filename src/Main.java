import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n,maxWeight;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        maxWeight = read.nextInt();
        int[] array = new int[n];
        int[] taken = new int[n];
        for (int i = 0; i<n; i++)
            array[i]= read.nextInt();
        Arrays.sort(array);
        int numBay=0;

//        for (int i = array.length-1; i>=0; i--){
//            if (taken[i] == 1)
//                continue;
//            for (int j = i-1; j>=0; j--)
//                if (array[j]+array[i]<=maxWeight && taken[j]==0){
//                    taken[j]=1;
//                    break;
//                }
//            numBay++;
//        }
        int j = 0;
        for (int i = array.length-1; i>=0; i--){
            if (taken[i] == 1)
                continue;
            if (array[j]+array[i]<=maxWeight && taken[j]==0) {
                taken[j] = 1;
                j++;
            }
            numBay++;
        }
        System.out.println(numBay);
    }
}
