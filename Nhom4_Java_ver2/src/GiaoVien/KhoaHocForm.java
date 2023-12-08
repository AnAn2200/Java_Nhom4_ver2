package GiaoVien;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KhoaHocForm extends javax.swing.JFrame {

    public KhoaHocForm() {
        initComponents();
        setLocationRelativeTo(null);
        LoadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhoaHoc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbKhoaHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma mon", "Ma lop", "Ten mon", "So sinh vien"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhoaHoc);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("THONG TIN KHOA HOC");

        txtTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        btnTim.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTim.setText("Tim kiem");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<KhoaHoc> khoa = new ArrayList<>();
    private void LoadData(){
        KhoaHoc k1 = new KhoaHoc("IT6019.1","IT6019","Lap trinh Java",70);
        KhoaHoc k2 = new KhoaHoc("IT6019.2","IT6019","Lap trinh Java",68);
        KhoaHoc k3 = new KhoaHoc("IT6019.3","IT6019","Lap trinh Java",69);
        KhoaHoc k4 = new KhoaHoc("IT6020.1","IT6020","Lap trinh C#",71);
        KhoaHoc k5 = new KhoaHoc("IT6018.1","IT6018","Lap trinh C++",72);
        KhoaHoc k6 = new KhoaHoc("IT6021.1","IT6021","He dieu hanh",70);
        khoa.add(k1);
        khoa.add(k2);
        khoa.add(k3);
        khoa.add(k4);
        khoa.add(k5);
        khoa.add(k6);
        
        DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
        for(KhoaHoc item : khoa){
            model.addRow(new Object[]{item.getMaMon(),item.getMaLop(),item.getTenMon(),item.getSoSinhVien()});
        } 
    }
    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
//        if(txtTim.getText().equals("")){
//            model.setRowCount(0);
//            for(KhoaHoc item : khoa){
//                model.addRow(new Object[]{item.getMaMon(),item.getMaLop(),item.getTenMon(),item.getSoSinhVien()});
//            }
//        }
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
       
       DefaultTableModel model = (DefaultTableModel)tbKhoaHoc.getModel();
       model.setRowCount(0);
       
       String maMon = txtTim.getText();
       String tenMon = txtTim.getText();
       
       for(KhoaHoc item : khoa){
           if(item.getMaMon().equals(maMon) || item.getTenMon().equals(tenMon)){
               model.addRow(new Object[]{item.getMaMon(),item.getMaLop(),item.getTenMon(),item.getSoSinhVien()});
           }
       }
       if(model.getRowCount() == 0){
           JOptionPane.showMessageDialog(null, "Khong co thong tin lop hoc");
       }
    }//GEN-LAST:event_btnTimActionPerformed

    private void tbKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhoaHocMouseClicked
        
            LopHocForm lop = new LopHocForm();
            int row = tbKhoaHoc.getSelectedRow();
            int col = tbKhoaHoc.getSelectedColumn();
            String maLop = (String) tbKhoaHoc.getValueAt(row, col);
            String maMon = (String) tbKhoaHoc.getValueAt(row, col);
            KhoaHoc khoaHoc = null;
            for (KhoaHoc item : khoa) {
                if (item.getMaLop().equals(maLop) || item.getMaMon().equals(maMon)) {
                    khoaHoc = item;
                    break;
                }
            }
            if(khoaHoc != null){
                lop.setVisible(true);
                setVisible(false);
            }
    }//GEN-LAST:event_tbKhoaHocMouseClicked

     
    
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
            java.util.logging.Logger.getLogger(KhoaHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoaHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoaHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoaHocForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhoaHocForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKhoaHoc;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
