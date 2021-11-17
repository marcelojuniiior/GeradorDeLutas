/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.me.telas;

import br.com.me.DAO.CampeonatoDao;
import br.com.me.entidade.Campeonato;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo.barbosa
 */
public class CriarCampeonato extends javax.swing.JInternalFrame {

    /**
     * Creates new form CriarCampeonato
     */
    public CriarCampeonato() {
        initComponents();

    }
    CampeonatoDao campeonatoDao = new CampeonatoDao();
    Campeonato campeonato = new Campeonato();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        titulo = new javax.swing.JLabel();
        LOGO = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        logradouro = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        varNome = new javax.swing.JTextField();
        varLogradouro = new javax.swing.JTextField();
        varNumero = new javax.swing.JTextField();
        varID = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        btDeletar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        varDtCampeonato = new javax.swing.JFormattedTextField();
        varValorInscricao = new javax.swing.JFormattedTextField();
        btPesquisar = new javax.swing.JButton();
        Aberto = new javax.swing.JRadioButton();
        Fechado = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 102, 102));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("                      Campeonato");
        kGradientPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 340, 64));

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/me/icones/icone trofeu.png"))); // NOI18N
        kGradientPanel1.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        nome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome:");
        kGradientPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 23));

        logradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logradouro.setForeground(new java.awt.Color(255, 255, 255));
        logradouro.setText("Logradouro:");
        kGradientPanel1.add(logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 23));

        data.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setText("Data:");
        kGradientPanel1.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 23));

        numero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numero.setForeground(new java.awt.Color(255, 255, 255));
        numero.setText("Numero:");
        kGradientPanel1.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 23));

        valor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valor.setForeground(new java.awt.Color(255, 255, 255));
        valor.setText("Valor de inscrição:");
        kGradientPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 23));

        varNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNomeActionPerformed(evt);
            }
        });
        kGradientPanel1.add(varNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 300, -1));

        varLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varLogradouroActionPerformed(evt);
            }
        });
        kGradientPanel1.add(varLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 300, -1));
        kGradientPanel1.add(varNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 300, -1));
        kGradientPanel1.add(varID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 260, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID:");
        kGradientPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));
        kGradientPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 490, 10));
        kGradientPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 500, 10));

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/me/icones/icone Excluir.png"))); // NOI18N
        btDeletar.setBorder(null);
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/me/icones/icone editar.png"))); // NOI18N
        btEditar.setBorder(null);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/me/icones/icone adicionar.png"))); // NOI18N
        btAdicionar.setBorder(null);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 60, -1));

        try {
            varDtCampeonato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        kGradientPanel1.add(varDtCampeonato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 300, -1));

        varValorInscricao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        kGradientPanel1.add(varValorInscricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 300, -1));

        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/me/icones/icone pesquisar.png"))); // NOI18N
        btPesquisar.setBorder(null);
        btPesquisar.setBorderPainted(false);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 30, 30));

        buttonGroup1.add(Aberto);
        Aberto.setText("Aberto");
        Aberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbertoActionPerformed(evt);
            }
        });
        kGradientPanel1.add(Aberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        buttonGroup1.add(Fechado);
        Fechado.setText("Fechado");
        kGradientPanel1.add(Fechado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 510, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void varNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNomeActionPerformed

    private void varLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varLogradouroActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        if (!validandoCampeonato()) {
            campeonato.setNome(varNome.getText().trim());
            campeonato.setDtcampeonato(varDtCampeonato.getText().trim());
            campeonato.setLogradouro(varLogradouro.getText().trim());
            campeonato.setNumero(varNumero.getText().trim());
            String valorinsc = varValorInscricao.getText().trim();
            String valorconvertido = valorinsc.replace(",", ".");
            campeonato.setValorinscricao(Double.parseDouble(valorconvertido));
            campeonato.setCondicao(Aberto.isSelected());
            
            
            
            boolean sCamp = campeonatoDao.criarCampeonato(campeonato);
            if(sCamp == true){
                limparcampos();
            }
        }


    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String valorid = varID.getText().trim();
        if(valorid.equals("")){
            JOptionPane.showMessageDialog(null, "Digite o ID!");
        }
        campeonato.setId(Integer.parseInt(varID.getText().trim()));
        Campeonato pesquisa = campeonatoDao.pesquisarIDCampeonato(campeonato);
        if(pesquisa == null){
             JOptionPane.showMessageDialog(null, "Nenhum campeonato foi encontrado");
        }
        varNome.setText(pesquisa.getNome());
        varDtCampeonato.setText(pesquisa.getDtcampeonato());
        varNumero.setText(pesquisa.getNumero());
        varLogradouro.setText(pesquisa.getLogradouro());
        String valorInscricao = pesquisa.getValorinscricao().toString();
        String valorconvertido = valorInscricao.replace(".", ",");
        varValorInscricao.setText(valorconvertido);
        
        
        
        btAdicionar.setEnabled(false);
        
        
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if (!validandoCampeonato()) {
            campeonato.setNome(varNome.getText().trim());
            campeonato.setDtcampeonato(varDtCampeonato.getText().trim());
            campeonato.setLogradouro(varLogradouro.getText().trim());
            campeonato.setNumero(varNumero.getText().trim());
            String valorinsc = varValorInscricao.getText().trim();
            String valorconvertido = valorinsc.replace(",", ".");
            campeonato.setValorinscricao(Double.parseDouble(valorconvertido));

            boolean alterar = campeonatoDao.alterarCampeonato(campeonato);
            if (alterar) {
                btAdicionar.setEnabled(true);
                limparcampos();
            }
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        int excluir = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir esse Campeonato?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            String id = varID.getText().trim();
            campeonato.setId(Integer.parseInt(id));

            boolean deletarCamp = campeonatoDao.deletarCampeonato(campeonato);
            if (deletarCamp) {
                limparcampos();
            }
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void AbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbertoActionPerformed

    public void limparcampos() {
        varID.setText("");
        varDtCampeonato.setText("");
        varLogradouro.setText("");
        varNome.setText("");
        varNumero.setText("");
        varValorInscricao.setText("");
    }

    public boolean validandoCampeonato() {

        if (validandoNome()) {
            JOptionPane.showMessageDialog(null, "Digite um nome Válido !!");
            return true;
        }
        if (validandoData()) {
            JOptionPane.showMessageDialog(null, "Digite uma Data Válida !!");
            return true;
        }
        if (validandoLogradouro()) {
            JOptionPane.showMessageDialog(null, "Digite um Logradouro Válido !!");
            return true;
        }
        if (validandoNumero()) {
            JOptionPane.showMessageDialog(null, "Digite um Numero Válido !!");
            return true;
        }

        if (validandoInscricao()) {
            JOptionPane.showMessageDialog(null, "Digite um Valor Válido !!");
            return true;
        }

        return false;
    }

    public boolean validandoInscricao() {
        String valorInscricao = varValorInscricao.getText().trim();
        if (valorInscricao.equals("")) {
            return true;
        } else {
            String valorconvertido = valorInscricao.replace(",", ".");
            Double valorconvertido2 = Double.parseDouble(valorconvertido);
            if (valorconvertido2 <= 0) {
                return true;
            }
        }
        return false;
    }

    public boolean validandoNumero() {
        String numero = varNumero.getText().trim();
        if (numero.equals("") || numero.equals("0")) {
            return true;
        }
        return false;
    }

    public boolean validandoLogradouro() {
        String logradouro = varLogradouro.getText().trim();
        if (logradouro.equals("") || logradouro.length() < 4) {
            return true;
        }
        return false;
    }

    public boolean validandoNome() {
        String nome = varNome.getText().trim();
        if (nome.equals("") || nome.length() < 3) {
            return true;
        }
        return false;
    }

    public boolean validandoData() {
        String data = varDtCampeonato.getText().trim();
        int ultimoIndiceData = data.length() - 1;
        char ultimoValor = data.charAt(ultimoIndiceData);
        if (ultimoValor == '/') {
            return true;
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Aberto;
    private javax.swing.JRadioButton Fechado;
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel data;
    private javax.swing.JLabel id;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel logradouro;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel valor;
    private javax.swing.JFormattedTextField varDtCampeonato;
    private javax.swing.JTextField varID;
    private javax.swing.JTextField varLogradouro;
    private javax.swing.JTextField varNome;
    private javax.swing.JTextField varNumero;
    private javax.swing.JFormattedTextField varValorInscricao;
    // End of variables declaration//GEN-END:variables
}