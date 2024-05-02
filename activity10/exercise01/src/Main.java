import controller.DescontoClienteAntigo;
import controller.DescontoFuncionario;
import model.ClienteAntigo;
import model.Funcionario;
import model.Produto;

//Para não infligir o OCP, foi criada uma interface para Desconto e utilizado Strategy
//para cada tipo de desconto. Assim, quando precisarmos de um desconto diferente,
//basta criarmos uma nova classe para esse, sem precisar alterar o método calculaDesconto original.
public class Main {
    public static void main(String[] args) {

        ClienteAntigo clienteAntigo = new ClienteAntigo();
        Funcionario funcionario = new Funcionario();
        Produto produto = new Produto();

        DescontoClienteAntigo dc = new DescontoClienteAntigo();
        DescontoFuncionario df = new DescontoFuncionario();

        clienteAntigo.setNome("Leandro");
        funcionario.setNome("Colevati");


        produto.setNome("Coca Cola");
        produto.setPreco(12);

        System.out.printf("Desconto para clientes antigos: R$%.2f", dc.calculaDesconto(produto));
        System.out.printf("\nDesconto para funcionários: R$%.2f", df.calculaDesconto(produto));
    }
}