package hendricks.flightSim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JLabel Question;
    private JButton button1;
    private JButton button6;
    private JButton button5;
    private JButton button4;
    private JButton button3;
    private JCheckBox positionTrimCheckBox;
    private JCheckBox forceBreakoutCheckBox;
    private JCheckBox forceGradientCheckBox;
    private JCheckBox forceFrictionCheckBox;
    private JCheckBox dampingCheckBox;
    private JCheckBox hardStopCheckBox;
    private JLabel Description;
    private JPanel onlyPanelThereIs;
    boolean listenersrunning = true;
    int button;
    private volatile boolean threadRunning = false;
    Thread listeners = new Thread(new Runnable() { //New thread is easiest way to avoid infinite loop
        @Override
        public void run() {

            while (listenersrunning) {
                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button = 1;
                        DisplayStep2(button);
                        listenersrunning = false;
                    }
                });
                button3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button = 3;
                        DisplayStep2(button);
                        listenersrunning = false;
                    }
                });
                button4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button = 2;
                        DisplayStep2(button);
                        listenersrunning = false;
                    }
                });
                button5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button = 4;
                        DisplayStep2(button);
                        listenersrunning = false;
                    }
                });
                positionTrimCheckBox.setVisible(false);
                forceBreakoutCheckBox.setVisible(false);
                forceGradientCheckBox.setVisible(false);
                forceFrictionCheckBox.setVisible(false);
                dampingCheckBox.setVisible(false);
                hardStopCheckBox.setVisible(false);

            }
        }
    });

    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            threadRunning = true;
            while (threadRunning) {
                boolean postrim = positionTrimCheckBox.isSelected();
                boolean forcebreak = forceBreakoutCheckBox.isSelected();
                boolean forcegrad = forceGradientCheckBox.isSelected();
                boolean forcefric = forceFrictionCheckBox.isSelected();
                boolean damping = dampingCheckBox.isSelected();
                boolean hardstop = hardStopCheckBox.isSelected();


                postrim = positionTrimCheckBox.isSelected();
                forcebreak = forceBreakoutCheckBox.isSelected();
                forcegrad = forceGradientCheckBox.isSelected();
                forcefric = forceFrictionCheckBox.isSelected();
                damping = dampingCheckBox.isSelected();
                hardstop = hardStopCheckBox.isSelected();

                if (postrim) {
                    Question.setText("Position Trim");
                    Description.setText("The position to which a flight\n" +
                            "control returns when the pilot releases it.");
                }
                if (forcebreak) {
                    Question.setText("Force Breakout");
                    Description.setText("A force\n" +
                            "that returns a control to Trim. This is a constant force\n" +
                            "applied toward Trim which remains the same despite\n" +
                            "how far the control is moved (displacement) and how\n" +
                            "fast a control is moved (velocity).");

                }
                if (forcegrad) {
                    Question.setText("Force Gradient");
                    Description.setText("A force that returns a control to Trim, but one that varies" +
                            "with displacement.  The farther the control is moved, the stronger the force applied toward" +
                            "Trim.");
                }
                if (forcefric) {
                    Question.setText("Force Friction");
                    Description.setText("A constant force that is opposite to the direction of movement.");
                }
                if (damping) {
                    Question.setText("Damping");
                    Description.setText("A force that is opposite to the direction of movement. Damping varies with\n" +
                            "velocity.  The faster a control is moved, the stronger the force.");
                }
                if (hardstop) {
                    Question.setText("Hard Stop");
                    Description.setText("A force that simulates a mechanical limit of travel.  By varying the Hard Stops," +
                            "the range of travel can be adjusted.");
                }
            }
        }
    });


    public void invisible() {
        positionTrimCheckBox.setVisible(false);
        forceBreakoutCheckBox.setVisible(false);
        forceGradientCheckBox.setVisible(false);
        forceFrictionCheckBox.setVisible(false);
        dampingCheckBox.setVisible(false);
        hardStopCheckBox.setVisible(false);
        Description.setVisible(false);
    }



    /* private void MainListeners() {
         button1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 button = 1;
                 DisplayStep2(button);
             }
         });
         button3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 button = 3;
                 DisplayStep2(button);
             }
         });
         button4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 button = 2;
                 DisplayStep2(button);
             }
         });
         button5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 button = 4;
                 DisplayStep2(button);
             }
         });
     }
 */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().onlyPanelThereIs);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Main main = new Main();
        main.invisible();
        main.listeners.start();
    }

    //public void jPanelInit() {
    //    onlyPanelThereIs.setVisible(true);
    //}

    public void DisplayStep2(int button) {
        if (button == 1) {
            Description.setText("You have chosen the Blimp");
        } else if (button == 2) {
            System.out.println("You have chosen the Helicopter!");
        } else if (button == 3) {
            System.out.println("You have chosen the Fighter Jet!");
        } else if (button == 4) {
            System.out.println("You have chosen the Space Shuttle! \n \n \r Daredevil.");
        } else {
            System.out.println("How the heck have you managed THAT\u203D");
        }
        positionTrimCheckBox.setVisible(true);
        forceBreakoutCheckBox.setVisible(true);
        forceGradientCheckBox.setVisible(true);
        forceFrictionCheckBox.setVisible(true);
        dampingCheckBox.setVisible(true);
        hardStopCheckBox.setVisible(true);
        Description.setVisible(true);
        button6.setText("SUBMIT");
        t.start();


        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                threadRunning = false;
                final boolean postrimfinal = positionTrimCheckBox.isSelected();
                final boolean forcebreakfinal = forceBreakoutCheckBox.isSelected();
                final boolean forcegradfinal = forceGradientCheckBox.isSelected();
                final boolean forcefricfinal = forceFrictionCheckBox.isSelected();
                final boolean dampingfinal = dampingCheckBox.isSelected();
                final boolean hardstopfinal = hardStopCheckBox.isSelected();

                Question.setText("Positional Trim is " + postrimfinal + ". Force Breakout is " + forcebreakfinal + ". \n" +
                        "Force Gradient is " + forcegradfinal + ". Force Friction is " + forcefricfinal + ". \n" +
                        "Damping is " + dampingfinal + ". Hard Stop is " + hardstopfinal + ". \n" +
                        "Playing simulation.");
                Description.setText("Go for launch. Exiting configuration.");
                System.exit(0);
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

     /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        onlyPanelThereIs = new JPanel();
        onlyPanelThereIs.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(7, 3, new Insets(0, 0, 0, 0), -1, -1));
        Question = new JLabel();
        Question.setText("Which aircraft should be simulated?");
        onlyPanelThereIs.add(Question, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        button1 = new JButton();
        button1.setText("Blimp");
        onlyPanelThereIs.add(button1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button6 = new JButton();
        button6.setText("Exit");
        onlyPanelThereIs.add(button6, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button5 = new JButton();
        button5.setText("Space Shuttle");
        onlyPanelThereIs.add(button5, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button4 = new JButton();
        button4.setText("Helicopter");
        onlyPanelThereIs.add(button4, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        button3 = new JButton();
        button3.setText("Fighter Jet");
        onlyPanelThereIs.add(button3, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        positionTrimCheckBox = new JCheckBox();
        positionTrimCheckBox.setText("Position Trim");
        onlyPanelThereIs.add(positionTrimCheckBox, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        forceBreakoutCheckBox = new JCheckBox();
        forceBreakoutCheckBox.setText("Force Breakout");
        onlyPanelThereIs.add(forceBreakoutCheckBox, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        forceGradientCheckBox = new JCheckBox();
        forceGradientCheckBox.setText("Force Gradient");
        onlyPanelThereIs.add(forceGradientCheckBox, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        forceFrictionCheckBox = new JCheckBox();
        forceFrictionCheckBox.setText("Force Friction");
        onlyPanelThereIs.add(forceFrictionCheckBox, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dampingCheckBox = new JCheckBox();
        dampingCheckBox.setText("Damping");
        onlyPanelThereIs.add(dampingCheckBox, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        hardStopCheckBox = new JCheckBox();
        hardStopCheckBox.setEnabled(true);
        hardStopCheckBox.setText("Hard Stop");
        onlyPanelThereIs.add(hardStopCheckBox, new com.intellij.uiDesigner.core.GridConstraints(6, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        Description = new JLabel();
        Description.setText("");
        onlyPanelThereIs.add(Description, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return onlyPanelThereIs;
    }
}
