public class Main {
    public static void main (String[] args)
        {
            int[] list = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
            double harmonicSum = 0;
            for (int i = 0;i < list.length;i++)
                {
                    harmonicSum += ( 1.0 / (double) list[i] );

                }

            System.out.println (list.length / harmonicSum);

        }

}
