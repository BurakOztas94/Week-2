public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match ( Fighter f1 , Fighter f2 , int minWeight , int maxWeight )
        {
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }


    public void run ()
        {


            if ( isCheck () )
                {
                    System.out.println ( "**********FIRST ROUND*********" );          //First round starts anyone can hit
                    if ( (int) ( Math.round ( Math.random () ) ) == 0 )
                        {      //Randomly pick numbers and if number hit 0 than f1ghter 1 starts first
                            this.f2.health = this.f1.hit ( this.f2 );
                            System.out.println ( this.f2.name + " Remain Health : " + this.f2.health );
                        }
                    else
                        {
                            this.f1.health = this.f2.hit ( this.f1 );
                            System.out.println ( this.f1.name + " Remain Health : " + this.f1.health );
                        }

                    while (this.f1.health > 0 && this.f2.health > 0)
                        {
                            System.out.println ( "**********NEW ROUND*********" );
                            this.f2.health = this.f1.hit ( this.f2 );

                            if ( isWin () )
                                {
                                    break;
                                }
                            this.f1.health = this.f2.hit ( this.f1 );
                            if ( isWin () )
                                {
                                    break;
                                }
                            System.out.println ( this.f1.name + " Remain Health : " + this.f1.health );
                            System.out.println ( this.f2.name + " Remain Health : " + this.f2.health );
                        }
                }
            else
                {
                    System.out.println ( "Invalid fighter division" );
                }

        }


    boolean isCheck ()
        {
            return ( this.f1.weight >= minWeight && this.f1.weight <= maxWeight ) && ( this.f2.weight >= minWeight && this.f2.weight <= maxWeight );
        }

    boolean isWin ()
        {
            if ( this.f1.health <= 0 )
                {
                    System.out.println ( this.f1.name + " remain health :  " + this.f1.health );
                    System.out.println ( this.f2.name + " remain health :  " + this.f2.health );
                    System.out.println ( this.f2.name + " Win !" );
                    return true;
                }
            if ( this.f2.health <= 0 )
                {
                    System.out.println ( this.f1.name + " remain health :  " + this.f1.health );
                    System.out.println ( this.f2.name + " remain health :  " + this.f2.health );
                    System.out.println ( this.f1.name + " Win !" );
                    return true;
                }
            return false;
        }


}
