

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
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
import java.awt.Dimension;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import java.awt.Insets;
import javax.swing.JScrollBar;

public class MainGUIWindow {

	private JFrame frmFilthydogs;
	private JTable playersTable;
	private JTable table_1;
	private JTable currentTeamsPlayers;
	private JTable freeAgents;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_4;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_5;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_6;

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
		frmFilthydogs.setBounds(100, 100, 596, 650);
		frmFilthydogs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFilthydogs.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel PlayersPanel = new JPanel();
		frmFilthydogs.getContentPane().add(PlayersPanel, "name_921119217249248");
		PlayersPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblThisIsThe = new JLabel("Players");
		PlayersPanel.add(lblThisIsThe, BorderLayout.NORTH);
		lblThisIsThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThisIsThe.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
				
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
		
		JPanel panel_3 = new JPanel();
		PlayersPanel.add(panel_3, BorderLayout.CENTER);
		playersTable = new JTable(20, 6);
		PlayersPanel.add(playersTable, BorderLayout.WEST);
		
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
		
		table_1 = new JTable(20,6);
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
		
		currentTeamsPlayers = new JTable(15,1);
		currentTeamsPlayers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		currentTeamsPlayers.setCellSelectionEnabled(true);
		CurrentPlayersPanel.add(currentTeamsPlayers);
		
		JPanel FreeAgentPanel = new JPanel();
		CreateTeamPanel.add(FreeAgentPanel, BorderLayout.EAST);
		FreeAgentPanel.setLayout(new BoxLayout(FreeAgentPanel, BoxLayout.Y_AXIS));
		
		JLabel lblFreeAgents = new JLabel("Free Agents");
		FreeAgentPanel.add(lblFreeAgents);
		
		freeAgents = new JTable(15,1);
		freeAgents.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		freeAgents.setCellSelectionEnabled(true);
		FreeAgentPanel.add(freeAgents);
		
		JPanel ControlPanel = new JPanel();
		CreateTeamPanel.add(ControlPanel, BorderLayout.CENTER);
		ControlPanel.setLayout(new BoxLayout(ControlPanel, BoxLayout.Y_AXIS));
		
		JButton btnAddToTeam = new JButton("<-- Add to Team <--");
		btnAddToTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentSelectedFreeAgent = freeAgents.getSelectedRow();
				
