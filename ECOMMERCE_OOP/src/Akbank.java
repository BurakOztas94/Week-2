import java.util.UUID;

public class Akbank {
    private String apiUser;
    private String apiPass;

    public  Akbank(String apiUser,String apiPassword){
        this.apiUser=apiUser;
        this.apiPass =apiPassword;

    }

    public boolean checkout (double price , String[] products , String owner , String cardNumber , String skt , String cvv)
        {
            System.out.println ("Akbank üzerinden ödeme yapıldı!");
            return UUID.randomUUID ().toString ();
        }


}
