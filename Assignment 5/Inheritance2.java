
class LibraryItem
{
    int id;
    int price;
    int quantity;

    public LibraryItem(int id, int price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

class DVD extends LibraryItem
{
    int runtime;
    String name;

    public DVD(int id, int price, int quantity, int runtime, String name) {
        super(id, price, quantity);
        this.runtime = runtime;
        this.name = name;
    }
    public int getWattage() {
        return runtime;
    }
    public void setWattage(int runtime) {
        this.runtime = runtime;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void display()
    {
        System.out.println("ID: "+id+"\nTotal Price:
"+(quantity*price)+"\nQuantity: "+quantity+"\nName: "+name+"\nRuntime:
"+runtime);
    }

}

class Books extends LibraryItem
{
    int numberofpages;
    String name;
    String author;

    public Books(int id, int price, int quantity, int numberofpages, String
name, String author) {
        super(id, price, quantity);
        this.numberofpages = numberofpages;
        this.name = name;
        this.author = author;
    }

    public int getNumberofpages() {
        return numberofpages;
    }
    public void setNumberofpages(int numberofpages) {
        this.numberofpages = numberofpages;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    void display()
    {
        System.out.println("ID: "+id+"\nTotal Price:
"+(quantity*price)+"\nQuantity: "+quantity+"\nName: "+name+"\nAuthor:
"+author+"\nNumber of pages: "+numberofpages);
    }
}

class Magazine extends LibraryItem
{
    String type;
    String edition;
    String name;

    public Magazine(int id, int price, int quantity, String type, String
edition, String name) {
        super(id, price, quantity);
        this.type = type;
        this.edition = edition;
        this.name = name;
    }
    public String getSize() {
        return type;
    }
    public void setSize(String type) {
        this.type = type;
    }
    public String getColour() {
        return edition;
    }
    public void setColour(String edition) {
        this.edition = edition;
    }
    public String getGarment_type() {
        return name;
    }
    public void setGarment_type(String name) {
        this.name = name;
    }

    void display()
    {
        System.out.println("ID: "+id+"\nTotal Price:
"+(quantity*price)+"\nQuantity: "+quantity+"\nType: "+type+"\nEdition:
"+edition+"\nName: "+name);
    }

}

public class Inheritance2 {
    public static void main(String[] args) {
        Magazine m = new Magazine(1, 40, 40, "Fashion", "V8", "Vogue");
        Books b = new Books(2, 350, 50, 500, "Hello", "HowAreYou");
        DVD e = new DVD(3, 30, 70, 120, "Life");
        m.display();
        b.display();
        e.display();
    }
}
