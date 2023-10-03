public class Ecommerce {
    private final String projectTitle;
    private Akbank akbank;
            //Dependency
    public Ecommerce ()
        {
            this.projectTitle = "Patika Store";
            this.akbank=new Akbank("Patika","1234");
        }

    public boolean checkout (double price , String[] products , String owner , String cardNumber , String skt , String cvv)
        {
            System.out.println ("Ürünleriniz ");
            for(String productName:products){
                System.out.println ("-"+productName);
                            }
            return false;
        }

    public String getProjectTitle ()
        {
            return projectTitle;
        }


}
