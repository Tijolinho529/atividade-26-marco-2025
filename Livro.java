public class Livro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Alterar Livro");
            System.out.println("4. Remover Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    adicionarLivro(scanner, livros);
                    break;
                case 2:
                    listarLivros(livros);
                    break;
                case 3:
                    alterarLivro(scanner, livros);
                    break;
                case 4:
                    removerLivro(scanner, livros);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void adicionarLivro(Scanner scanner, List<Livro> livros) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        Livro livro = new Livro(titulo, autor, anoPublicacao, preco);
        livros.add(livro);

        System.out.println("Livro adicionado com sucesso!");
    }

    public static void listarLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("--- Lista de Livros ---");
            for (Livro livro : livros) {
                livro.exibirInformacoes();
                System.out.println("----------------------");
            }
        }
    }

    public static void alterarLivro(Scanner scanner, List<Livro> livros) {
        System.out.print("Digite o título do livro que deseja alterar: ");
        String titulo = scanner.nextLine();

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.print("Novo título: ");
                livro.setTitulo(scanner.nextLine());
                System.out.print("Novo autor: ");
                livro.setAutor(scanner.nextLine());
                System.out.print("Novo ano de publicação: ");
                livro.setAnoPublicacao(scanner.nextInt());
                System.out.print("Novo preço: ");
                livro.setPreco(scanner.nextDouble());

                System.out.println("Livro alterado com sucesso!");
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }

    public static void removerLivro(Scanner scanner, List<Livro> livros) {
        System.out.print("Digite o título do livro que deseja remover: ");
        String titulo = scanner.nextLine();

        livros.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("Livro removido com sucesso!");

    }
}