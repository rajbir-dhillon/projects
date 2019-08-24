/*
 * DrawerMain.java
 *
 * 
 * A very simple drawing program.
 *
 * The UI for the class has been created using NetBeans GUI Builder.  If you
 * wish to edit the parts generated by the form editor you have two choices:
 * 1) Use a text editor to remove the "editor" comments that NetBeans uses
 * to identify the parts that should not be edited.  This is a one way trip. 
 * Once you have done this you won't be able to use the NetBeans GUI editor 
 * any more for this class
 * 2) Work out how to use the "Code" feature on the property editor in NetBeans
 * to customise the generated code.  You can do most things by use of properties 
 * such as "Pre-Init Code" and "Post-Init Code"
 */
package simpledrawer;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class DrawerMain extends javax.swing.JFrame {
    int currentRed, currentGreen, currentBlue;
    private DrawingPanel drawingPanel; // the drawing panel

    /**
     * Initialise the components in the screen and then cast a reference to the
     * panel that will be drawn on so it can be used elsewhere.
     */
    public DrawerMain() {
        initComponents();
        drawingPanel = (DrawingPanel) panDrawingArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpShape = new javax.swing.ButtonGroup();
        panControls = new javax.swing.JPanel();
        panScroller = new javax.swing.JPanel();
        panRedScroller = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        scrRed = new javax.swing.JScrollBar();
        txtRed = new javax.swing.JTextField();
        panGreenScroller = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        scrGreen = new javax.swing.JScrollBar();
        txtGreen = new javax.swing.JTextField();
        panBlueScroller = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        scrBlue = new javax.swing.JScrollBar();
        txtBlue = new javax.swing.JTextField();
        panBrightness = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        scrBrightness = new javax.swing.JScrollBar();
        labBrightness = new javax.swing.JLabel();
        panMoreControls = new javax.swing.JPanel();
        panThickness = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtThickness = new javax.swing.JTextField();
        btnReset1 = new javax.swing.JButton();
        panBackground = new javax.swing.JPanel();
        btnBackground = new javax.swing.JButton();
        panRotate = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        panButtons = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        panLoad = new javax.swing.JPanel();
        btnLoadXML = new javax.swing.JButton();
        btnLoadJSON = new javax.swing.JButton();
        panShape = new javax.swing.JPanel();
        radLine = new javax.swing.JRadioButton();
        radOval = new javax.swing.JRadioButton();
        radQuadrilateral = new javax.swing.JRadioButton();
        radTriangle = new javax.swing.JRadioButton();
        panViewBackground = new DrawingPanel();
        panDrawingArea = new DrawingPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Draw");
        setPreferredSize(new java.awt.Dimension(570, 400));

        panControls.setPreferredSize(new java.awt.Dimension(270, 300));
        panControls.setLayout(new java.awt.BorderLayout());

        panScroller.setPreferredSize(new java.awt.Dimension(200, 100));
        panScroller.setLayout(new java.awt.GridLayout(4, 0));

        panRedScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panRedScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Red");
        jLabel4.setPreferredSize(new java.awt.Dimension(35, 14));
        panRedScroller.add(jLabel4);

        scrRed.setMaximum(256);
        scrRed.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrRed.setVisibleAmount(1);
        scrRed.setPreferredSize(new java.awt.Dimension(150, 16));
        scrRed.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        panRedScroller.add(scrRed);

        txtRed.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRed.setText("0");
        txtRed.setPreferredSize(new java.awt.Dimension(50, 20));
        txtRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRedActionPerformed(evt);
            }
        });
        panRedScroller.add(txtRed);

        panScroller.add(panRedScroller);

        panGreenScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panGreenScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Green");
        jLabel5.setPreferredSize(new java.awt.Dimension(35, 14));
        panGreenScroller.add(jLabel5);

        scrGreen.setMaximum(256);
        scrGreen.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrGreen.setVisibleAmount(1);
        scrGreen.setPreferredSize(new java.awt.Dimension(150, 16));
        scrGreen.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        panGreenScroller.add(scrGreen);

        txtGreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGreen.setText("0");
        txtGreen.setPreferredSize(new java.awt.Dimension(50, 20));
        txtGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGreenActionPerformed(evt);
            }
        });
        panGreenScroller.add(txtGreen);

        panScroller.add(panGreenScroller);

        panBlueScroller.setPreferredSize(new java.awt.Dimension(200, 26));
        panBlueScroller.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Blue");
        jLabel6.setPreferredSize(new java.awt.Dimension(35, 14));
        panBlueScroller.add(jLabel6);

        scrBlue.setMaximum(256);
        scrBlue.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBlue.setVisibleAmount(1);
        scrBlue.setPreferredSize(new java.awt.Dimension(150, 16));
        scrBlue.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrColourAdjustmentHandler(evt);
            }
        });
        panBlueScroller.add(scrBlue);

        txtBlue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBlue.setText("0");
        txtBlue.setPreferredSize(new java.awt.Dimension(50, 20));
        txtBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBlueActionPerformed(evt);
            }
        });
        panBlueScroller.add(txtBlue);

        panScroller.add(panBlueScroller);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Brightness");
        panBrightness.add(jLabel3);

        scrBrightness.setMaximum(110);
        scrBrightness.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        scrBrightness.setValue(50);
        scrBrightness.setPreferredSize(new java.awt.Dimension(150, 16));
        scrBrightness.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrBrightnessAdjustmentValueChanged(evt);
            }
        });
        panBrightness.add(scrBrightness);

        labBrightness.setBackground(new java.awt.Color(126, 126, 126));
        labBrightness.setText("           ");
        labBrightness.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labBrightness.setOpaque(true);
        panBrightness.add(labBrightness);

        panScroller.add(panBrightness);

        panControls.add(panScroller, java.awt.BorderLayout.NORTH);

        panMoreControls.setLayout(new java.awt.GridLayout(5, 0));

        panThickness.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Thickness");
        panThickness.add(jLabel1);

        txtThickness.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtThickness.setText("5");
        txtThickness.setPreferredSize(new java.awt.Dimension(50, 20));
        txtThickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThicknessActionPerformed(evt);
            }
        });
        txtThickness.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtThicknessFocusLost(evt);
            }
        });
        txtThickness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtThicknessKeyReleased(evt);
            }
        });
        panThickness.add(txtThickness);

        btnReset1.setText("Reset");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });
        panThickness.add(btnReset1);

        panMoreControls.add(panThickness);

        btnBackground.setText("Set Background");
        btnBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackgroundActionPerformed(evt);
            }
        });
        panBackground.add(btnBackground);

        panMoreControls.add(panBackground);

        panRotate.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setText("Rotate");
        panRotate.add(jLabel2);

        btnLeft.setText("Left");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });
        panRotate.add(btnLeft);

        btnRight.setText("Right");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });
        panRotate.add(btnRight);

        panMoreControls.add(panRotate);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panButtons.add(btnClear);

        panMoreControls.add(panButtons);

        btnLoadXML.setText("load XML");
        btnLoadXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadXMLActionPerformed(evt);
            }
        });
        panLoad.add(btnLoadXML);

        btnLoadJSON.setText("load JSON");
        btnLoadJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadJSONActionPerformed(evt);
            }
        });
        panLoad.add(btnLoadJSON);

        panMoreControls.add(panLoad);

        panControls.add(panMoreControls, java.awt.BorderLayout.SOUTH);

        grpShape.add(radLine);
        radLine.setSelected(true);
        radLine.setText("Line");
        radLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radLine);

        grpShape.add(radOval);
        radOval.setText("Oval");
        radOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radOval);

        grpShape.add(radQuadrilateral);
        radQuadrilateral.setLabel("Quadrilateral");
        radQuadrilateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radQuadrilateral);
        radQuadrilateral.getAccessibleContext().setAccessibleName("");
        radQuadrilateral.getAccessibleContext().setAccessibleDescription("");

        grpShape.add(radTriangle);
        radTriangle.setText("Triangle");
        radTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radShapeActionPerformed(evt);
            }
        });
        panShape.add(radTriangle);

        panViewBackground.setBackground(new java.awt.Color(255, 255, 255));
        panViewBackground.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panViewBackground.setFocusCycleRoot(true);
        panViewBackground.setPreferredSize(new java.awt.Dimension(300, 300));
        panShape.add(panViewBackground);

        panControls.add(panShape, java.awt.BorderLayout.CENTER);

        getContentPane().add(panControls, java.awt.BorderLayout.WEST);

        panDrawingArea.setBackground(new java.awt.Color(255, 255, 255));
        panDrawingArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panDrawingArea.setFocusCycleRoot(true);
        panDrawingArea.setPreferredSize(new java.awt.Dimension(300, 300));
        getContentPane().add(panDrawingArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* rotate the drawing 90 degrees to the left */
    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        drawingPanel.rotate(-90);
    }//GEN-LAST:event_btnLeftActionPerformed
    /* clear the drawing */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        drawingPanel.clearDisplay();
    }//GEN-LAST:event_btnClearActionPerformed

    /* set the drawing colours */
    private void scrColourAdjustmentHandler(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrColourAdjustmentHandler
        
        currentRed = scrRed.getValue();
        currentGreen = scrGreen.getValue();
        currentBlue = scrBlue.getValue();
        txtRed.setText(currentRed + "");
        txtGreen.setText(currentGreen + "");
        txtBlue.setText(currentBlue + "");
        drawingPanel.setCurrentColor(new Color(currentRed, currentGreen, currentBlue));
        panViewBackground.setBackground(new Color(currentRed, currentGreen, currentBlue));

    }//GEN-LAST:event_scrColourAdjustmentHandler

    /* change the type of shape to be drawn */
    private void radShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radShapeActionPerformed
        if (radLine.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.LINE);
            return;
        }
        if (radOval.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.OVAL);
            return;
        }

        if (radTriangle.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.TRIANGLE);
            return;
        }
        
        if (radQuadrilateral.isSelected()) {
            drawingPanel.setCurrentShapeType(ShapeType.QUADRILATERAL);
            return;
        }
    }//GEN-LAST:event_radShapeActionPerformed
    /* user pressed return in the thickness field */
    private void txtThicknessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThicknessActionPerformed
        handleThickness();
    }//GEN-LAST:event_txtThicknessActionPerformed
    /* user has clicked away from the thickness field */
    private void txtThicknessFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtThicknessFocusLost
        handleThickness();
    }//GEN-LAST:event_txtThicknessFocusLost
    /* user has types somethinginto thickness field */
    private void txtThicknessKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThicknessKeyReleased
        handleThickness();
    }//GEN-LAST:event_txtThicknessKeyReleased
    /* rotate the drawing 90 degrees to the right */
    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        drawingPanel.rotate(90);
    }//GEN-LAST:event_btnRightActionPerformed

    private void scrBrightnessAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrBrightnessAdjustmentValueChanged
        float currentBrightness = scrBrightness.getValue();
        int colourValue = (int) (255 * ((100 - currentBrightness) / 100));
        labBrightness.setBackground(new Color(colourValue, colourValue, colourValue));
        drawingPanel.setCurrentBrightness((100 - currentBrightness) / 100);

    }//GEN-LAST:event_scrBrightnessAdjustmentValueChanged

    private void btnLoadXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadXMLActionPerformed



    }//GEN-LAST:event_btnLoadXMLActionPerformed

    private void btnLoadJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadJSONActionPerformed

        

    }//GEN-LAST:event_btnLoadJSONActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        scrRed.setValue(0);
        scrGreen.setValue(0);
        scrBlue.setValue(0);
        txtThickness.setText("5");
        scrBrightness.setValue(50);
    }//GEN-LAST:event_btnReset1ActionPerformed

    private void txtRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedActionPerformed

    private void btnBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackgroundActionPerformed
        panDrawingArea.setBackground(new Color(scrRed.getValue(),scrGreen.getValue(),scrBlue.getValue()));
    }//GEN-LAST:event_btnBackgroundActionPerformed

    private void txtGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGreenActionPerformed

    private void txtBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBlueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBlueActionPerformed
    
    /* action whatever change has been made to the line thickness */
    private void handleThickness() {
        int thickness = Integer.parseInt(txtThickness.getText());
        /* only allow thicknesses in the range 1 to 40 */
        thickness = thickness < 1 || thickness > 40 ? 5 : thickness;
        drawingPanel.setCurrentThickness(thickness);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        new DrawerMain().setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackground;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnLoadJSON;
    private javax.swing.JButton btnLoadXML;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnRight;
    private javax.swing.ButtonGroup grpShape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labBrightness;
    private javax.swing.JPanel panBackground;
    private javax.swing.JPanel panBlueScroller;
    private javax.swing.JPanel panBrightness;
    private javax.swing.JPanel panButtons;
    private javax.swing.JPanel panControls;
    private javax.swing.JPanel panDrawingArea;
    private javax.swing.JPanel panGreenScroller;
    private javax.swing.JPanel panLoad;
    private javax.swing.JPanel panMoreControls;
    private javax.swing.JPanel panRedScroller;
    private javax.swing.JPanel panRotate;
    private javax.swing.JPanel panScroller;
    private javax.swing.JPanel panShape;
    private javax.swing.JPanel panThickness;
    private javax.swing.JPanel panViewBackground;
    private javax.swing.JRadioButton radLine;
    private javax.swing.JRadioButton radOval;
    private javax.swing.JRadioButton radQuadrilateral;
    private javax.swing.JRadioButton radTriangle;
    private javax.swing.JScrollBar scrBlue;
    private javax.swing.JScrollBar scrBrightness;
    private javax.swing.JScrollBar scrGreen;
    private javax.swing.JScrollBar scrRed;
    private javax.swing.JTextField txtBlue;
    private javax.swing.JTextField txtGreen;
    private javax.swing.JTextField txtRed;
    private javax.swing.JTextField txtThickness;
    // End of variables declaration//GEN-END:variables
}
