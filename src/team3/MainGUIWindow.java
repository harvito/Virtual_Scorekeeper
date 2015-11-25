package team3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Component;

public class MainGUIWindow {

	private JFrame frmFilthydogs;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField txtEnterATeam;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUIWindow window = new MainGUIWindow();
					window.frmFilthydogs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUIWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFilthydogs = new JFrame();
		frmFilthydogs.setTitle("FilthyDogs\u00AE Soccer ScoreKeeper");
		frmFilthydogs.setBounds(100, 100, 596, 473);
		frmFilthydogs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFilthydogs.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel PlayersPanel = new JPanel();
		frmFilthydogs.getContentPane().add(PlayersPanel, "name_921119217249248");
		PlayersPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblThisIsThe = new JLabel("Players");
		PlayersPanel.add(lblThisIsThe, BorderLayout.NORTH);
		lblThisIsThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsThe.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		
		table = new JTable();
		PlayersPanel.add(table);
		
		JPanel PlayersOptionPanel = new JPanel();
		PlayersPanel.add(PlayersOptionPanel, BorderLayout.EAST);
		PlayersOptionPanel.setLayout(new BoxLayout(PlayersOptionPanel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Show:");
		PlayersOptionPanel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		PlayersOptionPanel.add(comboBox);
		
		JLabel lblSortBy = new JLabel("Sort By:");
		PlayersOptionPanel.add(lblSortBy);
		
		JComboBox comboBox_1 = new JComboBox();
		PlayersOptionPanel.add(comboBox_1);
		
		JPanel TeamsPanel = new JPanel();
		frmFilthydogs.getContentPane().add(TeamsPanel, "name_921182758166659");
		TeamsPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTeams = new JLabel("Teams");
		TeamsPanel.add(lblTeams, BorderLayout.NORTH);
		lblTeams.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeams.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		
		JPanel TeamsOptionsPanel = new JPanel();
		TeamsPanel.add(TeamsOptionsPanel, BorderLayout.EAST);
		TeamsOptionsPanel.setLayout(new BoxLayout(TeamsOptionsPanel, BoxLayout.Y_AXIS));
		
		JLabel lblSortBy_1 = new JLabel("Sort By");
		TeamsOptionsPanel.add(lblSortBy_1);
		
		JComboBox comboBox_2 = new JComboBox();
		TeamsOptionsPanel.add(comboBox_2);
		
		table_1 = new JTable();
		TeamsPanel.add(table_1, BorderLayout.CENTER);
		
		JPanel CreateTeamPanel = new JPanel();
		frmFilthydogs.getContentPane().add(CreateTeamPanel, "name_925719882446334");
		CreateTeamPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel CreateTeam = new JLabel("Create Team");
		CreateTeamPanel.add(CreateTeam, BorderLayout.NORTH);
		CreateTeam.setHorizontalAlignment(SwingConstants.CENTER);
		CreateTeam.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		
		JPanel CurrentPlayersPanel = new JPanel();
		CreateTeamPanel.add(CurrentPlayersPanel, BorderLayout.WEST);
		CurrentPlayersPanel.setLayout(new BoxLayout(CurrentPlayersPanel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("Current Players");
		CurrentPlayersPanel.add(lblNewLabel_1);
		
		table_2 = new JTable();
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_2.setCellSelectionEnabled(true);
		CurrentPlayersPanel.add(table_2);
		
		JPanel FreeAgentPanel = new JPanel();
		CreateTeamPanel.add(FreeAgentPanel, BorderLayout.EAST);
		FreeAgentPanel.setLayout(new BoxLayout(FreeAgentPanel, BoxLayout.Y_AXIS));
		
		JLabel lblFreeAgents = new JLabel("Free Agents");
		FreeAgentPanel.add(lblFreeAgents);
		
		table_3 = new JTable();
		table_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_3.setCellSelectionEnabled(true);
		FreeAgentPanel.add(table_3);
		
		JPanel ControlPanel = new JPanel();
		CreateTeamPanel.add(ControlPanel, BorderLayout.CENTER);
		ControlPanel.setLayout(new BoxLayout(ControlPanel, BoxLayout.Y_AXIS));
		
		JButton btnAddToTeam = new JButton("<-- Add to Team <--");
		ControlPanel.add(btnAddToTeam);
		
		JButton btnRemoveFromTeam = new JButton("--> Remove from Team -->");
		ControlPanel.add(btnRemoveFromTeam);
		
		JLabel lblCreateANew = new JLabel("Create a new team:");
		ControlPanel.add(lblCreateANew);
		
		txtEnterATeam = new JTextField();
		txtEnterATeam.setHorizontalAlignment(SwingConstants.LEFT);
		txtEnterATeam.setText("Enter a team name:");
		ControlPanel.add(txtEnterATeam);
		txtEnterATeam.setColumns(1);
		
		JButton btnCreateTeam = new JButton("Create Team");
		ControlPanel.add(btnCreateTeam);
		
		JPanel CreatePlayersPanel = new JPanel();
		frmFilthydogs.getContentPane().add(CreatePlayersPanel, "name_925704200991788");
		CreatePlayersPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblCreatePlayerProfile = new JLabel("Create Player Profile");
		lblCreatePlayerProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatePlayerProfile.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		CreatePlayersPanel.add(lblCreatePlayerProfile, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		CreatePlayersPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblEnterPlayerInformation = new JLabel("Enter Player Information:");
		panel.add(lblEnterPlayerInformation);
		
		JPanel namePanel = new JPanel();
		panel.add(namePanel);
		
		JLabel lblName = new JLabel("Name:");
		namePanel.add(lblName);
		
		textField = new JTextField();
		namePanel.add(textField);
		textField.setColumns(10);
		
		JPanel numberPanel = new JPanel();
		panel.add(numberPanel);
		
		JLabel lblJerseyNumber = new JLabel("Jersey Number:");
		numberPanel.add(lblJerseyNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		numberPanel.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblPreferedPositionif = new JLabel("Prefered Position (if applicable)");
		panel_1.add(lblPreferedPositionif);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JButton btnNewButton = new JButton("Create Player");
		panel.add(btnNewButton);
		
		JPanel LiveScoreInputPanel = new JPanel();
		frmFilthydogs.getContentPane().add(LiveScoreInputPanel, "name_925765079015101");
		LiveScoreInputPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblLiveScoreInput = new JLabel("Live Score Input");
		lblLiveScoreInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiveScoreInput.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		LiveScoreInputPanel.add(lblLiveScoreInput, BorderLayout.NORTH);
		
		JPanel BatchScoreInputPanel = new JPanel();
		frmFilthydogs.getContentPane().add(BatchScoreInputPanel, "name_925775241412546");
		BatchScoreInputPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblBatchScoreInput = new JLabel("Batch Score Input");
		lblBatchScoreInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatchScoreInput.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		BatchScoreInputPanel.add(lblBatchScoreInput, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		frmFilthydogs.setJMenuBar(menuBar);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmTeamRankings = new JMenuItem("Team Rankings");
		mnView.add(mntmTeamRankings);
		
		JMenuItem mntmPlayerRankings = new JMenuItem("Player Rankings");
		mnView.add(mntmPlayerRankings);
		
		JMenuItem mntmFilthyDogs = new JMenuItem("Filthy Dogs");
		mnView.add(mntmFilthyDogs);
		
		JMenu mnAdministration = new JMenu("Administration");
		menuBar.add(mnAdministration);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Create Team");
		mnAdministration.add(mntmNewMenuItem);
		
		JMenuItem mntmCreatePlayer = new JMenuItem("Create Player");
		mnAdministration.add(mntmCreatePlayer);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Live Score Input");
		mnAdministration.add(mntmNewMenuItem_1);
		
		JMenuItem mntmBatchScoreInput = new JMenuItem("Batch Score Input");
		mnAdministration.add(mntmBatchScoreInput);
		
		JLabel lblFilthyDogsRepresent = new JLabel("FILTHY DOGS REPRESENT WOOF WOOF");
		lblFilthyDogsRepresent.setForeground(Color.RED);
		menuBar.add(lblFilthyDogsRepresent);
	}

}
