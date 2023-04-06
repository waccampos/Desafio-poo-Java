package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "br.com.dio.desafio.Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getTitulo() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_padrao + 20;
    }
}
