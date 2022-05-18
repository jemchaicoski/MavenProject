/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.edu.br.trabalhomavenprog4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author joao.chaicoski
 */
@Entity
@Table(name = "pgm4_joao_chaicoski_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pgm4_joao_chaicoski_pedido_seq")
    @SequenceGenerator(name = "pgm4_joao_chaicoski_pedido_seq", initialValue = 1)
    private Long id;
    private String produto;
    private int quantidade;
    @OneToOne
    private Pessoa pessoa;

    public Pedido(String produto, int quantidade, Pessoa pessoa) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.pessoa = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + ", pessoa=" + pessoa + '}';
    }
    
}
