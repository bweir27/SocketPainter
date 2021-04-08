/**
 * @author Brian Weir (https://github.com/bweir27)
 */
package socketPainter;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

abstract class PaintingPrimitive implements Serializable{

	private Color color;

	public PaintingPrimitive(Color c) {
		this.color= c;
	}

	public final void draw(Graphics g) {
		g.setColor(this.color);
		drawGeometry(g);
	}

	protected abstract void drawGeometry(Graphics g);
	
	public String toString() {
		return "This is a generic PaintingPrimitive";
	}
}
