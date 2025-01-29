package ifba.edu.br.principal;

import java.util.List;

import ifba.edu.br.basicas.Categoria;
import ifba.edu.br.basicas.Cliente;
import ifba.edu.br.basicas.Endereco;
import ifba.edu.br.basicas.Produto;
import ifba.edu.br.basicas.Venda;
import ifba.edu.br.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {
    public static void main(String[] args) {
      
    EntityManager em = GetEntityManager.getConnectionJpa();
        Categoria c = new Categoria("Categoria Teste");
        Categoria c2 = new Categoria("teste 2");

         //em.getTransaction().begin();
        //em.persist(e);
        //em.getTransaction().commit();



    Endereco e = new Endereco ();
    e.setRua("Rua Teste");
    e.setBairro("Bairro Teste");
    e.setCep("123456");
    e.setCidade("Cidade Teste");
    e.setEstado("Estado Teste");
    e.setNumero("123");
   // e.setCliente(em.find(Cliente.class,1));


        //em.getTransaction().begin();
        //em.persist(e);
        //em.getTransaction().commit();



       Cliente cli =new Cliente ();
       cli.setNome("vinicius");
       cli.setCpf("552444222");
       cli.setRg("5656578");
    //   cli.setCategoria(em.find(Categoria.class,1));

       //cli =  em.find(Cliente.class, 1);
      
       Cliente cli2 =new Cliente ();
       cli2.setNome("ana");
       cli2.setCpf("5367433");
       cli2.setRg("233984");
      // cli2.setCategoria(em.find(Categoria.class,2));

      
   /*    em.getTransaction().begin();
       em.persist(cli);
       em.getTransaction().commit();
*/

//List<Cliente> list = em.createQuery("select cli form Cliente cli", Cliente.class).getResultList();

       
        
       // System.out.println("Categoria encontrada:" + em.find(Categoria.class,1));

Produto p1 = new Produto();
p1.setDescricao("Descrição do produto 1");
p1.setEstoque(2);
p1.setValor(10.0);


Venda v1 = new Venda();
v1.setDescricao("nshbdhjw");
v1.getProdutos().add(p1);
p1.getVendas().add(v1);

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(v1);
        em.getTransaction().commit();

        //list.forEach(System.out::println);


    }
    
    
}

