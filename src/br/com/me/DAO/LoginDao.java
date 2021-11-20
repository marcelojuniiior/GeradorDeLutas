/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import br.com.me.entidade.Login;
import br.com.me.telas.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo jr
 */
public class LoginDao {
   public Connection conexao;
   public PreparedStatement prepararSql;
   public ResultSet resultado;
    
    public boolean verificarLogin(Login login) {
        String sql = "SELECT * from login where usuario =? and senha =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararSql = conexao.prepareStatement(sql);
            prepararSql.setString(1, login.getUsuario());
            prepararSql.setString(2, login.getSenha());
            resultado = prepararSql.executeQuery();
            if(resultado.next()){
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                TelaPrincipal.varUsuario.setText("Bem vindo," + resultado.getString("usuario") + "!");
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao PESQUISAR ARBITRO" + e.getMessage());
        }
        return false;
}
}
    
