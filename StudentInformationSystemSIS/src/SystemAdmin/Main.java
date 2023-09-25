package SystemAdmin;

public class Main {
    public static void main ( String[] args )
        {

            Teacher t1 =new Teacher ( "Burak Teacher","555","HST" );
            Teacher t2 =new Teacher ( "Zeynep Teacher","505","PHY" );
            Teacher t3 =new Teacher ( "Pelte Teacher","545","MAT" );

            Course history = new Course ("History","101","HST" );
            history.addTeacher ( t1 );
            Course physics = new Course ("Physic","102","PHY" );
            physics.addTeacher ( t2 );
            Course math = new Course ("Mathematics","103","MAT" );
            math.addTeacher ( t3 );

            Student s1=new Student ( "İnek Şaban","1235","4",history ,physics,math);
            s1.addBulkExamNote ( 100,100,100 );
            s1.addBulkSozluNote ( 50,50,50 );
            s1.isPass ();

            Student s2=new Student ( "Güdük Necmi","2564","4",history ,physics,math);
            s2.addBulkExamNote ( 50,70,30 );
            s2.addBulkSozluNote ( 30,30,20 );
            s2.isPass ();


        }
}
