module com.taskmanager.taskify {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jfxtras.styles.jmetro;

    opens com.taskmanager.taskify to javafx.fxml;
    exports com.taskmanager.taskify;
}
