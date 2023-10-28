
package restaurat.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import proyectofinal.BaseDatos.Conexion;
import proyectofinal.BaseDatos.MesaData;
import proyectofinal.BaseDatos.MeseroData;
import proyectofinal.BaseDatos.PedidoData;
import proyectofinal.BaseDatos.ProductoData;
import proyectofinal.Tablas.Mesa;
import proyectofinal.Tablas.Mesero;
import proyectofinal.Tablas.Producto;


public class Estadisticas extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla2 = new DefaultTableModel();
    private List<Mesero> listaMeseros = new ArrayList<>();

    private MeseroData mozo = new MeseroData();
   

    public Estadisticas() {
        initComponents();
        this.setSize(795, 600);

        armarTabla2();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono4=new ImageIcon(getClass().getResource("/proyectofinal/recursos/pedidos2.png"));
        Image miImagen4=icono4.getImage();
        jDesktopPane2 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen4,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtabla2 = new javax.swing.JTable();
        jTextNombreMesero = new javax.swing.JTextField();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(744, 567));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estadisticas...");

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesero");

        jTtabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mesero", "Cant.Mesas", "Cant.Pedidos", "Fecha", "Totales"
            }
        ));
        jScrollPane1.setViewportView(jTtabla2);

        jTextNombreMesero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextNombreMeseroKeyReleased(evt);
            }
        });

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextNombreMesero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreMeseroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreMeseroKeyReleased
            
        String nombreMesero = jTextNombreMesero.getText();
            
        List <Mesero> meserosActivos = mozo.listarMesero();
        //Limpia la tabla
        tabla2.setRowCount(0);
        
        for (Mesero mesero : meserosActivos) {
        if (mesero.getNombre().toLowerCase().contains(nombreMesero.toLowerCase())) {
            // Agrega el mesero a la tabla
            tabla2.addRow(new Object[]{
                mesero.getNombre(),
                
            });
        }
    }
        
    }//GEN-LAST:event_jTextNombreMeseroKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextNombreMesero;
    private javax.swing.JTable jTtabla2;
    // End of variables declaration//GEN-END:variables


private void armarTabla2(){

    tabla2.addColumn("Mesero");
    tabla2.addColumn("Cant.Mesas");
    tabla2.addColumn("Cant.Pedidos");
    tabla2.addColumn("Fecha");
    tabla2.addColumn("Totales");
    jTtabla2.setModel(tabla2);

}




}
