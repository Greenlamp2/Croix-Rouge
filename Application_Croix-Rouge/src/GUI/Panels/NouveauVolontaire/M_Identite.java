/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels.NouveauVolontaire;

import Containers.Identite;
import Containers.Volontaire;
import EasyCheck.EasyCheck;
import GUI.Panels.Main;
import Network.NetworkClient;
import SSL.NetworkClientSSL;
import my.cr.PacketCom.PacketCom;
import States.States;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Greenlamp
 */
public class M_Identite extends javax.swing.JPanel {

    /**
     * Creates new form M_Identite
     */
    Main parent = null;
    NetworkClientSSL socket = null;
    Volontaire volontaire = null;
    String matricule = null;
    boolean edited = false;

    public M_Identite(Main parent, NetworkClientSSL socket) {
        initComponents();
        this.socket = socket;
        this.parent = parent;
        ComboBoxAnnee();
        matricule = parent.getMatricule();
        if(matricule != null){
            edited = true;
            Gtitre.setText("Modifier un volontaire");
        }else{
            edited = false;
        }
        volontaire = parent.getVolontaire();
        if(volontaire != null){
            if(volontaire.getIdentite() != null){
                this.completerChampIdentite();
            }
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Gtitre = new javax.swing.JLabel();
        Baccueil1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Gnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Gprenom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ghomme = new javax.swing.JRadioButton();
        Gfemme = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Gepouse = new javax.swing.JTextField();
        Gjour = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        Gmois = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        Gannee = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        Bterminer = new javax.swing.JButton();
        Bannuler = new javax.swing.JButton();
        Bsuivant = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Gimage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Gphoto = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        Gtitre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Gtitre.setText("Nouveau volontaire");

        Baccueil1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Baccueil1.setForeground(new java.awt.Color(0, 0, 255));
        Baccueil1.setText("ACCUEIL");
        Baccueil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Baccueil1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Baccueil1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gtitre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Baccueil1)
                    .addComponent(Gtitre))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identité");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setText("Nom");

        jLabel4.setText("prénom");

        jLabel5.setText("sexe");

