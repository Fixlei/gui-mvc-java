package edu.gui_mvc.view;

import edu.gui_mvc.model.Features;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameView extends JFrame implements IView {
  private JLabel label;
  private JButton upperBtn;
  private JButton colorBtn;
  private boolean isRed = false;

  public JFrameView(String title) {
    super(title);
    setLayout(new FlowLayout());

    label = new JLabel("data is loading ...");
    upperBtn = new JButton("Upper Case");
    colorBtn = new JButton("Toggle Color");
    add(label);
    add(upperBtn);
    add(colorBtn);

    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


  @Override
  public void serEchoOutput(String text) {
    label.setText(text);
  }

  @Override
  public void toggleColor() {
    isRed = !isRed;
    label.setForeground(isRed ? Color.RED : Color.BLACK);
  }

  @Override
  public void addFeatures(Features features) {

    upperBtn.addActionListener(e->features.makeUpperCase());
    colorBtn.addActionListener(e->features.toggleColor());
  }
}
