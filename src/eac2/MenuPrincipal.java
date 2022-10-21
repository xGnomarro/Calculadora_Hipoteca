package eac2;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MenuPrincipal {
	protected Shell shlClculHipotecaMensual;
	private static Label lblDadesHabitatge;
	private static Button btnAcceptar;
	private static Combo tipusResidencia;
	private static Text preuHabitatge;
	private static Text estalvisAportats;
	private static Label lblPreuHabitatge;
	private static Label lblEstavisAportats;
	private static Label lblTipusResidncia;
	private static Label lblDadesHipoteca;
	private static Label lblDescompte;
	private static Label lblEdadClient;
	private static Label lblAnysHipoteca;
	private static Label lblEuriborActual;
	private static Button btnCalcular;
	private static Button btnRestablir;
	private static Combo descompte;
	private static Text edadClient;
	private static Text anysHipoteca;
	private static Text euribor;
	private static Label label;
	private static Label label_1;
	private static Label label_2;
	private static Label lblPossiblesHipoteques;
	private static Label lblFixaSenseBonificar;
	private static Label lblVariableSenseBonificar;
	private static Label lblFixaBonificada;
	private static Label lblVariableBonificada;
	private static Label lblAlertes;
	private static Text alertes;
	private static Text fixaSense;
	private static Text variableSense;
	private static Text variableBonificada;
	private static Text fixaBonificada;
	private static Label lblmes;
	private static Label lblmes_1;
	private static Label lblmes_2;
	private static Label lblmes_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MenuPrincipal window = new MenuPrincipal();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		//Apertura de la finestra
		public void open() {
			Display display = Display.getDefault();
			creaContinguts();
			shlClculHipotecaMensual.open();
			shlClculHipotecaMensual.layout();
			while (!shlClculHipotecaMensual.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		}	
		
		// Creem els continguts de la pantalla principal
		protected void creaContinguts() {
		shlClculHipotecaMensual = new Shell();
		shlClculHipotecaMensual.setSize(460, 723);
		shlClculHipotecaMensual.setText("Càlcul Hipoteca Mensual per David Delgado");
		lblDadesHabitatge = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblDadesHabitatge.setBounds(11, 20, 105, 15);
		lblDadesHabitatge.setText("Dades Habitatge");
			
		// AL FER CLICK PRIMER COMPROVA QUE HI HA DADES
		btnAcceptar = new Button(shlClculHipotecaMensual, SWT.NONE);
		btnAcceptar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				validaParametres();
				}
			});
		
		btnAcceptar.setBounds(336, 107, 75, 25);
		btnAcceptar.setText("ACCEPTAR");
		
		tipusResidencia = new Combo(shlClculHipotecaMensual, SWT.NONE);
		tipusResidencia.setToolTipText("Indica el tipus de residencia");
		tipusResidencia.setItems(new String[] {"Habitatge habitual", "Segona residència"});
		tipusResidencia.setBounds(130, 148, 129, 23);
		
		preuHabitatge = new Text(shlClculHipotecaMensual, SWT.BORDER);
		preuHabitatge.setToolTipText("Has de ficar el preu del pis, sense impostos.");
		preuHabitatge.setBounds(130, 67, 129, 21);
		
		estalvisAportats = new Text(shlClculHipotecaMensual, SWT.BORDER);
		estalvisAportats.setToolTipText("Introdueix la quantitat estalviada");
		estalvisAportats.setBounds(130, 109, 129, 21);
		
		lblPreuHabitatge = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblPreuHabitatge.setBounds(24, 70, 92, 15);
		lblPreuHabitatge.setText("Preu habitatge");
		
		lblEstavisAportats = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblEstavisAportats.setBounds(24, 112, 92, 15);
		lblEstavisAportats.setText("Estavis aportats");
		
		lblTipusResidncia = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblTipusResidncia.setBounds(24, 151, 92, 15);
		lblTipusResidncia.setText("Tipus residència");
		
		lblDadesHipoteca = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblDadesHipoteca.setBounds(10, 223, 92, 15);
		lblDadesHipoteca.setText("Dades Hipoteca");
		
		lblDescompte = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblDescompte.setBounds(24, 275, 65, 15);
		lblDescompte.setText("Descompte");
		
		lblEdadClient = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblEdadClient.setBounds(24, 314, 78, 15);
		lblEdadClient.setText("Edad Client");
		
		lblAnysHipoteca = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblAnysHipoteca.setBounds(24, 351, 78, 15);
		lblAnysHipoteca.setText("Anys hipoteca");
		
		lblEuriborActual = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblEuriborActual.setBounds(24, 389, 78, 15);
		lblEuriborActual.setText("Euribor actual");
		
		btnCalcular = new Button(shlClculHipotecaMensual, SWT.NONE);
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCalcular.setBounds(306, 289, 105, 50);
		btnCalcular.setText("CALCULAR");
		
		
		btnRestablir = new Button(shlClculHipotecaMensual, SWT.NONE);
		btnRestablir.setBounds(319, 354, 78, 31);
		btnRestablir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			restablir();	
			}
		});
		btnRestablir.setText("RESTABLIR");
		
		descompte = new Combo(shlClculHipotecaMensual, SWT.NONE);
		descompte.setItems(new String[] {"Funcionari", "Menor de 35 anys", "Col·lectiu especial", "Cap"});
		descompte.setBounds(130, 275, 129, 23);
		
		edadClient = new Text(shlClculHipotecaMensual, SWT.BORDER);
		edadClient.setEnabled(false);
		edadClient.setEditable(false);
		edadClient.setBounds(130, 314, 76, 21);
		
		anysHipoteca = new Text(shlClculHipotecaMensual, SWT.BORDER);
		anysHipoteca.setEnabled(false);
		anysHipoteca.setEditable(false);
		anysHipoteca.setBounds(130, 345, 76, 21);
		
		euribor = new Text(shlClculHipotecaMensual, SWT.BORDER);
		euribor.setEnabled(false);
		euribor.setEditable(false);
		euribor.setBounds(130, 383, 76, 21);
		
		label = new Label(shlClculHipotecaMensual, SWT.NONE);
		label.setBounds(212, 389, 55, 15);
		label.setText("%");
		
		label_1 = new Label(shlClculHipotecaMensual, SWT.NONE);
		label_1.setBounds(265, 70, 55, 15);
		label_1.setText("€");
		
		label_2 = new Label(shlClculHipotecaMensual, SWT.NONE);
		label_2.setBounds(265, 112, 55, 15);
		label_2.setText("€");
		
		lblPossiblesHipoteques = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblPossiblesHipoteques.setBounds(151, 441, 152, 15);
		lblPossiblesHipoteques.setText("POSSIBLES HIPOTEQUES");
		
		lblFixaSenseBonificar = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblFixaSenseBonificar.setBounds(46, 481, 123, 15);
		lblFixaSenseBonificar.setText("Fixa sense bonificar");
		
		lblVariableSenseBonificar = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblVariableSenseBonificar.setBounds(46, 536, 152, 15);
		lblVariableSenseBonificar.setText("Variable sense bonificar");
		
		lblFixaBonificada = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblFixaBonificada.setBounds(277, 481, 92, 15);
		lblFixaBonificada.setText("Fixa bonificada");
		
		lblVariableBonificada = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblVariableBonificada.setBounds(277, 536, 105, 15);
		lblVariableBonificada.setText("Variable bonificada");
		
		lblAlertes = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblAlertes.setBounds(11, 606, 55, 15);
		lblAlertes.setText("Alertes");
		
		
		alertes = new Text(shlClculHipotecaMensual, SWT.BORDER);
		alertes.setEnabled(false);
		alertes.setEditable(false);
		alertes.setBounds(11, 627, 420, 31);
		
		fixaSense = new Text(shlClculHipotecaMensual, SWT.BORDER);
		fixaSense.setEnabled(false);
		fixaSense.setEditable(false);
		fixaSense.setBounds(46, 502, 76, 21);
		
		variableSense = new Text(shlClculHipotecaMensual, SWT.BORDER);
		variableSense.setEnabled(false);
		variableSense.setEditable(false);
		variableSense.setBounds(46, 557, 76, 21);
		
		variableBonificada = new Text(shlClculHipotecaMensual, SWT.BORDER);
		variableBonificada.setEnabled(false);
		variableBonificada.setEditable(false);
		variableBonificada.setBounds(277, 557, 76, 21);
		
		fixaBonificada = new Text(shlClculHipotecaMensual, SWT.BORDER);
		fixaBonificada.setEnabled(false);
		fixaBonificada.setEditable(false);
		fixaBonificada.setBounds(277, 502, 76, 21);
		
		lblmes = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblmes.setBounds(356, 502, 55, 15);
		lblmes.setText("€/mes");
		
		lblmes_1 = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblmes_1.setBounds(130, 505, 55, 15);
		lblmes_1.setText("€/mes");
		
		lblmes_2 = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblmes_2.setText("€/mes");
		lblmes_2.setBounds(130, 563, 55, 15);
		
		lblmes_3 = new Label(shlClculHipotecaMensual, SWT.NONE);
		lblmes_3.setText("€/mes");
		lblmes_3.setBounds(356, 563, 55, 15);
		}
		
	private boolean validaParametres() {

		if (preuHabitatge.getText().isEmpty()) {
		enfocaText(preuHabitatge);	
		alertes.setText("No has introduït cap valor al camp Preu Habitatge.");
		return false;
		}
		if (estalvisAportats.getText().isEmpty()) {
		enfocaText(estalvisAportats);	
		alertes.setText("No has introduït cap valor al camp Estalvis Aportats.");
		return false;
		}
		if (tipusResidencia.getSelectionIndex()<0) {
		tipusResidencia.setFocus();
		alertes.setText("No has introduït el tipus de residència");
		return false;
		}
	return true;
	}
		
	private void restablir() {
		preuHabitatge.setText("");
		estalvisAportats.setText("");
		edadClient.setText("");
		anysHipoteca.setText("");
		euribor.setText("");
		alertes.setText("");
	}
	
	private void enfocaText(Text text){
		text.setFocus();
		text.selectAll();
	}
}
