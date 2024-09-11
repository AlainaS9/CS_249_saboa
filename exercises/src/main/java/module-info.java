module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.saboa.exercises00 to javafx.fxml;

    exports edu.saboa.exercises00;
}
