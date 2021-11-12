/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import br.com.me.entidade.Campeonato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo jr
 */
public class CampeonatoDao {

    Connection conexao;
    PreparedStatement prepararsql;
    ResultSet resultado;

    public boolean criarCampeonato(Campeonato campeonato) {
        String sql = "INSERT INTO campeonato (nome, logradouro, numero, dtcampeonato, valorinscricao) values (?, ?, ?, ?, ?)";

        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setString(1, campeonato.getNome());
            prepararsql.setString(2, campeonato.getLogradouro());
            prepararsql.setString(3, campeonato.getNumero());
            prepararsql.setString(4, campeonato.getDtcampeonato());
            prepararsql.setDouble(5, campeonato.getValorinscricao());
            prepararsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campeonato criado com Sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("ERRO AO SALVAR" + e);
        }
        return false;
    }

    public boolean alterarCampeonato(Campeonato campeonato) {
        String sql = "UPDATE campeonato set nome =?, logradouro =?, numero =?, dtcampeonato =?, valorinscricao =? WHERE idcampeonato =?";

        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setString(1, campeonato.getNome());
            prepararsql.setString(2, campeonato.getLogradouro());
            prepararsql.setString(3, campeonato.getNumero());
            prepararsql.setString(4, campeonato.getDtcampeonato());
            prepararsql.setDouble(5, campeonato.getValorinscricao());
            prepararsql.setInt(6, campeonato.getId());
            prepararsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Camepeonato Alterado com Sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("ERRO AO ALTERAR" + e);
        }
        return false;
    }

    public Campeonato pesquisarIDCampeonato(Campeonato campeonato) {
        String sql = "SELECT * FROM campeonato where idcampeonato =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, campeonato.getId());
            resultado = prepararsql.executeQuery();
            if (resultado.next()) {
                campeonato = new Campeonato();
                campeonato.setNome(resultado.getString("nome"));
                campeonato.setDtcampeonato(resultado.getString("dtcampeonato"));
                campeonato.setLogradouro(resultado.getString("logradouro"));
                campeonato.setNumero(resultado.getString("numero"));
                campeonato.setValorinscricao(Double.parseDouble(resultado.getString("valorinscricao")));
                return campeonato;
            }
        } catch (Exception e) {
            System.out.println("ERRO AO PESQUISAR" + e);
        }
        return null;
    }

    public boolean deletarCampeonato(Campeonato campeonato) {
        String sql = "DELETE FROM campeonato WHERE idcampeonato=?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, campeonato.getId());
            prepararsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Campeonato Deletado com sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("ERRO AO DELETAR" + e);
        }
        return false;
    }
}
