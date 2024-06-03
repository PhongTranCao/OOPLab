package hust.soict.ict.screen;

import hust.soict.ict.Cart;
import hust.soict.ict.DigitalVideoDisc;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addMedia(new DigitalVideoDisc("haha"));
        cart.addMedia(new DigitalVideoDisc("hihi"));
        cart.addMedia(new DigitalVideoDisc("hehe"));
        cart.addMedia(new DigitalVideoDisc("hehe"));
        cart.addMedia(new DigitalVideoDisc("hehe"));
        new CartScreen(cart);
    }
}
