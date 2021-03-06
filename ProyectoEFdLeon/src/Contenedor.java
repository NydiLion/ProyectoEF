
import clases.Usuarios;
import java.awt.Dimension;
import java.awt.Toolkit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snake
 */
public class Contenedor extends javax.swing.JFrame {
      Usuarios mod;
private Cliente nuevaVentana1;
private Proveedor nuevaVentana2;
private Vendedor nuevaVentana3;
private Bodegas nuevaVentana4;
private Producto nuevaVentana5;
private Lineas nuevaVentana6;
private Marcas nuevaVentana7;

///--------------------------

private ComprasE nuevaVentana8;
private ComprasD nuevaVentana9;
private VentasE nuevaVentana10;
private VentasD nuevaVentana11;
private Existencias nuevaVentana12;




 public Contenedor() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
         
    }


   

  
    Contenedor(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
       // JFrame.setDefaultLookAndFeelDecorated(true);
      //  SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");
                Contenedor ve= new Contenedor ();
                ve.setVisible(false);

        if (mod.getIdTipo() == 1) {
               MenuCatalogo.setVisible(false);
              MenuProcesos.setVisible(false);
              MenuHerramientas.setVisible(false);
             menuSalida.setVisible(false);
        }
        if (mod.getIdTipo() == 2) {
               MenuCatalogo.setVisible(true);
              MenuProcesos.setVisible(true);
              MenuHerramientas.setVisible(true);
              menuSalida.setVisible(true);
        }
               
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCatalogo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        MenuProcesos = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        MenuHerramientas = new javax.swing.JMenu();
        menuSalida = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        MenuCatalogo.setText("Catalogo");
        MenuCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCatalogoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem1);

        jMenuItem2.setText("Proveedores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem2);

        jMenuItem3.setText("Vendedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem3);

        jMenuItem4.setText("Bodega");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem4);

        jMenuItem5.setText("Productos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem5);

        jMenuItem6.setText("Linea");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem6);

        jMenuItem7.setText("Marca");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        MenuCatalogo.add(jMenuItem7);

        jMenuBar1.add(MenuCatalogo);

        MenuProcesos.setText("Procesos");

        jMenuItem8.setText("ComprasE");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        MenuProcesos.add(jMenuItem8);

        jMenuItem10.setText("ComprasD");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        MenuProcesos.add(jMenuItem10);

        jMenuItem11.setText("VentasE");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        MenuProcesos.add(jMenuItem11);

        jMenuItem12.setText("VentasD");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        MenuProcesos.add(jMenuItem12);

        jMenuItem13.setText("Existencias");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        MenuProcesos.add(jMenuItem13);

        jMenuBar1.add(MenuProcesos);

        MenuHerramientas.setText("herramientas");
        jMenuBar1.add(MenuHerramientas);

        menuSalida.setText("Salir ");

        jMenuItem9.setText("Out");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuSalida.add(jMenuItem9);

        jMenuBar1.add(menuSalida);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
  nuevaVentana2=new Proveedor();
        jDesktopPane1.add(nuevaVentana2);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana2.getSize();
        nuevaVentana2.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana2.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
     nuevaVentana4=new Bodegas();
        jDesktopPane1.add(nuevaVentana4);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana4.getSize();
        nuevaVentana4.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana4.show();   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
     nuevaVentana9=new ComprasD();
        jDesktopPane1.add(nuevaVentana9);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana9.getSize();
        nuevaVentana9.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana9.show(); 
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
          nuevaVentana1=new Cliente();
        jDesktopPane1.add(nuevaVentana1);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana1.getSize();
        nuevaVentana1.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana1.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCatalogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCatalogoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        nuevaVentana3=new Vendedor ();
        jDesktopPane1.add(nuevaVentana3);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana3.getSize();
        nuevaVentana3.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana3.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        nuevaVentana5=new Producto();
        jDesktopPane1.add(nuevaVentana5);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana5.getSize();
        nuevaVentana5.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana5.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        nuevaVentana6=new Lineas();
        jDesktopPane1.add(nuevaVentana1);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana6.getSize();
        nuevaVentana6.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana6.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    nuevaVentana7=new Marcas();
        jDesktopPane1.add(nuevaVentana7);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana7.getSize();
        nuevaVentana7.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana7.show();    // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      nuevaVentana8=new ComprasE();
        jDesktopPane1.add(nuevaVentana8);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana8.getSize();
        nuevaVentana8.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana8.show(); 
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
     nuevaVentana10=new VentasE();
        jDesktopPane1.add(nuevaVentana10);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana10.getSize();
        nuevaVentana10.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana10.show(); 
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        nuevaVentana11=new VentasD();
        jDesktopPane1.add(nuevaVentana11);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana11.getSize();
        nuevaVentana11.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana11.show(); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       nuevaVentana12=new Existencias();
        jDesktopPane1.add(nuevaVentana12);
        
        //centrar intenal
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = nuevaVentana12.getSize();
        nuevaVentana12.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        nuevaVentana12.show(); 
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contenedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contenedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCatalogo;
    private javax.swing.JMenu MenuHerramientas;
    private javax.swing.JMenu MenuProcesos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuSalida;
    // End of variables declaration//GEN-END:variables
}
