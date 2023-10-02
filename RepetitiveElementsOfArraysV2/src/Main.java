import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            int repeat = 0;
            for ( int k : list )
                {
                    if ( list[i] == k )
                        {
                            repeat++;
                        }
                }
            if (i == 0) {
                System.out.println(list[i] + " number " + repeat + " times repeated.");
            }
           else if ( list[i-1] != list[i]) {
                System.out.println(list[i] + " number " + repeat + " times repeated.");
            }
        }
    }
}