        Ghomme.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(Ghomme);
        Ghomme.setSelected(true);
        Ghomme.setText("H");
        Ghomme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GhommeActionPerformed(evt);
            }
        });

        Gfemme.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(Gfemme);
        Gfemme.setText("F");
        Gfemme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GfemmeActionPerformed(evt);
            }
        });

        jLabel6.setText("Nom d'épouse");

        Gepouse.setEnabled(false);

        Gjour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel7.setText("/");

        Gmois.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jLabel8.setText("/");

        jLabel9.setText("Date de naissance");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gnom)
                    .addComponent(Gprenom)
                    .addComponent(Gepouse)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Ghomme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Gfemme))
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Gjour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Gmois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Gannee, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 199, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ghomme)
                    .addComponent(Gfemme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gepouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gjour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Gmois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Gannee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel114.setText("Page: ");

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel115.setText("1");

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel116.setText("/");

        jLabel117.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel117.setText("9");

        Bterminer.setText("Terminer");
        Bterminer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BterminerActionPerformed(evt);
            }
        });

        Bannuler.setText("Annuler");
        Bannuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BannulerActionPerformed(evt);
            }
        });

        Bsuivant.setText("Suivant");
        Bsuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsuivantActionPerformed(evt);
            }
        });

        jButton1.setText("Lire carte d'identité");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bannuler, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bterminer, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(Bsuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(jLabel115)
                    .addComponent(jLabel116)
                    .addComponent(jLabel117)
                    .addComponent(Bannuler)
                    .addComponent(Bterminer)
                    .addComponent(Bsuivant)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Gimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/infirmiere3.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gphoto)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gphoto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(Gimage))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(Gimage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BterminerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BterminerActionPerformed
        if(checkChamps()){
            creerClasse();
            envoyerClasse();
            parent.cleanBackup();
        }
    }//GEN-LAST:event_BterminerActionPerformed

    private void BsuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsuivantActionPerformed
        if(checkChamps()){
            creerClasse();
            parent.changeState(Main.NOUVEAU_VOLONTAIRE_PAGE_2);
        }
    }//GEN-LAST:event_BsuivantActionPerformed

    private void BannulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BannulerActionPerformed
        parent.changeState(Main.LOGGED);
        parent.cleanBackup();
    }//GEN-LAST:event_BannulerActionPerformed

    private void GfemmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GfemmeActionPerformed
        if(Gfemme.isSelected()){
            Gepouse.setEnabled(true);
        }else{
            Gepouse.setEnabled(false);
        }
    }//GEN-LAST:event_GfemmeActionPerformed

    private void GhommeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GhommeActionPerformed
        if(Gfemme.isSelected()){
            Gepouse.setEnabled(true);
        }else{
            Gepouse.setEnabled(false);
        }
    }//GEN-LAST:event_GhommeActionPerformed

    private void Baccueil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Baccueil1ActionPerformed
        parent.changeState(Main.LOGGED);
    }//GEN-LAST:event_Baccueil1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ApercuCarte apercuCarte = new ApercuCarte(parent, true, parent);
        apercuCarte.setVisible(true);
        volontaire = parent.getVolontaire();
        if(volontaire != null){
            if(volontaire.getIdentite() != null){
                this.completerChampIdentite();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baccueil1;
    private javax.swing.JButton Bannuler;
    private javax.swing.JButton Bsuivant;
    private javax.swing.JButton Bterminer;
    private javax.swing.JComboBox Gannee;
    private javax.swing.JTextField Gepouse;
    private javax.swing.JRadioButton Gfemme;
    private javax.swing.JRadioButton Ghomme;
    private javax.swing.JLabel Gimage;
    private javax.swing.JComboBox Gjour;
    private javax.swing.JComboBox Gmois;
    private javax.swing.JTextField Gnom;
    private javax.swing.JLabel Gphoto;
    private javax.swing.JTextField Gprenom;
    private javax.swing.JLabel Gtitre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void ComboBoxAnnee() {
        String annéeToday = new SimpleDateFormat("yyyy").format(new Date());
        int année = Integer.parseInt(annéeToday);
        for(int i=année-16; i>=1920; i--){
            Gannee.addItem(i);
        }
    }

    private boolean checkChamps() {
        if(!EasyCheck.checkString(Gnom.getText())){
            parent.afficherMessage("Nom invalide");
            Gnom.requestFocus();
            return false;
        }else if(!EasyCheck.checkString(Gprenom.getText())){
            parent.afficherMessage("Prenom invalide");
            Gprenom.requestFocus();
            return false;
        }else if(!EasyCheck.checkDate(Gjour, Gmois, Gannee)){
            parent.afficherMessage("date incorrect");
            return false;
        }
        return true;
    }

    private void creerClasse() {
        String nom = Gnom.getText();
        nom = nom.toUpperCase();
        String prenom = Gprenom.getText();
        prenom = prenom.toLowerCase();
        prenom = prenom.substring(0, 1).toUpperCase() + prenom.substring(1, prenom.length());
        String sexe = (Ghomme.isSelected() ? "M" : "F");
        String nomEpouse = Gepouse.getText();
        String jour = Gjour.getSelectedItem().toString();
        String mois = Gmois.getSelectedItem().toString();
        String annee = Gannee.getSelectedItem().toString();
        String dateNaissance = jour + "/" + mois + "/" + annee;
        String matricule = parent.getMatricule();
        byte[] photoId = null;
        if(Gphoto.getIcon() != null){
            Image photo = iconToImage(Gphoto.getIcon());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                BufferedImage bufferedImage = createBufferedImage(photo);
                ImageIO.write(bufferedImage, "png", baos);
                photoId = baos.toByteArray();
            }catch(Exception ex){
            }finally{
                try{
                    if(baos != null){
                        baos.close();
                    }
                }catch(Exception ex){

                }
            }
        }


        if(matricule == null){
            matricule = nom + "-" + prenom;
        }

        Identite identite = new Identite();
        identite.setMatricule(matricule);
        identite.setNom(nom);
        identite.setPrenom(prenom);
        identite.setSexe(sexe);
        identite.setNomJeuneFille(nomEpouse);
        identite.setCompleted(false);
        try {
            identite.setDateNaissance(new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissance));
        } catch (ParseException ex) {
            Logger.getLogger(M_Identite.class.getName()).log(Level.SEVERE, null, ex);
        }
        identite.setPhoto(photoId);

        if(volontaire == null){
            volontaire = new Volontaire();
        }

        volontaire.setIdentite(identite);
        parent.setVolontaire(volontaire);
    }

    public Image iconToImage(Icon icon){
        if(icon instanceof ImageIcon){
            return ((ImageIcon)icon).getImage();
        }else{
            int w = icon.getIconWidth();
            int h = icon.getIconHeight();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice gd = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gd.getDefaultConfiguration();
            BufferedImage image = gc.createCompatibleImage(w, h);
            Graphics2D g = image.createGraphics();
            icon.paintIcon(null, g, 0, 0);
            g.dispose();
            return image;
        }

    }

    private void completerChampIdentite() {
        String nom = volontaire.getIdentite().getNom();
        String prenom = volontaire.getIdentite().getPrenom();
        String sexe = volontaire.getIdentite().getSexe();
        String nomEpouse = volontaire.getIdentite().getNomJeuneFille();
        Date dateNaissance = volontaire.getIdentite().getDateNaissance();
        int jour = 1;
        int mois = 1;
        int annee = 2000;
        if(dateNaissance != null){
            jour = Integer.parseInt(new SimpleDateFormat("dd").format(dateNaissance));
            mois = Integer.parseInt(new SimpleDateFormat("MM").format(dateNaissance));
            annee = Integer.parseInt(new SimpleDateFormat("yyyy").format(dateNaissance));
        }

        Gnom.setText(nom);
        Gprenom.setText(prenom);
        if(sexe.equals("M")){
            Ghomme.setSelected(true);
            Gepouse.setEnabled(false);
        }else{
            Gfemme.setSelected(true);
            Gepouse.setEnabled(true);
        }
        Gepouse.setText(nomEpouse);
        Gjour.setSelectedIndex(jour-1);
        Gmois.setSelectedIndex(mois-1);

        boolean found = false;
        for(int i=0; i<Gannee.getItemCount() && !found; i++){
            if(Integer.parseInt(Gannee.getItemAt(i).toString()) == annee){
                Gannee.setSelectedIndex(i);
                found = true;
            }
        }
        if(volontaire.getIdentite().getPhoto() != null){
            Gphoto.setIcon(new ImageIcon(volontaire.getIdentite().getPhoto()));
        }
    }

    private void envoyerClasse() {
        PacketCom packet = null;
        if(!edited){
            packet = new PacketCom(States.NOUVEAU_VOLONTAIRE, (Object)volontaire);
        }else{
            packet = new PacketCom(States.EDIT_VOLONTAIRE, (Object)volontaire);
        }
        socket.send(packet);
        boolean cont = false;
        try {
            PacketCom packetReponse = socket.receive();
            String type = packetReponse.getType();
            if(type.equals(States.EDIT_VOLONTAIRE_OUI)){
                parent.afficherMessage("Modification du volontaire réussi.");
                cont = true;
            }else if(type.equals(States.NOUVEAU_VOLONTAIRE_OUI)){
                parent.afficherMessage("Ajout du  nouveau volontaire réussi.");
                cont = true;
            }else{
                String message = (String) packetReponse.getObjet();
                volontaire = parent.getVolontaire();
                parent.afficherMessage(message);
            }
        } catch (Exception ex) {
            Logger.getLogger(M_Identite.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(cont){
            parent.cleanBackup();
            parent.changeState(Main.LOGGED);
        }
    }

    private BufferedImage createBufferedImage(Image photo) {
        if(photo instanceof BufferedImage){
            return (BufferedImage) photo;
        }else{
            BufferedImage bi = new BufferedImage(photo.getWidth(null), photo.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = bi.createGraphics();
            g2.drawImage(photo, 0, 0, null);
            return bi;
        }
    }
}
