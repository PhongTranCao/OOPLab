package hust.soict.ict.screen;


import hust.soict.ict.Cart;
import hust.soict.ict.DigitalVideoDisc;
import hust.soict.ict.Playable;
import hust.soict.ict.aims.media.Media;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
    public RadioButton radioBtnFilterTitle;
    public RadioButton radioBtnFilterId;
    public ToggleGroup filterCategory;
    private Cart cart;
    @FXML
    private TableView<Media> tblMedia;
    @FXML
    private TableColumn<Media, String> colMediaTitle;
    @FXML
    private TableColumn<Media, String> colMediacategory;
    @FXML
    private TableColumn<Media, Float> colMediaCost;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private TextField tfFilter;

    public CartScreenController(Cart cart) {
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getItemsOrdered());
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
            @Override
            public void changed(ObservableValue<? extends Media> observable, Media oldValue,
                                Media newValue) {
                if (newValue != null) {
                        updateButtonBar(newValue);
                }
            }
        });
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (newValue != null) {
                    showFilteredMedia(newValue);
                }
            }
        });
    }

    @FXML
    public void btnRemovePressed(ActionEvent actionEvent) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
    }

    private void updateButtonBar (Media media){
        btnRemove.setVisible(true);
        btnPlay.setVisible(media instanceof Playable);
    }

    public void showFilteredMedia (String string){
        FilteredList<String> filteredList = new FilteredList<>(cart.getItemsOrderedInString(), p -> true);
        tfFilter.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredList.setPredicate(media -> {
                // If filter text is empty, display all items
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare the title, genre, and year with the filter text
                String lowerCaseFilter = newValue.toLowerCase();
                return media.toLowerCase().contains(lowerCaseFilter);
            });
        });
    }
}