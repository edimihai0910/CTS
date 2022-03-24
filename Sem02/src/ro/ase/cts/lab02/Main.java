package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws MinLenghtException {

    try {
    // write your code here
    OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

    Product p1 = new Product("Lap", 3200.5, Category.Electronic, 1123);
    Product p2 = new Product("Frigider", 207.95, Category.Appliances, 1245);

    Product p3 = new Product(p1);

    p3.setName("Paine");

    o.modifyProductsList(1,p1);
    o.modifyProductsList(1,p2);

    o.modifyProductsList(2, p1);
    System.out.println(p1.equals(p2));
    }catch (Exception e){
        System.out.println(e.getMessage());
    }

    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<Product> products;

    OShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Product p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

class Product //am folosit o clasa pt mai multe tipuri de produse GRESIT.
{
    private int id;
    private String name;
    private double price;
    private Category category;
    private int quantity;
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, Category category, int id)throws MinLenghtException
    {

            if (name.length() >= 5)
                this.name = name;
            else throw new MinLenghtException("prea putine caractere");
        this.price = price;
        this.category = category;
        this.id = id;

    }

    public Product(Product product)
    {
        this.name = product.name;
        this.price = product.price;
        //this.productType = p.productType;
        this.category = product.category;
        this.id = product.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Product product)
    {
        if(product.id != this.id)
            return false;
        if(!product.name.equals(this.name))
            return false;
        if(product.price != this.price)
            return false;
        if(product.category != this.category)
            return false;

        return true;
    }

    public void RaisePrice(double val){
        if (val>=0&&val<=1){
            this.price +=this.price *val;
        }
    }

    public void ApplyDiscount(double val) {
        if (val >= 0 && val <= 1) {
            this.price -= this.price * val / 100;
        }
    }
    public void modify(boolean flag, double val)//una sau mai multe metode, una pt reducere si una pt scumpire.. apoi verificam daca valoarea apartine unui procent
    {
        if(flag)
            RaisePrice(val);
        if(!flag)
            ApplyDiscount(val);
    }
}

class User
{
    private String usn;
    private String userId;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.usn = usn;
        this.userId = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Product> l;
    private String addr;

    public Order()
    {
        l = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(l.size() > 99)
            return;

        l.add(p);
    }

    public void remove(Product p)
    {
        l.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}


