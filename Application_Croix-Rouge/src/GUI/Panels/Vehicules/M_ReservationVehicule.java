/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels.Vehicules;

import Containers.ReservationVehicule;
import GUI.Panels.Consultation.M_Consultation;
import GUI.Panels.Main;
import Helpers.SwingUtils;
import SSL.NetworkClientSSL;
import my.cr.PacketCom.PacketCom;
import States.States;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Greenlamp
 */
public class M_ReservationVehicule extends javax.swing.JPanel {

    /**
     * Creates new form M_GestionVehicules
     */
    Main parent = null;
    NetworkClientSSL socket = null;

    public M_ReservationVehicule() {
        initComponents();
    }

    public M_ReservationVehicule(Main parent, NetworkClientSSL socket) {
        initComponents();
        this.socket = socket;
        this.parent = parent;
        refreshListe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Baccueil1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gtableau = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Réservation véhicule");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Baccueil1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Baccueil1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        Gtableau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "DateDebut", "DateFin", "Semaine", "Année"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Gtableau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GtableauMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Gtableau);

        jButton1.setText("Nouveau");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Baccueil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Baccueil1ActionPerformed
        parent.changeState(Main.LOGGED);
    }//GEN-LAST:event_Baccueil1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        parent.changeState(Main.NOUVEAU_RESERVATION_VEHICULE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = Gtableau.getSelectedRow();
        if (row == -1) {
            return;
        }
        String nom = Gtableau.getValueAt(row, 0).toString();
        String semaine = Gtableau.getValueAt(row, 3).toString();
        String annee = Gtableau.getValueAt(row, 4).toString();
        deleteReservation(nom, semaine, annee);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void GtableauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GtableauMouseClicked
        if (evt.getClickCount() == 2) {
            int row = Gtableau.getSelectedRow();
            String nom = Gtableau.getValueAt(row, 0).toString();
            String semaine = Gtableau.getValueAt(row, 3).toString();
            String annee = Gtableau.getValueAt(row, 4).toString();
            ReservationVehicule reservationVehicule = getReservationVehicule(nom, semaine, annee);
            parent.setReservationVehicule(reservationVehicule);
            parent.changeState(Main.EDIT_RESERVATION_VEHICULE);
        }
    }//GEN-LAST:event_GtableauMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baccueil1;
    private javax.swing.JTable Gtableau;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void refreshListe() {
        PacketCom packet = new PacketCom(States.GET_RESERVATION_ALL, null);
        socket.send(packet);
        try {
            PacketCom packetReponse = socket.receive();
            reponseFromServeur(packetReponse);
        } catch (Exception ex) {
            Logger.getLogger(M_Consultation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reponseFromServeur(PacketCom packetReponse) {
        String type = packetReponse.getType();
        Object contenu = packetReponse.getObjet();

        if (type.equals(States.GET_RESERVATION_ALL_OUI)) {
            LinkedList<Object[]> listeReservation = (LinkedList<Object[]>) contenu;
            listeReservation = calculerDate(listeReservation);
            SwingUtils.addToTable(Gtableau, listeReservation);
        } else {
            System.out.println("Erreur.");
        }
    }

    private void deleteReservation(String nom, String semaine, String annee) {
        Object[] data = {nom, Integer.parseInt(semaine), Integer.parseInt(annee)};
        PacketCom packet = new PacketCom(States.DELETE_RESERVATION, (Object) data);
        socket.send(packet);
        try {
            PacketCom retour = socket.receive();
            String type = retour.getType();
            if (type.equals(States.DELETE_RESERVATION_OUI)) {
                parent.afficherMessage("Suppression de la réservation réussi");
            } else if (type.equals(States.DELETE_RESERVATION_NON)) {
                String message = (String) retour.getObjet();
                parent.afficherMessage(message);
            } else {
                String message = (String) retour.getObjet();
                parent.afficherMessage(message);
            }
        } catch (Exception ex) {
            Logger.getLogger(M_ReservationVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        parent.changeState(Main.RESERVATION_VEHICULE);
    }

    private ReservationVehicule getReservationVehicule(String nom, String semaine, String annee) {
        Object[] data = {nom, Integer.parseInt(semaine), Integer.parseInt(annee)};
        PacketCom packet = new PacketCom(States.GET_RESERVATION, (Object) data);
        socket.send(packet);
        try {
            PacketCom retour = socket.receive();
            String type = retour.getType();
            if (type.equals(States.GET_RESERVATION_OUI)) {
                ReservationVehicule reservationVehicule = (ReservationVehicule) retour.getObjet();
                return reservationVehicule;
            } else if (type.equals(States.GET_RESERVATION_NON)) {
                String message = (String) retour.getObjet();
                parent.afficherMessage(message);
            } else {
                String message = (String) retour.getObjet();
                parent.afficherMessage(message);
            }
        } catch (Exception ex) {
            Logger.getLogger(M_ReservationVehicule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private LinkedList<Object[]> calculerDate(LinkedList<Object[]> listeReservation) {
        LinkedList<Object[]> nouvelleListe = new LinkedList<>();
        for (Object[] elm : listeReservation) {
            String nomVehicule = (String) elm[0];
            int semaine = (int) elm[1];
            int annee = (int) elm[2];

            GregorianCalendar gc = new GregorianCalendar();
            gc.set(GregorianCalendar.YEAR, annee);
            gc.set(GregorianCalendar.WEEK_OF_YEAR, semaine);

            gc.set(GregorianCalendar.DAY_OF_WEEK, GregorianCalendar.MONDAY);
            String dateDebut = new SimpleDateFormat("dd/MM/yyyy").format(gc.getTime());

            gc.set(GregorianCalendar.DAY_OF_WEEK, GregorianCalendar.SUNDAY);
            String dateFin = new SimpleDateFormat("dd/MM/yyyy").format(gc.getTime());

            nouvelleListe.add(new Object[]{nomVehicule, dateDebut, dateFin, semaine, annee});
        }
        return nouvelleListe;
    }
}
