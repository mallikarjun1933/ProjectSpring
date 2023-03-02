public class Account
{
    private static Account obj=null;
    private Account()
    {
        System.out.println("Object created");
    }
    public static void CreateObj() {
        if (obj == null) {
            obj = new Account();
        } else {
            System.out.println("Cannot Created object");
        }
    }
}
