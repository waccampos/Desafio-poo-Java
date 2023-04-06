package br.com.dio.desafio;

public class Curso extends Conteudo {
    private int cargahoraria;


    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "br.com.dio.desafio.Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_padrao * cargahoraria;
    }
}

