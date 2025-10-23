public class Book {
    String title;
    String author;
    double price;

    public Book(){ // parametresiz
        title = "-";
        author = " ";
        price = 0;
    }

    public Book(String title, String author, double price){ // parametreli
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void showDetails(){  // show details method.
        System.out.println(title + " " + author + " " + price);
    }
}
