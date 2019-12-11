/*
* this is a gui  class to view standard UI in calculator 
* biginning in 3/12/2019 ...
* java developers team .
 */
package GUI;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Muhammmad Hossam
 */
public final class Standard extends JFrame {

    // our constructor 
    Standard() {
        declearingButtons();
        decleareStandardPanel();
        decleareResultPanel();
        decleareMPanel();
        decleareNumbersAndOPerationPanel();
        decleareContetPane();
        this.setPreferredSize(new Dimension(360, 550));
        this.setMinimumSize(new Dimension(360, 550));
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Calcultor");
    }

    // method to decleare and initialize components  
    public static void declearingButtons() {
        menuItems = new JButton("\u2630");
        standardWord = new JLabel("Standard");
        moveToSymbolCal = new JButton("\u25F3");
        history = new JButton("\u21BA");
        //...............
        displayText = new JLabel();
        percent = new JButton("%");
        sqrRoot = new JButton("\u221B");
        pow2 = new JButton("x" + "\u00B2");
        invOfTask = new JButton("\u00B9" + "\u2044" + "\u03C7");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        mul = new JButton("X");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        min = new JButton("\u2796");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        plus = new JButton("\u2795");
        negate = new JButton("+/-");
        b0 = new JButton("0");
        decPoint = new JButton("\u2022");
        equal = new JButton("=");
        div = new JButton("\u2797");
        delnumber = new JButton("\u232B");
        deleteall = new JButton("C");
        setzero = new JButton("CE");
        bMC = new JButton("MC");
        bMR = new JButton("MR");
        bMplus = new JButton("M+");
        bMminus = new JButton("M-");
        bMS = new JButton("MS");
        bM = new JButton("M^");
    }
    
    // method to add buttons to (nummber and operations ) panel  
    public static Panel addButtonstopannel() {
        pannelNmberAndOPeration.add(percent);
        pannelNmberAndOPeration.add(sqrRoot);
        pannelNmberAndOPeration.add(pow2);
        pannelNmberAndOPeration.add(invOfTask);
        pannelNmberAndOPeration.add(setzero);
        pannelNmberAndOPeration.add(deleteall);
        pannelNmberAndOPeration.add(delnumber);
        pannelNmberAndOPeration.add(div);
        pannelNmberAndOPeration.add(b7);
        pannelNmberAndOPeration.add(b8);
        pannelNmberAndOPeration.add(b9);
        pannelNmberAndOPeration.add(mul);
        pannelNmberAndOPeration.add(b4);
        pannelNmberAndOPeration.add(b5);
        pannelNmberAndOPeration.add(b6);
        pannelNmberAndOPeration.add(min);
        pannelNmberAndOPeration.add(b1);
        pannelNmberAndOPeration.add(b2);
        pannelNmberAndOPeration.add(b3);
        pannelNmberAndOPeration.add(plus);
        pannelNmberAndOPeration.add(negate);
        pannelNmberAndOPeration.add(b0);
        pannelNmberAndOPeration.add(decPoint);
        pannelNmberAndOPeration.add(equal);
        return pannelNmberAndOPeration;
    }

    // method to fill StandardPanel
    public static void decleareStandardPanel() {
        panelStandard = new Panel(new FlowLayout(20, 20, 20));
        panelStandard.add(menuItems);
        panelStandard.add(standardWord);
        panelStandard.add(moveToSymbolCal);
        panelStandard.add(history);
        panelStandard.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
    }

    // method to decleare resultPannel 
    public static void decleareResultPanel() {
        paneldisplayResult = new Panel(new FlowLayout());
        displayText = new JLabel("0");
        paneldisplayResult.add(displayText);
    }

    // method to decleare M panel 
    public static void decleareMPanel() {
        panelM = new Panel(new FlowLayout(15, 5, 10));
        declearingButtons();
        panelM.add(bMC);
        panelM.add(bMR);
        panelM.add(bMplus);
        panelM.add(bMminus);
        panelM.add(bMS);
        panelM.add(bM);
        panelM.setComponentOrientation(
                ComponentOrientation.LEFT_TO_RIGHT);
    }

    // method to decleare Numbers and OperationsPanel panel 
    public static void decleareNumbersAndOPerationPanel() {
        declearingButtons();
        pannelNmberAndOPeration = new Panel();
        pannelNmberAndOPeration = addButtonstopannel();
        pannelNmberAndOPeration.setLayout(new GridLayout(6, 4));
        pannelNmberAndOPeration.setPreferredSize(new Dimension(360, 450));
        pannelNmberAndOPeration.setBackground(Color.BLUE);
    }

    // method to fill content pane 
    public void decleareContetPane() {
        contentpane = new Container();
        contentpane = this.getContentPane();
        contentpane.setBackground(Color.PINK);

//        contentpane1.add(displayText);
//        contentpane1.add(conPaneGrid);
        contentpane.setLayout(new BoxLayout(contentpane, WIDTH));
        // "super" Frame sets to BorderLayout
        contentpane.add(panelStandard);
        contentpane.add(paneldisplayResult);
        contentpane.add(panelM);
        contentpane.add(pannelNmberAndOPeration);

    }
    
    // declearing component s 
    private static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9,
            plus, min, mul, negate, b0,
            decPoint, equal, div, delnumber, deleteall,
            setzero, invOfTask, pow2, sqrRoot, percent,
            menuItems, moveToSymbolCal, history, bMC, bMR, bMplus, bMminus, bMS, bM;
    //.......................
    private static Container contentpane;
    private static Panel pannelNmberAndOPeration, panelM, paneldisplayResult, panelStandard;
    private static JLabel displayText;
    private static JLabel standardWord;

}
