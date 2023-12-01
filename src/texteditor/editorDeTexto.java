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
        color_letra = new javax.swing.JButton();
        abrirarch_btn = new javax.swing.JButton();
        guardararch_btn = new javax.swing.JButton();
        combo_tipodeletra = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combo_tamaño = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        negrita = new javax.swing.JButton();
        cursiva = new javax.swing.JButton();
        subrayado = new javax.swing.JButton();
        highlight = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDITOR DE TEXTO PROFESIONAL -  SI LEE ESTO DEME 5 PUNTOS EXTRAS");
        setPreferredSize(new java.awt.Dimension(976, 637));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tp_texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 140, 920, 450));

        color_letra.setBackground(new java.awt.Color(0, 0, 153));
        color_letra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        color_letra.setForeground(new java.awt.Color(204, 204, 255));
        color_letra.setText("color font");
        color_letra.setMaximumSize(new java.awt.Dimension(76, 11));
        color_letra.setMinimumSize(new java.awt.Dimension(76, 11));
        color_letra.setPreferredSize(new java.awt.Dimension(76, 11));
        color_letra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                color_letraMouseClicked(evt);
            }
        });
        color_letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                color_letraActionPerformed(evt);
            }
        });
        getContentPane().add(color_letra, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 100, 40));

        abrirarch_btn.setBackground(new java.awt.Color(0, 0, 153));
        abrirarch_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        abrirarch_btn.setForeground(new java.awt.Color(204, 204, 255));
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
        getContentPane().add(abrirarch_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 40));

        guardararch_btn.setBackground(new java.awt.Color(0, 0, 153));
        guardararch_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guardararch_btn.setForeground(new java.awt.Color(204, 204, 255));
        guardararch_btn.setText("save file");
        guardararch_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardararch_btnMouseClicked(evt);
            }
        });
        guardararch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardararch_btnActionPerformed(evt);
            }
        });
        getContentPane().add(guardararch_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 100, 40));

        combo_tipodeletra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipodeletraItemStateChanged(evt);
            }
        });
        getContentPane().add(combo_tipodeletra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 160, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("size");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 160, 30));

        combo_tamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "8", "10", "12", "14", "16", "18", "20", "24", "28", "32", "36", "42", "48", "60", "72" }));
        combo_tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tamañoActionPerformed(evt);
            }
        });
        getContentPane().add(combo_tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("font");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 140, 30));

        negrita.setBackground(new java.awt.Color(0, 0, 153));
        negrita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        negrita.setForeground(new java.awt.Color(204, 204, 255));
        negrita.setText("negrita");
        negrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negritaActionPerformed(evt);
            }
        });
        getContentPane().add(negrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 40));

        cursiva.setBackground(new java.awt.Color(0, 0, 153));
        cursiva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cursiva.setForeground(new java.awt.Color(204, 204, 255));
        cursiva.setText("cursiva");
        cursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cursivaActionPerformed(evt);
            }
        });
        getContentPane().add(cursiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 80, 40));

        subrayado.setBackground(new java.awt.Color(0, 0, 153));
        subrayado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subrayado.setForeground(new java.awt.Color(204, 204, 255));
        subrayado.setText("subrayado");
        subrayado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subrayadoActionPerformed(evt);
            }
        });
        getContentPane().add(subrayado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 100, 40));

        highlight.setBackground(new java.awt.Color(0, 0, 153));
        highlight.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        highlight.setForeground(new java.awt.Color(204, 204, 255));
        highlight.setText("highlight");
        highlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highlightActionPerformed(evt);
            }
        });
        getContentPane().add(highlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 100, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void color_letraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color_letraMouseClicked
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
    }//GEN-LAST:event_color_letraMouseClicked

    boolean cursivaActiva=false;
    boolean subrayadoActivo=false;
    
    private void guardararch_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardararch_btnMouseClicked
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("words"));
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
        } 
    }//GEN-LAST:event_guardararch_btnMouseClicked

    private void abrirarch_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirarch_btnMouseClicked
       File fichero;
        FileInputStream entrada;
        ObjectInputStream objeto;
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setCurrentDirectory(new File("words"));
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("text file", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                entrada = new FileInputStream(fichero);
                objeto = new ObjectInputStream(entrada);
                tp_texto.setText("");
                Documento temp = (Documento) objeto.readObject();
                tp_texto.setStyledDocument(temp.getDoc());
                doc = temp.getDoc();
                estilo = temp.getEstilo();
            }
        } catch (HeadlessException | IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe.");
        }
    }//GEN-LAST:event_abrirarch_btnMouseClicked

    private void combo_tipodeletraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipodeletraItemStateChanged
        StyleConstants.setFontFamily(estilo, combo_tipodeletra.getSelectedItem().toString());
        doc.setCharacterAttributes(tp_texto.getSelectionStart(),
            tp_texto.getSelectionEnd() - tp_texto.getSelectionStart(),
            tp_texto.getStyle("miEstilo"),
            true);
    }//GEN-LAST:event_combo_tipodeletraItemStateChanged

    private void combo_tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tamañoActionPerformed
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
        }
    }//GEN-LAST:event_cursivaActionPerformed

    private void subrayadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subrayadoActionPerformed
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
        }

    }//GEN-LAST:event_subrayadoActionPerformed

    private void highlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highlightActionPerformed
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

    }//GEN-LAST:event_highlightActionPerformed

    private void color_letraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_color_letraActionPerformed
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
    }//GEN-LAST:event_color_letraActionPerformed

    private void abrirarch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirarch_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirarch_btnActionPerformed

    private void guardararch_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardararch_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardararch_btnActionPerformed
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
    private javax.swing.JButton color_letra;
    private javax.swing.JComboBox<String> combo_tamaño;
    private javax.swing.JComboBox<String> combo_tipodeletra;
    private javax.swing.JButton cursiva;
    private javax.swing.JButton guardararch_btn;
    private javax.swing.JButton highlight;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton negrita;
    private javax.swing.JButton subrayado;
    private javax.swing.JTextPane tp_texto;
    // End of variables declaration//GEN-END:variables

  

}
