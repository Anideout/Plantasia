package view;


import controller.Persona;
import controller.DIreccion;
import controller.Direccion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;
import model.Gestion;
import view.Tabla;
/**
 *
 * @author anideu
 */
public class SIstema extends javax.swing.JFrame {
    
    
    
    
    private Gestion gestionPersona;
    //variable para ejes del mouse
    int xMouse, yMouse;
    /**
     * Creates new form SIstema
     */
    public SIstema() {
        initComponents();
        
        //ocultar tabla 
        tblPersona.setVisible(false);
        gestionPersona = new Gestion();
        lblGuar.setVisible(false);
        configurarTabla();
        if(gestionPersona.tamanioLIsta() == 0){
            lblGuar.setVisible(true);        
        }
        this.setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(logo, "src/Img/plantas.png");
    }
    
    private void InitContent(){
        initComponents();
        this.setLocationRelativeTo(this);
        //definimos la clase listar, para interponerlo en la clase Sistema, y así mostrar otra pagina por encima de nuestra app
        //definimos las dimensiones
        //tabla.setSize(900, 420);
        //posicion
        //tabla.setLocation(0,0);
        //llamamos el panel content, que es el panel asignado para mostrar la pagina nueva
        // content.removeAll();
        //content.add(tabla,BorderLayout.CENTER);
        //content.revalidate();
        //content.repaint();
        
        
        
    }
    
    
    private void configurarTabla(){
        tblPersona.addMouseListener(new java.awt.event.MouseAdapter() {
           @Override
           public void mouseClicked(java.awt.event.MouseEvent evt){
               int filaSeleccionada = tblPersona.getSelectedRow();
               if(filaSeleccionada >= 0){
                   //obtener los valores del objeto
                   String rut = (String) tblPersona.getValueAt(filaSeleccionada, 0);
                    String apellido = (String) tblPersona.getValueAt(filaSeleccionada, 2);
                    String nombre = (String) tblPersona.getValueAt(filaSeleccionada, 1);
                    int edad = (int) tblPersona.getValueAt(filaSeleccionada, 3);
                    
                    //mostrar los valores en el formulario
                    txtRut.setText(rut);
                    txtNombre.setText(nombre);
                    txtApellido.setText(apellido);
                    txtEdad.setText(String.valueOf(edad)); 
                    //inhabilitar campo rut
                    txtRut.setEnabled(false);
                    btnGuardar.setVisible(false);
               }
           } 
        });
    }
    
