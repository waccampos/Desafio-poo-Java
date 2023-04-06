package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do js");
        curso2.setCargahoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria js");
        mentoria1.setDescricao("descrição do Mentoria js");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java developer");
        bootcamp1.setDescricao("descrição Bootcamp Jaa Deeloper");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Devs dev1 = new Devs();
        dev1.setNome("willams");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("conteudo inscritos" + dev1.getConteudosInscritos());
        dev1.progredindo();
        System.out.println("conteudo conclidos" + dev1.getConteudosconcluidos());
        System.out.println("xp:"+dev1.calcularTotalXp());

        System.out.println("-----------------------");

        Devs dev2 = new Devs();
        dev2.setNome("matheus");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("conteudo inscritos" + dev2.getConteudosInscritos());
        dev2.progredindo();
        dev2.progredindo();
        dev2.progredindo();
        System.out.println("conteudo conclidos" + dev2.getConteudosconcluidos());
        System.out.println("xp:"+dev2.calcularTotalXp());






    }



}