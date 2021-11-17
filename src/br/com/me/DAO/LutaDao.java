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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo jr
 */
public class LutaDao {

    Connection conexao;
    PreparedStatement prepararsql;
    ResultSet resultado;

    public ResultSet atletasCampeonato(int id){
       String sql = "SELECT idatleta as Id,nome,nacionalidade as País,altura,peso as PesoKG,categoria FROM atleta where campeonato =?";
        try {
            conexao = FabricaConexao.abrirConexao();
            prepararsql = conexao.prepareStatement(sql);
            prepararsql.setInt(1, id);
            return resultado = prepararsql.executeQuery();
                      
        } catch (Exception e) {
        }
        return null;
    } 
    }
//    public List<Atleta> atletasCampeonato(int id) {
//        String sql = "SELECT * FROM atleta where campeonato =?";
//        Atleta atleta;
//        List<Atleta>atletas = new ArrayList<>();
//        try {
//            conexao = FabricaConexao.abrirConexao();
//            prepararsql = conexao.prepareStatement(sql);
//            prepararsql.setInt(1, id);
//            resultado = prepararsql.executeQuery();
//            while (resultado.next()) {
//                atleta = new Atleta();
//                atleta.setId(resultado.getInt("idatleta"));
//                atleta.setNome(resultado.getString("nome"));
//                atleta.setNacionalidade(resultado.getString("nacionalidade"));
//                atleta.setAltura(Double.parseDouble(resultado.getString("altura")));
//                atleta.setPeso(Double.parseDouble(resultado.getString("peso")));
//                atleta.setCategoria(resultado.getString("categoria"));
//                atletas.add(atleta);
//            }
//            return atletas;
//        } catch (Exception e) {
//        }
//        return null;
//    }