    //metodo para randomizar el numero de seguimiento
   public void nSeguimiento(){
       Random random = new Random();
       int numero = random.nextInt(9);
       
       
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg2 = new javax.swing.JPanel();
        plantabg2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        tblNombre = new javax.swing.JLabel();
        tblRut = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        plantasia = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        tblEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        tblCalle = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtComuna = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtNumero = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        scrPersona = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        lblGuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg2.setBackground(new java.awt.Color(255, 255, 255));
        bg2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg2.setMinimumSize(new java.awt.Dimension(900, 420));
        bg2.setPreferredSize(new java.awt.Dimension(900, 420));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plantabg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Download premium image of Tropical no Text vegetation outdoors_ by Sataphorn Srijantra about tropical leaf iphone wallpaper, safari jungle animals graphic, banana leaf 3d rendering, wallpaper green, and 3 dimensional 13598928.jpeg"))); // NOI18N
        plantabg2.setText("PLANTASIA");
        bg2.add(plantabg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 260, 530));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 230, -1));

        tblApellido.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        tblApellido.setForeground(new java.awt.Color(0, 0, 0));
        tblApellido.setText("APELLIDO");
        bg2.add(tblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Nexa Heavy", 0, 13)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(204, 204, 204));
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        bg2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 230, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Nexa Heavy", 0, 13)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        bg2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, -1));

        tblNombre.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        tblNombre.setForeground(new java.awt.Color(0, 0, 0));
        tblNombre.setText("NOMBRE");
        bg2.add(tblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 20));

        tblRut.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        tblRut.setForeground(new java.awt.Color(0, 0, 0));
        tblRut.setText("RUT");
        bg2.add(tblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 40, 20));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        txtExit.setFont(new java.awt.Font("Nexa Heavy", 3, 24)); // NOI18N
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1010, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 30));

        txtRut.setBackground(new java.awt.Color(255, 255, 255));
        txtRut.setFont(new java.awt.Font("Nexa Heavy", 0, 13)); // NOI18N
        txtRut.setForeground(new java.awt.Color(204, 204, 204));
        txtRut.setText("Ingrese su rut...");
        txtRut.setBorder(null);
        txtRut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRutMousePressed(evt);
            }
        });
        bg2.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 230, -1));

        plantasia.setFont(new java.awt.Font("Coolvetica Rg", 1, 36)); // NOI18N
        plantasia.setForeground(new java.awt.Color(0, 0, 0));
        plantasia.setText("Plantasia");
        bg2.add(plantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 160, 30));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        logo.setToolTipText("");
        bg2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 70, 70));

        title1.setFont(new java.awt.Font("Coolvetica Rg", 1, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 0));
        title1.setText("Ingrese sus datos! ");
        bg2.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 160, 30));

        tblEdad.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        tblEdad.setForeground(new java.awt.Color(0, 0, 0));
        tblEdad.setText("EDAD");
        bg2.add(tblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, 30));

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Nexa Heavy", 0, 13)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(204, 204, 204));
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setBorder(null);
        txtEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEdadMousePressed(evt);
            }
        });
        bg2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 10));

        btnGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnGuardar.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        bg2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 120, 40));

        tblCalle.setBackground(new java.awt.Color(0, 0, 0));
        tblCalle.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        tblCalle.setForeground(new java.awt.Color(0, 0, 0));
        tblCalle.setText("Calle");
        bg2.add(tblCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 50, 30));

        txtCalle.setBackground(new java.awt.Color(255, 255, 255));
        txtCalle.setFont(new java.awt.Font("Nexa Heavy", 1, 13)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(204, 204, 204));
        txtCalle.setText("Ingrese su calle...");
        txtCalle.setToolTipText("");
        txtCalle.setBorder(null);
        txtCalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCalleMousePressed(evt);
            }
        });
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        bg2.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 280, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 280, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Comuna");
        bg2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        txtComuna.setBackground(new java.awt.Color(255, 255, 255));
        txtComuna.setFont(new java.awt.Font("Nexa Heavy", 1, 13)); // NOI18N
        txtComuna.setForeground(new java.awt.Color(204, 204, 204));
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setBorder(null);
        txtComuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtComunaMousePressed(evt);
            }
        });
        txtComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComunaActionPerformed(evt);
            }
        });
        bg2.add(txtComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 280, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 290, 10));

        jLabel2.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Numero");
        bg2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 70, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 290, 10));

        txtNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtNumero.setFont(new java.awt.Font("Nexa Heavy", 1, 13)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(204, 204, 204));
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setBorder(null);
        txtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroMousePressed(evt);
            }
        });
        bg2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 290, 20));

        btnMostrar.setBackground(new java.awt.Color(0, 204, 102));
        btnMostrar.setFont(new java.awt.Font("Coolvetica Rg", 0, 18)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(0, 0, 0));
        btnMostrar.setText("Mostrar");
        btnMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMostrarMousePressed(evt);
            }
        });
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        bg2.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 120, 40));

        jLabel3.setFont(new java.awt.Font("Coolvetica Rg", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Dirección");
        bg2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 90, 30));

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Apellido", "Edad", "Planta", "Precio", "Calle", "Comuna", "Numero", "N°Seguimiento"
            }
        ));
        scrPersona.setViewportView(tblPersona);

        bg2.add(scrPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 250, 60));

        lblGuar.setText("prubea");
        lblGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblGuarActionPerformed(evt);
            }
        });
        bg2.add(lblGuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 40));

        bg.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //definimos los eventos del mouse
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed
    //funcion para el arrastre del mouse por la aplicación 
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

        //Metodo para l boton X de cerrar la aplicación 
    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked
    //metodo para colorear el botón X cuando el mouse pase por encima
    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        exitBtn.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseEntered
    //metodo para decololear el boton X cuando el mouse sale de encima 
    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        exitBtn.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_txtExitMouseExited
    
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(0, 166, 147));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(0,204,102));
    }//GEN-LAST:event_btnGuardarMouseExited
    //metodo para borrar el texto gris...
    private void txtRutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRutMousePressed
   //a cada texto lo separamos con if, para que cuand se escriba, no se borre lo escrito con anterioridad, y no se buguee
    if (txtRut.getText().equals("Ingrese su rut...")){
        txtRut.setText("");
        txtRut.setForeground(Color.black);
    }
    if (String.valueOf(txtNombre.getText()).isEmpty()){
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setForeground(Color.gray);
    }
     if (String.valueOf(txtEdad.getText()).isEmpty()){
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtCalle.getText()).isEmpty()){
        txtCalle.setText("Ingrese su Calle...");
        txtCalle.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtComuna.getText()).isEmpty()){
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtNumero.getText()).isEmpty()){
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setForeground(Color.gray);
    } 
      
  
    }//GEN-LAST:event_txtRutMousePressed

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseEntered
    


    //metodo para borrar el texto gris...
    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
    //a cada texto lo separamos con if, para que cuand se escriba, no se borre lo escrito con anterioridad, y no se buguee
    if (txtNombre.getText().equals("Ingrese su nombre...")){
        txtNombre.setText("");
        txtNombre.setForeground(Color.black);
    }
    if (String.valueOf(txtRut.getText()).isEmpty()){
        txtRut.setText("Ingrese su rut...");
        txtRut.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setForeground(Color.gray);
    }
     if (String.valueOf(txtEdad.getText()).isEmpty()){
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setForeground(Color.gray);
     }
     if (String.valueOf(txtCalle.getText()).isEmpty()){
        txtCalle.setText("Ingrese su calle...");
        txtCalle.setForeground(Color.gray);
     }
      
     if (String.valueOf(txtComuna.getText()).isEmpty()){
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtNumero.getText()).isEmpty()){
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setForeground(Color.gray);
    } 
    }//GEN-LAST:event_txtNombreMousePressed
        //metodo para borrar el texto gris...
    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
    if (txtApellido.getText().equals("Ingrese su apellido...")){
        txtApellido.setText("");
        txtApellido.setForeground(Color.black);
    }
    if (String.valueOf(txtRut.getText()).isEmpty()){
        txtRut.setText("Ingrese su rut...");
        txtRut.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setForeground(Color.gray);
    }
     if (String.valueOf(txtEdad.getText()).isEmpty()){
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setForeground(Color.gray);
     }
      if (String.valueOf(txtCalle.getText()).isEmpty()){
        txtCalle.setText("Ingrese su calle...");
        txtCalle.setForeground(Color.gray);
     }
      
     if (String.valueOf(txtComuna.getText()).isEmpty()){
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtNumero.getText()).isEmpty()){
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setForeground(Color.gray);
    } 
    }//GEN-LAST:event_txtApellidoMousePressed
    


