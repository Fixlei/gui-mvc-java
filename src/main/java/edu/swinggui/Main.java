package edu.gui_mvc;

import edu.gui_mvc.controller.Controller;
import edu.gui_mvc.model.IModel;
import edu.gui_mvc.model.StringModel;
import edu.gui_mvc.view.IView;
import edu.gui_mvc.view.JFrameView;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    IModel model = new StringModel();

    IView view = new JFrameView("MVC decoupling -- ");

    Controller controller = new Controller(model);

    controller.setView(view);
    ((JFrame) view).setVisible(true);
  }
}