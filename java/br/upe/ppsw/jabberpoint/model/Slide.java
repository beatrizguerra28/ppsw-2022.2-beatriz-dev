package br.upe.ppsw.jabberpoint.model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Vector;

import br.upe.ppsw.jabberpoint.view.SlideItem;
import br.upe.ppsw.jabberpoint.view.SlideViewerComponent;

public class Slide {

  public final static int WIDTH = 1200;
  public final static int HEIGHT = 800;

  protected TextItem title;
  protected Vector<SlideItem> items;

  public Slide() {
    items = new Vector<SlideItem>();
  }
  //tirando funcionalidades de "draw"
  //aqui apenas visualizacao do slide
  public void append(SlideItem anItem) {
    items.addElement(anItem);
  }

  public SlideItem getTitle() {
    return title.getText();
  }

  public void setTitle(String newTitle) {
    title = new TextItem(0, newTitle);
  }

  public void append(int level, String message) {
    append(new TextItem(level, message));
  }

  public SlideItem getSlideItem(int number) {
    return (SlideItem) items.elementAt(number);
  }

  public Vector<SlideItem> getSlideItems() {
    return items;
  }

  public int getSize() {
    return items.size();
  }
public void draw(Graphics g, Rectangle area, SlideViewerComponent slideViewerComponent) {
	// TODO Auto-generated method stub
	
}

}
