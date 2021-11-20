/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import br.com.me.entidade.Atleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo.barbosa
 */
public class AtletaDao {

    private Connection conexao;
    private PreparedStatement prepararSql;
    private ResultSet resultado;

    public boolean adicionarAtleta(Atleta atleta) throws SQLException {

        String sql = "INSERT INTO atleta(nome, dtnascimento, altura, peso,"
                + "nacionalidade, estado, categoria, cpf, telefone, idcampeonato)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, atleta.getNome());
            prepararSql.setString(2, atleta.getNascimento());
            prepararSql.setDouble(3, atleta.getAltura());
            prepararSql.setDouble(4, atleta.getPeso());
            prepararSql.setString(5, atleta.getNacionalidade());
            prepararSql.setString(6, atleta.getEstado());
            prepararSql.setString(7, atleta.getCategoria());
            prepararSql.setString(8, atleta.getCpf());
            prepararSql.setString(9, atleta.getTelefone());
            prepararSql.setInt(10, atleta.getCampeonato());
            prepararSql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atleta adicionado com sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao salvar o Atleta " + e.getMessage());
        } finally {
            FabricaConexao.fecharConexao(conexao, prepararSql, null);

        }
        return false;
    }

    public boolean alterarAtleta(Atleta atleta) {
        String sql = "UPDATE atleta SET nome = ?, dtnascimento = ?,"
                + " altura = ?, peso = ?, nacionalidade = ?, estado = ?, categoria = ?, cpf = ?, telefone = ?, campeonato = ? WHERE idatleta = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, atleta.getNome());
            prepararSql.setString(2, atleta.getNascimento());
            prepararSql.setDouble(3, atleta.getAltura());
            prepararSql.setDouble(4, atleta.getPeso());
            prepararSql.setString(5, atleta.getNacionalidade());
            prepararSql.setString(6, atleta.getEstado());
            prepararSql.setString(7, atleta.getCategoria());
            prepararSql.setString(8, atleta.getCpf());
            prepararSql.setString(9, atleta.getTelefone());
            prepararSql.setInt(10, atleta.getCampeonato());
            prepararSql.setInt(11, atleta.getId());
            prepararSql.executeUpdate();
            JOptionPane.showMessageDialog(null, "atleta alterado com sucesso");
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao alterar o Atleta " + e.getMessage());
        }
        return false;
    }

    public Atleta pesquisarCPF(String cpf) {
        String consulta = "SELECT * FROM atleta WHERE cpf =?";
        Atleta atleta = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(consulta);
            prepararSql.setString(1, cpf);
            resultado = prepararSql.executeQuery();
            if (resultado.next()) {
                atleta = new Atleta();
                atleta.setId(resultado.getInt("idatleta"));
                atleta.setNome(resultado.getString("nome"));
                atleta.setNascimento(resultado.getString("dtnascimento"));
                atleta.setEstado(resultado.getString("Estado"));
                atleta.setNacionalidade(resultado.getString("Nacionalidade"));
                atleta.setAltura(resultado.getDouble("Altura"));
                atleta.setPeso(resultado.getDouble("Peso"));
                atleta.setCategoria(resultado.getString("Categoria"));
                atleta.setCpf(resultado.getString("Cpf"));
                atleta.setTelefone(resultado.getString("Telefone"));
                atleta.setCampeonato(resultado.getInt("campeonato"));
                return atleta;
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar Atletas por CPF " + e.getMessage());
        }
        return null;
    }
    
    public void excluir(int id) {
        String sql = "DELETE FROM atleta WHERE idatleta = ?";
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
