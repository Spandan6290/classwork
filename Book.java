public class Book {
    private int id;
    private String name;
    private double price;

    public int getBookId() {
        return id;
    }

    public String getBookName() {
        return name;
    }

    public double getBookPrice() {
        return price;
    }

    public Book(int id, String name,double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

