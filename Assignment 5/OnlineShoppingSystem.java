class Product {

    private int ID;
    private String name;
    private double price;

    public Product(int ID, String name, double price)
    {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getID()
    {
        return ID;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Product: " + name + ", Price: " + price;
    }
}

class Electronics extends Product {

        private String brand;
        private String model;

        public Electronics(int ID, String name, double price, String brand, String model)
        {
            super(ID, name, price);
            this.brand = brand;
            this.model = model;
        }

        public String getBrand()
        {
            return brand;
        }

        public String getModel()
        {
            return model;
        }

        @Override
        public String toString()
        {
            return "Electronics: " + super.toString() + ", Brand: " + brand + ", Model: " + model;
        }
    }

class Clothing extends Product {
        private String size;
        private String material;

        public Clothing(int ID, String name, double price, String size, String material)
        {
            super(ID, name, price);
            this.size = size;
            this.material = material;
        }

        public String getSize()
        {
            return size;
        }

        public String getMaterial()
        {
            return material;
        }

        @Override
        public String toString()
        {
            return "Clothing: " + super.toString() + ", Size: " + size + ",Material: " + material;
        }
    }

class Books extends Product {
        private String author;
        private int pageCount;

        public Books(int ID, String name, double price, String author, int pageCount)
        {
            super(ID, name, price);
            this.author = author;
            this.pageCount = pageCount;
        }

        public String getAuthor()
        {
            return author;
        }

        public int getPageCount()
        {
            return pageCount;
        }

        @Override
        public String toString()
        {
            return "Book: " + super.toString() + ", Author: " + author + ",Page Count: " + pageCount;
        }
    }

public class OnlineShoppingSystem {
    public static void main(String[] args) {
    Electronics mobile = new Electronics(112, "Mobile", 60000, "OnePlus", "11");
    Clothing item = new Clothing(449, "Jacket", 899, "Large", "Cotton");
    Books novel = new Books(229, "Atomic Habits", 700, "James Clear", 400);
    System.out.println(mobile);
    System.out.println(item);
    System.out.println(novel);
    }
}
