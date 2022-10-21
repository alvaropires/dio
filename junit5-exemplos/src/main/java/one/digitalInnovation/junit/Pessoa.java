package one.digitalInnovation.junit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }


    public String getNome() {
        return nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public Integer getIdade() {
        return (int) ChronoUnit.YEARS.between(this.nascimento, LocalDateTime.now());
    }

    public boolean ehMaiorDeIdade(){
        if(this.getIdade()> 18) {
            return true;
        }
        return false;
    }
}
