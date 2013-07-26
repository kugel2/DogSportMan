import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;


public class ResultEditPanel extends JPanel {
	private JLabel lblStartNr;
	private JTextField txtStartNr;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtAltersklasse;
	private JTextField txtName;
	private JTextField txtRufname;
	private JTextField txtZwinger;
	private JLabel lblUnterordnung;
	private JTextField txtPunkteUnterordnung;
	private JLabel lblSlalom;
	private JTextField txtZeitSlalom;
	private JLabel lblNewLabel;
	private JLabel lblFehler;
	private JTextField txtFehlerSlalom;
	private JCheckBox chckbxOhneLeine;
	private JLabel lblHrden;
	private JLabel lblZeit;
	private JTextField txtZeitHrden;
	private JLabel lblFehler_1;
	private JTextField txtFehlerHrden;
	private JCheckBox chckbxOhneLeine_1;
	private JLabel lblHindernisse;
	private JLabel lblZeit_1;
	private JTextField txtZeitHindernisse;
	private JLabel lblFehler_2;
	private JTextField txtFehlerHindernisse;
	private JLabel lblX;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblPktUo;
	private JLabel lblPktSlalom;
	private JLabel lblPktHrden;
	private JLabel label_3;
	private JLabel lblPktHindernisse;
	private JLabel lblErgebnis;
	private JLabel lblNewLabel_1;
	private JLabel lblAktuellerRang;
	private JLabel lblAktRang;
	private JButton btnVorherigesTeam;
	private JButton btnNchstesTeam;
	private JButton btnZurcksetzen;
	private JButton btnStarter;

