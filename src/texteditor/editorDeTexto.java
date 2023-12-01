/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package texteditor;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class editorDeTexto extends javax.swing.JFrame {

    StyledDocument doc;
    Style estilo;

    public editorDeTexto() {
        initComponents();

        doc = tp_texto.getStyledDocument();
        estilo = tp_texto.addStyle("miEstilo", null);

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) combo_tipodeletra.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < fontNames.length; i++) {
            modelo.addElement(fontNames[i]);
        }
        combo_tipodeletra.setModel(modelo);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_texto = new javax.swing.JTextPane();
        colorletra_btn = new javax.swing.JButton();
        abrirarch_btn = new javax.swing.JButton();
        guardararch_btn = new javax.swing.JButton();
        combo_tipodeletra = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combo_tamaño = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        negrita = new javax.swing.JButton();
        cursiva = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tp_texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 140, 920, 450));

        colorletra_btn.setText("color font");
        colorletra_btn.setMaximumSize(new java.awt.Dimension(76, 11));
        colorletra_btn.setMinimumSize(new java.awt.Dimension(76, 11));
        colorletra_btn.setPreferredSize(new java.awt.Dimension(76, 11));
        colorletra_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorletra_btnMouseClicked(evt);
            }
        });
        colorletra_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorletra_btnActionPerformed(evt);
            }
        });
        getContentPane().add(colorletra_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 100, 31));

        abrirarch_btn.setText("open file");
        abrirarch_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirarch_btnMouseClicked(evt);
            }
        });
        abrirarch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirarch_btnActionPerformed(evt);
            }
        });
        getContentPane().add(abrirarch_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 80, 33));

        guardararch_btn.setText("save file");
        guardararch_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardararch_btnMouseClicked(evt);
            }
        });
        getContentPane().add(guardararch_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 90, 27));

        combo_tipodeletra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipodeletraItemStateChanged(evt);
            }
        });
        getContentPane().add(combo_tipodeletra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 40));

        jLabel2.setText("size");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 60, 30));

        combo_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "8", "10", "12", "14", "16", "18", "20", "24", "28", "32", "36", "42", "48", "60", "72" }));
        combo_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tamañoActionPerformed(evt);
            }
        });
        getContentPane().add(combo_tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 150, 40));

        jLabel3.setText("font");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, 30));

        negrita.setText("negrita");
        negrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negritaActionPerformed(evt);
            }
        });
        getContentPane().add(negrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, 40));

        cursiva.setText("cursiva");
        cursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursivaActionPerformed(evt);
            }
        });
        getContentPane().add(cursiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, 40));

        jButton1.setText("subrayado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, 40));

        jButton2.setText("highlight");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorletra_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorletra_btnMouseClicked
        // TODO add your handling code here:
        try {

            StyleConstants.setForeground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.red)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_colorletra_btnMouseClicked

    boolean cursivaActiva=false;
    boolean subrayadoActivo=false;
    private void guardararch_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardararch_btnMouseClicked
        JFileChooser jfc = new JFileChooser();
      
            jfc.setCurrentDirectory(new File("/words"));
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Text file", "txt");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File fichero ;
                if (jfc.getFileFilter().getDescription().equals("Text file")) {
                    fichero = new File(jfc.getSelectedFile().getPath() + ".txt");
                } else {
                    fichero = jfc.getSelectedFile();
                }

                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                Documento d = new Documento(tp_texto, doc, estilo);
                bw.writeObject(d);
                bw.flush();

                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
              
            }
        }
    }//GEN-LAST:event_guardararch_btnMouseClicked

    private void abrirarch_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirarch_btnMouseClicked
        // TODO add your handling code here:
        File fichero ;
        FileInputStream entrada ;
        ObjectInputStream objeto ;
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(new File("/words"));
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("text file", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                entrada = new FileInputStream(fichero);
                objeto = new ObjectInputStream(entrada);
                tp_texto.setText("");
                Documento temp = (Documento) objeto.readObject();
                tp_texto.setText(((Documento) temp).getPanel().getText());
                tp_texto.setStyledDocument(((Documento) temp).getDoc());
                

            }
        } catch (HeadlessException | IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe.");
        }

    }//GEN-LAST:event_abrirarch_btnMouseClicked

    private void combo_tipodeletraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipodeletraItemStateChanged
        // TODO add your handling code here:
        StyleConstants.setFontFamily(estilo, combo_tipodeletra.getSelectedItem().toString());
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
            tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
            tp_texto.getStyle("miEstilo"),
            true);
    }//GEN-LAST:event_combo_tipodeletraItemStateChanged

    private void combo_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tamañoActionPerformed
        // TODO add your handling code here:
        StyleConstants.setFontSize(estilo, Integer.parseInt(combo_tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
            tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
            tp_texto.getStyle("miEstilo"),
            true);
    }//GEN-LAST:event_combo_tamañoActionPerformed

    private void negritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negritaActionPerformed
        
        try {
            if (negritaActiva) {
                StyleConstants.setBold(estilo, false); 
                negritaActiva = false; 
            } else {
                StyleConstants.setBold(estilo, true);
                negritaActiva = true; 
            }

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
        } catch (Exception ex) {
            ex.printStackTrace(); // Maneja las excepciones de manera adecuada
        }

    }//GEN-LAST:event_negritaActionPerformed

    private void cursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cursivaActionPerformed
        
        try {
            if (cursivaActiva) {
                StyleConstants.setItalic(estilo, false); 
                cursivaActiva = false; 
            } else {
                StyleConstants.setItalic(estilo, true);
                cursivaActiva = true; 
            }

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
        } catch (Exception ex) {
            ex.printStackTrace(); // Maneja las excepciones de manera adecuada
        }

    }//GEN-LAST:event_cursivaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (subrayadoActivo) {
                StyleConstants.setUnderline(estilo, false);
                subrayadoActivo = false; 
            } else {
                StyleConstants.setUnderline(estilo, true);
                subrayadoActivo = true; 
            }

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            StyleConstants.setBackground(estilo,
                JColorChooser.showDialog(this,
                    "Seleccione Color", Color.yellow)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                tp_texto.getStyle("miEstilo"),
                true);
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void colorletra_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorletra_btnActionPerformed
        try {

            StyleConstants.setForeground(estilo,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.red)
            );

            doc.setCharacterAttributes(tp_texto.getSelectionStart(),
                    tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
                    tp_texto.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_colorletra_btnActionPerformed

    private void abrirarch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirarch_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirarch_btnActionPerformed
    boolean negritaActiva = false;
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
            java.util.logging.Logger.getLogger(editorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editorDeTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editorDeTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirarch_btn;
    private javax.swing.JButton colorletra_btn;
    private javax.swing.JComboBox<String> combo_tamaño;
    private javax.swing.JComboBox<String> combo_tipodeletra;
    private javax.swing.JButton cursiva;
    private javax.swing.JButton guardararch_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton negrita;
    private javax.swing.JTextPane tp_texto;
    // End of variables declaration//GEN-END:variables

  

}
