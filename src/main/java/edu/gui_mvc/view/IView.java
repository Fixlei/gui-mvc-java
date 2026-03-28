package edu.gui_mvc.view;

import edu.gui_mvc.model.Features;

/**
 * this is view interface, it requires all views are implement all the same features.
 *
 */
public interface IView {

  public void serEchoOutput(String text);
  public void toggleColor();
  public void addFeatures(Features features);

}
