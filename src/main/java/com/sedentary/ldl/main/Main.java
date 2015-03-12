/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sedentary.ldl.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author rodrigo
 */
public class Main extends javax.swing.JFrame {

    private final JFileChooser fc = new JFileChooser();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOriginFile = new javax.swing.JLabel();
        txtOriginFile = new javax.swing.JTextField();
        btnOpenOriginFile = new javax.swing.JButton();
        lblPicturesFolder = new javax.swing.JLabel();
        txtPicturesFolder = new javax.swing.JTextField();
        btnOpenPicturesFolder = new javax.swing.JButton();
        lblOutputFolder = new javax.swing.JLabel();
        btnOpenOutputFolder = new javax.swing.JButton();
        txtOutputFolder = new javax.swing.JTextField();
        lblOutputFileName = new javax.swing.JLabel();
        txtOutputFileName = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        pbZipProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zipper - " + this.getClass().getPackage().getImplementationVersion());

        lblOriginFile.setText("Arquivo Origem:");

        btnOpenOriginFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-file.png"))); // NOI18N
        btnOpenOriginFile.setToolTipText("Selecionar arquivo");
        btnOpenOriginFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenOriginFileActionPerformed(evt);
            }
        });

        lblPicturesFolder.setText("Pasta Fotos:");

        btnOpenPicturesFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-file.png"))); // NOI18N
        btnOpenPicturesFolder.setToolTipText("Selecionar pasta");
        btnOpenPicturesFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPicturesFolderActionPerformed(evt);
            }
        });

        lblOutputFolder.setText("Pasta de Saida:");

        btnOpenOutputFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-file.png"))); // NOI18N
        btnOpenOutputFolder.setToolTipText("Selecionar pasta");
        btnOpenOutputFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenOutputFolderActionPerformed(evt);
            }
        });

        lblOutputFileName.setText("Arquivo de Saída:");

        btnStart.setText("Iniciar");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOriginFile)
                            .addComponent(lblPicturesFolder)
                            .addComponent(lblOutputFolder)
                            .addComponent(lblOutputFileName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOutputFileName)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOriginFile, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(txtPicturesFolder))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOpenOriginFile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOpenPicturesFolder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtOutputFolder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOpenOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pbZipProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOriginFile)
                    .addComponent(txtOriginFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpenOriginFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPicturesFolder)
                        .addComponent(txtPicturesFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOpenPicturesFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOutputFolder)
                        .addComponent(txtOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOpenOutputFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutputFileName)
                    .addComponent(txtOutputFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pbZipProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenOriginFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenOriginFileActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XLS", "xls");
        fc.setFileFilter(filter);
        fc.setCurrentDirectory(new File("."));
        fc.setDialogTitle("Selecione o arquivo com as referências");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            txtOriginFile.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnOpenOriginFileActionPerformed

    private void btnOpenPicturesFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPicturesFolderActionPerformed
        fc.setCurrentDirectory(new File("."));
        fc.setDialogTitle("Selecione a pasta onde se encontram as fotos");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            txtPicturesFolder.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnOpenPicturesFolderActionPerformed

    private void btnOpenOutputFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenOutputFolderActionPerformed
        fc.setCurrentDirectory(new File("."));
        fc.setDialogTitle("Selecione a pasta onde o arquivo será gravado");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = fc.showOpenDialog(this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            txtOutputFolder.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnOpenOutputFolderActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        File originFile = new File(txtOriginFile.getText());
        File picturesFolder = new File(txtPicturesFolder.getText());
        File outputFolder = new File(txtOutputFolder.getText());
        File outputFile = new File(outputFolder, txtOutputFileName.getText());
        
        if (!originFile.exists()) {
            JOptionPane.showMessageDialog(null, "Selecione um arquivo de origem válido");
            return;
        }
        if (!picturesFolder.exists()) {
            JOptionPane.showMessageDialog(null, "Selecione um diretório de fotos válido");
            return;
        }
        if (!outputFolder.exists()) {
            try {
                outputFolder.mkdirs();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Não é possível criar a pasta de saída");
                return;
            }
        }
        
        outputFile.delete();
        if (!outputFile.exists()) {
            try {
                outputFile.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não é possível criar o arquivo de saída");
                return;
            }
        }
        
        String[] refs = findReferences(originFile);
        if (refs == null) {
            JOptionPane.showMessageDialog(null, "O arquivo de origem não possui dados para processar");
            return;
        }
        
        // TODO encontrar arquivos e zipar
    }//GEN-LAST:event_btnStartActionPerformed
    
    private String[] findReferences(File originFile) {
        BufferedReader br = null;
        List<String> refs = new ArrayList<>();
        
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(originFile));
            
            while ((sCurrentLine = br.readLine()) != null) {
                String[] parts = sCurrentLine.split(",");
                for (String ref : parts) {
                    refs.add(ref);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                return null;
            }
        }
        
        return refs.toArray(new String[refs.size()]);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenOriginFile;
    private javax.swing.JButton btnOpenOutputFolder;
    private javax.swing.JButton btnOpenPicturesFolder;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblOriginFile;
    private javax.swing.JLabel lblOutputFileName;
    private javax.swing.JLabel lblOutputFolder;
    private javax.swing.JLabel lblPicturesFolder;
    private javax.swing.JProgressBar pbZipProgress;
    private javax.swing.JTextField txtOriginFile;
    private javax.swing.JTextField txtOutputFileName;
    private javax.swing.JTextField txtOutputFolder;
    private javax.swing.JTextField txtPicturesFolder;
    // End of variables declaration//GEN-END:variables
}
