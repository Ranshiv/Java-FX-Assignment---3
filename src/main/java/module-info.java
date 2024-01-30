module org.example.studentgrouplab2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.example.studentgrouplab2 to javafx.fxml;
    exports org.example.studentgrouplab2;
}
