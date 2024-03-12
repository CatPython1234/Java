class Java_Book {
   public String Название_книги;
   public String Автор_книги;
   public int Год_издания;
   public  String Жанр;

   public Java_Book(String Название_книги, String Автор_книги, int Год_издания, String Жанр){
       this.Название_книги = Название_книги;
       this.Автор_книги = Автор_книги;
       this.Год_издания = Год_издания;
       this.Жанр = Жанр;
   }

    public String getНазвание_книги() {
        return Название_книги;
    }

    public String getАвтор_книги() {
        return Автор_книги;
    }

    public int getГод_издания() {
        return Год_издания;
    }

    public String getЖанр() {
        return Жанр;
    }

    public void setНазвание_книги(String название_книги) {
        Название_книги = название_книги;
    }

    public void setАвтор_книги(String автор_книги) {
        Автор_книги = автор_книги;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Название_книги='" + Название_книги + '\'' +
                ", Автор_книги='" + Автор_книги + '\'' +
                ", Год_издания=" + Год_издания +
                ", Жанр='" + Жанр + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Java_Book java = new Java_Book("Сказка о царе Салтане", "Александр Сергеевич Пушкин",
                1831,"русская литературная сказка");
        System.out.println(java.toString());
    }
}
