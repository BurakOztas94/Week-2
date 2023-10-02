import java.util.Arrays;

public class Main {

    static boolean isEven (int[] arr , int value)
        {
            for ( int i : arr )
                {
                    if ( value % 2 != 0 )
                        {
                            return true;
                        }
                }
            return false;
        }

    public static void main (String[] args)
        {
            int[] list = {1 , 2 , 3 , 2 , 5 , 4 , 78 , 78 , 57 , 857 , 85 , 785 , 785 , 78 , 578 , 578 , 6 , 8};
            int[] duplicate = new int[list.length];
            int startIndex = 0;
            for ( int i = 0;i < list.length;i++ )
                {
                    for ( int j = 0;j < list.length;j++ )
                        {
                            if ( i != j && ( list[i] == list[j] ) )
                                {
                                    if ( !isEven (duplicate , list[i]) )
                                        {
                                            duplicate[startIndex++] = list[i];

                                        }
                                    break;

                                }

                        }

                }

            System.out.println (Arrays.toString (duplicate));
        }
}
