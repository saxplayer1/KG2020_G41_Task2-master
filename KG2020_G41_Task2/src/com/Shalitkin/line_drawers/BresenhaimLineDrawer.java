package com.Shalitkin.line_drawers;

import com.Shalitkin.pixel_drawers.PixelDrawer;

import java.awt.*;

public class BresenhaimLineDrawer implements LineDrawer {
    private PixelDrawer pd;

    public BresenhaimLineDrawer(PixelDrawer pd) {
        this.pd = pd;
    }


    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int dx2 = 2 * dx;
        int dy2 = 2 * dy;

        int ix = x1 < x2 ? 1 : -1;
        int iy = y1 < y2 ? 1 : -1;

        int d = 0;
        if (dx >= dy) {
            while (true) {
                pd.setPixel(x1, y1, Color.BLUE);
                if (x1 == x2)
                    break;
                x1 += ix;
                d += dy2;
                if (d > dx) {
                    y1 += iy;
                    d -= dx2;
                }
            }
        } else {
            while (true) {
                pd.setPixel(x1, y1, Color.BLUE);
                if (y1 == y2)
                    break;
                y1 += iy;
                d += dx2;
                if (d > dy) {
                    x1 += ix;
                    d -= dy2;
                }
            }
        }
    }

    public String toString() {
        return "This is Bresenham line drawer";
    }
}
