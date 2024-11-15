class Book {
    public int book_number;
    public String title;
    public String author;
    public double price;

    public void set_booknumber(int s_bn) {
        this.book_number = s_bn;
    }

    public void set_title(String s_title) {
        this.title = s_title;
    }

    public void set_author(String s_author) {
        this.author = s_author;
    }

    public void set_price(double s_price) {
        this.price = s_price;
    }

    public int getBooknum() {
        return book_number;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
