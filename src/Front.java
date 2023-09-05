import java.util.Scanner;
public class Front {
    Scanner read = new Scanner(System.in);


    public int menu(){
    write("1. Adicionar livro");
    write("2. Emprestar livro ao aluno");
    write("3. Devolução de livro do aluno");
    write("4. Listar livros disponíveis");
    write("0. Sair");

    return read.nextInt();
    }




    public void write(String text){
        System.out.println(text);
    }
}
