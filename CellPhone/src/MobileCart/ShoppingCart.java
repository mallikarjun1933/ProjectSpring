package MobileCart;

import java.util.ArrayList;

public class ShoppingCart
{
    public static void main(String[] args) {
     Mobile m1=new Mobile("Samsung",6500,"Samsung",4,MobileType._6G,RingType._Silent,DialType._AutoDial);
     Mobile m2=new Mobile("OnePlus",9500,"OnePlus",8,MobileType._5G,RingType._Ringtone,DialType._Manual);
     Mobile m3=new Mobile("Redmi",5500,"Redmi",12,MobileType._5G,RingType._Silent,DialType._AutoDial);
     Mobile m4=new Mobile("LG",9500,"LG",4,MobileType._6G,RingType._Ringtone,DialType._Manual);
        ArrayList<Mobile> al=new ArrayList<>();
        al.add(m1);
        al.add(m2);
        al.add(m3);
        al.add(m4);

        for(Mobile m:al)
        {
           System.out.println(m);
        }
        m1.Exchangable();
        m3.Repairable();
        m4.Sellable();
        m2.Talking();
    }
}
