/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import br.com.me.entidade.Arbitro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo.barbosa
 */
public class ArbitroDao {

    private Connection conexao;
    private PreparedStatement prepararSql;
    private ResultSet resultado;

    public void AdicionarArbitro(Arbitro arbitro) {

        String sql = "INSERT INTO arbitro(nome, dtnascimento, nacionalidade, estado, telefone, cpf, campeonato)"
                + " values(?, ?, ?, ?, ?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, arbitro.getNome());
            prepararSql.setString(2, arbitro.getDtnascimento());
            prepararSql.setString(3, arbitro.getNacionalidade());
            prepararSql.setString(4, arbitro.getEstado());
            prepararSql.setString(5, arbitro.getTelefone());
            prepararSql.setString(6, arbitro.getCpf());
            prepararSql.setString(7, arbitro.getCampeonato());
            prepararSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao salvar o Arbitro " + e.getMessage());
        }
    }

    public void alterarArbitro(Arbitro arbitro) {
        String sql = "UPDATE arbitro SET nome = ?, nascimento = ?,"
                + " nacionalidade = ?, estado = ? WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, arbitro.getNome());
            prepararSql.setString(2, arbitro.getDtnascimento());
            prepararSql.setString(3, arbitro.getNacionalidade());
            prepararSql.setString(4, arbitro.getEstado());
            prepararSql.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao alterar o Arbitro " + e.getMessage());
        }
    }

    public List<Arbitro> pesquisarPorNome(String nome) {
        String consulta = "SELECT * FROM arbitro WHERE"
                + " nome LIKE ?";
        Arbitro arbitro;
        List<Arbitro> arbitros = new ArrayList<>();
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
            prepararSql.setString(1, "%" + nome + "%");
            resultado = prepararSql.executeQuery();
            while (resultado.next()) {
                arbitro = new Arbitro();
                arbitro.setId(resultado.getInt("id"));
                arbitro.setNome(resultado.getString("nome"));
                arbitro.setDtnascimento(resultado.getString("Data Nascimento"));
                arbitro.setEstado(resultado.getString("Estado"));
                arbitro.setNacionalidade(resultado.getString("Nacionalidade"));

                arbitros.add(arbitro);
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar arbitro por"
                    + " nome " + e.getMessage());
        }
        return arbitros;
    }

    public ResultSet pesquisarArbitro() {
        String sql = "SELECT idarbitro as id,nome,dtnascimento as nasc,nacionalidade as país,estado,telefone,cpf FROM arbitro";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            resultado = prepararSql.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao BUSCAR CLIENTE" + e.getMessage());
        }
        return resultado;
    }

    public void excluir(int id) {
        String sql = "DELETE FROM arbitro WHERE id = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setInt(1, id);
            int x = prepararSql.executeUpdate();
            System.out.println("XXX " + x);
        } catch (Exception e) {
            System.out.println("Erro ao excluir " + e.getMessage());
        }
    }

}
