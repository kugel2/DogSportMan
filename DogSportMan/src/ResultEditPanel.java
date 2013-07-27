import javax.swing.JPanel;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class ResultEditPanel extends JPanel {
	private JLabel lblStartNr;
	private JTextField txtStartNr;
	private JLabel lblUnterordnung;
	private JLabel lblSlalom;
	private JLabel lblNewLabel;
	private JLabel lblFehler;
	private JCheckBox chckbxOhneLeineSlalom;
	private JLabel lblHrden;
	private JLabel lblZeit;
	private JLabel lblFehler_1;
	private JCheckBox chckbxOhneLeineHuerden;
	private JLabel lblHindernisse;
	private JLabel lblZeit_1;
	private JLabel lblFehler_2;
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
	private JFormattedTextField txtZeitHindernisse;
	private JFormattedTextField txtZeitHuerden;
	private JFormattedTextField txtZeitSlalom;
	private JFormattedTextField txtPunkteUnterordnung;
	private JFormattedTextField txtFehlerHindernisse;
	private JFormattedTextField txtFehlerHuerden;
	private JFormattedTextField txtFehlerSlalom;
	private JLabel lblVorname;
	private JLabel lblNachname;
	private JLabel lblAltersklasse;
	private JLabel lblNameHund;
	private JLabel lblRufnameHund;
	private JLabel lblZwingerHund;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultEditPanel panel = new ResultEditPanel();
					JFrame frame = new JFrame();
					frame.setContentPane(panel);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the panel.
	 */
	public ResultEditPanel() {
		
		lblStartNr = new JLabel("Start Nr.");
		
		txtStartNr = new JTextField();
		txtStartNr.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txtStartNr.setEditable(false);
		txtStartNr.setText("Start Nr.");
		txtStartNr.setColumns(10);
		
		lblUnterordnung = new JLabel("Unterordnung");
		
		lblSlalom = new JLabel("Slalom");
		
		lblNewLabel = new JLabel("Zeit");
		
		lblFehler = new JLabel("Fehler");
		
		chckbxOhneLeineSlalom = new JCheckBox("ohne Leine");
		
		lblHrden = new JLabel("H\u00FCrden");
		
		lblZeit = new JLabel("Zeit");
		
		lblFehler_1 = new JLabel("Fehler");
		
		chckbxOhneLeineHuerden = new JCheckBox("ohne Leine");
		
		lblHindernisse = new JLabel("Hindernisse");
		
		lblZeit_1 = new JLabel("Zeit");
		
		lblFehler_2 = new JLabel("Fehler");
		
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
		
		txtZeitHindernisse = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtZeitHindernisse.setText("Zeit Hindernisse");
		
		txtZeitHuerden = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtZeitHuerden.setText("Zeit H\u00FCrden");
		
		txtZeitSlalom = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtZeitSlalom.setText("Zeit Slalom");
		
		txtPunkteUnterordnung = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtPunkteUnterordnung.setText("Punkte Unterordnung");
		
		txtFehlerHindernisse = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtFehlerHindernisse.setText("Fehler Hindernisse");
		
		txtFehlerHuerden = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtFehlerHuerden.setText("Fehler H\u00FCrden");
		
		txtFehlerSlalom = new JFormattedTextField(new DecimalFormat("0.##", new DecimalFormatSymbols()));
		txtFehlerSlalom.setText("Fehler Slalom");
		
		lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		lblAltersklasse = new JLabel("Altersklasse");
		lblAltersklasse.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		lblNameHund = new JLabel("Name Hund");
		lblNameHund.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		lblRufnameHund = new JLabel("Rufname Hund");
		lblRufnameHund.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		lblZwingerHund = new JLabel("Zwinger Hund");
		lblZwingerHund.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(lblSlalom)
															.addComponent(lblHrden)
															.addComponent(lblUnterordnung))
														.addGap(18)
														.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
															.addComponent(lblNewLabel)
															.addComponent(lblZeit_1)
															.addComponent(lblZeit)))
													.addComponent(lblHindernisse))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(txtZeitHindernisse)
													.addComponent(txtZeitHuerden, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
													.addComponent(txtZeitSlalom, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
													.addComponent(txtPunkteUnterordnung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(lblFehler)
															.addComponent(lblFehler_1)
															.addComponent(lblFehler_2))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
															.addComponent(txtFehlerHindernisse, 0, 0, Short.MAX_VALUE)
															.addComponent(txtFehlerHuerden, 0, 0, Short.MAX_VALUE)
															.addComponent(txtFehlerSlalom, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
														.addPreferredGap(ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(chckbxOhneLeineSlalom)
															.addComponent(chckbxOhneLeineHuerden)))
													.addComponent(lblX)))
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addComponent(lblNameHund, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblVorname, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
													.addComponent(lblRufnameHund, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(lblNachname, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addComponent(lblZwingerHund)
													.addComponent(lblAltersklasse))))
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
									.addComponent(lblPunkteHuerden)
									.addComponent(lblPunkteUnterordnung)
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
								.addGap(89)
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
						.addComponent(lblVorname)
						.addComponent(lblNachname)
						.addComponent(lblAltersklasse))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNameHund)
						.addComponent(lblRufnameHund)
						.addComponent(lblZwingerHund))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label)
							.addComponent(lblPunkteUnterordnung))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblUnterordnung)
							.addComponent(lblX)
							.addComponent(txtPunkteUnterordnung, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSlalom)
						.addComponent(lblNewLabel)
						.addComponent(lblFehler)
						.addComponent(chckbxOhneLeineSlalom)
						.addComponent(label_1)
						.addComponent(txtZeitSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFehlerSlalom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPunkteSlalom))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHrden)
						.addComponent(label_2)
						.addComponent(lblZeit)
						.addComponent(lblFehler_1)
						.addComponent(chckbxOhneLeineHuerden)
						.addComponent(txtZeitHuerden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFehlerHuerden, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPunkteHuerden))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(lblHindernisse)
						.addComponent(lblZeit_1)
						.addComponent(lblFehler_2)
						.addComponent(lblPunkteHindernisse)
						.addComponent(txtZeitHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtFehlerHindernisse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
