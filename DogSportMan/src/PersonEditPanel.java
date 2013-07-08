import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class PersonEditPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtHh;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
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
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(108)
					.addComponent(chckbxPrfungsleiter)
					.addGap(279))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblHunde)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
					.addGap(130))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblGeburtsdatum)
								.addComponent(lblTelefonnummer)
								.addComponent(lblVorname)
								.addComponent(lblName))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
								.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addComponent(formattedTextField_1, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(txtHh, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnMann)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnFrau))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblStrae)
							.addPreferredGap(ComponentPlacement.RELATED, 359, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblOrt)
							.addPreferredGap(ComponentPlacement.RELATED, 405, GroupLayout.PREFERRED_SIZE)))
					.addGap(47))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(chckbxRichter)
					.addContainerGap(379, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(71, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnMann)
						.addComponent(rdbtnFrau))
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
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
					.addGap(84)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHunde)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(chckbxRichter)
					.addGap(25)
					.addComponent(chckbxPrfungsleiter)
					.addGap(28))
		);
		setLayout(groupLayout);

	}
}
