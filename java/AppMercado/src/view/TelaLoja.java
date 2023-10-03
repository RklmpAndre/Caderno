/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.entity.Produto;
import persist.ProdutoDAO;

/**
 *
 * @author andre
 */
public class TelaLoja extends javax.swing.JFrame {

    ProdutoDAO prDAO;
    
    public TelaLoja() {
        prDAO = ProdutoDAO.getInstance();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JTable();
        conteudoPanel = new javax.swing.JPanel();
        produtosPanel = new javax.swing.JPanel();
        produtoLabel = new javax.swing.JLabel();
        produtosCamboBox = new javax.swing.JComboBox<>();
        qntLabel = new javax.swing.JLabel();
        qntTextField = new javax.swing.JFormattedTextField();
        adicionarButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();
        valorLabel = new javax.swing.JLabel();
        valorTextField = new javax.swing.JTextField();
        finalizacaoPanel = new javax.swing.JPanel();
        enderecosLabel = new javax.swing.JLabel();
        enderecos = new javax.swing.JComboBox<>();
        pagamentoLabel = new javax.swing.JLabel();
        creditoRadioBtn = new javax.swing.JRadioButton();
        debitoRadioBtn = new javax.swing.JRadioButton();
        pixRadioBtn = new javax.swing.JRadioButton();
        finalizarButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        perfilMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        administradorMenu = new javax.swing.JMenu();
        abaProdutoMenu = new javax.swing.JMenuItem();
        abaUsuarioMenu = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IFRSTORE Supermercados");
        setResizable(false);

        carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carrinho.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(carrinho);
        if (carrinho.getColumnModel().getColumnCount() > 0) {
            carrinho.getColumnModel().getColumn(0).setResizable(false);
            carrinho.getColumnModel().getColumn(1).setResizable(false);
            carrinho.getColumnModel().getColumn(2).setResizable(false);
        }

        conteudoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        produtosPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        produtoLabel.setText("Produto");

        produtosCamboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        produtosCamboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtosCamboBoxActionPerformed(evt);
            }
        });

        qntLabel.setText("Quantidade");

        qntTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        adicionarButton.setText("Adicionar no Carrinho");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        removerButton.setText("Remover do Carrinho");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        valorLabel.setText("Valor total");

        valorTextField.setEditable(false);

        javax.swing.GroupLayout produtosPanelLayout = new javax.swing.GroupLayout(produtosPanel);
        produtosPanel.setLayout(produtosPanelLayout);
        produtosPanelLayout.setHorizontalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(produtosCamboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtoLabel))
                .addGap(18, 18, 18)
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(produtosPanelLayout.createSequentialGroup()
                        .addComponent(qntTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarButton)
                        .addGap(18, 18, 18)
                        .addComponent(removerButton))
                    .addComponent(qntLabel))
                .addGap(102, 102, 102)
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorLabel))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        produtosPanelLayout.setVerticalGroup(
            produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(produtosPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(produtosPanelLayout.createSequentialGroup()
                        .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qntLabel)
                            .addComponent(produtoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(produtosCamboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qntTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(produtosPanelLayout.createSequentialGroup()
                        .addComponent(valorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(produtosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarButton)
                            .addComponent(removerButton)
                            .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        finalizacaoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        enderecosLabel.setText("Endereços");

        enderecos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        pagamentoLabel.setText("Forma de pagamento");

        creditoRadioBtn.setText("Cartão de débito");

        debitoRadioBtn.setText("Cartão de crédito");

        pixRadioBtn.setText("PIX");

        finalizarButton.setText("Finalizar Compra");

        javax.swing.GroupLayout finalizacaoPanelLayout = new javax.swing.GroupLayout(finalizacaoPanel);
        finalizacaoPanel.setLayout(finalizacaoPanelLayout);
        finalizacaoPanelLayout.setHorizontalGroup(
            finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalizacaoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enderecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecosLabel))
                .addGap(58, 58, 58)
                .addGroup(finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagamentoLabel)
                    .addComponent(pixRadioBtn)
                    .addGroup(finalizacaoPanelLayout.createSequentialGroup()
                        .addGroup(finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditoRadioBtn)
                            .addComponent(debitoRadioBtn))
                        .addGap(58, 58, 58)
                        .addComponent(finalizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        finalizacaoPanelLayout.setVerticalGroup(
            finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalizacaoPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enderecosLabel)
                    .addComponent(pagamentoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finalizacaoPanelLayout.createSequentialGroup()
                        .addComponent(finalizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(finalizacaoPanelLayout.createSequentialGroup()
                        .addGroup(finalizacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enderecos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(debitoRadioBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(creditoRadioBtn)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addComponent(pixRadioBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout conteudoPanelLayout = new javax.swing.GroupLayout(conteudoPanel);
        conteudoPanel.setLayout(conteudoPanelLayout);
        conteudoPanelLayout.setHorizontalGroup(
            conteudoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteudoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalizacaoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        conteudoPanelLayout.setVerticalGroup(
            conteudoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(produtosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalizacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        perfilMenu.setText("Perfil");

        jMenuItem1.setText("Historico de Compras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        perfilMenu.add(jMenuItem1);

        jMenuItem2.setText("Endereços");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        perfilMenu.add(jMenuItem2);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        perfilMenu.add(jMenuItem3);

        jMenuBar1.add(perfilMenu);

        administradorMenu.setText("Administrador");

        abaProdutoMenu.setText("Adicionar ou remover produtos");
        abaProdutoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaProdutoMenuActionPerformed(evt);
            }
        });
        administradorMenu.add(abaProdutoMenu);

        abaUsuarioMenu.setText("Adicionar ou remover usuarios");
        abaUsuarioMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abaUsuarioMenuActionPerformed(evt);
            }
        });
        administradorMenu.add(abaUsuarioMenu);

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        administradorMenu.add(jMenuItem4);

        jMenuBar1.add(administradorMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteudoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteudoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removerButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        String produtoSelecionado = (String) produtosCamboBox.getSelectedItem();
        carrinho.add(produtosCamboBox);
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void produtosCamboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtosCamboBoxActionPerformed
        produtosCamboBox.removeAllItems();
        
        
        
                
    }//GEN-LAST:event_produtosCamboBoxActionPerformed

    private void abaProdutoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaProdutoMenuActionPerformed
    }//GEN-LAST:event_abaProdutoMenuActionPerformed

    private void abaUsuarioMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abaUsuarioMenuActionPerformed
    }//GEN-LAST:event_abaUsuarioMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoja().setVisible(true);
            }
        });
    }
    
    public void setTableModel(Object[][] rowData, Object[] columnNames) {
        DefaultTableModel tableModel = new DefaultTableModel(rowData, columnNames);
        carrinho.setModel(tableModel); //define o modelo para a criação da tabela
        carrinho.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abaProdutoMenu;
    private javax.swing.JMenuItem abaUsuarioMenu;
    private javax.swing.JButton adicionarButton;
    private javax.swing.JMenu administradorMenu;
    private javax.swing.JTable carrinho;
    private javax.swing.JPanel conteudoPanel;
    private javax.swing.JRadioButton creditoRadioBtn;
    private javax.swing.JRadioButton debitoRadioBtn;
    private javax.swing.JComboBox<String> enderecos;
    private javax.swing.JLabel enderecosLabel;
    private javax.swing.JPanel finalizacaoPanel;
    private javax.swing.JButton finalizarButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pagamentoLabel;
    private javax.swing.JMenu perfilMenu;
    private javax.swing.JRadioButton pixRadioBtn;
    private javax.swing.JLabel produtoLabel;
    private javax.swing.JComboBox<String> produtosCamboBox;
    private javax.swing.JPanel produtosPanel;
    private javax.swing.JLabel qntLabel;
    private javax.swing.JFormattedTextField qntTextField;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel valorLabel;
    private javax.swing.JTextField valorTextField;
    // End of variables declaration//GEN-END:variables
}
