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

    public boolean AdicionarArbitro(Arbitro arbitro) {

        String sql = "INSERT INTO arbitro(nome, dtnascimento, nacionalidade, estado, telefone, cpf, idcampeonato)"
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
            prepararSql.setInt(7, arbitro.getCampeonato());
            int resultado = prepararSql.executeUpdate();
            if(resultado == 1){
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao salvar o Arbitro " + e.getMessage());
        }
        return false;
    }

    public boolean alterarArbitro(Arbitro arbitro) {
        String sql = "UPDATE arbitro SET nome = ?, dtnascimento = ?,"
                + " nacionalidade = ?, estado = ?, telefone = ?, cpf = ? WHERE idarbitro = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, arbitro.getNome());
            prepararSql.setString(2, arbitro.getDtnascimento());
            prepararSql.setString(3, arbitro.getNacionalidade());
            prepararSql.setString(4, arbitro.getEstado());
            prepararSql.setString(5, arbitro.getTelefone());
            prepararSql.setString(6, arbitro.getCpf());
            prepararSql.setInt(7, arbitro.getId());
            int resultadoalt = prepararSql.executeUpdate();
            if(resultadoalt == 1){
               return true; 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar o Arbitro " + e.getMessage());
        }
        return false;
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

    public ResultSet pesquisarArbitro(int id) {
        String sql = "SELECT idarbitro as Id,Nome,nacionalidade as país,Estado,Telefone,Cpf FROM arbitro where idcampeonato =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setInt(1, id);
            resultado = prepararSql.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR ARBITRO" + e.getMessage());
        }
        return resultado;
    }
    public Arbitro pesquisarArbitroCPF(String cpf){
        String sql = "SELECT * from arbitro where cpf =?";
        Arbitro arbitro = null;
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, cpf);
            resultado = prepararSql.executeQuery();
            if(resultado.next()){
               arbitro = new Arbitro();
               arbitro.setId(resultado.getInt("idarbitro"));
               arbitro.setNome(resultado.getString("nome"));
               arbitro.setCampeonato(resultado.getInt("idcampeonato"));
               arbitro.setCpf(resultado.getString("cpf"));
               arbitro.setDtnascimento(resultado.getString("dtnascimento"));
               arbitro.setEstado(resultado.getString("estado"));
               arbitro.setNacionalidade(resultado.getString("nacionalidade"));
               arbitro.setTelefone(resultado.getString("telefone"));
               return arbitro;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR ARBITRO" + e.getMessage());
        }
        return null;
    }

    public boolean DeletarArbitro(int id) {
        String sql = "DELETE FROM arbitro WHERE idarbitro = ?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setInt(1, id);
            int conf = prepararSql.executeUpdate();
            if(conf == 1){
               return true; 
            }
        } catch (Exception e) {
            System.out.println("Erro ao excluir " + e.getMessage());
        }
        return false;
    }

}
