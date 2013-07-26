import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;


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
	private JCheckBox chckbxOhneLeineSlalom;
	private JLabel lblHrden;
	private JLabel lblZeit;
	private JTextField txtZeitHuerden;
	private JLabel lblFehler_1;
	private JTextField txtFehlerHuerden;
	private JCheckBox chckbxOhneLeineHuerden;
	private JLabel lblHindernisse;
	private JLabel lblZeit_1;
	private JTextField txtZeitHindernisse;
	private JLabel lblFehler_2;
	private JTextField txtFehlerHindernisse;
	private JLabel lblX;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblPunkteUnterordnung;
	private JLabel lblPunkteSlalom;
	private JLabel lblPunkteHuerden;
	private JLabel label_3;
	private JLabel lblPunkteHindernisse;
	private JLabel lblErgebnis;
	private JLabel lblNewLabel_1;
	private JLabel lblAktuellerRang_;
	private JLabel lblAktuellerRang;
	private JButton btnVorherigesTeam;
	private JButton btnNaechstesTeam;
	private JButton btnZuruecksetzen;
	private JButton btnErsterStarter;
	private JLabel lblSuche;
	private JTextField txtSuche;
	private JComboBox comboBoxSortierung;

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
		
		chckbxOhneLeineSlalom = new JCheckBox("ohne Leine");
		
		lblHrden = new JLabel("H\u00FCrden");
		
		lblZeit = new JLabel("Zeit");
		
		txtZeitHuerden = new JTextField();
		txtZeitHuerden.setText("Zeit H\u00FCrden");
		txtZeitHuerden.setColumns(10);
		
		lblFehler_1 = new JLabel("Fehler");
		
		txtFehlerHuerden = new JTextField();
		txtFehlerHuerden.setText("Fehler H\u00FCrden");
		txtFehlerHuerden.setColumns(10);
		
		chckbxOhneLeineHuerden = new JCheckBox("ohne Leine");
		
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
		
		lblPunkteUnterordnung = new JLabel("Pkt UO");
		
		lblPunkteSlalom = new JLabel("Pkt Slalom");
		
		lblPunkteHuerden = new JLabel("Pkt H\u00FCrden");
		
		label_3 = new JLabel("=");
		
		lblPunkteHindernisse = new JLabel("Pkt Hindernisse");
		
		lblErgebnis = new JLabel("ergebnis");
		
		lblNewLabel_1 = new JLabel("Ergebnis");
		
		lblAktuellerRang_ = new JLabel("aktueller Rang");
		
		lblAktuellerRang = new JLabel("akt Rang");
		
		btnVorherigesTeam = new JButton("vorheriges Team");
		
		btnNaechstesTeam = new JButton("n\u00E4chstes Team");
		btnNaechstesTeam.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btnZuruecksetzen = new JButton("Zur\u00FCcksetzen");
		
		btnErsterStarter = new JButton("1. Starter");
		
		lblSuche = new JLabel("Suche:");
		
		txtSuche = new JTextField();
		txtSuche.setText("Suche");
		txtSuche.setColumns(10);
		
		comboBoxSortierung = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_1)
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
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
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(lblSlalom)
															.addComponent(lblHrden)
															.addComponent(lblUnterordnung))
														.addGap(18)
														.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
															.addComponent(lblNewLabel)
															.addComponent(lblZeit_1)
															.addComponent(lblZeit))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
															.addComponent(txtZeitHindernisse, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
																.addComponent(txtZeitHuerden, 0, 0, Short.MAX_VALUE)
																.addComponent(txtZeitSlalom, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
																.addComponent(txtPunkteUnterordnung, GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
													.addComponent(lblHindernisse))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(lblFehler)
															.addComponent(lblFehler_1)
															.addComponent(lblFehler_2))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(txtFehlerHuerden, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
															.addComponent(txtFehlerSlalom, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
															.addComponent(txtFehlerHindernisse, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(chckbxOhneLeineSlalom)
															.addComponent(chckbxOhneLeineHuerden)))
													.addComponent(lblX))))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(label_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
									.addComponent(lblAktuellerRang_))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblPunkteSlalom)
									.addComponent(lblPunkteUnterordnung)
									.addComponent(lblPunkteHuerden)
									.addComponent(lblPunkteHindernisse)
									.addComponent(lblAktuellerRang)
									.addComponent(lblErgebnis)))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnVorherigesTeam)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnZuruecksetzen, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
								.addGap(171)
								.addComponent(btnNaechstesTeam))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblSuche)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtSuche, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxSortierung, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnErsterStarter))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSuche)
						.addComponent(txtSuche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxSortierung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtStartNr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblStartNr))
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
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label)
							.addComponent(lblPunkteUnterordnung))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblUnterordnung)
							.addComponent(txtPunkteUnterordnung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblX)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSlalom)
						.addComponent(lblNewLabel)
						.addComponent(txtZeitSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFehler)
						.addComponent(txtFehlerSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxOhneLeineSlalom)
						.addComponent(label_1)
						.addComponent(lblPunkteSlalom))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHrden)
						.addComponent(txtZeitHuerden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(lblZeit)
						.addComponent(lblFehler_1)
						.addComponent(txtFehlerHuerden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(chckbxOhneLeineHuerden)
						.addComponent(lblPunkteHuerden))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(lblHindernisse)
						.addComponent(lblZeit_1)
						.addComponent(txtZeitHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFehler_2)
						.addComponent(txtFehlerHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPunkteHindernisse))
					.addGap(12)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblErgebnis)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAktuellerRang)
						.addComponent(lblAktuellerRang_))
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(btnErsterStarter)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVorherigesTeam)
						.addComponent(btnZuruecksetzen)
						.addComponent(btnNaechstesTeam))
					.addContainerGap())
		);
		setLayout(groupLayout);

	}
}
