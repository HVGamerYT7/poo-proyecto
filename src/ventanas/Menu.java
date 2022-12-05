/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author Troxblack
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     * @param parent
     * @param modal
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(parent);
    }

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearCancion = new javax.swing.JButton();
        mostrarPlaylist = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        crearPlaylist = new javax.swing.JButton();
        eliminarCancion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearCancion.setText("Añadir Cancion a una Playlist");
        crearCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCancionActionPerformed(evt);
            }
        });
        getContentPane().add(crearCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 210, -1));

        mostrarPlaylist.setText("Mostar Playlist del Usuario");
        mostrarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarPlaylistActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, -1));

        jButton3.setText("Salir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jButton4.setText("Mostar Datos del Usuario");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 210, -1));

        crearPlaylist.setText("Crear Playlist");
        crearPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPlaylistActionPerformed(evt);
            }
        });
        getContentPane().add(crearPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 210, -1));

        eliminarCancion.setText("Eliminar Cancion de una Playlist");
        eliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCancionActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fc813e57424d1ad9576f9066812f670f.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCancionActionPerformed
        new AñadirCancion(this,true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearCancionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void eliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCancionActionPerformed
        new EliminarCancion(this,true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eliminarCancionActionPerformed

    private void crearPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPlaylistActionPerformed
        new CrearPlayList(this,true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearPlaylistActionPerformed

    private void mostrarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarPlaylistActionPerformed
        new MostrarPlayList(this,true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mostrarPlaylistActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new java.awt.Color(218,48,52));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new java.awt.Color(209,224,238));
    }//GEN-LAST:event_jButton3MouseExited

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearCancion;
    private javax.swing.JButton crearPlaylist;
    private javax.swing.JButton eliminarCancion;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mostrarPlaylist;
    // End of variables declaration//GEN-END:variables
}