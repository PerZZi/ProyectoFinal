
package restaurat.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectofinal.BaseDatos.MesaData;
import proyectofinal.Tablas.Mesa;


public class AgregarMesas extends javax.swing.JInternalFrame {
private MesaData mesaData = new MesaData();
private Mesa mesas=null;

    public AgregarMesas() {
        initComponents();
        this.setSize(795,600);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon  icon3=new ImageIcon(getClass().getResource("/Proyectofinal/recursos/abm3.png"));
        Image miImagen3=icon3.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){

                g.drawImage(miImagen3,0,0,getWidth(),getHeight(),this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTnmesa = new javax.swing.JTextField();
        jTcapacidad = new javax.swing.JTextField();
        jBeliminar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTmodificar = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jBactivar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Mesas...");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° Mesa");

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Capacidad");

        jTcapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcapacidadActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modificar N°  de Mesa");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBactivar.setText("Activar");
        jBactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactivarActionPerformed(evt);
            }
        });

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnmesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTcapacidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBeliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBactivar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTnmesa, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jTcapacidad))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jBactivar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnmesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar)
                    .addComponent(jBactivar))
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jBguardar))
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcapacidadActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        
 try {
        // Obtén el número de mesa a eliminar desde el campo de texto
        Integer nM = Integer.parseInt(jTnmesa.getText());

        // Llama al método para eliminar la mesa desde la base de datos
        boolean eliminado = mesaData.eliminarMesa(nM);

        if (eliminado) {
            // Si se elimina con éxito, notifica al usuario y limpia los campos
            JOptionPane.showMessageDialog(this, "Mesa eliminada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            jTnmesa.setText("");
            jTcapacidad.setText("");
        } else {
            // Si no se encuentra la mesa, muestra un mensaje
            JOptionPane.showMessageDialog(this, "No se encontró una mesa con ese número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        // Maneja posibles errores de conversión de número
        JOptionPane.showMessageDialog(this, "Ingresa un número de mesa válido.", "Error", JOptionPane.ERROR_MESSAGE);
         jTnmesa.setText("");
        
    }
        
        
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
try {
        
        int numeroMesa = Integer.parseInt(jTnmesa.getText());

    
        Mesa mesa = mesaData.buscarMesa(numeroMesa);

        if (mesa != null) {
            if (mesa.isEstado()) {
                
                jTcapacidad.setText(Integer.toString(mesa.getCapacidad()));
            } else {
                // Si la mesa no está en estado activo, muestra un mensaje
                JOptionPane.showMessageDialog(this, "La mesa no está en estado activo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                 jTnmesa.setText("");              
                jTcapacidad.setText(""); // Limpia el campo de capacidad
            }
        } else {
            // Si no se encontró la mesa, muestra un mensaje
            JOptionPane.showMessageDialog(this, "No se encontró una mesa con ese número.", "Error", JOptionPane.ERROR_MESSAGE);
             jTnmesa.setText("");
             jTnmesa.requestFocus();
        }
    } catch (NumberFormatException ex) {
       
        JOptionPane.showMessageDialog(this, "Ingresa un número de mesa válido.", "Error", JOptionPane.ERROR_MESSAGE);
         jTnmesa.setText("");
        
        
        
        
    }        
        
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactivarActionPerformed
      try {
        // Obtén el número de mesa a buscar desde el campo de texto
        int numeroMesa = Integer.parseInt(jTnmesa.getText());

        // Realiza la búsqueda en la base de datos
        Mesa mesa = mesaData.buscarMesa(numeroMesa);

        if (mesa != null) {
            if (!mesa.isEstado()) {
                // Si la mesa está inactiva, activa la mesa llamando al método "activarMesa"
                mesaData.activarMesa(numeroMesa);
                JOptionPane.showMessageDialog(this, "Mesa activada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Si la mesa ya está activa, muestra un mensaje
                JOptionPane.showMessageDialog(this, "La mesa ya está activa.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // Si no se encontró la mesa, muestra un mensaje
            JOptionPane.showMessageDialog(this, "No se encontró una mesa con ese número.", "Error", JOptionPane.ERROR_MESSAGE);
            jTnmesa.setText("");
        }
    } catch (NumberFormatException ex) {
        // Maneja posibles errores de conversión de número
        JOptionPane.showMessageDialog(this, "Ingresa un número de mesa válido.", "Error", JOptionPane.ERROR_MESSAGE);
        
        jTnmesa.setText("");  
    }
    }//GEN-LAST:event_jBactivarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
 String numeroMesaText = jTnmesa.getText().trim();
    String nuevoNumeroMesaText = jTmodificar.getText().trim();

    if (numeroMesaText.isEmpty() || nuevoNumeroMesaText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ambos campos deben contener números de mesa válidos.", "Error", JOptionPane.ERROR_MESSAGE);
       jTcapacidad.setText("");
        jTmodificar.setText("");
        jTnmesa.setText("");
    
    } else {
        try {
            int numeroMesa = Integer.parseInt(numeroMesaText);
            int nuevoNumeroMesa = Integer.parseInt(nuevoNumeroMesaText);

            // Verificar si el nuevo número de mesa ya existe en la base de datos
            if (mesaData.existeMesaConNumero(nuevoNumeroMesa)) {
                JOptionPane.showMessageDialog(this, "El nuevo número de mesa ya existe en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
                jTnmesa.setText("");
                jTmodificar.setText("");
                jTnmesa.setText("");
            
            } else {
                // El nuevo número de mesa no existe, se puede realizar la modificación
                mesaData.modificarNumeroMesa(numeroMesa, nuevoNumeroMesa);
                JOptionPane.showMessageDialog(this, "Número de mesa modificado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                jTnmesa.setText("");
                jTcapacidad.setText("");
                jTmodificar.setText("");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa números de mesa válidos.", "Error", JOptionPane.ERROR_MESSAGE);
               jTcapacidad.setText("");
        jTmodificar.setText("");
        jTnmesa.setText("");
        }
    }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
       // Obtén el texto de los campos de mesa y capacidad
    String numeroMesaText = jTnmesa.getText().trim();
    String capacidadText = jTcapacidad.getText().trim();

    // Verifica que ambos campos contengan solo dígitos
    if (!numeroMesaText.matches("\\d+") || !capacidadText.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Ambos campos deben contener números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
         jTnmesa.setText("");
        jTcapacidad.setText("");
    } else {
        // Los campos contienen solo números, puedes continuar con la operación
        int numeroMesa = Integer.parseInt(numeroMesaText);
        int capacidad = Integer.parseInt(capacidadText);

        // Crea un objeto Mesa con los valores ingresados
        Mesa mesa = new Mesa(numeroMesa, capacidad, true);

        // Llama al método para guardar la mesa
        mesaData.guardarMesa(mesa);

        // Limpia los campos de texto después de guardar
        jTnmesa.setText("");
        jTcapacidad.setText("");

        JOptionPane.showMessageDialog(this, "Mesa guardada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBactivar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTcapacidad;
    private javax.swing.JTextField jTmodificar;
    private javax.swing.JTextField jTnmesa;
    // End of variables declaration//GEN-END:variables
}
