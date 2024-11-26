package edu.realemj.exercises15.observer;

public class Gotham {
    public static void main(String [] args) {
        Batsignal signal = new Batsignal();

        Batperson bruce = new Batperson("Batman");
        Batperson grayson = new Batperson("Nightwing");
        Batperson barbara = new Batperson("Batgirl");
        Batperson tim = new Batperson("Robin");

        signal.registerObserver(bruce);
        signal.registerObserver(grayson);
        signal.registerObserver(barbara);
        signal.registerObserver(tim);

        signal.setActiveCrime("bank robbery");

        signal.removeObserver(grayson);

        Superperson clark = new Superperson("Superman");
        signal.registerObserver(clark);

        signal.setActiveCrime("kidnapping");
    }
}
