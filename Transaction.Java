package banking;

public class Transaction {
    public void start_banking(){
        String shazzad_pin="1234";
        String moshiur_pin="7890";
        String saha_pin;
        Account shazzad = new Account ("shazzad","01766929644",shazzad_pin);
        Account moshiur = new Account ("moshiur", "01625434063", moshiur_pin);
        Account saha = new Account ("saha", "01876543433");
        System.out.println(shazzad);
        System.out.println(moshiur);
        System.out.println(saha);
        shazzad.add_money(1500);
        moshiur.add_money(2000);
        saha.add_money(3000);
        shazzad.cash_out(500, moshiur_pin);

        if(shazzad.pin_update(shazzad_pin, "3245"))
        {
            shazzad_pin="3245";
        }
        if(saha.pin_set("2211"))
        {
            saha_pin="2211";
        }

        System.out.println(shazzad.getAccount_holder_name()+ ", "
                + shazzad.getAccount_phone_number() + ", "
                + shazzad.getBalance());

        System.out.println(moshiur.getAccount_holder_name()+ ", "
                + moshiur.getAccount_phone_number() + ", "
                + moshiur.getBalance());

        shazzad.cash_out(1200, shazzad_pin);
        saha.cash_out(1000, "2211");
    }
}
