public class App {
    public static void main (String[] args)
        {
            Ecommerce patika = new Ecommerce ();
            String owner = "Burak öztaş";
            String cardNumber ="1234 4123 4561 4567";
            String skt="12/2028";
            String cvv = "123";
            String[] products={"Iphone","Kulaklık"};
            double prc=1000.2;
            patika.checkout (prc,products,owner,cardNumber,skt,cvv );

        }

}
