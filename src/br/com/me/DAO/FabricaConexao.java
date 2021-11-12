/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marcelo jr
 */
public class FabricaConexao {

    public static Connection abrirConexao() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcampeonato?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull",
                "root", "admin");
    }

    public static void fecharConexao(Connection con, PreparedStatement psmt, ResultSet resultado) throws SQLException {

        con.close();
        psmt.close();
        if (resultado != null) {
            resultado.close();
        }

    }

}
