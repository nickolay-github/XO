package nico.xo.controllers;

import nico.xo.model.Field;
import nico.xo.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;


public class CurrentMoveControllerTest {
    @Test
    public void testCurrentMoveWhenNextMoveIsO() throws Exception {
        CurrentMoveController currentMoveController = new CurrentMoveController();
        Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.O);
        field.setFigure(new Point(2, 2), Figure.X);
        field.setFigure(new Point(0, 1), Figure.X);
        assertEquals(Figure.O, currentMoveController.CurrentMove(field));
    }
    @Test
    public void testCurrentMoveWhenNextMoveIsX() throws Exception {
        CurrentMoveController currentMoveController = new CurrentMoveController();
        Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.X);
        field.setFigure(new Point(2, 2), Figure.O);

        assertEquals(Figure.X, currentMoveController.CurrentMove(field));
    }
    @Test
    public void testCurrentMoveWhenNoNextMove() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        final Field field = new Field(3);
        field.setFigure(new Point(0, 0), Figure.O);
        field.setFigure(new Point(0, 1), Figure.X);
        field.setFigure(new Point(0, 2), Figure.O);
        field.setFigure(new Point(1, 0), Figure.O);
        field.setFigure(new Point(1, 1), Figure.X);
        field.setFigure(new Point(1, 2), Figure.O);
        field.setFigure(new Point(2, 0), Figure.O);
        field.setFigure(new Point(2, 1), Figure.X);
        field.setFigure(new Point(2, 2), Figure.O);
        assertNull(currentMoveController.CurrentMove(field));
    }

}