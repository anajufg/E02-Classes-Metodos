public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.dono.nome = "Ana";
        conta1.agencia = "007";
        conta1.numero = 12345678;
        conta1.saldo = 2000000;
        conta1.limite = 150000;
        conta1.dono.cpf = 87654321;
        conta1.dono.endereco = "Minha casa";
        conta1.dono.idade = 18;
        conta1.dono.sexo = 'm';

        conta1.imprimir();

    }
}