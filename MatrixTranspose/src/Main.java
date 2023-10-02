public class Main {
    public static void main (String[] args)
        {
            int[][] list = {
                    {2 , 3 , 4} ,
                    {4 , 5 , 6}
            };

            for ( int i = 0;i < list.length;i++ )
                {
                    for ( int j = 0;j < list[0].length;j++ )
                        {
                            System.out.print (list[i][j] + " ");
                        }
                    System.out.println ();
                }

            System.out.println ("-------Transposed Only For--------");

            int[][] transpose = new int[list[0].length][list.length];

            for ( int i = 0;i < list[0].length;i++ )
                {
                    for ( int j = 0;j < list.length;j++ )
                        {
                            transpose[i][j] = list[j][i];
                        }
                }

            for ( int i = 0;i < transpose.length;i++ )
                {
                    for ( int j = 0;j < transpose[0].length;j++ )
                        {
                            System.out.print (transpose[i][j] + " ");
                        }
                    System.out.println ();
                }

            System.out.println ("-------Transposed For Each Usage--------");

            for ( int[] transRow : transpose )
                {
                    for ( int transCol : transRow )
                        {
                            System.out.print (transCol + " ");
                        }
                    System.out.println ();
                }


        }
}
