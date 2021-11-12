/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.DAO;

import br.com.me.entidade.Campeonato;
import javafx.scene.Camera;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo jr
 */
public class CampeonatoDaoTest {
    
    public CampeonatoDaoTest() {
    }

    @Test
    public void testCriarCampeonato() {
        System.out.println("criarCampeonato");
        Campeonato campeonato = new Campeonato("Futebol", "rua doze", "123", "29/11/2021", 29.00);
        CampeonatoDao campeonatoDao = new CampeonatoDao();
        campeonatoDao.criarCampeonato(campeonato);
        
    }
    
}
