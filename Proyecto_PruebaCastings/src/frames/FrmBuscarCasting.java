/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import controlescasting.Fabrica;
import controlescasting.INegocio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosnegocio.Casting;
import objetosnegocio.Fase;

/**
 *
 * @author miran
 */
public class FrmBuscarCasting extends javax.swing.JFrame implements FrameBase {
    private INegocio negocios= Fabrica.fabricaN();
    private static FrmBuscarCasting frmBuscarCasting;
    private List<Casting>castings;
    /**
     * Creates new form FrmBuscarCasting
     */
    private FrmBuscarCasting() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.limpiarCampos();
    }

    public static FrmBuscarCasting getFrmBuscarCasting() {
        if (FrmBuscarCasting.frmBuscarCasting != null) {
            return frmBuscarCasting;
        } else {
            FrmBuscarCasting.frmBuscarCasting = new FrmBuscarCasting();
            return FrmBuscarCasting.frmBuscarCasting;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTittle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dpFecha = new com.github.lgooddatepicker.components.DatePicker();
        txtNombreID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCasting = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 76, 125), 2));

        jPanel2.setBackground(new java.awt.Color(41, 76, 125));

        lblTittle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bocina64gris.png"))); // NOI18N
        lblTittle.setText("Búsqueda Casting");
        lblTittle.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTittle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTittle)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 76, 125)), "Información del Casting", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed", 1, 24), new java.awt.Color(41, 76, 125))); // NOI18N

        txtNombreID.setText(" ");

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 76, 125)));

        tblCasting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 76, 125)));
        tblCasting.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Coste ", "Fecha de contratación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCasting);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa32azul.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(41, 76, 125));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFecha.setText("Fecha");
        lblFecha.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(41, 76, 125));

        lblFecha1.setText("Nombre/id");
        lblFecha1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        lblFecha1.setForeground(new java.awt.Color(41, 76, 125));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblFecha1)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreID, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addGap(18, 18, 18)
                                .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97)))
                .addComponent(btnBuscar)
                .addGap(81, 81, 81))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha1))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        FrmMenuCasting.getFrmMenuCasting().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(this.verificar()){
            this.mostrar();
        }else{
            this.mostrar();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    private boolean verificar(){
        if(!this.camposVacios()){
            Casting casting= new Casting();
            LocalDate local = dpFecha.getDate();
            Date fecha = Date.from(local.atStartOfDay(ZoneId.systemDefault()).toInstant());
            casting.setFechaContratacion(fecha);
            if(this.txtNombreID.getText().matches("^[0-9]*$")){
                Long id = Long.parseLong(this.txtNombreID.getText());
               casting.setId(id);
            }else{
                casting.setNombre(this.txtNombreID.getText());
            }
            this.castings = negocios.buscarCastings(casting);
            if(this.castings.isEmpty()){
                this.mostrarMsj("No se encontraron coincidencias", 0);
                return false;
            }else{
                return true;
            }
        }else{
            this.mostrarMsj("No deben de quedar espacios vacios", 3);
            return false;
        }
    }
    
    private boolean camposVacios(){
        if(this.txtNombreID.getText().isEmpty() || this.dpFecha.toString().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    private void limpiarCampos(){
        this.txtNombreID.setText("");
        this.dpFecha.setDate(LocalDate.now());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private com.github.lgooddatepicker.components.DatePicker dpFecha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblCasting;
    private javax.swing.JTextField txtNombreID;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrar() {
        DefaultTableModel modelo = (DefaultTableModel) tblCasting.getModel();
        modelo.setRowCount(0);
        for (Casting casting : this.castings) {
            modelo.addRow(casting.toArray());
        }
    }

    @Override
    public void mostrarMsj(String mensaje, int tipo) {
        if (tipo == 0) {
            JOptionPane.showMessageDialog(this, mensaje,
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo == 1) {
            JOptionPane.showMessageDialog(this, mensaje,
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, mensaje,
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
}
