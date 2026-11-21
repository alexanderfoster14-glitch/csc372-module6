import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class studentSortWindow extends JFrame {
	
	studentSortWindow() {
	
		setSize(600, 400);								//Set the frame's width to 400 and height to 300 pixels
		setTitle("Student Sorting");					//Set the frame's title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Set program to exit when the frame is closed

	/*
	setLayout(new GridBagLayout());
	GridBagConstraints layoutConst = new GridBagConstraints();
	
	//jPanel ---------------------------------------------
	JPanel jPanel = new JPanel(new GridBagLayout());

	//jPanel layout --------------------------------------
	GridBagConstraints panelConst = new GridBagConstraints();
	panelConst.gridx = 0;
	panelConst.gridy = 0;
	add(jPanel, panelConst);
	
	//Instructions -----------------------------------------
	JTextArea outputArea = new JTextArea();
	outputArea.setText("Instructions: Enter 5 numbers into fields below.");
	outputArea.setEditable(false);
	layoutConst.gridx = 0;
	layoutConst.gridy = 0;
	layoutConst.gridwidth = 2;
	layoutConst.fill = GridBagConstraints.HORIZONTAL;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(outputArea, layoutConst);

	//Number 1 -----------------------------------------------------------
	number1Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
	number1Field.setColumns(10);
	JLabel number1Label = new JLabel("Number 1:");
	
	//Positioning for number 1 -------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 1;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number1Label, layoutConst);

	layoutConst.gridx = 1;
	layoutConst.gridy = 1;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number1Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
	
	number1Field.setText("0");

	//Number 2 -----------------------------------------------------------
	number2Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
	number2Field.setColumns(10);
	JLabel number2Label = new JLabel("Number 2:");
	
	//Positioning for number 2 -------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 2;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number2Label, layoutConst);

	layoutConst.gridx = 1;
	layoutConst.gridy = 2;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number2Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
	
	number2Field.setText("0");
	
	//Number 3 -----------------------------------------------------------
	number3Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
	number3Field.setColumns(10);
	JLabel number3Label = new JLabel("Number 3:");
	
	//Positioning for number 3 -------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 3;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number3Label, layoutConst);

	layoutConst.gridx = 1;
	layoutConst.gridy = 3;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number3Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
	
	number3Field.setText("0");
	
	//Number 4 -----------------------------------------------------------
	number4Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
	number4Field.setColumns(10);
	JLabel number4Label = new JLabel("Number 4:");
	
	//Positioning for number 4 -------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 4;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number4Label, layoutConst);

	layoutConst.gridx = 1;
	layoutConst.gridy = 4;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number4Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
	
	number4Field.setText("0");
	
	//Number 5 -----------------------------------------------------------
	number5Field = new JFormattedTextField(NumberFormat.getNumberInstance());	//Create a field for the starting balance
	number5Field.setColumns(10);
	JLabel number5Label = new JLabel("Number 5:");
	
	//Positioning for number 5 -------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 5;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number5Label, layoutConst);

	layoutConst.gridx = 1;
	layoutConst.gridy = 5;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(number5Field, layoutConst);	//Add a field for startingBlanceField to the JFrame
	
	number5Field.setText("0");
	
	//Button to calculate product sum -------------------------------------------------------
	calcButton = new JButton("Calculate total product sum");
	calcButton.addActionListener(this);
	
	//Add button to panel ------------------------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 6;
	layoutConst.gridwidth = 2;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(calcButton, layoutConst);
	
	//Product sum total -----------------------------------------------------------------
	productSumTotalField = new JTextField(10);
	productSumTotalLabel = new JLabel("Product sum Total:");

	//Positioning for currentBlance ---------------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 7;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	jPanel.add(productSumTotalLabel, layoutConst);

	layoutConst.gridx = 1;
	layoutConst.gridy = 7;
	layoutConst.gridwidth = 1;
	layoutConst.fill = GridBagConstraints.NONE;
	jPanel.add(productSumTotalField, layoutConst);

	//Button to update account ------------------------------------------------------
	exitButton = new JButton("Exit program");
	exitButton.addActionListener(this);
	
	//Add button to panel -----------------------------------------------------------
	layoutConst.gridx = 0;
	layoutConst.gridy = 8;
	layoutConst.gridwidth = 2;
	layoutConst.fill = GridBagConstraints.NONE;
	layoutConst.insets = new Insets(10,10,10,10);
	jPanel.add(exitButton, layoutConst);

	pack();								//Auto size the program to fit everything
	
	*/
	setVisible(true);
	
	}
}
