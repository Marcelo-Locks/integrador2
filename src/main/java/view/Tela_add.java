/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.ControllerLivro;
import javax.swing.JOptionPane;


/**
 *
 * @author guilh
 */
public class Tela_add extends javax.swing.JFrame {

    /**
     * Creates new form Tela_add
     */
    public Tela_add() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_genero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_editora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        input_numero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        input_autor = new javax.swing.JTextField();
        button_add = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        input_isbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_ano = new javax.swing.JTextField();
        button_editar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Área do Professor Senac");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 10, 250, 26);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Título:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 50, 80, 26);

        input_titulo.setText("A bela e a fera");
        input_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tituloActionPerformed(evt);
            }
        });
        getContentPane().add(input_titulo);
        input_titulo.setBounds(120, 80, 270, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gênero:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 170, 80, 26);

        input_genero.setText("terror");
        getContentPane().add(input_genero);
        input_genero.setBounds(120, 200, 270, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Editora:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 230, 80, 26);

        input_editora.setText("A culpa é do cabral");
        getContentPane().add(input_editora);
        input_editora.setBounds(120, 260, 270, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Número de Páginas:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 410, 200, 30);

        input_numero.setText("58");
        getContentPane().add(input_numero);
        input_numero.setBounds(120, 440, 270, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Autor:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(120, 110, 80, 26);

        input_autor.setText("Marcelo");
        getContentPane().add(input_autor);
        input_autor.setBounds(120, 140, 270, 30);

        button_add.setText("Adicionar");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });
        getContentPane().add(button_add);
        button_add.setBounds(120, 480, 110, 23);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ISBN:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 290, 80, 30);

        input_isbn.setText("789-879-498");
        getContentPane().add(input_isbn);
        input_isbn.setBounds(120, 320, 270, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ano de Publicação:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 350, 200, 30);

        input_ano.setText("2020-10-10");
        getContentPane().add(input_ano);
        input_ano.setBounds(120, 380, 270, 30);

        button_editar.setText("Editar");
        getContentPane().add(button_editar);
        button_editar.setBounds(280, 480, 110, 23);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-120, 0, 650, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        
        boolean sucesso;
        String titulo = input_titulo.getText();
        String autor = input_autor.getText();
        String genero = input_genero.getText();
        String editora = input_editora.getText();
        String isbn = input_isbn.getText();
        String anoPublicacao = input_ano.getText();
        String numeroPaginas = input_numero.getText();
        

        
        try {
            //instanciando a variavel controllerLivro
            ControllerLivro controllerLivro = new ControllerLivro ();
            sucesso = controllerLivro.cadastrarLivro(titulo, autor, genero, editora, isbn, anoPublicacao, numeroPaginas);

            if (sucesso){

                JOptionPane.showInternalMessageDialog(null, "Sucesso ao cadstrar Livro!");

            }else{

            JOptionPane.showMessageDialog(null, "Dados incorretos");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
 
    }//GEN-LAST:event_button_addActionPerformed

    private void input_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tituloActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton button_add;
    private javax.swing.JToggleButton button_editar;
    private javax.swing.JTextField input_ano;
    private javax.swing.JTextField input_autor;
    private javax.swing.JTextField input_editora;
    private javax.swing.JTextField input_genero;
    private javax.swing.JTextField input_isbn;
    private javax.swing.JTextField input_numero;
    private javax.swing.JTextField input_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
