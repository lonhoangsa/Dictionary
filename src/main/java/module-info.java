module dictionary.dictionary {
    requires javafx.controls;
    requires javafx.fxml;


    opens dictionary.dictionary to javafx.fxml;
    exports dictionary.dictionary;
}