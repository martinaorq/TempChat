import java.awt.*;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class cliente extends javax.swing.JFrame implements Runnable {

    public cliente() {
        initComponents();
        Thread t=new Thread(this);
        t.start();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        barra = new javax.swing.JPanel();
        btncerrar = new javax.swing.JButton();
        btnmin = new javax.swing.JButton();
        btnmax = new javax.swing.JButton();
        panel_izquierda = new javax.swing.JPanel();
        nombre_menus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        conectados = new javax.swing.JPanel();
        scrollpaneip = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ipjtextfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        conecta2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        personasconlasquehablo = new javax.swing.JPanel();
        FlowLayout fl2=new FlowLayout();
        fl2.setVgap(0);
        personasconlasquehablo.setLayout(fl2);
        panelconectados = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelconpersonas = new javax.swing.JPanel();
        FlowLayout fl=new FlowLayout(); fl.setVgap(00); panelconpersonas.setLayout(fl);
        panelcuerpo = new javax.swing.JPanel();
        panelbienvenida = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelchat = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        mensajejtextfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        elnombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areatexto = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        barra.setBackground(new java.awt.Color(26, 26, 33));
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

        btncerrar.setBackground(new java.awt.Color(26, 26, 33));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cross-out-blanco.png"))); // NOI18N
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

        btnmin.setBackground(new java.awt.Color(26, 26, 33));
        btnmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus-horizontal-straight-line-blanco.png"))); // NOI18N
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

        btnmax.setBackground(new java.awt.Color(26, 26, 33));
        btnmax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multi-tab-blanco.png"))); // NOI18N
        btnmax.setBorder(null);
        btnmax.setBorderPainted(false);
        btnmax.setContentAreaFilled(false);
        btnmax.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnmax.setOpaque(true);
        btnmax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmaxMouseExited(evt);
            }
        });
        btnmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnmin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnmin, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
            .addComponent(btnmax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        nombre_menus.setBackground(new java.awt.Color(29, 29, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-user-24 (1).png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(29, 29, 33));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-menu-vertical-filled-24.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        jButton4.setBackground(new java.awt.Color(29, 29, 33));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-sms-24 (1).png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nombre_menusLayout = new javax.swing.GroupLayout(nombre_menus);
        nombre_menus.setLayout(nombre_menusLayout);
        nombre_menusLayout.setHorizontalGroup(
            nombre_menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombre_menusLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        nombre_menusLayout.setVerticalGroup(
            nombre_menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nombre_menusLayout.createSequentialGroup()
                .addGroup(nombre_menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conectados.setBackground(new java.awt.Color(36, 36, 40));
        conectados.setLayout(new java.awt.CardLayout());

        scrollpaneip.setBackground(new java.awt.Color(34, 34, 36));
        scrollpaneip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollpaneip.setToolTipText("");
        scrollpaneip.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel3.setBackground(new java.awt.Color(34, 34, 36));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setPreferredSize(new java.awt.Dimension(199, 44));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconfinder_magnifying_glass_search_1891418 (1).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("IP:");

        ipjtextfield.setBackground(new java.awt.Color(102, 102, 102));
        ipjtextfield.setForeground(new java.awt.Color(255, 255, 255));
        ipjtextfield.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ipjtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipjtextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipjtextfield)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ipjtextfield)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setOpaque(false);

        conecta2.setEditable(false);
        conecta2.setBackground(new java.awt.Color(51, 51, 51));
        conecta2.setColumns(20);
        conecta2.setForeground(new java.awt.Color(197, 203, 57));
        conecta2.setRows(5);
        conecta2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(conecta2);

        jScrollPane3.setBorder(null);

        personasconlasquehablo.setBackground(new java.awt.Color(34, 34, 36));
        personasconlasquehablo.setMaximumSize(new java.awt.Dimension(203, 263));
        personasconlasquehablo.setPreferredSize(new java.awt.Dimension(203, 263));
        jScrollPane3.setViewportView(personasconlasquehablo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollpaneip.setViewportView(jPanel3);

        conectados.add(scrollpaneip, "card2");

        panelconectados.setBackground(new java.awt.Color(36, 36, 40));

        jPanel5.setBackground(new java.awt.Color(34, 34, 36));

        jButton5.setBackground(new java.awt.Color(34, 34, 36));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setBackground(new java.awt.Color(36, 36, 40));
        jScrollPane1.getViewport().setBackground(new Color(36,36,40));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setOpaque(false);

        panelconpersonas.setBackground(new java.awt.Color(36, 36, 40));
        panelconpersonas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelconpersonas.setForeground(new java.awt.Color(255, 255, 255));
        panelconpersonas.setPreferredSize(new java.awt.Dimension(205, 375));
        panelconpersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelconpersonasMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(panelconpersonas);

        javax.swing.GroupLayout panelconectadosLayout = new javax.swing.GroupLayout(panelconectados);
        panelconectados.setLayout(panelconectadosLayout);
        panelconectadosLayout.setHorizontalGroup(
            panelconectadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        panelconectadosLayout.setVerticalGroup(
            panelconectadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelconectadosLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );

        conectados.add(panelconectados, "card3");

        javax.swing.GroupLayout panel_izquierdaLayout = new javax.swing.GroupLayout(panel_izquierda);
        panel_izquierda.setLayout(panel_izquierdaLayout);
        panel_izquierdaLayout.setHorizontalGroup(
            panel_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conectados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombre_menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_izquierdaLayout.setVerticalGroup(
            panel_izquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_izquierdaLayout.createSequentialGroup()
                .addComponent(nombre_menus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(conectados, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelcuerpo.setLayout(new java.awt.CardLayout());

        panelbienvenida.setBackground(new java.awt.Color(42, 42, 45));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clock.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Temporary chats");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Speak without worries; \nFeel safe.");

        jLabel9.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Images credits");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelbienvenidaLayout = new javax.swing.GroupLayout(panelbienvenida);
        panelbienvenida.setLayout(panelbienvenidaLayout);
        panelbienvenidaLayout.setHorizontalGroup(
            panelbienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbienvenidaLayout.createSequentialGroup()
                .addGroup(panelbienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbienvenidaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(panelbienvenidaLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(panelbienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelbienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGroup(panelbienvenidaLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)))
                        .addGap(0, 180, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelbienvenidaLayout.setVerticalGroup(
            panelbienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbienvenidaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelcuerpo.add(panelbienvenida, "card2");

        panelchat.setBackground(new java.awt.Color(42, 42, 45));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 0, true));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus (1).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);

        mensajejtextfield.setBackground(new java.awt.Color(51, 51, 51));
        mensajejtextfield.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        mensajejtextfield.setForeground(new java.awt.Color(153, 153, 153));
        mensajejtextfield.setText("Send message to...");
        mensajejtextfield.setBorder(null);
        mensajejtextfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mensajejtextfieldMouseClicked(evt);
            }
        });
        mensajejtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajejtextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensajejtextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajejtextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(42, 42, 45));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 1));

        elnombre.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        elnombre.setForeground(new java.awt.Color(255, 255, 255));
        elnombre.setText("Person's name");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("@");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elnombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane4.setBorder(null);

        areatexto.setBackground(new java.awt.Color(42, 42, 45));
        areatexto.setColumns(20);
        areatexto.setForeground(new java.awt.Color(255, 255, 255));
        areatexto.setRows(5);
        areatexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane4.setViewportView(areatexto);

        javax.swing.GroupLayout panelchatLayout = new javax.swing.GroupLayout(panelchat);
        panelchat.setLayout(panelchatLayout);
        panelchatLayout.setHorizontalGroup(
            panelchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelchatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        panelchatLayout.setVerticalGroup(
            panelchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelchatLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelcuerpo.add(panelchat, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_izquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panelcuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_izquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelcuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered
        btncerrar.setBackground(new Color(232, 17, 35));
    }//GEN-LAST:event_btncerrarMouseEntered

    private void btncerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseExited
        btncerrar.setBackground(new Color(26, 26, 33));
    }//GEN-LAST:event_btncerrarMouseExited

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        try {
            Socket socketentrada=new Socket("192.168.1.3",9999);
            paquete p=new paquete(); 
            p.setNick(getNombre());
            p.setMyip(Inet4Address.getLocalHost().getHostAddress());
            p.setMensaje("usuariodesconectado");
            
            ObjectOutputStream salidainicio=new ObjectOutputStream(socketentrada.getOutputStream());
            salidainicio.writeObject(p);
            salidainicio.close();
            socketentrada.close();
             
        } catch (UnknownHostException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseEntered
        btnmin.setBackground(new Color(152, 152, 152));
    }//GEN-LAST:event_btnminMouseEntered

    private void btnminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminMouseExited
        btnmin.setBackground(new Color(26, 26, 33));
    }//GEN-LAST:event_btnminMouseExited

    private void btnminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnminActionPerformed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();

        this.setLocation(x-mousex,y-mousey);
    }//GEN-LAST:event_barraMouseDragged

    private void barraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseEntered

    }//GEN-LAST:event_barraMouseEntered

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        mousex=evt.getX();
        mousey=evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void btnmaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmaxMouseEntered
        btnmax.setBackground(new Color(152, 152, 152));
    }//GEN-LAST:event_btnmaxMouseEntered

    private void btnmaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmaxMouseExited
        btnmax.setBackground(new Color(26, 26, 33));
    }//GEN-LAST:event_btnmaxMouseExited
        
    private void btnmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaxActionPerformed
        if(maximizado==false){
            cliente.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
            cliente.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximizado=true;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximizado=false;
        }
    }//GEN-LAST:event_btnmaxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Socket socketentrada=new Socket("192.168.1.3",9999);
            paquete p=new paquete(); 
            p.setNick(getNombre());
            p.setMyip(Inet4Address.getLocalHost().getHostAddress());
            p.setMensaje("usuarioconectado");
            
            ObjectOutputStream salidainicio=new ObjectOutputStream(socketentrada.getOutputStream());
            salidainicio.writeObject(p);
            salidainicio.close();
            socketentrada.close();
            
        } catch (IOException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void ipjtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipjtextfieldActionPerformed
        mostrarcuerpochat();
    }//GEN-LAST:event_ipjtextfieldActionPerformed
