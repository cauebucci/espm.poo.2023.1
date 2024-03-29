import java.util.ArrayList;
import java.util.List;

public class Util {
    private static List<Pessoa> ListaPessoas = new ArrayList<Pessoa>();

    public static void cadastrarCliente(String nome, String cpf, double valorDaDivida) {
        Cliente c = new Cliente();
        c.setNome(nome);;
        c.setCpf(cpf);
        c.setValorDaDivida(valorDaDivida);

        ListaPessoas.add(c);
    }

    public static void cadastrarVendedor(String nome, String cpf, double totalDasVendas, double comissao) {
        Vendedor v = new Vendedor();
        
        v.setNome(nome);
        v.setCpf(cpf);
        v.setTotalDasVendas(totalDasVendas);
        v.setComissao(comissao);

        ListaPessoas.add(v);
    }

    public static void cadastrarGerente(String nome, String cpf, double salario, double bonus) {
        Gerente g = new Gerente();
        
        g.setNome(nome);
        g.setCpf(cpf);
        g.setSalario(salario);
        g.setBonus(bonus);

        ListaPessoas.add(g);
    }

    public static String pesquisarCPF(String cpf) {
        StringBuffer sb = new StringBuffer();
        Pessoa pessoa = pegarPessoa(cpf);
        if(pegarPessoa(cpf) != null) {
            sb.append("\nNome: " + pessoa.getNome());
            sb.append("\nCPF: " + pessoa.getCpf());                
            if(pessoa instanceof Cliente c) {
                sb.append("\nTipo: Cliente");
                sb.append("\nValor da Dívida: R$ " + String.format("%.2f", c.getValorDaDivida())); 
            }else if(pessoa instanceof Vendedor v) {
                sb.append("\nTipo: Vendedor");
                sb.append("\nTotal das Vendas: R$ " + String.format("%.2f", v.getTotalDasVendas())); 
                sb.append("\nPorcentagem da Comissão: " +  String.format("%.2f", v.getComissao()) + "%");
                sb.append("\n\nSalário: R$ " + String.format("%.2f", v.calcularSalario()));
            }else if(pessoa instanceof Gerente g) {
                sb.append("\nTipo: Gerente");
                sb.append("\nSalário: R$ " + String.format("%.2f", g.getSalario()));
                sb.append("\nPorcentagem do Bonus: "  + String.format("%.2f", g.getBonus()) + "%");
                sb.append("\n\nBonus: R$ " + String.format("%.2f", g.calcularBonus()));
            }
        }
        return sb.toString();
    }

    public static Pessoa pegarPessoa(String cpf) {
        
        for (Pessoa pessoa : ListaPessoas) {
            if(pessoa.getCpf().equalsIgnoreCase(cpf)){
                return pessoa;
            }
        }
        return null;
    }

    public static String listarEmpregados() {
        StringBuffer sb = new StringBuffer();
        int contador = 0;

        for (Pessoa pessoa : ListaPessoas) {
            if(pessoa instanceof Vendedor || pessoa instanceof Gerente) {
                if(!(contador == 0)) {
                    sb.append("\n\n─────────────────────────────────────\n"); 
                } else {
                    sb.append("Lista de empregados:\n");
                }
                sb.append("\nNome: " + pessoa.getNome());
                sb.append("\nCPF: " + pessoa.getCpf());
            }
            if(pessoa instanceof Vendedor v) {
                sb.append("\nTipo: Vendedor");
                sb.append("\nTotal das Vendas: R$ " + String.format("%.2f", v.getTotalDasVendas())); 
                sb.append("\nPorcentagem da Comissão: " +  String.format("%.2f", v.getComissao()) + "%");
                sb.append("\n\nSalário: R$ " + String.format("%.2f", v.calcularSalario()));
                contador++; 
            }else if(pessoa instanceof Gerente g) {
                sb.append("\nTipo: Gerente");
                sb.append("\nSalário: R$ " + String.format("%.2f", g.getSalario()));
                sb.append("\nPorcentagem do Bonus: "  + String.format("%.2f", g.getBonus()) + "%");
                sb.append("\n\nBonus: R$ " + String.format("%.2f", g.calcularBonus()));
                contador++;
            }
            
        }
        if(sb.isEmpty()) {
            sb.append("Nenhum empregado cadastrado.");
        }  
        return sb.toString();
    }

    public static String listarClientes() {
        StringBuffer sb = new StringBuffer();
        int contador = 0;

        for (Pessoa pessoa : ListaPessoas) {
            if(pessoa instanceof Cliente c) {
                if(!(contador == 0)) {
                    sb.append("\n\n─────────────────────────────────────\n"); 
                } else {
                    sb.append("Lista de clientes:\n");
                }
                sb.append("\nNome: " + pessoa.getNome());
                sb.append("\nCPF: " + pessoa.getCpf());
                sb.append("\nValor da Dívida: R$ " + String.format("%.2f", c.getValorDaDivida())); 
                contador++;
            }
        }
        if(sb.isEmpty()) {
            sb.append("Nenhum cliente cadastrado.");
        }  
        return sb.toString();
    }

    public static boolean excluir(String cpf) {
        
        for (Pessoa pessoa : ListaPessoas) {
            if(pessoa.getCpf().equalsIgnoreCase(cpf)) {
                ListaPessoas.remove(pessoa);
                return true;
            }
        }
        return false;
    }
}
