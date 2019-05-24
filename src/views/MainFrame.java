/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regionItem = new javax.swing.JMenuItem();
        countryItem = new javax.swing.JMenuItem();
        locationItem = new javax.swing.JMenuItem();
        departmentItem = new javax.swing.JMenuItem();
        employeeItem = new javax.swing.JMenuItem();
        jobItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, null));
        jMenu1.setText("Main");
        jMenu1.setAlignmentX(4.0F);
        jMenu1.setAlignmentY(4.0F);

        regionItem.setText("Region");
        regionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionItemActionPerformed(evt);
            }
        });
        jMenu1.add(regionItem);

        countryItem.setText("Country");
        countryItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryItemActionPerformed(evt);
            }
        });
        jMenu1.add(countryItem);

        locationItem.setText("Location");
        locationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationItemActionPerformed(evt);
            }
        });
        jMenu1.add(locationItem);

        departmentItem.setText("Department");
        departmentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentItemActionPerformed(evt);
            }
        });
        jMenu1.add(departmentItem);

        employeeItem.setText("Employee");
        employeeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeItemActionPerformed(evt);
            }
        });
        jMenu1.add(employeeItem);

        jobItem.setText("Job");
        jobItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobItemActionPerformed(evt);
            }
        });
        jMenu1.add(jobItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regionItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionItemActionPerformed
        JIRegionView regionView = new JIRegionView();
        this.jDesktopPane1.add(regionView);
        regionView.show();
    }//GEN-LAST:event_regionItemActionPerformed

    private void countryItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryItemActionPerformed

    private void locationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationItemActionPerformed

    private void departmentItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentItemActionPerformed

    private void employeeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeItemActionPerformed

    private void jobItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem countryItem;
    private javax.swing.JMenuItem departmentItem;
    private javax.swing.JMenuItem employeeItem;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jobItem;
    private javax.swing.JMenuItem locationItem;
    private javax.swing.JMenuItem regionItem;
    // End of variables declaration//GEN-END:variables
}