				//
			}
		});
		ControlPanel.add(btnAddToTeam);
		
		JButton btnRemoveFromTeam = new JButton("--> Remove from Team -->");
		btnRemoveFromTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentSelectedTeamMember = currentTeamsPlayers.getSelectedRow();
			}
		});
		ControlPanel.add(btnRemoveFromTeam);
		
		JLabel lblCreateANew = new JLabel("Create a new team:");
		ControlPanel.add(lblCreateANew);
		
		JTextField newTeamNameField = new JFormattedTextField();
		newTeamNameField.setMaximumSize(new Dimension(600, 40));
		ControlPanel.add(newTeamNameField);
		
		JButton btnCreateTeam = new JButton("Create Team");
		btnCreateTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (newTeamNameField.getText() != null) {
					new Team(newTeamNameField.getText(), 0);
					sqlInterface.addTeam(newTeamNameField.getText());
				} else {
					JOptionPane.showMessageDialog(null, "There was no name entered for a team!", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		ControlPanel.add(btnCreateTeam);
		
		JButton btnDeleteTeam = new JButton("Delete Team");
		btnDeleteTeam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int currentSelectedTeam = currentTeam
				//sqlInterface.removeTeam(teamArray[currentSelectedTeam]);
			}
		});
		ControlPanel.add(btnDeleteTeam);
		
		JLabel lblChooseTeam = new JLabel("Choose Team:");
		ControlPanel.add(lblChooseTeam);
		
		JComboBox currentTeam = new JComboBox();
		ControlPanel.add(currentTeam);
		
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
		
		JLabel lblSelectExistingPlayer = new JLabel("Select Existing Player to Modify:");
		panel.add(lblSelectExistingPlayer);
		
		JPanel existingPlayersPanel = new JPanel();
		panel.add(existingPlayersPanel);
		
		table_4 = new JTable(20,4);
		existingPlayersPanel.add(table_4);
		
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
		
		JPanel preferedPositionPanel = new JPanel();
		panel.add(preferedPositionPanel);
		
		JLabel lblPreferedPositionif = new JLabel("Prefered Position (if applicable)");
		preferedPositionPanel.add(lblPreferedPositionif);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		preferedPositionPanel.add(textField_2);
		
		JPanel heightPanel = new JPanel();
		panel.add(heightPanel);
		
		JLabel lblPlayerHeight = new JLabel("Player Height:");
		heightPanel.add(lblPlayerHeight);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		heightPanel.add(textField_3);
		
		JPanel weightPanel = new JPanel();
		panel.add(weightPanel);
		
		JLabel lblPlayerWeight = new JLabel("Player Weight:");
		weightPanel.add(lblPlayerWeight);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		weightPanel.add(textField_4);
		
		JPanel buttonPanel = new JPanel();
		panel.add(buttonPanel);
		
		JButton btnNewButton = new JButton("Create Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText()!= null){
					boolean goalkeeper=false;
					if(textField_2.getText()=="Goalkeeper") 
						goalkeeper = true;
					new Player (textField.getText(),Integer.parseInt(textField_1.getText()),goalkeeper);
					sqlInterface.addPlayer(textField.getText(), Integer.parseInt(textField_1.getText()), Integer.parseInt(textField_3.getText()), Integer.parseInt(textField_4.getText()), goalkeeper);
				} else {
					JOptionPane.showMessageDialog(null, "There was no name entered for player!","Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		buttonPanel.add(btnNewButton);
		
		JButton btnLoadPlayerData = new JButton("Load Player Data");
		buttonPanel.add(btnLoadPlayerData);
		
		JButton btnSubmitModifications = new JButton("Submit Modified Player Data");
		buttonPanel.add(btnSubmitModifications);
		
		JPanel LiveScoreInputPanel = new JPanel();
		frmFilthydogs.getContentPane().add(LiveScoreInputPanel, "name_925765079015101");
		LiveScoreInputPanel.setLayout(new BoxLayout(LiveScoreInputPanel, BoxLayout.Y_AXIS));
		
		JLabel lblLiveScoreInput = new JLabel("Live Score Input");
		lblLiveScoreInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiveScoreInput.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		LiveScoreInputPanel.add(lblLiveScoreInput);
		
		JPanel liveTeamSelectionPanel = new JPanel();
		LiveScoreInputPanel.add(liveTeamSelectionPanel);
		liveTeamSelectionPanel.setLayout(new BoxLayout(liveTeamSelectionPanel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		liveTeamSelectionPanel.add(panel_1);
		
		JLabel lblTeam_3 = new JLabel("Team 1:");
		panel_1.add(lblTeam_3);
		
		JComboBox comboBox_7 = new JComboBox();
		panel_1.add(comboBox_7);
		
		JLabel lblTeam_4 = new JLabel("Team 2:");
		panel_1.add(lblTeam_4);
		
		JComboBox comboBox_8 = new JComboBox();
		panel_1.add(comboBox_8);
		
		JPanel panel_2 = new JPanel();
		liveTeamSelectionPanel.add(panel_2);
		
		JLabel lblDate = new JLabel("Today's Date:");
		panel_2.add(lblDate);
		
		JComboBox comboBox_9 = new JComboBox();
		panel_2.add(comboBox_9);
		
		JLabel lblNewLabel_2 = new JLabel("Month");
		panel_2.add(lblNewLabel_2);
		
		JComboBox comboBox_10 = new JComboBox();
		panel_2.add(comboBox_10);
		
		JButton btnCreateMatch = new JButton("Create Match");
		panel_2.add(btnCreateMatch);
		
		JButton btnEndMatch = new JButton("End Match");
		panel_2.add(btnEndMatch);
		
		JPanel liveMatchInfoPanel = new JPanel();
		LiveScoreInputPanel.add(liveMatchInfoPanel);
		
		table_6 = new JTable(20,4);
		liveMatchInfoPanel.add(table_6);
		
		JPanel panel_5 = new JPanel();
		LiveScoreInputPanel.add(panel_5);
		
		JLabel label_1 = new JLabel("Team:");
		panel_5.add(label_1);
		
		JRadioButton radioButton_2 = new JRadioButton("1");
		panel_5.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("2");
		panel_5.add(radioButton_3);
		
		JLabel lblPlayer_1 = new JLabel("Player:");
		panel_5.add(lblPlayer_1);
		
		JComboBox comboBox_11 = new JComboBox();
		panel_5.add(comboBox_11);
		
		JPanel viewPanel = new JPanel();
		LiveScoreInputPanel.add(viewPanel);
		
		JLabel lblShot_1 = new JLabel("Shot Success:");
		viewPanel.add(lblShot_1);
		
		JComboBox comboBox_12 = new JComboBox();
		viewPanel.add(comboBox_12);
		
		JPanel panel_6 = new JPanel();
		LiveScoreInputPanel.add(panel_6);
		
		JLabel lblInfractionType_1 = new JLabel("Infraction Type:");
		panel_6.add(lblInfractionType_1);
		
		JComboBox comboBox_16 = new JComboBox();
		panel_6.add(comboBox_16);
		
		JButton btnSubmitInfraction_1 = new JButton("Submit Infraction");
		panel_6.add(btnSubmitInfraction_1);
		
		JPanel inputLiveGoalPanel = new JPanel();
		LiveScoreInputPanel.add(inputLiveGoalPanel);
		
		JLabel lblCounter = new JLabel("COUNTER");
		inputLiveGoalPanel.add(lblCounter);
		
		JButton btnCopyTime = new JButton("Copy Time");
		inputLiveGoalPanel.add(btnCopyTime);
		
		JLabel lblTime = new JLabel("Time:");
		inputLiveGoalPanel.add(lblTime);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		inputLiveGoalPanel.add(formattedTextField_2);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		inputLiveGoalPanel.add(lblNewLabel_3);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		inputLiveGoalPanel.add(formattedTextField_3);
		
		JButton btnSubmitShot = new JButton("Submit Shot");
		inputLiveGoalPanel.add(btnSubmitShot);
		
		JPanel BatchScoreInputPanel = new JPanel();
		frmFilthydogs.getContentPane().add(BatchScoreInputPanel, "name_925775241412546");
		BatchScoreInputPanel.setLayout(new BoxLayout(BatchScoreInputPanel, BoxLayout.Y_AXIS));
		
		JLabel lblBatchScoreInput = new JLabel("Batch Score Input");
		lblBatchScoreInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblBatchScoreInput.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		BatchScoreInputPanel.add(lblBatchScoreInput);
		
		JPanel teamSelectionPanel = new JPanel();
		BatchScoreInputPanel.add(teamSelectionPanel);
		teamSelectionPanel.setLayout(new BoxLayout(teamSelectionPanel, BoxLayout.X_AXIS));
		
		JLabel lblTeam_1 = new JLabel("Team 2: ");
		teamSelectionPanel.add(lblTeam_1);
		
		JComboBox comboBox_3 = new JComboBox();
		teamSelectionPanel.add(comboBox_3);
		
		JLabel lblTeam = new JLabel("Team 1:");
		teamSelectionPanel.add(lblTeam);
		
		JComboBox comboBox_4 = new JComboBox();
		teamSelectionPanel.add(comboBox_4);
		
		JPanel matchInfoPanel = new JPanel();
		BatchScoreInputPanel.add(matchInfoPanel);
		
		JLabel lblDay = new JLabel("Match Day: ");
		matchInfoPanel.add(lblDay);
		
		textField_5 = new JTextField();
		matchInfoPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblMonth = new JLabel("Month: ");
		matchInfoPanel.add(lblMonth);
		
		textField_6 = new JTextField();
		matchInfoPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel editPanel = new JPanel();
		BatchScoreInputPanel.add(editPanel);
		
		table_5 = new JTable(20,4);
		editPanel.add(table_5);
		
		JPanel inputGoalPanel = new JPanel();
		BatchScoreInputPanel.add(inputGoalPanel);
		inputGoalPanel.setLayout(new BoxLayout(inputGoalPanel, BoxLayout.Y_AXIS));
		
		JPanel inputGoalPanelRow1 = new JPanel();
		inputGoalPanel.add(inputGoalPanelRow1);
		
		JLabel lblTeam_2 = new JLabel("Team: ");
		inputGoalPanelRow1.add(lblTeam_2);
		
		JRadioButton radioButton = new JRadioButton("1");
		inputGoalPanelRow1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("2");
		inputGoalPanelRow1.add(radioButton_1);
		
		JLabel lblPlayer = new JLabel("Player:");
		inputGoalPanelRow1.add(lblPlayer);
		
		JComboBox comboBox_5 = new JComboBox();
		inputGoalPanelRow1.add(comboBox_5);
		
		JPanel panel_4 = new JPanel();
		inputGoalPanel.add(panel_4);
		
		JLabel lblInfractionType = new JLabel("Infraction Type:");
		panel_4.add(lblInfractionType);
		
		JComboBox comboBox_14 = new JComboBox();
		panel_4.add(comboBox_14);
		
		JButton btnSubmitInfraction = new JButton("Submit Infraction");
		panel_4.add(btnSubmitInfraction);
		
		JPanel inputGoalPanelRow2 = new JPanel();
		inputGoalPanel.add(inputGoalPanelRow2);
		
		JLabel lblShot = new JLabel("Shot:");
		inputGoalPanelRow2.add(lblShot);
		
		JComboBox comboBox_6 = new JComboBox();
		inputGoalPanelRow2.add(comboBox_6);
		
		JLabel lblGameTime = new JLabel("Game time:");
		inputGoalPanelRow2.add(lblGameTime);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		inputGoalPanelRow2.add(formattedTextField);
		
		JLabel label = new JLabel(":");
		inputGoalPanelRow2.add(label);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		inputGoalPanelRow2.add(formattedTextField_1);
		
		JButton btnEnterShot = new JButton("Enter Shot");
		inputGoalPanelRow2.add(btnEnterShot);
		
		JPanel submitPanel = new JPanel();
		BatchScoreInputPanel.add(submitPanel);
		
		JButton btnDeleteBottomRow = new JButton("Delete Bottom Row");
		submitPanel.add(btnDeleteBottomRow);
		
		JButton btnDeleteAll = new JButton("Delete All");
		submitPanel.add(btnDeleteAll);
		
		JButton btnSubmitGame = new JButton("Submit Game");
		submitPanel.add(btnSubmitGame);
		
		JPanel FilthiestPanel = new JPanel();
		frmFilthydogs.getContentPane().add(FilthiestPanel, "name_79638213137950");
		FilthiestPanel.add(new JLabel(new ImageIcon("C:/Users/Lou/Documents/team3/src/team3/dog.jpg")));
		
		JMenuBar menuBar = new JMenuBar();
		frmFilthydogs.setJMenuBar(menuBar);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmTeamRankings = new JMenuItem("Team Rankings");
		mntmTeamRankings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeamsPanel.setVisible(true);
				PlayersPanel.setVisible(false);
				CreateTeamPanel.setVisible(false);
				CreatePlayersPanel.setVisible(false);
				LiveScoreInputPanel.setVisible(false);
				BatchScoreInputPanel.setVisible(false);
				FilthiestPanel.setVisible(false);
			}
		});
		mnView.add(mntmTeamRankings);
		
		JMenuItem mntmPlayerRankings = new JMenuItem("Player Rankings");
		mntmPlayerRankings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamsPanel.setVisible(false);
				PlayersPanel.setVisible(true);
				CreateTeamPanel.setVisible(false);
				CreatePlayersPanel.setVisible(false);
				LiveScoreInputPanel.setVisible(false);
				BatchScoreInputPanel.setVisible(false);
				FilthiestPanel.setVisible(false);
			}
		});
		mnView.add(mntmPlayerRankings);
		
		JMenuItem mntmFilthyDogs = new JMenuItem("A Filthy Secret");
		mntmFilthyDogs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamsPanel.setVisible(false);
				PlayersPanel.setVisible(false);
				CreateTeamPanel.setVisible(false);
				CreatePlayersPanel.setVisible(false);
				LiveScoreInputPanel.setVisible(false);
				BatchScoreInputPanel.setVisible(false);
				FilthiestPanel.setVisible(true);
			}
		});
		mnView.add(mntmFilthyDogs);
		
		JMenu mnAdministration = new JMenu("Administration");
		menuBar.add(mnAdministration);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Create Team");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamsPanel.setVisible(false);
				PlayersPanel.setVisible(false);
				CreateTeamPanel.setVisible(true);
				CreatePlayersPanel.setVisible(false);
				LiveScoreInputPanel.setVisible(false);
				BatchScoreInputPanel.setVisible(false);
				FilthiestPanel.setVisible(false);
			}
		});
		mnAdministration.add(mntmNewMenuItem);
		
		JMenuItem mntmCreatePlayer = new JMenuItem("Create Player");
		mntmCreatePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamsPanel.setVisible(false);
				PlayersPanel.setVisible(false);
				CreateTeamPanel.setVisible(false);
				CreatePlayersPanel.setVisible(true);
				LiveScoreInputPanel.setVisible(false);
				BatchScoreInputPanel.setVisible(false);
				FilthiestPanel.setVisible(false);
			}
		});
		mnAdministration.add(mntmCreatePlayer);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Live Score Input");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeamsPanel.setVisible(false);
				PlayersPanel.setVisible(false);
				CreateTeamPanel.setVisible(false);
				CreatePlayersPanel.setVisible(false);
				LiveScoreInputPanel.setVisible(true);
				BatchScoreInputPanel.setVisible(false);
				FilthiestPanel.setVisible(false);
			}
		});
		mnAdministration.add(mntmNewMenuItem_1);
		
		JMenuItem mntmBatchScoreInput = new JMenuItem("Batch Score Input");
		mntmBatchScoreInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TeamsPanel.setVisible(false);
				PlayersPanel.setVisible(false);
				CreateTeamPanel.setVisible(false);
				CreatePlayersPanel.setVisible(false);
				LiveScoreInputPanel.setVisible(false);
				BatchScoreInputPanel.setVisible(true);
				FilthiestPanel.setVisible(false);
			}
		});
		mnAdministration.add(mntmBatchScoreInput);
		
		JLabel lblFilthyDogsRepresent = new JLabel("FILTHY DOGS REPRESENT WOOF WOOF");
		lblFilthyDogsRepresent.setForeground(Color.RED);
		menuBar.add(lblFilthyDogsRepresent);
	}

}
