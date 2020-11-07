package com.Shalitkin.factories;


import com.Shalitkin.line_drawers.LineDrawer;

import java.awt.*;

public interface LineDrawerFactory {
    LineDrawer createLineDrawer(Graphics g);

    void setType(LineDrawer.Type t);

    LineDrawer.Type getType();
}
