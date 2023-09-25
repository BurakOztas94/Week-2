package SystemAdmin;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double average;
    double sozlu;
    boolean isPass;


    Student ( String name , String studentNo , String classes , Course c1 , Course c2 , Course c3 )
        {
            this.name = name;
            this.studentNo = studentNo;
            this.classes = classes;
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.average = 0.0;
            this.sozlu = 0.0;
            this.isPass = false;

        }

    void addBulkExamNote ( int note1 , int note2 , int note3 )
        {
            if ( note1 >= 0 && note1 <= 100 )
                {
                    this.c1.note = note1;
                }
            if ( note2 >= 0 && note2 <= 100 )
                {
                    this.c2.note = note2;
                }
            if ( note3 >= 0 && note3 <= 100 )
                {
                    this.c3.note = note3;
                }
        }

    void addBulkSozluNote ( int sozlu1 , int sozlu2 , int sozlu3 )
        {
            if ( sozlu1 >= 0 && sozlu1 <= 100 )
                {
                    this.c1.sozlu = sozlu1;
                }
            if ( sozlu2 >= 0 && sozlu2 <= 100 )
                {
                    this.c2.sozlu = sozlu2;
                }
            if ( sozlu3 >= 0 && sozlu3 <= 100 )
                {
                    this.c3.sozlu = sozlu3;
                }
        }

    void isPass ()
        {
            this.average = ( ( ( ( this.c1.note + this.c2.note + this.c3.note ) / 3.0 ) * 0.80 )           //Sozlu notu bu kısıma eklenmiştir.
                    + ( ( ( this.c1.sozlu + this.c2.sozlu + this.c3.sozlu ) / 3.0 ) * 0.20 ) );                //kod çok kompleks yapıda düzeltilmesi gerekityor
            if ( this.average > 55 )
                {
                    System.out.println ( "***********************************" );
                    System.out.println ( "You have passed !" );
                    this.isPass = true;

                }
            else
                {
                    System.out.println ( "***********************************" );
                    System.out.println ( "You have failed !" );
                    this.isPass = false;
                }
            printNote ();
        }

    void printNote ()
        {
            System.out.println ( "***********************************" );
            System.out.println ( c1.name + " Note :\t\t " + this.c1.note + "\t\t\tSozlu\t: " + this.c1.sozlu );
            System.out.println ( c2.name + " Note\t :\t\t " + this.c2.note + "\t\t\tSozlu\t: " + this.c2.sozlu );
            System.out.println ( c3.name + " Note :\t " + this.c3.note + "\t\t\tSozlu\t: " + this.c3.sozlu );
            System.out.println ( "Your average : " + this.average );
        }


}
