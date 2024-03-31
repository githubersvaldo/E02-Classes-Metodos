public class main {

    public static void imprimir(Conta conta1){
    System.out.println("Nome do Cliente: " + conta1.dono.nome);
    System.out.println("CPF do Cliente: " + conta1.dono.CPF);
        if (conta1.dono.sexo == 'm') {
            System.out.println("Sexo do Cliente: Masculino");
        } else if (conta1.dono.sexo == 'f') {
            System.out.println("Sexo do Cliente: Feminino");
        }
        System.out.println("Endereço do Cliente: " + conta1.dono.endereco);
        System.out.println("Idade do Cliente: " + conta1.dono.idade);
        System.out.println("Número da conta: " + conta1.numero);
    System.out.printf("Saldo atual: %.2f\n",conta1.saldo);
    System.out.printf("Limite: %.2f\n",conta1.limite);
    }
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.dono.nome = "João";
        conta1.dono.sexo = 'm';
        conta1.dono.idade = 25;
        conta1.dono.CPF = "123456789-10";
        conta1.dono.endereco = "Rua Deu Ruim nº30 Bairro Vaida Bom";
        conta1.agencia = "222-2";
        conta1.numero = 1234;
        conta1.saldo = 2000;
        conta1.limite = conta1.saldo + 500;
        imprimir(conta1);

    }
}
