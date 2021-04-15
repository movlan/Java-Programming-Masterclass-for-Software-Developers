package dev.bahram.todolist;

import dev.bahram.todolist.datamodel.ToDoData;
import dev.bahram.todolist.datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<ToDoItem> toDoItems;

    @FXML
    private ListView<ToDoItem> toDoListView;

    @FXML
    private TextArea itemDetailsTextArea;

    @FXML
    private Label deadlineLabel;

    public void initialize() {
//        ToDoItem item1 = new ToDoItem("Mail Birthday card",
//                "Buy 30th birthday card for John",
//                LocalDate.of(2020, Month.APRIL, 25));
//        ToDoItem item2 = new ToDoItem("Doctor's appointment",
//                "See Dr. Smith at 12 Main St. Bring paperwork",
//                LocalDate.of(2020, Month.MAY, 25));
//        ToDoItem item3 = new ToDoItem("Third item",
//                "Long description of do do list item",
//                LocalDate.of(2020, Month.APRIL, 25));
//        ToDoItem item4 = new ToDoItem("Fourth Item",
//                "Long description of do do list item",
//                LocalDate.of(2020, Month.MARCH, 25));
//        ToDoItem item5 = new ToDoItem("Fifth Item",
//                "Long description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list itemLong description of do do list item",
//                LocalDate.of(2020, Month.APRIL, 20));
//
//        toDoItems = new ArrayList<>();
//        toDoItems.add(item1);
//        toDoItems.add(item2);
//        toDoItems.add(item3);
//        toDoItems.add(item4);
//        toDoItems.add(item5);
//
//        ToDoData.getInstance().setToDoItems(toDoItems);

        toDoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem toDoItem, ToDoItem t1) {
                if(t1 != null) {
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();
    }


    @FXML
    public void handleCLickListView() {
        ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());
//        System.out.println("Selected item is: " + item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n Due: ");
//        sb.append(item.getDeadline().toString());
//        textArea.setText(sb.toString());
    }
}
