/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.*;


/**
 *
 * @author alexm
 */
public class EscolhaRandom extends javax.swing.JFrame {

    /**
     * Creates new form EscolhaRandom
     */
    public EscolhaRandom() {
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

        lblPalpite = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBicho = new javax.swing.JLabel();
        lblMilhar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPalpite.setBackground(new java.awt.Color(255, 255, 255));
        lblPalpite.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPalpite.setText("00");
        getContentPane().add(lblPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 61, -1, -1));

        jButton1.setText("Gerar Palpite");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 326, 460, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Bicho:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Palpite de hoje:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Palpite de Milhar:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lblBicho.setBackground(new java.awt.Color(255, 255, 255));
        lblBicho.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblBicho.setText("-------");
        getContentPane().add(lblBicho, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 111, -1, -1));

        lblMilhar.setBackground(new java.awt.Color(255, 255, 255));
        lblMilhar.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblMilhar.setText("0000");
        getContentPane().add(lblMilhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 11, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prof-x.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random gerador = new Random();
        HashMap<String, String> dic = new HashMap<String, String>();
        
        dic.put("01" , "01 - Avestruz");
        dic.put("02" , "01 - Avestruz");
        dic.put("03" , "01 - Avestruz");
        dic.put("04" , "01 - Avestruz");
        dic.put("05" , "02 - Águia");
        dic.put("06" , "02 - Águia");
        dic.put("07" , "02 - Águia");
        dic.put("08" , "02 - Águia");
        dic.put("09" , "03 - Burro");
        dic.put("10" , "03 - Burro");
        dic.put("11" , "03 - Burro");
        dic.put("12" , "03 - Burro");
        dic.put("13" , "04 - Borboleta");
        dic.put("14" , "04 - Borboleta");
        dic.put("15" , "04 - Borboleta");
        dic.put("16" , "04 - Borboleta");
        dic.put("17" , "05 - Cachorro");
        dic.put("18" , "05 - Cachorro");
        dic.put("19" , "05 - Cachorro");
        dic.put("20" , "05 - Cachorro");
        dic.put("21" , "06 - Cabra");
        dic.put("22" , "06 - Cabra");
        dic.put("23" , "06 - Cabra");
        dic.put("24" , "06 - Cabra");
        dic.put("25" , "07 - Carneiro");
        dic.put("26" , "07 - Carneiro");
        dic.put("27" , "07 - Carneiro");
        dic.put("28" , "07 - Carneiro");
        dic.put("29" , "08 - Camelo");
        dic.put("30" , "08 - Camelo");
        dic.put("31" , "08 - Camelo");
        dic.put("32" , "08 - Camelo");
        dic.put("33" , "09 - Cobra");
        dic.put("34" , "09 - Cobra");
        dic.put("35" , "09 - Cobra");
        dic.put("36" , "09 - Cobra");
        dic.put("37" , "10 - Coelho");
        dic.put("38" , "10 - Coelho");
        dic.put("39" , "10 - Coelho");
        dic.put("40" , "10 - Coelho");
        dic.put("41" , "11 - Cavalo");
        dic.put("42" , "11 - Cavalo");
        dic.put("43" , "11 - Cavalo");
        dic.put("44" , "11 - Cavalo");
        dic.put("45" , "12 - Elefante");
        dic.put("46" , "12 - Elefante");
        dic.put("47" , "12 - Elefante");
        dic.put("48" , "12 - Elefante");
        dic.put("49" , "13 - Galo");
        dic.put("50" , "13 - Galo");
        dic.put("51" , "13 - Galo");
        dic.put("52" , "13 - Galo");
        dic.put("53" , "14 - Gato");
        dic.put("54" , "14 - Gato");
        dic.put("55" , "14 - Gato");
        dic.put("56" , "14 - Gato");
        dic.put("57" , "15 - Jacaré");
        dic.put("58" , "15 - Jacaré");
        dic.put("59" , "15 - Jacaré");
        dic.put("60" , "15 - Jacaré");
        dic.put("61" , "16 - Leão");
        dic.put("62" , "16 - Leão");
        dic.put("63" , "16 - Leão");
        dic.put("64" , "16 - Leão");
        dic.put("65" , "17 - Macaco");
        dic.put("66" , "17 - Macaco");
        dic.put("67" , "17 - Macaco");
        dic.put("68" , "17 - Macaco");
        dic.put("69" , "18 - Porco");
        dic.put("70" , "18 - Porco");
        dic.put("71" , "18 - Porco");
        dic.put("72" , "18 - Porco");
        dic.put("73" , "19 - Pavão");
        dic.put("74" , "19 - Pavão");
        dic.put("75" , "19 - Pavão");
        dic.put("76" , "19 - Pavão");
        dic.put("77" , "20 - Peru");
        dic.put("78" , "20 - Peru");
        dic.put("79" , "20 - Peru");
        dic.put("80" , "20 - Peru");
        dic.put("81" , "21 - Touro");
        dic.put("82" , "21 - Touro");
        dic.put("83" , "21 - Touro");
        dic.put("84" , "21 - Touro");
        dic.put("85" , "22 - Tigre");
        dic.put("86" , "22 - Tigre");
        dic.put("87" , "22 - Tigre");
        dic.put("88" , "22 - Tigre");
        dic.put("89" , "23 - Urso");
        dic.put("90" , "23 - Urso");
        dic.put("91" , "23 - Urso");
        dic.put("92" , "23 - Urso");
        dic.put("93" , "24 - Veado");
        dic.put("94" , "24 - Veado");
        dic.put("95" , "24 - Veado");
        dic.put("96" , "24 - Veado");
        dic.put("97" , "25 - Vaca");
        dic.put("98" , "25 - Vaca");
        dic.put("99" , "25 - Vaca");
        dic.put("00" , "25 - Vaca");
        
        int pal_1 = gerador.nextInt(10);
        int pal_2 = gerador.nextInt(10);
        int pal_3 = gerador.nextInt(10);
        int pal_4 = gerador.nextInt(10);                
        String soma = Integer.toString(pal_1) + Integer.toString(pal_2);
        lblPalpite.setText(soma);
        String milhar = Integer.toString(pal_3) + Integer.toString(pal_4) + Integer.toString(pal_1) + Integer.toString(pal_2);
        lblBicho.setText(dic.get(soma));
        lblMilhar.setText(milhar);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EscolhaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaRandom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBicho;
    private javax.swing.JLabel lblMilhar;
    private javax.swing.JLabel lblPalpite;
    // End of variables declaration//GEN-END:variables
}
