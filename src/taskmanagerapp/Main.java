
package taskmanagerapp;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TaskManagerApp app = new TaskManagerApp();
                app.setVisible(true);
            }
        });
    }
}

