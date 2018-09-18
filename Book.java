/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @Author Joseph Truelove
 * @version 9/17/2018
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    // Add the methods here ...
    public String getAuthor()
    {
        return author;   
    }
    public String getTitle()
    {
        return title;
    }
    public void printAuthor()
    {
        System.out.println("The Author's name is " + author + ".");
        System.out.println();
    }
    public void printTitle()
    {
        System.out.println("The title of the book is " + title + ".");
        System.out.println();
    }
    public int getPages()
    {
        return pages;
    }
    public void printDetails()
    {
        if (refNumber.length() > 0)
    {
        if (pages > 1)
        System.out.println(author + " is the author of the book: " + title +
        ", which contains " + pages + " pages in the book. Reference Number: " + refNumber);
        else
        System.out.println(author + " is the author of the book: " + title +
        ", which contains " + pages + " page in the book Reference Number: " + refNumber);
    }
    else
    if (pages > 1)
        System.out.println(author + " is the author of the book: " + title +
        ", which contains " + pages + " pages in the book.");
        else
        System.out.println(author + " is the author of the book: " + title +
        ", which contains " + pages + " page in the book");
    }
    public void setRefNumber(String ref)
    {
        while(refNumber.length() < 2)
        {
            System.out.println("Error must be more than 2");
            refNumber = ref;
        }
        refNumber = ref;
        
    }
    public String getRefNumber()
    {
        return refNumber;
    }
}
