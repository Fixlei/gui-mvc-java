package edu.gui_mvc.model;

/**
 * String model implements model interface.
 */
public class StringModel implements IModel{
  private String myString = "Hello, GUI - MVC design!";

  @Override
  public String getString() {
    return myString;
  }

  @Override
  public void setString(String input) {

    this.myString = input;
  }
}
