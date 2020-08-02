package labex1;
import java.util.*;

/**
 *
 * @author Desktop Pc
 */
public class integer {
    private static int i;
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        int r=0;
        for(i=100;i<200;i++)
        {
            if(i%8==0)
            r=r+i;
        }
        System.out.println("The required number is:"+r);
        
        }
    }