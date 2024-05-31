package hust.soict.ict.swing;

import hust.soict.ict.DigitalVideoDisc;
import hust.soict.ict.MediaStore;
import hust.soict.ict.aims.media.Media;
import hust.soict.ict.store.Store;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class StoreScreen extends JFrame {
    private Store store;

    void setStore(Store store) {
        store.addMedia(new DigitalVideoDisc("haha"));
        store.addMedia(new DigitalVideoDisc("hihi"));
        store.addMedia(new DigitalVideoDisc("hehe"));
        this.store = store;
    }

    public StoreScreen (Store store) {
        this.store = store;
        System.out.println(store.getItemOrdered());
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }

    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu= new JMenu("Options");
        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));
        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout (FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout (new BoxLayout (header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground (Color.CYAN);
        JButton cart = new JButton("View cart");
        cart.setPreferredSize (new Dimension (100, 50));
        cart.setMaximumSize (new Dimension (100, 50));
        header.add(Box.createRigidArea (new Dimension (10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea (new Dimension (10, 10)));
        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));
        for (Media media : store.getItemOrdered()) center.add(new MediaStore(media));
        return center;
    }

    public static void main(String[] args) {
        Store store = new Store();
        store.addMedia(new DigitalVideoDisc("haha"));
        store.addMedia(new DigitalVideoDisc("hihi"));
        store.addMedia(new DigitalVideoDisc("hehe"));
        store.addMedia(new DigitalVideoDisc("hehe"));
        store.addMedia(new DigitalVideoDisc("hehe"));
        new StoreScreen(store);
    }
}
