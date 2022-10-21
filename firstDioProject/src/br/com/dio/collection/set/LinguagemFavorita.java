package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String Ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        Ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return Ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", Ide='" + Ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && Ide.equals(that.Ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, Ide);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        int nome = this.getNome().compareTo(linguagem.getNome());
        if(nome!=0) return nome;
        return Integer.compare(this.getAnoDeCriacao(), linguagem.getAnoDeCriacao());

    }


}
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(ano != 0) return ano;
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(ano != 0) return ano;
        return l1.getIde().compareTo(l2.getIde());
    }
}





