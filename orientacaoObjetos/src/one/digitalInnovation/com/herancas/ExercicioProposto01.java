package one.digitalInnovation.com.herancas;

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
//      *** Upcast ***
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

//        *** Downcast ***
//        Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}

class Funcionario{

}

class Vendedor extends Funcionario{

}

class Gerente extends Funcionario{

}

class Faxineiro extends Funcionario{

}
