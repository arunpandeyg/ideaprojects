package Code60;
//Design and implement a class called Book that contains instance data for the title author, publisher,
// and copyright date. Define the book constructor that accept and initialize this data. Include
// setter and getter for all instance data. Include a toString method that returns a nicely formatted,
// multi-line description of the book. Create a driver class called Bookshelf whose main method
// instantiates and updates several book objects.

public class Code614Bookshelf {
        public static void main(String[] args) {

        Book book1, book2, book3;
        book1 = new Book("Programming in Java", "Jemes Smith", "Pavol's Publishing",
                "5/1/2014");
        book2 = new Book("Programming in VB.net", "Pavol Smith",
                "Computer's Publishing","12/5/2014");
        book3 = new Book("Programming in C++", "David John",
                "Cambridge's Publishing","2/1/2013");

        book3.setTitle("Programming in Java Script");

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

        }

}
class Book{

    //private variables
    private String _title;
    private String _author;
    private String _publisher;
    private String _copyright;

    //constructor
    public Book(String title, String author, String publisher, String copyright){
        _title = title;
        _author = author;
        _publisher = publisher;
        _copyright = copyright;
    }

    //getters
    public String getTitle(){return _title;}
    public String getAuthor(){return _author;}
    public String getPublisher(){return _publisher;}
    public String getCopyright(){return _copyright;}

    //setters
    public void  setTitle(String title){_title = title;}
    public void  setAuthor(String author){_author = author;}
    public void  setPublisher(String publisher){_publisher = publisher;}
    public void  setCopyright(String copyright){_copyright = copyright;}

    public String toString(){
        return  "Title: " + _title + "\n" + "Author: " + _author + "\n" + "Publisher: "
                +_publisher + "\n" + "Copyright: " + _copyright + "\n\n";
    }

}
