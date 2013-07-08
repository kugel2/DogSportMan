import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;


public class PersonEditPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8424709019574028587L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtHh;
	private JTextField textField_2;
	private JTextField textField_3;
	private JFormattedTextField formattedTextField;
	private JLabel lblAlter;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().add(new PersonEditPanel());
		f.setVisible(true);
		while (true) {
		}
	}
	/**
	 * Create the panel.
	 */
	public PersonEditPanel() {
		
		JLabel lblName = new JLabel("Name");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblVorname = new JLabel("Vorname");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblGeburtsdatum = new JLabel("Geburtsdatum");
		
		formattedTextField = new JFormattedTextField(new SimpleDateFormat("dd.MM.y"));
//		formattedTextField.addPropertyChangeListener(new PropertyChangeListener() {
//			public void propertyChange(PropertyChangeEvent arg0) {
//				Date now = new Date();
//				Date bday = (Date) formattedTextField.getValue();
//				
//				
//				
//				System.out.println(now);
//				if (bday == null) {
//					return;
//				}
//				System.out.println(bday);
//				int diff = now.getYear() - bday.getYear();
//				System.out.println(now.getYear() - bday.getYear());
//				
//				lblAlter.setText(Integer.toString(diff));
//			}
//		});
		formattedTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date now = new Date();
				Date bday = (Date) formattedTextField.getValue();
				
				System.out.println(now);
				if (bday == null) {
					return;
				}
				System.out.println(bday);
				int diff = now.getYear() - bday.getYear();
				System.out.println(now.getYear() - bday.getYear());
				
				lblAlter.setText(Integer.toString(diff));
			}
		});

		formattedTextField.setToolTipText("Geburtsdatum eingeben!");
		
		JLabel lblTelefonnummer = new JLabel("Telefonnummer");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		
		JCheckBox chckbxRichter = new JCheckBox("Richter");
		
		JCheckBox chckbxPrfungsleiter = new JCheckBox("Pr\u00FCfungsleiter");
		
		JList list = new JList();
		
		JLabel lblHunde = new JLabel("Hunde");
		
		JLabel lblStrae = new JLabel("Stra\u00DFe/Hausnr.");
		
		JLabel lblOrt = new JLabel("PLZ/Ort");
		
		txtHh = new JTextField();
		txtHh.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JRadioButton rdbtnMann = new JRadioButton("Mann");
		buttonGroup.add(rdbtnMann);
		
		JRadioButton rdbtnFrau = new JRadioButton("Frau");
		buttonGroup.add(rdbtnFrau);
		
		JLabel lblGeschlecht = new JLabel("Geschlecht");
		
		JLabel lblFunktionen = new JLabel("Funktionen");
		
		JLabel lblVerein = new JLabel("Verein");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		
		lblAlter = new JLabel("Hans ist doof!");
		
		JButton btnTest = new JButton("test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("???");
				lblAlter.setText("stimmt nšd");
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblStrae)
							.addPreferredGap(ComponentPlacement.RELATED, 378, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblOrt)
							.addPreferredGap(ComponentPlacement.RELATED, 424, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGeburtsdatum)
								.addComponent(lblTelefonnummer)
								.addComponent(lblVorname)
								.addComponent(lblName)
								.addComponent(lblGeschlecht))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnTest)
									.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
									.addComponent(lblAlter))
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
								.addComponent(formattedTextField_1, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtHh, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, 0, 288, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnMann)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnFrau))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxRichter)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(chckbxPrfungsleiter))
								.addComponent(comboBox_1, 0, 362, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFunktionen)
							.addPreferredGap(ComponentPlacement.RELATED, 402, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblVerein)
							.addPreferredGap(ComponentPlacement.RELATED, 434, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblHunde)
							.addGap(70)
							.addComponent(list, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMann)
						.addComponent(rdbtnFrau)
						.addComponent(lblGeschlecht))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVorname)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGeburtsdatum)
						.addComponent(lblAlter)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTest))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefonnummer)
						.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStrae)
						.addComponent(txtHh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblOrt)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFunktionen)
						.addComponent(chckbxRichter)
						.addComponent(chckbxPrfungsleiter))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVerein)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
						.addComponent(lblHunde))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
