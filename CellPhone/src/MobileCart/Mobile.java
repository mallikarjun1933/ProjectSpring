package MobileCart;

public class Mobile implements Exchangable,Repairable,Sellable,Talking
{
    private String name;
    private double price;
    private String brand;
    private int ram;
    private  MobileType mobileType;
    private RingType ringType;
    private DialType dialType;

    public Mobile(String name,double price,String brand,int Ram,MobileType mobileType,RingType ringType,DialType dialType)
    {
        this.name=name;
        this.price=price;
        this.brand=brand;
        this.ram=ram;
        this.mobileType=mobileType;
        this.ringType=ringType;
        this.dialType=dialType;

    }

    public String toString()
    {
        return "Name: " + name + "  Price: $" +price+" Brand:"+brand+" Ram:"+ram+" MobileType:"+mobileType+" " +
                "RingType:"+ringType+" DialType:"+dialType;

    }

    @Override
    public void Exchangable()
    {
      System.out.println("Samsung Mobile can be Exchange");
    }

    @Override
    public void Repairable()
    {
     System.out.println("Redmi Mobile will be repair");
    }

    @Override
    public void Sellable()
    {
   System.out.println("OnePlus Mobile will be Sale after using many year");
    }

    @Override
    public void Talking()
    {
        System.out.println("LG Mobile will be talking only");
    }
}
