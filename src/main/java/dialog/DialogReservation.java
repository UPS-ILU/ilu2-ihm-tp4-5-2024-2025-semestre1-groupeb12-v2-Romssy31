/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;
import javax.swing.JOptionPane;


public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        frameReservation.enableHourPicker();
    }

    public void handleTimeSelectedEvent(String time) {
        frameReservation.enableNumPersonsPicker();
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        frameReservation.enableTablePicker();
    }

    public void handleTableSelectedEvent(int numTable) {
        frameReservation.enableValidationButton();
    }

    public void handleCancelEvent() {
        frameReservation.cancelAll();
    }

    public void handleValidationEvent() {
    LocalDate date = frameReservation.getDate();
    String heure = frameReservation.getHour();
    int nombre = frameReservation.getNumPersons();
    String table = frameReservation.getTable();
    
    String[] moisFrancais = {
        "janvier", "février", "mars", "avril", "mai", "juin",
        "juillet", "août", "septembre", "octobre", "novembre", "décembre"
    };

    String mois = moisFrancais[date.getMonthValue() - 1];

    String confirmation = String.format("Réservation validée pour le %d %s %d à %s pour %d personnes à la %s.",
            date.getDayOfMonth(), mois, date.getYear(), heure, nombre, table);
    
    JOptionPane.showMessageDialog(null, confirmation, "Confirmation de réservation", JOptionPane.INFORMATION_MESSAGE);
}


    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
