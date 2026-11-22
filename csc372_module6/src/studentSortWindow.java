import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class studentSortWindow extends JFrame implements ActionListener{
	
	JTextField[] rollno = new JTextField[10];
	JTextField[] name = new JTextField[10];
	JTextField[] address = new JTextField[10];
	
	JLabel[] rollnoLabel = new JLabel[10];
	JLabel[] nameLabel = new JLabel[10];
	JLabel[] addressLabel = new JLabel[10];
	
	JButton exitButton;
	JButton rollnoSortButton;
	JButton nameSortButton;
	JButton displayButton;
	JButton updateButton;
	
	GridBagConstraints layoutConst = new GridBagConstraints();
	JPanel jPanel = new JPanel(new GridBagLayout());
	
	ArrayList<Student> students;
	
	studentSortWindow(ArrayList<Student> students) {
	
		this.students = students;
		
		//Program window sizing ----------------------------
		//setSize(600, 400);								//Set the frame's width to ___ pixels and height to ___ pixels
		setTitle("Student Sorting");					//Set the frame's title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Set program to exit when the frame is closed

		setLayout(new GridBagLayout());

		//jPanel layout ------------------------------------
		GridBagConstraints panelConst = new GridBagConstraints();
		panelConst.gridx = 0;
		panelConst.gridy = 0;
		//panelConst.weightx = 1.0;
		//panelConst.weighty = 1.0;
		panelConst.fill = GridBagConstraints.BOTH;
		panelConst.anchor = GridBagConstraints.NORTH;
		add(jPanel, panelConst);
	
		//Instructions -----------------------------------------
		JTextArea outputArea = new JTextArea();
		outputArea.setText("Instructions: Enter 10 students' information into fields below. Fields are prefilled by default.");
		outputArea.setEditable(false);
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 6;
		layoutConst.weightx = 1.0;
		//layoutConst.weighty = 1.0;
		//layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.anchor = GridBagConstraints.NORTH;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(outputArea, layoutConst);
		
		layoutConst.gridwidth = 1;

		//Add Student fields
		for (int i = 1; i <= 10; i++) {
			addStudentField(i);
		}
		
		//Fill fields with initial data
		initialFieldFill(students);
	
		//Sort by rollno button
		rollnoSortButton = new JButton("Sort by Roll No");
		rollnoSortButton.addActionListener(this);
		layoutConst.gridx = 0;
		layoutConst.gridy = 11;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(rollnoSortButton, layoutConst);	
			
		//Sort by name button
		nameSortButton = new JButton("Sort by Name");
		nameSortButton.addActionListener(this);
		layoutConst.gridx = 1;
		layoutConst.gridy = 11;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(nameSortButton, layoutConst);
		
		//Update ArrayList al with current Information
		updateButton = new JButton("Update ArrayList");
		updateButton.addActionListener(this);
		layoutConst.gridx = 2;
		layoutConst.gridy = 11;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(updateButton, layoutConst);
		
		//Display current ArrayList al information
		displayButton = new JButton("Display ArrayList");
		displayButton.addActionListener(this);
		layoutConst.gridx = 3;
		layoutConst.gridy = 11;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(displayButton, layoutConst);
		
		//Exit Button to update account ------------------------------------------------------
		exitButton = new JButton("Exit program");
		exitButton.addActionListener(this);
		layoutConst.gridx = 5;
		layoutConst.gridy = 11;
		layoutConst.gridwidth = 1;
		layoutConst.fill = GridBagConstraints.NONE;
		layoutConst.insets = new Insets(10,10,10,10);
		jPanel.add(exitButton, layoutConst);
		
		pack();								//Auto size the program to fit everything
		
		//Set visibility
		setVisible(true);			//Set the JFrame's visibility to True. The default is False.
	
	}

	private void initialFieldFill(ArrayList<Student> students) {
		for (int i = 0; i < 10; i++) {
			rollno[i].setText(String.valueOf(students.get(i).rollno));
			name[i].setText(students.get(i).name);
			address[i].setText(students.get(i).address);
		}
	}

	private void addStudentField(int i) {
		
		rollno[i - 1] = new JTextField(10);
		name[i - 1] = new JTextField(10);
		address[i - 1] = new JTextField(30);
		
		JLabel rollnoLabel = new JLabel("Roll Number: ");
		JLabel nameLabel = new JLabel("Name: ");
		JLabel addressLabel = new JLabel("Address: ");
		
		layoutConst.insets = new Insets(5, 5, 5, 5);
		layoutConst.fill = GridBagConstraints.NONE;
		
		layoutConst.gridx = 0;
		layoutConst.gridy = i;
		jPanel.add(rollnoLabel, layoutConst);
		
		layoutConst.gridx = 1;
		jPanel.add(rollno[i-1], layoutConst);
		
		layoutConst.gridx = 2;
		jPanel.add(nameLabel, layoutConst);
		
		layoutConst.gridx = 3;
		jPanel.add(name[i-1], layoutConst);
		
		layoutConst.gridx = 4;
		jPanel.add(addressLabel, layoutConst);
		
		layoutConst.gridx = 5;
		jPanel.add(address[i-1], layoutConst);
		
	}
	
	//Event Handler ----------------------------------------------------------------------
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exitButton) {
			System.exit(0);
		} else if (e.getSource() == rollnoSortButton) {
			//JOptionPane.showMessageDialog(this, "Roll No Sort Button was pressed"); //Used for testing
			updateArray();
			sortingMethods.sortRollNo(students);
			updateFields();
			//Print the updated info to the correct fields
		} else if (e.getSource() == nameSortButton) {
			//JOptionPane.showMessageDialog(this, "Name Sort Button was pressed"); //Used for testing
			updateArray();
			sortingMethods.sortName(students);
			updateFields();
			//Print the updated info to the correct fields
		} else if (e.getSource() == updateButton) {
			//JOptionPane.showMessageDialog(this, "Update Button was pressed"); //Used for testing
			updateArray();
		} else if (e.getSource() == displayButton) {
			//JOptionPane.showMessageDialog(this, "Display Button was pressed"); //Used for testing
			displayArray();
		}
	}

	private void updateFields() {
		// TODO Auto-generated method stub
		
	}

	//Update arraylist information with the info currently in the fields
	private void updateArray() {
		for (int i = 0; i < 10; i++) {
			int rollNumber = Integer.parseInt(rollno[i].getText());
			String studentName = name[i].getText();
			String studentAddress = address[i].getText();
			students.get(i).rollno = rollNumber;
			students.get(i).name = studentName;
			students.get(i).address = studentAddress;
	    }
	}
	
	private void displayArray() {
		// TODO Auto-generated method stub
		System.out.println("Current ArrayList information: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("ArrayList element: " + i + ", rollno: " + students.get(i).rollno
					+ ", name: " + students.get(i).name + ", address: " + students.get(i).address);
		}
		System.out.println("");
	}
	
}
