/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTnuevonmesa = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();

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

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nuevo N°  de  Mesa");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnmesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTcapacidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBeliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBmodificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnuevonmesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTnuevonmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTnmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBbuscar)))))
                .addContainerGap(71, Short.MAX_VALUE))
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
                    .addComponent(jBbuscar))
                .addGap(37, 37, 37)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnuevonmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
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
    }
        
        
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
            
           try {
        // Obtén el nuevo número de mesa desde el campo de texto jTnuevonmesa
        int nuevoNumeroMesa = Integer.parseInt(jTnuevonmesa.getText());
        
        // Obtén la capacidad deseada desde el campo de texto jTcapacidad
        int capacidad = Integer.parseInt(jTcapacidad.getText());

        // Puedes agregar validación adicional aquí si es necesario

        // Crea una nueva instancia de la clase Mesa
        Mesa mesa = new Mesa();
        mesa.setNumeroMesa(nuevoNumeroMesa);
        mesa.setCapacidad(capacidad);

        // Llama al método agregarMesa para guardar la mesa en la base de datos
        mesaData.agregarMesa(mesa);

        // Notifica al usuario que la mesa se ha guardado
        JOptionPane.showMessageDialog(this, "Mesa guardada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Limpia los campos de texto después de guardar la mesa
        jTnuevonmesa.setText("");
        jTcapacidad.setText("");
    } catch (NumberFormatException ex) {
        // Maneja posibles errores de conversión de número
        JOptionPane.showMessageDialog(this, "Ingresa un número de mesa y una capacidad válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }

        
        
        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        
 try {
        // Obtén el número de mesa a buscar desde el campo de texto
        int numeroMesa = Integer.parseInt(jTnmesa.getText());

        // Realiza la búsqueda en la base de datos
        Mesa mesa = mesaData.buscarMesa(numeroMesa);

        if (mesa != null) {
            if (mesa.isEstado()) {
                // Si se encontró una mesa en estado activo, muestra su capacidad en el campo de texto
                jTcapacidad.setText(Integer.toString(mesa.getCapacidad()));
            } else {
                // Si la mesa no está en estado activo, muestra un mensaje
                JOptionPane.showMessageDialog(this, "La mesa no está en estado activo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                jTcapacidad.setText(""); // Limpia el campo de capacidad
            }
        } else {
            // Si no se encontró la mesa, muestra un mensaje
            JOptionPane.showMessageDialog(this, "No se encontró una mesa con ese número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException ex) {
        // Maneja posibles errores de conversión de número
        JOptionPane.showMessageDialog(this, "Ingresa un número de mesa válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
 
        
    }//GEN-LAST:event_jBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField jTnmesa;
    private javax.swing.JTextField jTnuevonmesa;
    // End of variables declaration//GEN-END:variables
}
