package nico.xo.controllers;

import nico.xo.model.Field;
import nico.xo.model.Figure;
import org.junit.Test;

import java.awt.*;

import static nico.xo.model.Figure.O;
import static org.junit.Assert.*;


public class WinnerControllerTest {
    @Test
    public void testGetWinnerWhenNoWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.O);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertNull(winnerController.getWinner(field));

        }

    }
    @Test
    public void testGetWinnerWhenWinnerRow() throws Exception {
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.X);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X,winnerController.getWinner(field));

        }

    }


}