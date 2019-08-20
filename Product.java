public class Product
{
    int id;
    String name;
    int quantity;
    int unitPrice;
    String expireDate;
    public Product(int id,String name,int quantity,int unitPrice,String expireDate)
    {
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
        this.expireDate=expireDate;
    }
    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public int getUnitPrice()
    {
        return this.unitPrice;
    }
    public String getExpireDate()
    {
        return this.expireDate;
    }
}
