/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.vista;

import epn.edu.ec.controlador.ClienteJpaController;
import epn.edu.ec.controlador.TransaccionJpaController;
import epn.edu.ec.entities.Cliente;
import epn.edu.ec.entities.TipoTransaccion;
import epn.edu.ec.entities.Transaccion;
import java.awt.CardLayout;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josemiguel
 */
public class FrmTransaccion extends javax.swing.JFrame {

    /**
     * Creates new form FrmTransaccion
     */
    public FrmTransaccion() {
        initComponents();
    }

    private Cliente cliente;
    private List<TipoTransaccion> lstTipoTransaccion;
    private CardLayout cardLayout;
    DefaultTableModel modelBusqueda = new DefaultTableModel();

    public FrmTransaccion(Cliente cliente) {
        initComponents();
        this.cliente = cliente;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoTransaccion = new javax.swing.JComboBox();
        pnlPadre = new javax.swing.JPanel();
        pnlDeposito = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDeposito = new javax.swing.JTextField();
        pnlConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        pnlRetiro = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRetiro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("CLIENTE:");

        jLabel1.setText("Tipo de Transacción");

        jLabel3.setText("    ");

        cmbTipoTransaccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Depósito", "Retiro", "Consulta" }));
        cmbTipoTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoTransaccionActionPerformed(evt);
            }
        });

        pnlPadre.setLayout(new java.awt.CardLayout());

        pnlDeposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("REALIZAR DEPÓSITO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Monto a depositar");

        javax.swing.GroupLayout pnlDepositoLayout = new javax.swing.GroupLayout(pnlDeposito);
        pnlDeposito.setLayout(pnlDepositoLayout);
        pnlDepositoLayout.setHorizontalGroup(
            pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepositoLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDepositoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDepositoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDepositoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(287, 287, 287))))
        );
        pnlDepositoLayout.setVerticalGroup(
            pnlDepositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepositoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pnlPadre.add(pnlDeposito, "card2");

        pnlConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FECHA", "TIPO DE TRANSACCIÓN", "MONTO", "SALDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPacientes);

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pnlPadre.add(pnlConsulta, "card4");

        pnlRetiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("REALIZAR RETIRO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Monto a retirar");

        javax.swing.GroupLayout pnlRetiroLayout = new javax.swing.GroupLayout(pnlRetiro);
        pnlRetiro.setLayout(pnlRetiroLayout);
        pnlRetiroLayout.setHorizontalGroup(
            pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetiroLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRetiroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRetiroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(309, 309, 309))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRetiroLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(298, 298, 298))))
        );
        pnlRetiroLayout.setVerticalGroup(
            pnlRetiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRetiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pnlPadre.add(pnlRetiro, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(cmbTipoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlPadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoTransaccionActionPerformed

        if (cmbTipoTransaccion.getSelectedIndex() == 0) {
            limpiarJPanel();
            agregarPanel(pnlDeposito);
        }
        if (cmbTipoTransaccion.getSelectedIndex() == 1) {
            limpiarJPanel();
            agregarPanel(pnlRetiro);
        }
        if (cmbTipoTransaccion.getSelectedIndex() == 2) {
            limpiarJPanel();
            agregarPanel(pnlConsulta);
            cargarConsulta();

        }
    }//GEN-LAST:event_cmbTipoTransaccionActionPerformed

    private void cargarConsulta() {
        modelBusqueda = (DefaultTableModel) tblPacientes.getModel();
        modelBusqueda.setNumRows(0);
        Object[] filas = new Object[modelBusqueda.getColumnCount()];
        List<Transaccion> lstTransacciones = obtenerTransacciones(cliente);
        for (Transaccion transaccion : lstTransacciones) {
            filas[0] = transaccion.getFecha();
            filas[1] = transaccion.getIdTipo().getNombre();
            filas[2] = transaccion.getMonto();
            filas[3] = transaccion.getSaldo();
            modelBusqueda.addRow(filas);
        }

    }

    private List<Transaccion> obtenerTransacciones(Cliente cliente) {
        TransaccionJpaController controladorTransaccion = new TransaccionJpaController(Persistence.createEntityManagerFactory("epn.edu.ec_SistemaBancario_jar_1.0-SNAPSHOTPU"));
        EntityManager em = controladorTransaccion.getEntityManager();
        List<Transaccion> lstTransaccion = em.createNamedQuery("Transaccion.findByCedula", Transaccion.class).setParameter("cedula", cliente.getCedula()).getResultList();
        return lstTransaccion;
    }

    private void RealizarDeposito(Cliente cliente, TipoTransaccion tipoTransaccion, BigDecimal monto) throws Exception {
        TransaccionJpaController controladorTransaccion = new TransaccionJpaController(Persistence.createEntityManagerFactory("epn.edu.ec_SistemaBancario_jar_1.0-SNAPSHOTPU"));
        EntityManager em = controladorTransaccion.getEntityManager();
        Transaccion ultimaTransaccion = em.createNamedQuery("Transaccion.findUltimo", Transaccion.class).setParameter("cedula", cliente.getCedula()).setMaxResults(1).getSingleResult();

        Transaccion transaccion = new Transaccion();
        transaccion.setFecha(Calendar.getInstance().getTime());
        transaccion.setIdCliente(cliente);
        transaccion.setIdTipo(tipoTransaccion);
        transaccion.setMonto(monto);
        transaccion.setSaldo(ultimaTransaccion.getSaldo().add(monto));
        controladorTransaccion.create(transaccion);
    }

    private void RealizarRetiro(Cliente cliente, TipoTransaccion tipoTransaccion, BigDecimal monto) throws Exception {
        TransaccionJpaController controladorTransaccion = new TransaccionJpaController(Persistence.createEntityManagerFactory("epn.edu.ec_SistemaBancario_jar_1.0-SNAPSHOTPU"));
        EntityManager em = controladorTransaccion.getEntityManager();
        Transaccion ultimaTransaccion = em.createNamedQuery("Transaccion.findUltimo", Transaccion.class).setParameter("cedula", cliente.getCedula()).setMaxResults(1).getSingleResult();

        Transaccion transaccion = new Transaccion();
        transaccion.setFecha(Calendar.getInstance().getTime());
        transaccion.setIdCliente(cliente);
        transaccion.setIdTipo(tipoTransaccion);
        transaccion.setMonto(monto);
        transaccion.setSaldo(ultimaTransaccion.getSaldo().subtract(monto));
        controladorTransaccion.create(transaccion);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Integer tipoTransaccionID = 0;
            if (cmbTipoTransaccion.getSelectedIndex() == 0) {
                tipoTransaccionID = 1;
            } else if (cmbTipoTransaccion.getSelectedIndex() == 1) {
                tipoTransaccionID = 2;
            } else if (cmbTipoTransaccion.getSelectedIndex() == 2) {
                tipoTransaccionID = 3;
            }
            //ActualizarSañdoCliente(cliente, BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
            RealizarDeposito(cliente, new TipoTransaccion(tipoTransaccionID), BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
            limpiarJPanel();
        } catch (Exception ex) {
            Logger.getLogger(FrmTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Integer tipoTransaccionID = 0;
            if (cmbTipoTransaccion.getSelectedIndex() == 0) {
                tipoTransaccionID = 1;
            } else if (cmbTipoTransaccion.getSelectedIndex() == 1) {
                tipoTransaccionID = 2;
            } else if (cmbTipoTransaccion.getSelectedIndex() == 2) {
                tipoTransaccionID = 3;
            }
            RealizarRetiro(cliente, new TipoTransaccion(tipoTransaccionID), BigDecimal.valueOf(Double.parseDouble(txtRetiro.getText())));
            //ActualizarDeposito(cliente, BigDecimal.valueOf(Double.parseDouble(txtDeposito.getText())));
            limpiarJPanel();
        } catch (Exception ex) {
            Logger.getLogger(FrmTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void limpiarJPanel() {
        pnlPadre.removeAll();
        pnlPadre.repaint();
        pnlPadre.revalidate();
    }

    private void agregarPanel(JPanel panel) {
        pnlPadre.add(panel);
        pnlPadre.repaint();
        pnlPadre.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbTipoTransaccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlDeposito;
    private javax.swing.JPanel pnlPadre;
    private javax.swing.JPanel pnlRetiro;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtRetiro;
    // End of variables declaration//GEN-END:variables
}
