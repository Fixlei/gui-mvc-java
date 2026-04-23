package edu.gui_mvc.controller;

import edu.gui_mvc.model.Features;
import edu.gui_mvc.model.IModel;
import edu.gui_mvc.view.IView;


public class Controller implements Features {

  private final IModel model;
  private IView view;

  public Controller(IModel model) {
    this.model = model;
  }

  public void setView(IView view) {
    this.view = view;
    view.addFeatures(this);
    view.serEchoOutput(model.getString());
  }

  public void makeUppercase() {
    String upperText = model.getString().toUpperCase();
    view.serEchoOutput(upperText);
  }

  @Override
  public void toggleColor() {

    view.toggleColor();
  }

  @Override
  public void makeUpperCase() {

    String originalText = model.getString();
    String upperText = originalText.toUpperCase();
    view.serEchoOutput(upperText);
  }

  @Override
  public void restoreLowercase() {
    view.serEchoOutput(model.getString());
  }
}
