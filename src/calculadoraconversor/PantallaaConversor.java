package calculadoraconversor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


public class PantallaaConversor extends javax.swing.JPanel {
    private operaciones operaciones = new operaciones(); 
    private boolean invertido = false;
    public PantallaaConversor() {
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

        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnInversa = new javax.swing.JToggleButton();
        btnKiloLibra = new javax.swing.JButton();
        BtnSolDolar = new javax.swing.JToggleButton();
        BtngradosCF = new javax.swing.JToggleButton();
        BtnPiesMetros = new javax.swing.JToggleButton();

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor");

        jLabel2.setText("Resultado");

        labelResultado.setText("0.00");

        jLabel3.setText("inversa");

        btnInversa.setText("0");
        btnInversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInversaActionPerformed(evt);
            }
        });

        btnKiloLibra.setText("Kg a Lb");
        btnKiloLibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiloLibraActionPerformed(evt);
            }
        });

        BtnSolDolar.setText("Sol a Dol");
        BtnSolDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSolDolarActionPerformed(evt);
            }
        });

        BtngradosCF.setText("C° a F°");
        BtngradosCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtngradosCFActionPerformed(evt);
            }
        });

        BtnPiesMetros.setText("Feet a Mt");
        BtnPiesMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPiesMetrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnInversa)
                            .addGap(27, 27, 27)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelResultado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPiesMetros)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BtngradosCF))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnKiloLibra)
                        .addComponent(BtnSolDolar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnKiloLibra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelResultado)
                    .addComponent(BtnSolDolar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnInversa))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtngradosCF)
                        .addGap(12, 12, 12)
                        .addComponent(BtnPiesMetros)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnKiloLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiloLibraActionPerformed
         double valor = Double.parseDouble(txtValor.getText());
         double resultado = operaciones.convertirKilosLibras(valor, invertido);
         labelResultado.setText(resultado + " ");
    }//GEN-LAST:event_btnKiloLibraActionPerformed

    private void BtnSolDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSolDolarActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        double resultado = operaciones.convertirSolDolar(valor, invertido);
        labelResultado.setText(resultado + " ");
    }//GEN-LAST:event_BtnSolDolarActionPerformed

    private void BtngradosCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtngradosCFActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        double resultado = operaciones.convertirGrados(valor, invertido);
        labelResultado.setText(resultado + " ");
    }//GEN-LAST:event_BtngradosCFActionPerformed

    private void BtnPiesMetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPiesMetrosActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        double resultado = operaciones.convertirPiesMetros(valor, invertido);
        labelResultado.setText(resultado + " ");
    }//GEN-LAST:event_BtnPiesMetrosActionPerformed

    private void btnInversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInversaActionPerformed
        invertido = !invertido;
    }//GEN-LAST:event_btnInversaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnPiesMetros;
    private javax.swing.JToggleButton BtnSolDolar;
    private javax.swing.JToggleButton BtngradosCF;
    private javax.swing.JToggleButton btnInversa;
    private javax.swing.JButton btnKiloLibra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