//-------------------------------------------------------------------------------------------------------------------------------------
    private void mensajejtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajejtextfieldActionPerformed
        mandarmensaje();
    }//GEN-LAST:event_mensajejtextfieldActionPerformed

    private void mensajejtextfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mensajejtextfieldMouseClicked
        if(clicksenjtextfield==1){
        mensajejtextfield.setText("");
        mensajejtextfield.setForeground(new Color(255,255,255));
        clicksenjtextfield++;
        }
    }//GEN-LAST:event_mensajejtextfieldMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mostrarpanelnuevochat();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrarpanelmischats();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void panelconpersonasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelconpersonasMouseEntered

    }//GEN-LAST:event_panelconpersonasMouseEntered
    
   
        
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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areatexto;
    private javax.swing.JPanel barra;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnmax;
    private javax.swing.JButton btnmin;
    private javax.swing.JTextArea conecta2;
    private javax.swing.JPanel conectados;
    private javax.swing.JLabel elnombre;
    private javax.swing.JTextField ipjtextfield;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mensajejtextfield;
    private javax.swing.JPanel nombre_menus;
    private javax.swing.JPanel panel_izquierda;
    private javax.swing.JPanel panelbienvenida;
    private javax.swing.JPanel panelchat;
    private javax.swing.JPanel panelconectados;
    private javax.swing.JPanel panelconpersonas;
    private javax.swing.JPanel panelcuerpo;
    private javax.swing.JPanel personasconlasquehablo;
    private javax.swing.JScrollPane scrollpaneip;
    // End of variables declaration//GEN-END:variables
    private int mousex,mousey;
    private boolean maximizado=false;
    private String nombre;
    private String texto;
    private String ip;
    private int clicksenjtextfield=1;
    private boolean personaclickeada=false;
    private HashMap <String,String> personasmapa;
    private HashMap <String,String> personasconchat=new HashMap <String,String>();


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void run() {
        entradadedatos();
    }
    
    public void entradadedatos(){
        try {
            ServerSocket serversocket=new ServerSocket(9090);
            String nick,mensaje;
            paquete paqueterecibido;
            while(true){
                Socket socketentrada=serversocket.accept();
                ObjectInputStream entrada=new ObjectInputStream(socketentrada.getInputStream());
                paqueterecibido=(paquete) entrada.readObject();
                nick=paqueterecibido.getNick();
                mensaje=paqueterecibido.getMensaje();
                personasmapa=paqueterecibido.getPersonasmapa();
                
                if(!personasconchat.containsKey(nick)){
                    personasconchat.put(nick,nick+": "+mensaje+"\n");
                }else{
                personasconchat.put(nick, personasconchat.get(nick)+nick+": "+mensaje+"\n");
                }
                
                if(elnombre.getText().equals(nick)){
                   areatexto.append(nick+": "+mensaje+"\n");
                }
                
                conecta2.setText("");
                remover_objetos_panelconectados();
                manejopersonasconectadas(personasmapa,Inet4Address.getLocalHost().getHostAddress()); 
                manejodepersonasconectadasenmichat(nick,mensaje);
                
                entrada.close();
                socketentrada.close();
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void manejodepersonasconectadasenmichat(String nick,String mensajededesconexion){
        if(mensajededesconexion.equals("usuariodesconectado")){
            
            Component[] personasconchat=personasconlasquehablo.getComponents();
            for(Component i:personasconchat){
                personaconectada pc=(personaconectada) i;
                if(pc.getNombre().equals(nick)){
                    pc.setDesconectado();
                }
            }
        }
    }
    
    public void manejopersonasconectadas(HashMap <String,String> personasmapa,String myip){
        
       for(Map.Entry <String,String> i: personasmapa.entrySet()){
        String clave=i.getKey();
        String valor=i.getValue();
        
        conecta2.append(clave+"-IP: "+valor+"\n");
        if(!valor.equals(myip)){//Sirve para mostrar a los que estan conectados que no tienen mi ip.//Cambiar a ""!valor.equals(myip)""
            personaconectada pc=new personaconectada();
            pc.ponernombre(clave);//La clave es el nick
            pc.setIp(valor);//El valor es la ip del cliente

            panelconpersonas.add(pc);//Agregamos personaconectada
            panelconpersonas.validate();
            panelconpersonas.repaint();

            pc.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseClicked(MouseEvent me) {
                    ip=pc.getIp();
                    personasconlasquehablo.add(pc);
                    
                    if(personaclickeada==true){//Obtenemos el nombre actual de la persona con la que estamos hablando
                    String personahablada=elnombre.getText();
                    String chathablado=areatexto.getText();
                    personasconchat.put(personahablada, chathablado);
                    
                    elnombre.setText(pc.getNombre());
                    
                        String lohablado=personasconchat.get(elnombre.getText());
                        if(lohablado.equals(null)){
                        areatexto.setText("");
                        }else{
                        areatexto.setText(personasconchat.get(elnombre.getText()));}
                     
                    }else{
                    mostrarcuerpochat();
                    elnombre.setText(pc.getNombre());
                    
                        String lohablado=personasconchat.get(pc.getNombre());
                        if(lohablado.equals(null)){
                        areatexto.setText("");
                        }else{
                        areatexto.setText(personasconchat.get(pc.getNombre()));}
                     
                    
                    personasconchat.put(clave,personasconchat.get(pc.getNombre())+"");
                    personaclickeada= true;
                    }
                }
                @Override
                public void mouseEntered(MouseEvent me){
                    pc.setBackground(new Color(51,51,55));
                }
                @Override
                public void mouseExited(MouseEvent me){
                    pc.setBackground(new Color(34, 34, 36));
                }
            });
        }
        } 
    }
    
    public void remover_objetos_panelconectados(){
        panelconpersonas.removeAll();
        panelconpersonas.repaint();
        panelconpersonas.revalidate();
    }
   
    public void agregarmensaje(String mensaje){
        areatexto.append(mensaje+"\n");
    }
    
    public void mostrarpanelmischats(){
        conectados.removeAll();
        conectados.repaint();
        conectados.revalidate();
        conectados.add(scrollpaneip);
        conectados.revalidate();
    }
    
    public void mostrarpanelnuevochat(){
        conectados.removeAll();
        conectados.repaint();
        conectados.revalidate();
        conectados.add(panelconectados);
        conectados.revalidate(); 
    }
    
    public void mostrarcuerpochat(){
        panelcuerpo.removeAll();
        panelcuerpo.repaint();
        panelcuerpo.revalidate();
        panelcuerpo.add(panelchat);
        panelcuerpo.revalidate();
    }
    
    public void cambiarjtextpane(String nombre){
        elnombre.setText(nombre);
    }
    
    public void mandarmensaje(){
       try {
            Socket socketsalida=new Socket("192.168.1.3",9999);
            paquete paquetesalida=new paquete();
            
            String mensaje=mensajejtextfield.getText();
            String myip=Inet4Address.getLocalHost().getHostAddress();
            String nick=getNombre();
            
            paquetesalida.setMensaje(mensaje);
            paquetesalida.setIp(ip);
            paquetesalida.setMyip(myip);
            paquetesalida.setNick(nick);
            
            ObjectOutputStream salida=new ObjectOutputStream(socketsalida.getOutputStream());
            salida.writeObject(paquetesalida);
            
            areatexto.append(nick+": "+mensaje+"\n");
            
            socketsalida.close();
            salida.close();
            mensajejtextfield.setText("");
        } catch (IOException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
            areatexto.append("Error. Try again.");
        } 
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    

}
