/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_akhir;

import java.awt.Component;
import java.util.Objects;
import java.util.Stack;
import javax.swing.JOptionPane;


/**
 *
 * @author diego
 */

public class NewJFrame extends javax.swing.JFrame {

    private Component frame;
    Stack daftar = new Stack();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        skor1 = new javax.swing.JTextField();
        skor2 = new javax.swing.JTextField();
        timhome = new javax.swing.JComboBox<>();
        timaway = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnhistory = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        frmreport = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Score Updater");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skor1.setFont(new java.awt.Font("Manteka", 0, 48)); // NOI18N
        skor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skor1.setText("-");
        skor1.setToolTipText("");
        skor1.setBorder(null);
        getContentPane().add(skor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 100, 70, 100));

        skor2.setFont(new java.awt.Font("Manteka", 0, 48)); // NOI18N
        skor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        skor2.setText("-");
        skor2.setBorder(null);
        getContentPane().add(skor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 99, 70, 100));

        timhome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arema FC", "Bali United", "Barito Putra", "Bhayangkara FC", "Borneo FC", "Kalteng Putra", "Madura United", "Persebaya", "Persela", "Badak Lampung", "Persib", "Persija", "Persipura", "PSIS Semarang", "PSM Makassar", "PSS Sleman", "Semen Padang", "Tira Persikabo" }));
        timhome.setBorder(null);
        getContentPane().add(timhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 149, 180, 30));

        timaway.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arema FC", "Bali United", "Barito Putra", "Bhayangkara FC", "Borneo FC", "Kalteng Putra", "Madura United", "Persebaya", "Persela", "Badak Lampung", "Persib", "Persija", "Persipura", "PSIS Semarang", "PSM Makassar", "PSS Sleman", "Semen Padang", "Tira Persikabo" }));
        timaway.setBorder(null);
        getContentPane().add(timaway, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 149, 180, 30));

        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 214, -1, 40));

        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 214, -1, 40));

        btnhistory.setText("HISTORY");
        btnhistory.setToolTipText("");
        btnhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnhistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 214, -1, 40));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(220, 50));

        frmreport.setColumns(20);
        frmreport.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        frmreport.setLineWrap(true);
        frmreport.setRows(5);
        frmreport.setToolTipText("");
        frmreport.setBorder(null);
        frmreport.setPreferredSize(new java.awt.Dimension(220, 50));
        jScrollPane1.setViewportView(frmreport);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas_akhir/base.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void report(){
        Integer skorhm=Integer.parseInt(skor1.getText());
        Integer skoraw=Integer.parseInt(skor2.getText());
        Integer timhm=(timhome.getSelectedIndex());
        Integer timaw=(timaway.getSelectedIndex());
        if (skorhm<0){
            frmreport.setText("Anda memasukkan angka yang salah.\n");
        }  
        else if(skoraw<0){
            frmreport.setText("Anda memasukkan angka yang salah.\n");
        }
        else if(Objects.equals(timhm, timaw)){
            frmreport.setText("Tidak bisa memilih tim yang sama");
        }
        else{int jawab=JOptionPane.showConfirmDialog(this, "Apakah Skor sudah benar?");
     switch(jawab){
        case JOptionPane.YES_OPTION:
            frmreport.setText((timhome.getSelectedItem().toString())+" "+(skorhm)+" - "+(skoraw)+" "+(timaway.getSelectedItem().toString())+" [BERHASIL]\n");
            break;
        case JOptionPane.NO_OPTION:
            frmreport.setText((timhome.getSelectedItem().toString())+" "+(skorhm)+" - "+(skoraw)+" "+(timaway.getSelectedItem().toString())+" [GAGAL]\n");
            break;
        case JOptionPane.CANCEL_OPTION:
            break;
     }
        String report=frmreport.getText();
        daftar.push(report);}
        
    }
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try{
            report();
        }
        catch(Exception String){
         frmreport.setText("Anda tidak memasukkan angka");  
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    skor1.setText("-");
    skor2.setText("-");
    frmreport.setText("");
    timhome.setSelectedItem("Arema FC");
    timaway.setSelectedItem("Arema FC");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistoryActionPerformed
        //UIManager.put("OptionPane.minimumSize",new Dimension(400, 300)); 
        JOptionPane.showMessageDialog(null, daftar, "HISTORY", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnhistoryActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhistory;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JTextArea frmreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField skor1;
    private javax.swing.JTextField skor2;
    private javax.swing.JComboBox<String> timaway;
    private javax.swing.JComboBox<String> timhome;
    // End of variables declaration//GEN-END:variables
}
