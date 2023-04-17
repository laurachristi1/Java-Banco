public class Banco {
    String nomeDoBanco;
    String enderecoDoBanco;
    String nomeCompleto;
    String endereco;
    boolean temEmprestimoAtivo;
    String cpf;
    String dataNascimento;
    double saldo;
    double retirada;
    double deposito;
    double valorEmprestimo;
    int quantidadeParcelaEmprestimo;
    double valorParcelaEmprestimo;
    
    public Banco(String banco, String enderecobanco, String nomecompleto, String enderecocliente, boolean tememprestimoativo, String numerocpf, String datanascimento, double saldoemconta, double retirada, double deposito, double valoremprestimo, int quantidadeparcelaemprestimo,double valorparcelaemprestimo) { //construtor
        
    
    nomeDoBanco= banco;
    enderecoDoBanco=enderecobanco;
    nomeCompleto=nomecompleto;
    endereco=enderecocliente;
    temEmprestimoAtivo=tememprestimoativo;
    cpf=numerocpf;
    dataNascimento=datanascimento;
    saldo=saldoemconta;
    retirada = retirada;
    deposito = deposito;
    valorEmprestimo= valoremprestimo;
    quantidadeParcelaEmprestimo=quantidadeparcelaemprestimo;
    valorParcelaEmprestimo=valorparcelaemprestimo;
    
    }
    
    public static void main (String [] args) {
      
     Banco cliente1 = new Banco ( "Bradesco ", "   Rua Anonio Agu 375 ", " Elaine Cristina ", "  Sarah Veloso 1700       ", true, " 175.435.832-15 ", " 10/07/1975 ", 2.540 , 368.39 , 2.356, 1.059, 6, 156);  
     System.out.println( cliente1.nomeDoBanco + cliente1.enderecoDoBanco + cliente1.nomeCompleto + cliente1.endereco + cliente1.temEmprestimoAtivo + cliente1.cpf + cliente1.dataNascimento + cliente1.saldo + cliente1.retirada + cliente1.deposito + cliente1.valorEmprestimo + cliente1.quantidadeParcelaEmprestimo +cliente1.valorParcelaEmprestimo);
      
     Banco cliente2 = new Banco( "Santander ", "  Rua Vera Lima 983 ", "  Giullia Silva ", "    Jardim das Rosas 224    ", true, " 569.368.785-08 ", " 13/06/2000 ", 5.550, 253.78, 1.256, 526.13, 13, 124.02);  
               System.out.println( cliente2.nomeDoBanco + cliente2.enderecoDoBanco + cliente2.nomeCompleto + cliente2.endereco + cliente2.temEmprestimoAtivo + cliente2.cpf + cliente2.dataNascimento + cliente2.saldo + cliente2.retirada + cliente2.deposito + cliente2.valorEmprestimo + cliente2.quantidadeParcelaEmprestimo +cliente2.valorParcelaEmprestimo);


        
    }
    
    }