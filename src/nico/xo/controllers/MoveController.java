package nico.xo.controllers;


import nico.xo.model.Field;
import nico.xo.model.Figure;
import nico.xo.model.exceptions.AlreadyOccupiedException;
import nico.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Figure figure,
                            final Point point) throws InvalidPointException, AlreadyOccupiedException {

        if (field.getFigure(point) != null) {
                throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }




}


