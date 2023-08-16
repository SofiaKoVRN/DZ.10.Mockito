package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AfishaManagerTest {

    @Test
    public void NotFilm() {
        AfishaManager manager = new AfishaManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Film1() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Films1and2() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");

        String[] expected = {"Бладшот", "Вперед"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void allFilms() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Номер один");

        String[] expected = {"Номер один"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast5() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast7() {
        AfishaManager manager = new AfishaManager(7);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}