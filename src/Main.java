import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j,kolS;
        int q = 0-1;
        boolean l,r,u,d,marker=false;
        boolean[][] field = new boolean[101][101];
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        i = j = 50;
        kolS=0;
        field[i][j]=true;
        u=true;
        d=false;
        l=false;
        r=false;
        for(int k=0;k<str.length()-1;k++)
        {
            if (str.charAt(k)=='S'){
                if (u) i--;
                else
                    if (d) i++;
                    else
                        if (r) j++;
                        else j--;
                kolS++;
                if (field[i][j]){
                    System.out.println(kolS);
                    marker = true;
                break;}
                else field[i][j]=true;
            }
            else
                if (str.charAt(k)=='L') {
                    if (u) {
                        u = false;
                        l = true;
                    } else if (d) {
                        d = false;
                        r = true;
                    } else if (r) {
                        r = false;
                        u = true;
                    } else {
                        l = false;
                        d = true;
                    }
                }
                else {
                    if (u) {
                        u = false;
                        r = true;
                    } else if (d) {
                        d = false;
                        l = true;
                    } else if (r) {
                        r = false;
                        d = true;
                    } else {
                        l = false;
                        u = true;
                    }
                }

        }
        if(!marker)
            System.out.println(q);

    }
}
