
<<<<<<< HEAD
import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

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
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleTableSelectedEvent(int numTable) {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleCancelEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
=======
>>>>>>> 6b6b39a328fc442a362adb47ae56c09a68bc2c59
