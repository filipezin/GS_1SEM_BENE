package br.com.iaqua;

import br.com.iaqua.model.Cliente.*;
import br.com.iaqua.model.Planta.Fruto;
import br.com.iaqua.model.Planta.Gorduras;
import br.com.iaqua.model.Planta.Nutricao;
import br.com.iaqua.model.Planta.TipoFruto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
        EntityManager manager = factory.createEntityManager();

        PessoaFisica pf = new PessoaFisica();
        pf.setCpf("4334455344")
                .setDtNascimento(LocalDate.now())
                .setFilhos(null)
                .setEstadoCivil(EstadoCivil.CASADO)
                .setRendaMedia(5000.00)
                .setRendaPerCapita(5000.00)
                .setSexo(Sexo.MASCULINO)
                .setNome("Filipe")
                .setTelefone("123123123")
                .setEndereco("endereco")
                .setEmail("email")
                .setDtContratacaoServico(LocalDate.now())
                .setSenha("xablau");


        PessoaJuridica pj = new PessoaJuridica();
        pj.setCnpj("123123")
                .setNome("Banco do Brasil")
                .setEmail("bb@bb.com.br")
                .setDtContratacaoServico(LocalDate.now())
                .setEndereco("Rua BB")
                .setTelefone("123124124")
                .setSenha("xablei");

        Gorduras gorduras = new Gorduras();
        gorduras.setMonoinsaturada(0.023)
                .setPoliinsaturada(0.061)
                .setSaturada(0.021);

        Nutricao nutricao = new Nutricao();
        nutricao.setCarboidrato(1.76)
                .setProteina(0.40)
                .setGordura(gorduras)
                .setPorcao(45.00)
                .setKcal(8.00);

        Fruto tomate = new Fruto();
        tomate.setNomeFruto("Tomate")
                .setTipo(TipoFruto.FRUTA)
                .setFenotipo("Tomate-Cereja")
                .setTabelaNutricional(nutricao);



        try{

            manager.getTransaction().begin();
            manager.persist(pf);
            manager.persist(pj);
            manager.persist(tomate);
            manager.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            manager.close();
            factory.close();
        }

    }
}
