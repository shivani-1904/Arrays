import java.util.Scanner;

// Class name should be "Source",
// otherwise solution won't be accepted
public class transpose {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a= in.nextInt();
        int[][] arr = new int[a][a];

        int[][] b = new int[a][a];

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<a; j++)
            {
                arr[i][j] = in.nextInt();
                //System.out.println("\t");
            }
            //System.out.println("\n");
        }

        
        for(int i=0; i<a; i++)
        {
            for(int j=0; j<a; j++)
            {
                b[i][j] = arr[j][i];
            }
        }

        for(int i=0; i<a; i++)
        {
            for(int j=0; j<a; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

   }
}