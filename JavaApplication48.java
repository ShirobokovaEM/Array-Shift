
package javaapplication48;
import java.util.Arrays;

public class JavaApplication48 {
   
    public static void main(String[] args) {
        
        int[] m = {0,1,2,3,4,5};
        sdvigArray(m);
        System.out.println(Arrays.toString(m));
    }

    private static int sdvigArray(int[] m) {
        int x = m[0];        
        for (int i = 0; i < m.length - 1; i++) {
          m[i] = m[i + 1];
          m[i + 1] = x;                 
        }
        return 0;     
    }  
}