	/**
	 * Create the panel.
	 */
	public ResultEditPanel() {
		
		lblStartNr = new JLabel("Start Nr.");
		
		txtStartNr = new JTextField();
		txtStartNr.setEditable(false);
		txtStartNr.setText("Start Nr.");
		txtStartNr.setColumns(10);
		
		txtVorname = new JTextField();
		txtVorname.setEditable(false);
		txtVorname.setText("Vorname");
		txtVorname.setColumns(10);
		
		txtNachname = new JTextField();
		txtNachname.setEditable(false);
		txtNachname.setText("Nachname");
		txtNachname.setColumns(10);
		
		txtAltersklasse = new JTextField();
		txtAltersklasse.setEditable(false);
		txtAltersklasse.setText("Altersklasse");
		txtAltersklasse.setColumns(10);
		
		txtName = new JTextField();
		txtName.setEditable(false);
		txtName.setText("Name");
		txtName.setColumns(10);
		
		txtRufname = new JTextField();
		txtRufname.setEditable(false);
		txtRufname.setText("Rufname");
		txtRufname.setColumns(10);
		
		txtZwinger = new JTextField();
		txtZwinger.setEditable(false);
		txtZwinger.setText("Zwinger");
		txtZwinger.setColumns(10);
		
		lblUnterordnung = new JLabel("Unterordnung");
		
		txtPunkteUnterordnung = new JTextField();
		txtPunkteUnterordnung.setText("Punkte Unterordnung");
		txtPunkteUnterordnung.setColumns(10);
		
		lblSlalom = new JLabel("Slalom");
		
		txtZeitSlalom = new JTextField();
		txtZeitSlalom.setText("Zeit Slalom");
		txtZeitSlalom.setColumns(10);
		
		lblNewLabel = new JLabel("Zeit");
		
		lblFehler = new JLabel("Fehler");
		
		txtFehlerSlalom = new JTextField();
		txtFehlerSlalom.setText("Fehler Slalom");
		txtFehlerSlalom.setColumns(10);
		
		chckbxOhneLeine = new JCheckBox("ohne Leine");
		
		lblHrden = new JLabel("H\u00FCrden");
		
		lblZeit = new JLabel("Zeit");
		
		txtZeitHrden = new JTextField();
		txtZeitHrden.setText("Zeit H\u00FCrden");
		txtZeitHrden.setColumns(10);
		
		lblFehler_1 = new JLabel("Fehler");
		
		txtFehlerHrden = new JTextField();
		txtFehlerHrden.setText("Fehler H\u00FCrden");
		txtFehlerHrden.setColumns(10);
		
		chckbxOhneLeine_1 = new JCheckBox("ohne Leine");
		
		lblHindernisse = new JLabel("Hindernisse");
		
		lblZeit_1 = new JLabel("Zeit");
		
		txtZeitHindernisse = new JTextField();
		txtZeitHindernisse.setText("Zeit Hindernisse");
		txtZeitHindernisse.setColumns(10);
		
		lblFehler_2 = new JLabel("Fehler");
		
		txtFehlerHindernisse = new JTextField();
		txtFehlerHindernisse.setText("Fehler Hindernisse");
		txtFehlerHindernisse.setColumns(10);
		
		lblX = new JLabel("x 0,7");
		
		label = new JLabel("=");
		
		label_1 = new JLabel("=");
		
		label_2 = new JLabel("=");
		
		lblPktUo = new JLabel("Pkt UO");
		
		lblPktSlalom = new JLabel("Pkt Slalom");
		
		lblPktHrden = new JLabel("Pkt H\u00FCrden");
		
		label_3 = new JLabel("=");
		
		lblPktHindernisse = new JLabel("Pkt Hindernisse");
		
		lblErgebnis = new JLabel("ergebnis");
		
		lblNewLabel_1 = new JLabel("Ergenis");
		
		lblAktuellerRang = new JLabel("aktueller Rang");
		
		lblAktRang = new JLabel("akt Rang");
		
		btnVorherigesTeam = new JButton("vorheriges Team");
		
		btnNchstesTeam = new JButton("n\u00E4chstes Team");
		
		btnZurcksetzen = new JButton("Zur\u00FCcksetzen");
		
		btnStarter = new JButton("1. Starter");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblStartNr)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtStartNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtAltersklasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtRufname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtZwinger, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblUnterordnung)
										.addComponent(lblSlalom)
										.addComponent(lblHrden)
										.addComponent(lblHindernisse))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblZeit_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtZeitHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblFehler_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtFehlerHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(txtZeitSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(lblFehler)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(txtFehlerSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(txtPunkteUnterordnung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblX)
												.addComponent(chckbxOhneLeine)))
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addComponent(lblNewLabel_1)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblZeit)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtZeitHrden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(lblFehler_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtFehlerHrden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(chckbxOhneLeine_1))
											.addComponent(lblAktuellerRang)))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPktUo)
										.addComponent(lblPktSlalom)
										.addComponent(lblPktHrden)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblErgebnis)
										.addComponent(lblPktHindernisse)
										.addComponent(lblAktRang)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnVorherigesTeam)
							.addGap(142)
							.addComponent(btnZurcksetzen)
							.addPreferredGap(ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
							.addComponent(btnNchstesTeam))
						.addComponent(btnStarter))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStartNr)
						.addComponent(txtStartNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtVorname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNachname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAltersklasse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtRufname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtZwinger, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUnterordnung)
						.addComponent(txtPunkteUnterordnung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblX)
						.addComponent(label)
						.addComponent(lblPktUo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSlalom)
						.addComponent(lblNewLabel)
						.addComponent(txtZeitSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFehler)
						.addComponent(txtFehlerSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxOhneLeine)
						.addComponent(label_1)
						.addComponent(lblPktSlalom))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHrden)
						.addComponent(lblZeit)
						.addComponent(txtZeitHrden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFehler_1)
						.addComponent(txtFehlerHrden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxOhneLeine_1)
						.addComponent(label_2)
						.addComponent(lblPktHrden))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHindernisse)
						.addComponent(lblZeit_1)
						.addComponent(txtZeitHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFehler_2)
						.addComponent(txtFehlerHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(lblPktHindernisse))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblErgebnis)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAktuellerRang)
						.addComponent(lblAktRang))
					.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
					.addComponent(btnStarter)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVorherigesTeam)
						.addComponent(btnNchstesTeam)
						.addComponent(btnZurcksetzen))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
