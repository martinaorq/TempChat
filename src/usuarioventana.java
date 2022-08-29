
import java.awt.Color;
import java.awt.Frame;

public class usuarioventana extends javax.swing.JFrame {

    cliente c;
    public usuarioventana() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        btnmin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        espacionombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra.setBackground(new java.awt.Color(102, 102, 102));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                barraMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        btncerrar.setBackground(new java.awt.Color(102, 102, 102));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cross-out.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setBorderPainted(false);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncerrar.setOpaque(true);
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncerrarMouseExited(evt);
            }
        });
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnmin.setBackground(new java.awt.Color(102, 102, 102));
        btnmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus-horizontal-straight-line.png"))); // NOI18N
        btnmin.setBorder(null);
        btnmin.setBorderPainted(false);
        btnmin.setContentAreaFilled(false);
        btnmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmin.setOpaque(true);
        btnmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnminMouseExited(evt);
            }
        });
        btnmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 586, Short.MAX_VALUE)
                .addComponent(btnmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnmin, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tempchat.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 362, 210));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NICKNAME:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setForeground(new java.awt.Color(51, 51, 51));
        login.setText("Log in");
        login.setBorder(null);
        login.setContentAreaFilled(false);
        login.setOpaque(true);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 102, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 129, 1));

        espacionombre.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        espacionombre.setForeground(new java.awt.Color(255, 255, 255));
        espacionombre.setBorder(null);
        espacionombre.setOpaque(false);
        espacionombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacionombreActionPerformed(evt);
            }
        });
        jPanel2.add(espacionombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 130, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/beautiful-flowers-bloom-blooming-1028542 (2).jpg"))); // NOI18N
        //Photo by Daniel Spase from Pexels
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -20, 350, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, 690, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered
        btncerrar.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btncerrarMouseEntered

    private void btncerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseExited
        btncerrar.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btncerrarMouseExited

    private void btnminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseEntered
        btnmin.setBackground(new Color(152, 152, 152));
    }//GEN-LAST:event_btnminMouseEntered

    private void btnminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseExited
        btnmin.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnminMouseExited

    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnminActionPerformed

    private void barraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseEntered
        
    }//GEN-LAST:event_barraMouseEntered

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        mousex=evt.getX();
        mousey=evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();

        this.setLocation(x-mousex,y-mousey);
    }//GEN-LAST:event_barraMouseDragged

    private void espacionombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacionombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacionombreActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       c=new cliente();
       c.setNombre(espacionombre.getText());
       c.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(usuarioventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuarioventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuarioventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuarioventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuarioventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnmin;
    private javax.swing.JTextField espacionombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
    private int mousex,mousey;
}
