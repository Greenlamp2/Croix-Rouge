/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import Network.NetworkClient;
import my.cr.PacketCom.PacketCom;
import States.States;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Greenlamp
 */
public class M_Connexion extends javax.swing.JPanel {

    /**
     * Creates new form M_Connexion
     */
    Main parent = null;
    NetworkClient socket = null;

    public M_Connexion() {
        initComponents();
        LuserIncorrect.setVisible(false);
        LpassIncorrect.setVisible(false);
    }

    public M_Connexion(Main parent, NetworkClient socket) {
        initComponents();
        this.socket = socket;
        this.parent = parent;
        LuserIncorrect.setVisible(false);
        LpassIncorrect.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Glogin = new javax.swing.JTextField();
        Gpassword = new javax.swing.JTextField();
        Bvalider = new javax.swing.JButton();
        LpassIncorrect = new javax.swing.JLabel();
        LuserIncorrect = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nom d'utilisateur:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mot de passe:");

        Glogin.setText("admin");

        Gpassword.setText("admin");

        Bvalider.setText("Valider");
        Bvalider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvaliderActionPerformed(evt);
            }
        });

        LpassIncorrect.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LpassIncorrect.setForeground(new java.awt.Color(255, 0, 0));
        LpassIncorrect.setText("Mot de passe incorrect");
        LpassIncorrect.setOpaque(true);

        LuserIncorrect.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LuserIncorrect.setForeground(new java.awt.Color(255, 0, 51));
        LuserIncorrect.setText("Nom d'utilisateur inconnu");
        LuserIncorrect.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bvalider, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LuserIncorrect)
                            .addComponent(LpassIncorrect)
                            .addComponent(Glogin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LuserIncorrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Glogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LpassIncorrect)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Gpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bvalider)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Connexion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 978, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(531, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BvaliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvaliderActionPerformed
        // TODO add your handling code here:
        parent.connectSql();
        LuserIncorrect.setVisible(false);
        LpassIncorrect.setVisible(false);
        String[] objets = {Glogin.getText(), Gpassword.getText()};
        socket.send(new PacketCom(States.LOGIN, (Object)objets));
        try {
            PacketCom packetCom = socket.receive();
            String type = packetCom.getType();
            if(type.equals(States.LOGIN_OUI)){
                LinkedList<String> droits = getDroits();
                parent.setDroits(droits);
                parent.setLoginUser(Glogin.getText());
                parent.changeState(Main.LOGGED);
            }else if(type.equals(States.LOGIN_NON_USER)){
                LuserIncorrect.setVisible(true);
                parent.disconnectSql();
            }else if(type.equals(States.LOGIN_NON_PASS)){
                LpassIncorrect.setVisible(true);
                parent.disconnectSql();
            }else if(type.equals(States.LOGIN_NON)){
                String message = (String)packetCom.getObjet();
                parent.afficherMessage(message);
                parent.disconnectSql();
            }
        } catch (Exception ex) {
            parent.afficherMessage("Le serveur n'est pas allumé");
        }
    }//GEN-LAST:event_BvaliderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bvalider;
    private javax.swing.JTextField Glogin;
    private javax.swing.JTextField Gpassword;
    private javax.swing.JLabel LpassIncorrect;
    private javax.swing.JLabel LuserIncorrect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private LinkedList<String> getDroits() {
        LinkedList<String> droits = new LinkedList<>();
        socket.send(new PacketCom(States.GET_MY_DROITS, null));
        try {
            PacketCom packetCom = socket.receive();
            String type = packetCom.getType();
            if(type.equals(States.GET_MY_DROITS_OUI)){
                droits = (LinkedList<String>)packetCom.getObjet();
            }
        } catch (Exception ex) {
            Logger.getLogger(M_Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return droits;
    }
}
