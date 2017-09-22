import java.io.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class GraphingData extends JPanel {

    final int LMARGIN = 30;
    final int RMARGIN = 10;
    final int TMARGIN = 10;
    final int BMARGIN = 30;
    final int PAD = 20;
    final int TICK_LENGTH = 4;
    float [] xdata = new float[199];
    float [] ydata = new float[199];

    protected void drawOrdinate(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        g2.setPaint(Color.BLACK);
        g2.draw(new Line2D.Double(LMARGIN, TMARGIN, LMARGIN, h-BMARGIN));
        int tick_label = 0;
        for (int i = h - BMARGIN; i >= TMARGIN; i-=(h/30)) {
            g2.setFont(new Font("SanSerif", Font.PLAIN, 8));
            g2.draw(new Line2D.Double(LMARGIN, i, LMARGIN - TICK_LENGTH, i));
            String letter = String.format("%03d", tick_label);
            float sw = (float)font.getStringBounds(letter, frc).getWidth();
            float sx = sw/2;
            float sy = i + 3;
            g2.drawString(letter, sx, sy);
            tick_label += 10;
        } 
    }

    protected void drawAbcissa(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        g2.setPaint(Color.BLACK);
        g2.draw(new Line2D.Double(LMARGIN, h-BMARGIN, w-RMARGIN, h-BMARGIN));
        int step = 0;
        float x_tick_label = xdata[step];
        for (int i = BMARGIN; i < w - RMARGIN; i+=(w/95)) {
            g2.draw(new Line2D.Double(i, h-BMARGIN, i, h-BMARGIN+TICK_LENGTH));
            String letter = String.format("%.1f", x_tick_label);
            float sw = (float)font.getStringBounds(letter, frc).getWidth();
            float sx = i - sw/4 - 5; 
            float sy = h - BMARGIN + 15 ;
            if (i%2 == 0) {
              g2.drawString(letter, sx, sy);
            }
            step += 2;
            x_tick_label = xdata[step];
        }

    }

   protected void drawLine(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        g2.setPaint(Color.BLUE);
        for(int i = 0; i < 198; i++) {
            double x1 = LMARGIN + (i * 10)  ;
            double y1 = h - BMARGIN - (ydata[i] * h/300);
            double x2 = LMARGIN + (i + 1) * 10 ;
            double y2 = h - BMARGIN - (ydata[i+1] * h/300);
            //System.out.println("x1=" + x1 + " y1=" + y1 + " x2=" +  x2  + " y2=" + y2);
            g2.draw(new Line2D.Double(x1, y1, x2, y2));
        }
    }

    protected void drawOrdinateLabel(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        String s = "y axis";
        LineMetrics lm = font.getLineMetrics("0", frc);
        float sh = lm.getAscent() + lm.getDescent();
        float sy = PAD + ((h - 2*PAD) - s.length()*sh)/2 + lm.getAscent();
        for(int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            float sw = (float)font.getStringBounds(letter, frc).getWidth();
            float sx = (PAD - sw)/4;
            g2.setFont(new Font("SanSerif", Font.PLAIN, 12));
            g2.drawString(letter, sx, sy);
            sy += sh;
        }
    }

    protected void drawAbcissaLabel(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        String s = "x axis";
        LineMetrics lm = font.getLineMetrics("0", frc);
        float sh = lm.getAscent() + lm.getDescent();
        float sy = h - PAD + (PAD - sh)/2 + lm.getAscent();
        float sw = (float)font.getStringBounds(s, frc).getWidth();
        float sx = (w - sw)/2;
        g2.setFont(new Font("SanSerif", Font.PLAIN, 12));
        g2.drawString(s, sx, sy);
    }

    protected void drawDataPoints(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        //g2.setPaint(new Color(91,153,149));
        g2.setPaint(Color.BLUE);
        for(int i = 0; i < 199; i++) {
            double x = LMARGIN + i * 10;
            double y = h - BMARGIN - (ydata[i] * h/300);
            //System.out.println("x = " + x + " y = " + y);
            //g2.fill(new Ellipse2D.Double(x - 2.5, y - 2.5, 5, 5));
            g2.fill(new Rectangle2D.Double(x - 2.5, y - 2.5, 5, 5));
            //g2.draw(new Rectangle2D.Double(x - 2.5, y - 2.5, 5, 5));
        }
    }

    protected void drawGridLine(Graphics2D g2) {
        int w = getWidth();
        int h = getHeight();
        g2.setPaint(Color.LIGHT_GRAY);
        FontRenderContext frc = g2.getFontRenderContext();
        for (int i = ((h-TMARGIN)/10); i < h - TMARGIN; i += ((h-TMARGIN)/10)) {
            g2.draw(new Line2D.Double(LMARGIN, h-BMARGIN-i, w-RMARGIN, h-BMARGIN-i));
        }
    }

 
    protected void paintComponent(Graphics g) {
        Scanner sc = new Scanner(System.in); 
        int idx = 0;
        while (sc.hasNextFloat()) {
            xdata[idx] = sc.nextFloat();
            ydata[idx] = sc.nextFloat();
            idx++;
        }
        //System.out.println(Arrays.toString(xdata));
        //System.out.println(Arrays.toString(ydata));
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        System.out.println("width=" + w + " height " + h);
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        // Draw ordinate.
        drawOrdinate(g2);
        // Draw abcissa.
        drawAbcissa(g2);
           // Draw Labels
        // Ordinate label.
        drawOrdinateLabel(g2);
        // Abcissa label.
        drawAbcissaLabel(g2);
        // Draw Line
        drawLine(g2);
        // Draw data points.
        drawDataPoints(g2);
        // Draw grid lines
        drawGridLine(g2);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Total Sun Spot Number From 1818: Source SILSO");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new GraphingData());
        f.setExtendedState( f.getExtendedState()|JFrame.MAXIMIZED_BOTH );
        f.setLocation(0,0);
        f.setVisible(true);
    }
}
