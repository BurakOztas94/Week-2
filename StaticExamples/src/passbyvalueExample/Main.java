package passbyvalueExample;

public class Main {
    int x;
    public static void main ( String[] args )


        {
            int a=5;
            System.out.println ("İlk değer " + a);
            degistir(a);
            System.out.println ("son değer " + a);
            Main m1=new Main();
            m1.x=10;
            System.out.println ("ilk değer "+m1.x);
            m1.degistir2(m1);
            System.out.println ("son değer "+m1.x);

            int[] dizi ={1,2,3,4,5};
            System.out.println ("ilk değer "+ dizi[0]);
            degistir3(dizi);
            System.out.println ("son değer "+ dizi[0]);

        }

    private static void degistir3 ( int[] dizi )
        {
            dizi[0]=dizi[0]+10;

        }


    private void degistir2 ( Main m1 )
        {
            m1.x=m1.x+10;
        }


    static void degistir ( int a )
        {
            a=a+10;
        }
}
