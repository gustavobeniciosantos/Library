import java.util.*;

public class Library {

    //Declarações
    Scanner read = new Scanner(System.in);
    Book book = new Book();
    ArrayList<Book> array = new ArrayList<>();
    Set <Book> repISBN = new HashSet<>();
    Front front = new Front();
    boolean rep = true;
    boolean containISBN = array.contains(book.getCopys());



    //------------------------------------

    public Library(){

        while(rep){
            int option = front.menu();
            switch (option){
                case 1:
                    array.add(addBook(book));
                 break;

                case 2:
                loanBook(book);
                 break;



            }//sc


        }//while


    }//constructor





    public Book addBook(Book book){
         write("Digite o nome do livro");
         book.setTitle(read.next());

         write("Digite o nome do autor");
         book.setAuthor(read.next());

          //Gerador de código

         while (containISBN){
             book.setISBN((int) (Math.random() * 90000) + 10000);
         }//While

         write("Quantas unidades foram inseridas");
        book.setCopys(read.nextInt());

        return book;
    }//objeto livro


    public Book loanBook(Book book){


        for(int i = 0; i < array.size(); i++){
            write("Nome: "+book.getTitle()+"Código: "+book.getISBN());
        }

        write("");
        write("Digite o código do livro que deseja emprestar");
        int bookLoan = read.nextInt();

        if(book.getCopys()>0){
            book.setCopys(book.getCopys()-1);
            return book;
        }
        else{ write("Sem estoque");
        return null;
        }

    }//remover livro






    public void write(String text){
        System.out.println(text);
    }


}
