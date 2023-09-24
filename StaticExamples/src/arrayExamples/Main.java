package arrayExamples;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Main {

    public static int[] copyArray(int[] source){
        int [] copy =new int[source.length];
        for(int j=0;j<source.length;j++){
            copy[j]=source[j];
        }
        return copy;
    }



    public static void main ( String[] args )
        {


            int[] array1 = {2 , 3 , 5 , 8 , 1 , 4 , 1231 , 23 , 64 , 767};
         //   int[] copy=array1.clone ();
        //    int[] copy2= Arrays.copyOf(array1,array1.length);
          //  int[] copy3= Arrays.copyOfRange (array1,0,6);


            int[] array2 = new int[array1.length];

            System.arraycopy ( array1 , 3 , array2 , 0 , 5 );


            /*
            for(int i = 0;i<array1.length;i++){
                array2[i]=array1[i];

            } */

            for (int i = 0;i < array2.length;i++)
                {

                    if ( array2[i] != 0 )
                        {
                            System.out.print ( array2[i] + " " );
                        }


                }

            /*Java'da bir dizinin diğerine kopyalanmasının
            en yaygın yolu, System.arrayCopy()
            metodunu kullanmaktır. Ancak bu yöntem
            dizi üzerinde düşük seviye bir işlem yapar
            ve dikkatli kullanılması gerekir.
            Bir diğer yöntem ise, dizi türünün sahip olduğu
             clone() metodunu kullanmaktır. Bu yöntem daha
              basit ve hata yapma ihtimali daha düşüktür
               ancak daha yavaştır.Son olarak, Arrays.copyOf()
                ve Arrays.copyOfRange() metodları da kullanılabilir.
                 Bu metodlar daha modern ve esnektir.*/



           /* Bu kod parçacığı, 'source' adlı bir dizinin belirli
           bir bölümünü (1. indeksten itibaren 2 eleman) 'destination'
            adlı bir diziye kopyalar.
            Örnek 6: Büyük bir dizinin belirli bir bölümünü kopyalama*/

            int[] source =new int[1000];
            int[] destination = new int [500];
            System.arraycopy ( source,250,destination,0,500 );









        }
}