//metodo para borrar el texto gris...
    private void txtEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEdadMousePressed
    //a cada texto lo separamos con if, para que cuando se escriba, no se borre lo escrito con anterioridad, y no se buguee
    if (txtEdad.getText().equals("Ingrese su edad...")){
        txtEdad.setText("");
        txtEdad.setForeground(Color.black);
    }
    if (String.valueOf(txtRut.getText()).isEmpty()){
        txtRut.setText("Ingrese su rut...");
        txtRut.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setForeground(Color.gray);
    }
     if (String.valueOf(txtNombre.getText()).isEmpty()){
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setForeground(Color.gray);
     }
     if (String.valueOf(txtCalle.getText()).isEmpty()){
        txtCalle.setText("Ingrese su calle...");
        txtCalle.setForeground(Color.gray);
     }
      
     if (String.valueOf(txtComuna.getText()).isEmpty()){
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtNumero.getText()).isEmpty()){
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setForeground(Color.gray);
    } 
    }//GEN-LAST:event_txtEdadMousePressed
    //metodo al hacer click en el boton guardar, el cual guardará los datos ingresados
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
         javax.swing.JOptionPane.showMessageDialog(this,
                "Datos guardados!\nRut: " + txtRut.getText() +
                "\nNombre: " + txtNombre.getText()  +
                "\nApellido:" + txtApellido.getText() +
                "\nEdad: " + txtEdad.getText() +
                "\nCalle: " + txtCalle.getText() +
                "\nComuna: " + txtComuna.getText() +
                "\nCalle: " + txtCalle.getText(),
                "Guardado!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGuardarMouseClicked
    //metodo para el boton listar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String rut = txtRut.getText();
    String apellido = txtApellido.getText();
    String nombre = txtNombre.getText();
    int edad = 0;
    try{
        edad = Integer.parseInt(txtEdad.getText());
    }catch (Exception e){
        System.out.println("solo se permiten numeros!");
        return;
    }
    String calle = txtCalle.getText();
    String comuna = txtComuna.getText();
    int numero = 0;
    try{
        numero = Integer.parseInt(txtNumero.getText());
    }catch (Exception e){
        System.out.println("Solo se permiten numeros");
        return;
    }
    Direccion direccion = new Direccion(calle, comuna, numero);
    Persona persona = new Persona(rut, nombre, apellido, edad, direccion);
    gestionPersona.agregarPersona(persona);
    lblGuar.setVisible(true);
    
    
    
    scrPersona.revalidate();
    scrPersona.repaint();
    tblPersona.revalidate();
    tblPersona.repaint();
    if(gestionPersona.tamanioLIsta() > 0){
        btnMostrar.setVisible(false);
    }
    
    
    
   
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
         
    }//GEN-LAST:event_txtCalleActionPerformed

    private void txtComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComunaActionPerformed

    private void txtCalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCalleMousePressed
        //a cada texto lo separamos con if, para que cuando se escriba, no se borre lo escrito con anterioridad, y no se buguee
    if (txtCalle.getText().equals("Ingrese su calle...")){
        txtCalle.setText("");
        txtCalle.setForeground(Color.black);
    }
    if (String.valueOf(txtRut.getText()).isEmpty()){
        txtRut.setText("Ingrese su rut...");
        txtRut.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setForeground(Color.gray);
    }
     if (String.valueOf(txtNombre.getText()).isEmpty()){
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setForeground(Color.gray);
     }
     if (String.valueOf(txtEdad.getText()).isEmpty()){
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtComuna.getText()).isEmpty()){
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtNumero.getText()).isEmpty()){
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setForeground(Color.gray);
    } 
    }//GEN-LAST:event_txtCalleMousePressed

    private void txtComunaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtComunaMousePressed
       //a cada texto lo separamos con if, para que cuando se escriba, no se borre lo escrito con anterioridad, y no se buguee
    if (txtComuna.getText().equals("Ingrese su comuna...")){
        txtComuna.setText("");
        txtComuna.setForeground(Color.black);
    }
    if (String.valueOf(txtRut.getText()).isEmpty()){
        txtRut.setText("Ingrese su rut...");
        txtRut.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setForeground(Color.gray);
    }
     if (String.valueOf(txtNombre.getText()).isEmpty()){
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setForeground(Color.gray);
     }
     if (String.valueOf(txtEdad.getText()).isEmpty()){
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtCalle.getText()).isEmpty()){
        txtCalle.setText("Ingrese su calle...");
        txtCalle.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtNumero.getText()).isEmpty()){
        txtNumero.setText("Ingrese su numero...");
        txtNumero.setForeground(Color.gray);
    } 
    }//GEN-LAST:event_txtComunaMousePressed

    private void txtNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMousePressed
       //a cada texto lo separamos con if, para que cuando se escriba, no se borre lo escrito con anterioridad, y no se buguee
    if (txtNumero.getText().equals("Ingrese su numero...")){
        txtNumero.setText("");
        txtNumero.setForeground(Color.black);
    }
    if (String.valueOf(txtRut.getText()).isEmpty()){
        txtRut.setText("Ingrese su rut...");
        txtRut.setForeground(Color.gray);
    }
    if (String.valueOf(txtApellido.getText()).isEmpty()){
        txtApellido.setText("Ingrese su apellido...");
        txtApellido.setForeground(Color.gray);
    }
     if (String.valueOf(txtNombre.getText()).isEmpty()){
        txtNombre.setText("Ingrese su nombre...");
        txtNombre.setForeground(Color.gray);
     }
     if (String.valueOf(txtEdad.getText()).isEmpty()){
        txtEdad.setText("Ingrese su edad...");
        txtEdad.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtComuna.getText()).isEmpty()){
        txtComuna.setText("Ingrese su comuna...");
        txtComuna.setForeground(Color.gray);
    } 
      
     if (String.valueOf(txtCalle.getText()).isEmpty()){
        txtCalle.setText("Ingrese su calle...");
        txtCalle.setForeground(Color.gray);
    } 
    }//GEN-LAST:event_txtNumeroMousePressed

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMouseClicked

    private void btnMostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMouseEntered

    private void btnMostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMouseExited

    private void btnMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarMousePressed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Tabla tabla = new Tabla();
        tabla.setVisible(true);
        this.dispose();
         //definimos la clase Tabla, para interponerlo en la clase Sistema, y así mostrar otra pagina por encima de nuestra app
        //definimos las dimensiones
        tabla.setSize(900, 420);
        //posicion
        tabla.setLocation(0,0);
        //llamamos el panel content, que es el panel asignado para mostrar la pagina nueva
        //content.removeAll();
        //content.add(tabla,BorderLayout.CENTER);
        //content.revalidate();
        //content.repaint();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void lblGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblGuarActionPerformed
      //definir las columnas de la tabla
      String[] columnas = {"rut","nombre","apellido","edad","calle","comuna","numero"};
      //crear modelo de la tabla on las columnas definidas
      DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
      
      //rellenar los cambos de la tabla
        for(Persona p : gestionPersona.getPersonas()){
            Object[] fila = {p.getRut(),p.getNombre(),p.getApellido(),p.getEdad()};
            modelo.addRow(fila);
        }
        
        //metodo para que la tabla se sincronice con los objetos del array
        tblPersona.setModel(modelo);
        scrPersona.revalidate();
        scrPersona.repaint();
        tblPersona.revalidate();
        tblPersona.repaint();
        //mostrar por backedn
        gestionPersona.listarPersonas();
        scrPersona.setVisible(true);
        tblPersona.setVisible(true);
        if(gestionPersona.tamanioLIsta() > 0){
            btnMostrar.setVisible(true);
        }
        btnGuardar.setVisible(true);
        
        
    }//GEN-LAST:event_lblGuarActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(SIstema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIstema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIstema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIstema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIstema().setVisible(true);
            }
        });
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton lblGuar;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel plantabg2;
    private javax.swing.JLabel plantasia;
    private javax.swing.JScrollPane scrPersona;
    private javax.swing.JLabel tblApellido;
    private javax.swing.JLabel tblCalle;
    private javax.swing.JLabel tblEdad;
    private javax.swing.JLabel tblNombre;
    private javax.swing.JTable tblPersona;
    private javax.swing.JLabel tblRut;
    private javax.swing.JLabel title1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JLabel txtExit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables

    private void SetImagelLabel(JLabel logo, String homeanideuNetBeansProjectsPlantasiasrcImg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
