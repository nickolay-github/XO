package nico.xo.controllers;


import nico.xo.model.Field;
import nico.xo.model.Figure;
import nico.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class CurrentMoveController {
    private Field  field;
    public Figure CurrentMove(final Field field) {
        int countFigure = 0;
        for (int row = 0; row < field.getSize(); row++) {
            countFigure += countFiguresInTheRow(field, row);
        }
        if (countFigure == field.getSize() * field.getSize())
            return null;

        if (countFigure % 2 == 0)
            return Figure.X;

        return Figure.O;

    }
    private int countFiguresInTheRow(final Field field, final int row) {
        int countFigure = 0;
        for (int x = 0; x < field.getSize(); x++) {
            try {
                if (field.getFigure(new Point(x, row)) != null)
                    countFigure++;
            } catch (InvalidPointException e) {
                e.printStackTrace();
            }
        }
        return countFigure;
    }
}
