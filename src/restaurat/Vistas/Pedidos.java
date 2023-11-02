
package restaurat.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinal.BaseDatos.Conexion;
import proyectofinal.BaseDatos.MesaData;
import proyectofinal.BaseDatos.MeseroData;
import proyectofinal.BaseDatos.PedidoData;
import proyectofinal.BaseDatos.ProductoData;

import proyectofinal.Tablas.Mesa;
import proyectofinal.Tablas.Mesero;
import proyectofinal.Tablas.Pedido;
import proyectofinal.Tablas.Producto;

public class Pedidos extends javax.swing.JInternalFrame {

    private List<Mesero> listaMeseros = new ArrayList<>();
    private List<Producto> produc = new ArrayList<>();
    private List<Mesa> listaMesa = new ArrayList<>();

    private Conexion con = new Conexion();
    private MesaData mesas = new MesaData();
    private PedidoData pedi = new PedidoData();
    private ProductoData produ = new ProductoData();
    private MeseroData mozo = new MeseroData();

    private DefaultTableModel tabla = new DefaultTableModel();

    private double subtotalTotal = 0.0;

    public Pedidos() {
        this.listaMesa = new ArrayList<>();
        initComponents();
        this.setSize(795, 600);

        cargarMeseros();
        cargarProductos();
        cargarMesas();
        armarTabla();

    }



    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono3 =new ImageIcon(getClass().getResource("/proyectofinal/recursos/pedidos.png"));
        Image miImagen3=icono3.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen3,0,0,getWidth(),getHeight(),this);

            }

        };
        jBagregarProducto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTFtotal = new javax.swing.JTextField();
        jBpagar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBagregarPedido = new javax.swing.JButton();
        jComboMesas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboProductos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboMeseros = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaProductos = new javax.swing.JTable();
        jTsubTotal = new javax.swing.JTextField();

        setClosable(true);

        jBagregarProducto.setText("Agregar Producto");
        jBagregarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBagregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarProductoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total ");

        jTFtotal.setEditable(false);

        jBpagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBpagar.setText("Pagar");
        jBpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpagarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBagregarPedido.setText("Agregar Pedido");
        jBagregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarPedidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SubTotal");

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meseros");

        jComboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProductosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccionar Productos");

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pedidos");

        jComboMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMeserosActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mesa n°");

        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Canditad");

        jTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaProductos);

        jTsubTotal.setEditable(false);

        jDesktopPane1.setLayer(jBagregarProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTFtotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBpagar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBagregarPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboMesas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextCantidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboMeseros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTsubTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBagregarProducto)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)))))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(175, 175, 175)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jTFtotal)
                                        .addContainerGap())
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jBagregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 12, Short.MAX_VALUE))))))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTsubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBagregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboMeseros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBagregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTFtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaPropertyChange
        
      
        
        
        
    }//GEN-LAST:event_jDFechaPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBagregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarProductoActionPerformed

        String productoSeleccionado = (String) jComboProductos.getSelectedItem();
        int cantidad = Integer.parseInt(jTextCantidad.getText());
        double precioUnitario = obtenerPrecioUnitario(productoSeleccionado);
        double subtotal = cantidad * precioUnitario;

        tabla.addRow(new Object[]{productoSeleccionado, cantidad, subtotal});

        subtotalTotal += subtotal;
        jTsubTotal.setText(String.format(Locale.US, "%.2f", subtotalTotal));

    }//GEN-LAST:event_jBagregarProductoActionPerformed

    private void jComboMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMeserosActionPerformed
        
         
         
         
    }//GEN-LAST:event_jComboMeserosActionPerformed

    private void jComboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProductosActionPerformed
            
        
    }//GEN-LAST:event_jComboProductosActionPerformed

    private void jBagregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarPedidoActionPerformed
            try {
        
        int nroMesa = Integer.parseInt(jComboMesas.getSelectedItem().toString());
        double importe = subtotalTotal;
        
        java.util.Date fechaYhora = new java.util.Date();
        Timestamp fechaHora = new Timestamp(fechaYhora.getTime());
        
        Pedido pedido = new Pedido(nroMesa, importe, fechaHora, true);
        
        pedi.agregarPedido(pedido);
       
//        subtotalTotal = 0.0;
        tabla.setRowCount(0);
        jTsubTotal.setText("");
        jTextCantidad.setText("");
        
       subtotalTotal = calcularSubtotalTabla();
        double total = calcularTotalTabla();
        jTFtotal.setText(String.format(Locale.US, "%.2f", total));
                
       
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error: Asegúrate de ingresar un número de mesa válido y un importe válido."+e);
    }

        
    }//GEN-LAST:event_jBagregarPedidoActionPerformed

    private void jBpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpagarActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por elegirnos!");
    }//GEN-LAST:event_jBpagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregarPedido;
    private javax.swing.JButton jBagregarProducto;
    private javax.swing.JButton jBpagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboMesas;
    private javax.swing.JComboBox<String> jComboMeseros;
    private javax.swing.JComboBox<String> jComboProductos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFtotal;
    private javax.swing.JTable jTablaProductos;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTsubTotal;
    // End of variables declaration//GEN-END:variables

    private void armarTabla() {

        tabla.addColumn("Producto");
        tabla.addColumn("Cantidad");
        jTablaProductos.setModel(tabla);

    }

    private void cargarMeseros() {

        jComboMeseros.removeAllItems();
        listaMeseros = mozo.listarMesero();

        for (Mesero mesero : listaMeseros) {
            jComboMeseros.addItem(mesero.getNombre());
        }
    }

    private void cargarProductos() {

        jComboProductos.removeAllItems();
        produc = produ.ListarProductos();

        for (Producto producto : produc) {
            jComboProductos.addItem(producto.getNombre());
        }
    }

    private void cargarMesas() {

        jComboMesas.removeAllItems();
        listaMesa = mesas.listarMesa();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (Mesa mesa : listaMesa) {
            comboBoxModel.addElement(String.valueOf(mesa.getNumeroMesa()));
        }

        jComboMesas.setModel(comboBoxModel);
    }

    private double obtenerPrecioUnitario(String productoSeleccionado) {
        for (Producto producto : produc) {
            if (producto.getNombre().equals(productoSeleccionado)) {
                return producto.getPrecio();
            }
        }
        return 0.0;
    }
    
    public double calcularSubtotalTabla() {
    double subtotal = 0.0;
    for (int i = 0; i < tabla.getRowCount(); i++) {
        double precio = Double.parseDouble(tabla.getValueAt(i, 2).toString());
        subtotal += precio;
    }
    return subtotal;
}

    private double calcularTotalTabla() {
        double total = 0.0;

        for (int row = 0; row < tabla.getRowCount(); row++) {
            double subtotal = (double) tabla.getValueAt(row, 1);
            total += subtotal;
        }
        return total;
    }

}

    
   
   

    

