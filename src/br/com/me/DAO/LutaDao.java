/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import br.com.me.entidade.Campeonato;
import br.com.me.entidade.Luta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo jr
 */
public class LutaDao {

    Connection conexao;
    PreparedStatement prepararsql;
    ResultSet resultado;

    public ResultSet atletasCampeonato(int id) {
        String sql = "SELECT idatleta as Id,nome,nacionalidade as País,altura,peso as PesoKG,categoria FROM atleta where idcampeonato =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, id);
            return resultado = prepararsql.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR ATLETAS CAMEPEONATO");
        }
        return null;
    }

    public void salvandofase(String nome, Campeonato idcampeonato) {
        String sql = "INSERT INTO fase (nome,idcampeonato) values (?,?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setString(1, nome);
            prepararsql.setInt(2, idcampeonato.getId());
            prepararsql.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR FASE1" + e);
        }
    }

    public ResultSet pesquisandoFase(Campeonato campeonato) {
        String sql = "SELECT idfase from fase where idcampeonato =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, campeonato.getId());
            return resultado = prepararsql.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR ATLETAS CAMEPONATO");
        }
        return null;
    }
    
   
    public void salvandoVencedores1(Luta luta) {
        String sql = "INSERT INTO luta (idfase,idarbitro,idatleta1,idatleta2,idvencedor,idcampeonato) values (?, ? ,? , ?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, luta.getFase());
            prepararsql.setInt(2, luta.getArbitro());
            prepararsql.setInt(3, luta.getAtleta1());
            prepararsql.setInt(4, luta.getAtleta2());
            prepararsql.setInt(5, luta.getVencedor());
            prepararsql.setInt(6, luta.getCampeonato());
            prepararsql.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR VENCEDORES1" + e);
        } finally {
            try {
                FabricaConexao.fecharConexao(conexao, prepararsql, null);
            } catch (SQLException ex) {
                Logger.getLogger(LutaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
     public void salvandoVencedores2(Luta luta) {
        String sql = "INSERT INTO luta2 (atleta1,atleta2,arbitro,fase,idcampeonato,idvencedor) values (?, ? ,? , ?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setString(1, luta.getAtletaa1());
            prepararsql.setString(2, luta.getAtletaa2());
            prepararsql.setString(3, luta.getArbitroo());
            prepararsql.setString(4, luta.getFasee());
            prepararsql.setInt(5, luta.getCampeonato());
            prepararsql.setInt(6, luta.getVencedor());
            
            prepararsql.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR VENCEDORES QUARTAS" + e);
        } finally {
            try {
                FabricaConexao.fecharConexao(conexao, prepararsql, null);
            } catch (SQLException ex) {
                Logger.getLogger(LutaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }

     public ResultSet pesquisandoVencedores1(Campeonato campeonato) {
        String sql = "SELECT * vencedor from luta where fase =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, campeonato.getId());
            return resultado = prepararsql.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO PESQUISAR ATLETAS CAMEPONATO");
        }
        return null;
    }



}
