/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_karimguifarro;

import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import javax.swing.*;
import java.util.*;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
       String[] tipo={"luna","planeta"};
       JComboBox<String> dtipo = new JComboBox<String>(tipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jnave = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Nnombre = new javax.swing.JTextField();
        Nid = new javax.swing.JTextField();
        Ncupo = new javax.swing.JTextField();
        Ndespegue = new javax.swing.JTextField();
        Ntripulacion = new javax.swing.JTextField();
        Naterrizaje = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ndistmax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ncombustible = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Nreserva = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Ntiempo = new javax.swing.JTextField();
        jastro = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        anombre = new javax.swing.JTextField();
        aid = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        anacion = new javax.swing.JTextField();
        atitulo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        acontex = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        apeso = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        amisiones = new javax.swing.JTextField();
        jdestino = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        dnombre = new javax.swing.JTextField();
        distancia = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        dtipo = new javax.swing.JComboBox<>();
        superficie = new javax.swing.JComboBox<>();
        saturacion = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jLabel1.setText("Nombe:");

        jLabel2.setText("ID:");

        jLabel3.setText("Cupo:");

        jLabel4.setText("Tiempo despegue:");

        jLabel5.setText("Tripulacion:");

        jLabel6.setText("Tiempo Aterrizaje:");

        jLabel7.setText("Distancia max. de Viaje:");

        jLabel8.setText("Gasto de combustible:");

        jLabel9.setText("Reserva:");

        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel10.setText("Velocidad:");

        javax.swing.GroupLayout JnaveLayout = new javax.swing.GroupLayout(Jnave.getContentPane());
        Jnave.getContentPane().setLayout(JnaveLayout);
        JnaveLayout.setHorizontalGroup(
            JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnaveLayout.createSequentialGroup()
                .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JnaveLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(Nid)
                            .addComponent(Ncupo)
                            .addComponent(Ndespegue)
                            .addComponent(Ntripulacion))
                        .addGap(57, 57, 57)
                        .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ndistmax, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(Ncombustible)
                            .addComponent(Nreserva)
                            .addComponent(Naterrizaje)
                            .addComponent(Ntiempo)))
                    .addGroup(JnaveLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton2)))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        JnaveLayout.setVerticalGroup(
            JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JnaveLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Ndistmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Nid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(Ncombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Ncupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(Nreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Ndespegue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(Ntiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JnaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Ntripulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Naterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(45, 45, 45))
        );

        jLabel11.setText("Nombe:");

        jLabel12.setText("ID:");

        jLabel13.setText("Apellido:");

        jLabel14.setText("Nacionalidad:");

        jLabel15.setText("Titulo universitario:");

        jLabel17.setText("Contextura fisica:");

        jLabel18.setText("Peso:");

        apeso.setText("0");

        jButton3.setText("Guardar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel20.setText("Cantidad de misiones:");

        amisiones.setText("0");

        javax.swing.GroupLayout jastroLayout = new javax.swing.GroupLayout(jastro.getContentPane());
        jastro.getContentPane().setLayout(jastroLayout);
        jastroLayout.setHorizontalGroup(
            jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jastroLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jButton3)
                .addGap(0, 201, Short.MAX_VALUE))
            .addGroup(jastroLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(anombre, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(aid)
                    .addComponent(apellido)
                    .addComponent(anacion))
                .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jastroLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acontex, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(apeso)
                            .addComponent(amisiones)))
                    .addGroup(jastroLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jastroLayout.setVerticalGroup(
            jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jastroLayout.createSequentialGroup()
                .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jastroLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(anombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(acontex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)
                                .addComponent(apeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20)
                                .addComponent(amisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(anacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(atitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(45, 45, 45))
        );

        jLabel21.setText("Destino:");

        jLabel22.setText("Nombre:");

        jLabel23.setText("Distancia:");

        jLabel24.setText("Tipo de superficie:");

        jLabel25.setText("Saturacion Oxigeno:");

        jButton4.setText("Guardar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        dtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luna", "Planeta" }));

        superficie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rocosa", "Liquida", "Gaseosa" }));

        saturacion.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout jdestinoLayout = new javax.swing.GroupLayout(jdestino.getContentPane());
        jdestino.getContentPane().setLayout(jdestinoLayout);
        jdestinoLayout.setHorizontalGroup(
            jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdestinoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addComponent(distancia))
                    .addComponent(dtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdestinoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(83, 83, 83))
        );
        jdestinoLayout.setVerticalGroup(
            jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdestinoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(dtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(dnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(superficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(saturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu");

        jMenuItem1.setText("Añadir Nave");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Añadir Destino");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Añadir Astronauta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jdestino.setVisible(true);
        jdestino.setSize(500, 500);
        jdestino.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Jnave.setVisible(true);
        Jnave.setSize(500, 500);
        Jnave.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jastro.setVisible(true);
        jastro.setSize(500, 500);
        jastro.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        nave p = new nave(Nnombre.getText(),
                Nid.getText(),
                Ntripulacion.getText(),
                Integer.parseInt(Ncupo.getText()),
                Integer.parseInt(Ndistmax.getText()),
                Integer.parseInt(Ndespegue.getText()),
                Integer.parseInt(Naterrizaje.getText()),
                Integer.parseInt(Ncombustible.getText()),
                Integer.parseInt(Nreserva.getText()),
                Integer.parseInt(Ntiempo.getText())
        );
        String op = "s";
        int cant = 1;
        adminave ap = new adminave("./naves.cbm");
        ap.cargarArchivo();
        ap.setNave(p);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this,
                "Nave guardada exitosamente");
        Nnombre.setText("");
        Nid.setText("");
        Ncupo.setText("");
        Ndistmax.setText("");
        Ndespegue.setText("");
        Naterrizaje.setText("");
        Ncombustible.setText("");
        Nreserva.setText("");
        Ntiempo.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        astronuta p = new astronuta(anombre.getText(),
                aid.getText(),
                apellido.getText(),
                acontex.getText(),
                anacion.getText(),
                atitulo.getText(),
                Integer.parseInt(apeso.getText()),
                Integer.parseInt(amisiones.getText())
        );
        String op = "s";
        int cant = 1;
        adminastro ap = new adminastro("./astronauta.cbm");
        ap.cargarArchivo();
        ap.setAstronuta(p);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this,
                "Nave guardada exitosamente");
                apellido.setText("");
                acontex.setText("");
                anacion.setText("");
                atitulo.setText("");
                apeso.setText("0");
                amisiones.setText("0");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
          destino p = new destino(dtipo.getActionCommand(),
                dnombre.getText(),
                superficie.getActionCommand(),
                Integer.parseInt(distancia.getText()),
                saturacion.getComponentCount()
        );
          String op = "s";
        int cant = 1;
        admindest ap = new admindest("./destino.cbm");
        ap.cargarArchivo();
        ap.setDestino(p);
        ap.escribirArchivo();
    }//GEN-LAST:event_jButton4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Jnave;
    private javax.swing.JTextField Naterrizaje;
    private javax.swing.JTextField Ncombustible;
    private javax.swing.JTextField Ncupo;
    private javax.swing.JTextField Ndespegue;
    private javax.swing.JTextField Ndistmax;
    private javax.swing.JTextField Nid;
    private javax.swing.JTextField Nnombre;
    private javax.swing.JTextField Nreserva;
    private javax.swing.JTextField Ntiempo;
    private javax.swing.JTextField Ntripulacion;
    private javax.swing.JTextField acontex;
    private javax.swing.JTextField aid;
    private javax.swing.JTextField amisiones;
    private javax.swing.JTextField anacion;
    private javax.swing.JTextField anombre;
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField apeso;
    private javax.swing.JTextField atitulo;
    private javax.swing.JTextField distancia;
    private javax.swing.JTextField dnombre;
    private javax.swing.JComboBox<String> dtipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JDialog jastro;
    private javax.swing.JDialog jdestino;
    private javax.swing.JSpinner saturacion;
    private javax.swing.JComboBox<String> superficie;
    // End of variables declaration//GEN-END:variables
}
