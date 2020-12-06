/*
 * Thursday November 12th
 * Programmers: Jasmine Ly - 622376, Pranjal Mandhan - 637535
 * Description: A vinilla model Character Creator of a 5th edition DnD Player Character! (Randomization and edit included)
 */
package dndcharactersheetrndgen;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;



/**
 *
 * @author home
 */
public class DnDGrameForm extends javax.swing.JFrame {
    // Array for proficience options per Class
            String [] BarbarianPros = {"Animal Handiling", "Athletucs", "Intimidation", "Nature", "Perception", "Survival" };
            String [] BardPros = {"Acrobatics", "Animal Handiling", "Arcana", "Athletics", "Deception", "History", "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance", "Persuation", "Religon", "Slieght of Hand", "Stelth", "Survival" };
            String [] RougePros = {"Acrobatics", "Athletics", "Deception", "Insight", "Intimidation", "Investigation", "Perception", "Performance", "Persuation", "Slieght of Hand", "Stelth"};
        
    
    /**
     * Creates new form DnDGrameForm
     * @throws javax.xml.parsers.ParserConfigurationException
     */
    public DnDGrameForm() throws ParserConfigurationException {
       
            initComponents();
            
            // hiding the required buttons until needed
            lblRe1.setVisible(false);
            lblRe2.setVisible(false);
            lblRe3.setVisible(false);
            
            // setting up the boxes for level
            comboLevel.removeItem("Item 1");
            comboLevel.removeItem("Item 2");
            comboLevel.removeItem("Item 3");
            comboLevel.removeItem("Item 4");
            comboLevel.addItem("Please Select");
            comboLevel.addItem("level 1");
            comboLevel.addItem("level 2");
            
            // setting up boxes for class
            comboClass.removeItem("Item 1");
            comboClass.removeItem("Item 2");
            comboClass.removeItem("Item 3");
            comboClass.removeItem("Item 4");
            comboClass.addItem("Please Select");
            comboClass.addItem("Barbarian");
            comboClass.addItem("Bard");
            comboClass.addItem("Rouge");
            
            // setting up boxes for race
            comboRace.removeItem("Item 1");
            comboRace.removeItem("Item 2");
            comboRace.removeItem("Item 3");
            comboRace.removeItem("Item 4");
            comboRace.addItem("Please Select");
            comboRace.addItem("Elf");
            comboRace.addItem("Human");
            comboRace.addItem("Tiefling");
            
            // hiding tabs until classes are called 
            tbpUserInput.setEnabledAt(2, false);
            tbpUserInput.setEnabledAt(3, false);
           
            // removing the initial items from all the combo boxes so that they can be inserted later 
            comboPro1.removeItem("Item 1");
            comboPro2.removeItem("Item 1");
            comboPro3.removeItem("Item 1");
            comboPro4.removeItem("Item 1");
            
            comboPro1.removeItem("Item 2");
            comboPro2.removeItem("Item 2");
            comboPro3.removeItem("Item 2");
            comboPro4.removeItem("Item 2");
            
            comboPro1.removeItem("Item 3");
            comboPro2.removeItem("Item 3");
            comboPro3.removeItem("Item 3");
            comboPro4.removeItem("Item 3");
            
            comboPro1.removeItem("Item 4");
            comboPro2.removeItem("Item 4");
            comboPro3.removeItem("Item 4");
            comboPro4.removeItem("Item 4");
            
            //setting up the spells here since only bards have spells 
            comboCantrips.removeItem("Item 1");
                   comboCantrips.removeItem("Item 2");
                   comboCantrips.removeItem("Item 3");
                   comboCantrips.removeItem("Item 4");
                   comboCantrips.addItem("--Type in the # your Choice(s)--");
                   comboCantrips.addItem("1 - Blade Ward");
                   comboCantrips.addItem("2 -Dancing Lights");
                   comboCantrips.addItem("3 -Friends");
                   comboCantrips.addItem("4 - Light");
                   comboCantrips.addItem("5 - Mage Hand");
                   comboCantrips.addItem("6 - Mending");
                   comboCantrips.addItem("7 - Message");
                   comboCantrips.addItem("8 - Minor Illusion");
                   comboCantrips.addItem("9 - Prestidigitation");
                   comboCantrips.addItem("10 - True Strike");
                   comboCantrips.addItem("11 - Vicious Mockery");
                   
                   comboSpells1.removeItem("Item 1");
                   comboSpells1.removeItem("Item 2");
                   comboSpells1.removeItem("Item 3");
                   comboSpells1.removeItem("Item 4");
                   comboSpells1.addItem("--Type in the # your Choice(s)--");
                   comboSpells1.addItem("1- Animal Friendship");
                   comboSpells1.addItem("2 - Bane");
                   comboSpells1.addItem("3 - Charm Person");
                   comboSpells1.addItem("4 - Comprehend Languages");
                   comboSpells1.addItem("5 - Cure Wouunds");
                   comboSpells1.addItem("6 - Detect Magic");
                   comboSpells1.addItem("7 - Disguise Self");
                   comboSpells1.addItem("8 - Dissonant Whispers");
                   comboSpells1.addItem("9 - Faerie Fire");
                   comboSpells1.addItem("10 - Feather Fall");
                   comboSpells1.addItem("11 - Healing Word");
                   comboSpells1.addItem("12 - Heroism");
                   comboSpells1.addItem("13 - Identify");
                   comboSpells1.addItem("14 - Illusiry Script");
                   comboSpells1.addItem("15 - Longstrider");
                   comboSpells1.addItem("16 - Silent Image");
                   comboSpells1.addItem("17 - Sleep");
                   comboSpells1.addItem("18 - Speak with Animals");
                   comboSpells1.addItem("19 - Tasha's Hideous Laughter");
                   comboSpells1.addItem("20 - Thunderwave");
                   comboSpells1.addItem("21 - Unseen servant");
            
           
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        tbpUserInput = new javax.swing.JTabbedPane();
        pnlInstructions = new javax.swing.JPanel();
        lblInTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblStep1 = new javax.swing.JLabel();
        lblStep2 = new javax.swing.JLabel();
        lblStep2Line2 = new javax.swing.JLabel();
        lblStep1Line2 = new javax.swing.JLabel();
        lblWelcomeLine1 = new javax.swing.JLabel();
        lblWelcomeLine2 = new javax.swing.JLabel();
        lblWelcomeLine3 = new javax.swing.JLabel();
        pnlCharacterSheet = new javax.swing.JPanel();
        lblCharacterInfo = new javax.swing.JLabel();
        btnRNDCharacterInfo = new javax.swing.JButton();
        lblCharacterName = new javax.swing.JLabel();
        txtCharacterName = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        comboLevel = new javax.swing.JComboBox<>();
        lblClass = new javax.swing.JLabel();
        comboClass = new javax.swing.JComboBox<>();
        lblRace = new javax.swing.JLabel();
        comboRace = new javax.swing.JComboBox<>();
        lblAbilityScores = new javax.swing.JLabel();
        txtStr = new javax.swing.JTextField();
        txtDex = new javax.swing.JTextField();
        txtCon = new javax.swing.JTextField();
        txtInt = new javax.swing.JTextField();
        txtWis = new javax.swing.JTextField();
        txtCha = new javax.swing.JTextField();
        lblStr = new javax.swing.JLabel();
        lblDex = new javax.swing.JLabel();
        lblCon = new javax.swing.JLabel();
        lblInt = new javax.swing.JLabel();
        lblWis = new javax.swing.JLabel();
        lblCha = new javax.swing.JLabel();
        lblCharacterLook = new javax.swing.JLabel();
        btnRNDLook = new javax.swing.JButton();
        btnCharacterSheetConfirm = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblEyes = new javax.swing.JLabel();
        lblSkin = new javax.swing.JLabel();
        lblHair = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtEyes = new javax.swing.JTextField();
        txtSkin = new javax.swing.JTextField();
        txtHair = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        lblRe1 = new javax.swing.JLabel();
        lblRe2 = new javax.swing.JLabel();
        lblRe3 = new javax.swing.JLabel();
        pnlSpells = new javax.swing.JPanel();
        lblSpells = new javax.swing.JLabel();
        btnRNDSpells = new javax.swing.JButton();
        lblCantrips = new javax.swing.JLabel();
        comboCantrips = new javax.swing.JComboBox<>();
        lblSpells1 = new javax.swing.JLabel();
        comboSpells1 = new javax.swing.JComboBox<>();
        btnCantrip = new javax.swing.JButton();
        btnSpells1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaSpells = new javax.swing.JTextArea();
        btnSpellsConfirm = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtaCantrips = new javax.swing.JTextArea();
        btnCanReset = new javax.swing.JButton();
        btnSpellReset = new javax.swing.JButton();
        pnlProAndEq = new javax.swing.JPanel();
        lblProficiences = new javax.swing.JLabel();
        btnRNDPro = new javax.swing.JButton();
        lblPro1 = new javax.swing.JLabel();
        comboPro1 = new javax.swing.JComboBox<>();
        lblPro2 = new javax.swing.JLabel();
        comboPro2 = new javax.swing.JComboBox<>();
        lblEquipment = new javax.swing.JLabel();
        btnRNDEq = new javax.swing.JButton();
        btnProAndEqConfirm = new javax.swing.JButton();
        radEq1Op1 = new javax.swing.JRadioButton();
        lblOr1 = new javax.swing.JLabel();
        radEq1Op2 = new javax.swing.JRadioButton();
        lblFirstItem = new javax.swing.JLabel();
        radEq2Op2 = new javax.swing.JRadioButton();
        lblSecondItem = new javax.swing.JLabel();
        radEq2Op1 = new javax.swing.JRadioButton();
        lblOr2 = new javax.swing.JLabel();
        lblOr3 = new javax.swing.JLabel();
        lblThirdItem = new javax.swing.JLabel();
        radEq3Op2 = new javax.swing.JRadioButton();
        radEq3Op1 = new javax.swing.JRadioButton();
        lblPro3 = new javax.swing.JLabel();
        comboPro3 = new javax.swing.JComboBox<>();
        lblPro4 = new javax.swing.JLabel();
        comboPro4 = new javax.swing.JComboBox<>();
        tbpDisplay = new javax.swing.JTabbedPane();
        pnlCharacterSheetDisplay = new javax.swing.JPanel();
        lpCharacterInfo = new javax.swing.JLayeredPane();
        lblName = new javax.swing.JLabel();
        lblInpVal = new javax.swing.JLabel();
        lblProfBonNum = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtASkills = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtASavThrows = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAProfLang = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAFeatTraits = new javax.swing.JTextArea();
        txtDEX = new javax.swing.JTextField();
        txtCHAMod = new javax.swing.JTextField();
        txtCON = new javax.swing.JTextField();
        txtINT = new javax.swing.JTextField();
        txtCHA = new javax.swing.JTextField();
        txtSTR = new javax.swing.JTextField();
        txtWIS = new javax.swing.JTextField();
        txtSTRMod = new javax.swing.JTextField();
        txtDEXMod = new javax.swing.JTextField();
        txtCONMod = new javax.swing.JTextField();
        txtINTMod = new javax.swing.JTextField();
        txtWISMod = new javax.swing.JTextField();
        txtAC = new javax.swing.JTextField();
        lblCurrentHP = new javax.swing.JLabel();
        txtInitiative = new javax.swing.JTextField();
        lblMaxHP = new javax.swing.JLabel();
        txtSpeed = new javax.swing.JTextField();
        lblClassLvl = new javax.swing.JLabel();
        lblBGOutput = new javax.swing.JLabel();
        lblRaceOutput = new javax.swing.JLabel();
        txtPersonality = new javax.swing.JTextField();
        txtGoals = new javax.swing.JTextField();
        txtBonds = new javax.swing.JTextField();
        txtFlaws = new javax.swing.JTextField();
        lblAgeOutput = new javax.swing.JLabel();
        lblHeightOutput = new javax.swing.JLabel();
        lblWeightOutput = new javax.swing.JLabel();
        lblEyesOutput = new javax.swing.JLabel();
        lblSkinOutput = new javax.swing.JLabel();
        lblHairOutput = new javax.swing.JLabel();
        lblSTR = new javax.swing.JLabel();
        lblDEX = new javax.swing.JLabel();
        lblCON = new javax.swing.JLabel();
        lblINT = new javax.swing.JLabel();
        lblWIS = new javax.swing.JLabel();
        lblCHA = new javax.swing.JLabel();
        lblPerception = new javax.swing.JLabel();
        lblCharacterSheetDisplay = new javax.swing.JLabel();
        pnlSpellsDisplay = new javax.swing.JPanel();
        lpSpells = new javax.swing.JLayeredPane();
        txtSpellDC = new javax.swing.JTextField();
        txtSpellAbility = new javax.swing.JTextField();
        txtSpellBonus = new javax.swing.JTextField();
        txtSpellCastingClass = new javax.swing.JTextField();
        lblSlotsTot9 = new javax.swing.JLabel();
        lblSlotsTot8 = new javax.swing.JLabel();
        lblSlotsTot7 = new javax.swing.JLabel();
        lblSlotsTot6 = new javax.swing.JLabel();
        lblSlotsTot5 = new javax.swing.JLabel();
        lblSlotsTot4 = new javax.swing.JLabel();
        lblSlotsTot3 = new javax.swing.JLabel();
        lblSlotsTot2 = new javax.swing.JLabel();
        lblSlotsTot1 = new javax.swing.JLabel();
        txtExpn9 = new javax.swing.JTextField();
        txtExpn8 = new javax.swing.JTextField();
        txtExpn7 = new javax.swing.JTextField();
        txtExpn6 = new javax.swing.JTextField();
        txtExpn5 = new javax.swing.JTextField();
        txtExpn4 = new javax.swing.JTextField();
        txtExpn3 = new javax.swing.JTextField();
        txtExpn2 = new javax.swing.JTextField();
        txtExpn1 = new javax.swing.JTextField();
        txtASpells9 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        txtASpells8 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        txtASpells7 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        txtASpells6 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        txtASpells5 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        txtASpells4 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        txtASpells3 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        txtASpells2 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        txtASpells1 = new javax.swing.JScrollPane();
        txtASpellsOne = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtACantrips = new javax.swing.JTextArea();
        lblSpellsDisplay = new javax.swing.JLabel();
        pnlProAndEqDisplay = new javax.swing.JPanel();
        lpProAndEq = new javax.swing.JLayeredPane();
        txtCP = new javax.swing.JTextField();
        txtSP = new javax.swing.JTextField();
        txtEP = new javax.swing.JTextField();
        txtGP = new javax.swing.JTextField();
        txtPP = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAWeapons = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAItems = new javax.swing.JTextArea();
        lblProAndEqDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblInTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInTitle.setText("GarGoyull's D&D Character Creation Generator");

        lblSubTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubTitle.setText("To create your character sheet, follow the instructions:");

        lblStep1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStep1.setText("1.) Go through each tab in order.  Press the bottom right 'Confirm' button to lock in your input.");

        lblStep2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStep2.setText("2.) Input your answers and informations into each field.  If you miss an input for a field, then");

        lblStep2Line2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStep2Line2.setText("an input will be randomly generated for you.");

        lblStep1Line2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStep1Line2.setText("Ensure to click the 'Confirm' button before proceeding to the next tab.");

        lblWelcomeLine1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWelcomeLine1.setText("Welcome to GarGoyull's D&D Character Sheet builder.  You will input your character information");

        lblWelcomeLine2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWelcomeLine2.setText("into the fields on each tab.  At the end, the inputted information will be sorted out into the");

        lblWelcomeLine3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWelcomeLine3.setText("character sheet template on the right.");

        javax.swing.GroupLayout pnlInstructionsLayout = new javax.swing.GroupLayout(pnlInstructions);
        pnlInstructions.setLayout(pnlInstructionsLayout);
        pnlInstructionsLayout.setHorizontalGroup(
            pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInstructionsLayout.createSequentialGroup()
                .addGroup(pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInstructionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblWelcomeLine3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWelcomeLine2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWelcomeLine1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInstructionsLayout.createSequentialGroup()
                                .addGroup(pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInstructionsLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(lblSubTitle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInstructionsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblStep1Line2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblStep2)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInstructionsLayout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lblStep2Line2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(12, 12, 12)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInstructionsLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblStep1)))
                                .addGap(0, 44, Short.MAX_VALUE))))
                    .addGroup(pnlInstructionsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblInTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlInstructionsLayout.setVerticalGroup(
            pnlInstructionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInstructionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblWelcomeLine1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcomeLine2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcomeLine3)
                .addGap(48, 48, 48)
                .addComponent(lblSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStep1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStep1Line2)
                .addGap(23, 23, 23)
                .addComponent(lblStep2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStep2Line2)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        tbpUserInput.addTab("Instructions", pnlInstructions);

        pnlCharacterSheet.setForeground(new java.awt.Color(255, 0, 0));

        lblCharacterInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCharacterInfo.setText("Character Information");

        btnRNDCharacterInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRNDCharacterInfo.setText("Randomize");
        btnRNDCharacterInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRNDCharacterInfoActionPerformed(evt);
            }
        });

        lblCharacterName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCharacterName.setText("Enter Character Name");

        txtCharacterName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLevel.setText("Level");

        comboLevel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLevelActionPerformed(evt);
            }
        });

        lblClass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblClass.setText("Class");

        comboClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblRace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRace.setText("Race");

        comboRace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboRace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblAbilityScores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAbilityScores.setText("Ability Scores");

        lblStr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStr.setText("STR");

        lblDex.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDex.setText("DEX");

        lblCon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCon.setText("CON");

        lblInt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInt.setText("INT");

        lblWis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblWis.setText("WIS");

        lblCha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCha.setText("CHA");

        lblCharacterLook.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCharacterLook.setText("Character Appearence");

        btnRNDLook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRNDLook.setText("Randomize");
        btnRNDLook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRNDLookActionPerformed(evt);
            }
        });

        btnCharacterSheetConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCharacterSheetConfirm.setText("Confirm");
        btnCharacterSheetConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharacterSheetConfirmActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAge.setText("Age");

        lblWeight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblWeight.setText("Weight");

        lblEyes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEyes.setText("Eyes");

        lblSkin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSkin.setText("Skin");

        lblHair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHair.setText("Hair");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtHeight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        txtWeight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        txtEyes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEyesActionPerformed(evt);
            }
        });

        txtSkin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSkinActionPerformed(evt);
            }
        });

        txtHair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtHair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHairActionPerformed(evt);
            }
        });

        lblHeight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHeight.setText("Height");

        lblRe1.setForeground(new java.awt.Color(255, 0, 0));
        lblRe1.setText("Required *");

        lblRe2.setForeground(new java.awt.Color(255, 0, 0));
        lblRe2.setText("Required *");

        lblRe3.setForeground(new java.awt.Color(255, 0, 0));
        lblRe3.setText("Required *");

        javax.swing.GroupLayout pnlCharacterSheetLayout = new javax.swing.GroupLayout(pnlCharacterSheet);
        pnlCharacterSheet.setLayout(pnlCharacterSheetLayout);
        pnlCharacterSheetLayout.setHorizontalGroup(
            pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addComponent(lblCharacterInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRNDCharacterInfo))
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(lblAbilityScores, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                        .addComponent(txtStr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtWis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                        .addComponent(lblStr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDex, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblInt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblWis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblWeight))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEyes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEyes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                                .addComponent(lblSkin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(lblHair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                                .addComponent(txtSkin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtHair, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblHeight))
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addComponent(lblCharacterLook, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRNDLook)))
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCharacterName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCharacterName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                        .addComponent(comboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                        .addComponent(lblLevel)
                                        .addGap(44, 44, 44)
                                        .addComponent(lblClass)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblRe1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRe2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRace, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboRace, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblRe3)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCharacterSheetLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCharacterSheetConfirm)
                        .addGap(32, 32, 32))))
        );
        pnlCharacterSheetLayout.setVerticalGroup(
            pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCharacterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRNDCharacterInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCharacterName)
                    .addComponent(lblLevel)
                    .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblClass)
                        .addComponent(lblRace, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCharacterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRe1)
                            .addComponent(lblRe2)))
                    .addGroup(pnlCharacterSheetLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblRe3)))
                .addGap(34, 34, 34)
                .addComponent(lblAbilityScores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStr, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDex, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWis, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStr)
                    .addComponent(lblDex)
                    .addComponent(lblCon)
                    .addComponent(lblInt)
                    .addComponent(lblWis)
                    .addComponent(lblCha))
                .addGap(39, 39, 39)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCharacterLook)
                    .addComponent(btnRNDLook))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(lblWeight)
                    .addComponent(lblEyes)
                    .addComponent(lblSkin)
                    .addComponent(lblHair)
                    .addComponent(lblHeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCharacterSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEyes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnCharacterSheetConfirm)
                .addGap(24, 24, 24))
        );

        tbpUserInput.addTab("Character Information", pnlCharacterSheet);

        lblSpells.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSpells.setText("Spells");

        btnRNDSpells.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRNDSpells.setText("Randomize");
        btnRNDSpells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRNDSpellsActionPerformed(evt);
            }
        });

        lblCantrips.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantrips.setText("Cantrips");

        comboCantrips.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboCantrips.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblSpells1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSpells1.setText("1st Level Spells");

        comboSpells1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboSpells1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCantrip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCantrip.setText("Add");
        btnCantrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantripActionPerformed(evt);
            }
        });

        btnSpells1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSpells1.setText("Add");
        btnSpells1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpells1ActionPerformed(evt);
            }
        });

        txtaSpells.setColumns(20);
        txtaSpells.setRows(5);
        jScrollPane2.setViewportView(txtaSpells);

        btnSpellsConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSpellsConfirm.setText("Confirm");
        btnSpellsConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpellsConfirmActionPerformed(evt);
            }
        });

        txtaCantrips.setColumns(20);
        txtaCantrips.setRows(5);
        jScrollPane10.setViewportView(txtaCantrips);

        btnCanReset.setText("Reset");
        btnCanReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanResetActionPerformed(evt);
            }
        });

        btnSpellReset.setText("Reset");
        btnSpellReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpellResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSpellsLayout = new javax.swing.GroupLayout(pnlSpells);
        pnlSpells.setLayout(pnlSpellsLayout);
        pnlSpellsLayout.setHorizontalGroup(
            pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSpellsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpellsLayout.createSequentialGroup()
                        .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpellsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCanReset)
                                .addGap(78, 78, 78))
                            .addGroup(pnlSpellsLayout.createSequentialGroup()
                                .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantrips)
                                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                                        .addComponent(lblSpells)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRNDSpells))
                                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                                        .addComponent(comboCantrips, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCantrip))
                                    .addComponent(lblSpells1)
                                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                                        .addComponent(comboSpells1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSpells1))
                                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                                        .addGap(161, 161, 161)
                                        .addComponent(btnSpellReset)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)))
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpellsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSpellsConfirm)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpellsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlSpellsLayout.setVerticalGroup(
            pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSpellsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                        .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSpells)
                            .addComponent(btnRNDSpells))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCantrips)
                        .addGap(18, 18, 18)
                        .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboCantrips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCantrip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCanReset)
                        .addGap(7, 7, 7)
                        .addComponent(lblSpells1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSpells1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpells1)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlSpellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSpellsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSpellReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnSpellsConfirm)
                .addGap(27, 27, 27))
        );

        tbpUserInput.addTab("Spells", pnlSpells);

        lblProficiences.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProficiences.setText("Proficiencies");

        btnRNDPro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRNDPro.setText("Randomize");
        btnRNDPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRNDProActionPerformed(evt);
            }
        });

        lblPro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPro1.setText("Proficency #1");

        comboPro1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboPro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPro2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPro2.setText("Proficiency #2");

        comboPro2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboPro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEquipment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEquipment.setText("Equipment");

        btnRNDEq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRNDEq.setText("Randomize");
        btnRNDEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRNDEqActionPerformed(evt);
            }
        });

        btnProAndEqConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProAndEqConfirm.setText("Confirm");
        btnProAndEqConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProAndEqConfirmActionPerformed(evt);
            }
        });

        buttonGroup1.add(radEq1Op1);
        radEq1Op1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radEq1Op1.setText("option 1");

        lblOr1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOr1.setText("Or");

        buttonGroup1.add(radEq1Op2);
        radEq1Op2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radEq1Op2.setText("option 2");

        lblFirstItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFirstItem.setText("1.)");

        buttonGroup2.add(radEq2Op2);
        radEq2Op2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radEq2Op2.setText("option 2");

        lblSecondItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSecondItem.setText("2.)");

        buttonGroup2.add(radEq2Op1);
        radEq2Op1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radEq2Op1.setText("option 1");

        lblOr2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOr2.setText("Or");

        lblOr3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOr3.setText("Or");

        lblThirdItem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblThirdItem.setText("3.)");

        buttonGroup3.add(radEq3Op2);
        radEq3Op2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radEq3Op2.setText("option 2");

        buttonGroup3.add(radEq3Op1);
        radEq3Op1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radEq3Op1.setText("option 1");

        lblPro3.setText("Proficiency #3");

        comboPro3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPro4.setText("Proficiency #4");

        comboPro4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlProAndEqLayout = new javax.swing.GroupLayout(pnlProAndEq);
        pnlProAndEq.setLayout(pnlProAndEqLayout);
        pnlProAndEqLayout.setHorizontalGroup(
            pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblFirstItem)
                .addGap(13, 13, 13)
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProficiences)
                                    .addComponent(lblPro1))
                                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRNDPro))
                                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lblPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addComponent(lblEquipment)
                                .addGap(18, 18, 18)
                                .addComponent(btnRNDEq))
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addComponent(comboPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPro3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnProAndEqConfirm))
                            .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPro4)
                                .addComponent(comboPro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addComponent(lblOr1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radEq1Op2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radEq1Op1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)))
                        .addComponent(lblSecondItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblOr2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radEq2Op1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radEq2Op2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(216, 216, 216))))
            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblOr3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblThirdItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radEq3Op1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radEq3Op2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlProAndEqLayout.setVerticalGroup(
            pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProficiences)
                    .addComponent(btnRNDPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPro1)
                    .addComponent(lblPro2)
                    .addComponent(lblPro3)
                    .addComponent(lblPro4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquipment)
                    .addComponent(btnRNDEq))
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radEq1Op1)
                                    .addComponent(lblFirstItem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOr1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radEq2Op1)
                                    .addComponent(lblSecondItem))
                                .addGap(18, 26, Short.MAX_VALUE)
                                .addComponent(lblOr2)
                                .addGap(33, 33, 33)
                                .addComponent(radEq2Op2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProAndEqLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radEq1Op2)
                        .addGap(40, 40, 40)))
                .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addComponent(radEq3Op1)
                        .addGroup(pnlProAndEqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProAndEqConfirm)
                                .addGap(25, 25, 25))
                            .addGroup(pnlProAndEqLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblOr3)
                                .addGap(18, 18, 18)
                                .addComponent(radEq3Op2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlProAndEqLayout.createSequentialGroup()
                        .addComponent(lblThirdItem)
                        .addGap(128, 128, 128))))
        );

        tbpUserInput.addTab("Proficiences & Equipment ", pnlProAndEq);

        getContentPane().add(tbpUserInput);
        tbpUserInput.setBounds(20, 20, 600, 500);

        tbpDisplay.setMaximumSize(new java.awt.Dimension(525, 679));

        lblName.setText("Name");
        lpCharacterInfo.add(lblName);
        lblName.setBounds(20, 20, 190, 30);

        lblInpVal.setText("Num");
        lpCharacterInfo.add(lblInpVal);
        lblInpVal.setBounds(20, 80, 31, 20);

        lblProfBonNum.setText("Num");
        lpCharacterInfo.add(lblProfBonNum);
        lblProfBonNum.setBounds(20, 120, 30, 20);

        txtASkills.setColumns(20);
        txtASkills.setRows(5);
        jScrollPane3.setViewportView(txtASkills);

        lpCharacterInfo.add(jScrollPane3);
        jScrollPane3.setBounds(10, 340, 130, 290);

        txtASavThrows.setColumns(20);
        txtASavThrows.setRows(5);
        jScrollPane4.setViewportView(txtASavThrows);

        lpCharacterInfo.add(jScrollPane4);
        jScrollPane4.setBounds(10, 170, 100, 100);

        txtAProfLang.setColumns(20);
        txtAProfLang.setRows(5);
        jScrollPane5.setViewportView(txtAProfLang);

        lpCharacterInfo.add(jScrollPane5);
        jScrollPane5.setBounds(240, 440, 130, 190);

        txtAFeatTraits.setColumns(20);
        txtAFeatTraits.setRows(5);
        jScrollPane6.setViewportView(txtAFeatTraits);

        lpCharacterInfo.add(jScrollPane6);
        jScrollPane6.setBounds(390, 400, 110, 240);
        lpCharacterInfo.add(txtDEX);
        txtDEX.setBounds(170, 290, 40, 26);
        lpCharacterInfo.add(txtCHAMod);
        txtCHAMod.setBounds(170, 640, 40, 26);
        lpCharacterInfo.add(txtCON);
        txtCON.setBounds(170, 370, 40, 26);
        lpCharacterInfo.add(txtINT);
        txtINT.setBounds(170, 450, 40, 26);
        lpCharacterInfo.add(txtCHA);
        txtCHA.setBounds(170, 610, 40, 26);
        lpCharacterInfo.add(txtSTR);
        txtSTR.setBounds(170, 216, 40, 20);
        lpCharacterInfo.add(txtWIS);
        txtWIS.setBounds(170, 530, 40, 26);
        lpCharacterInfo.add(txtSTRMod);
        txtSTRMod.setBounds(170, 240, 40, 26);
        lpCharacterInfo.add(txtDEXMod);
        txtDEXMod.setBounds(170, 320, 40, 26);
        lpCharacterInfo.add(txtCONMod);
        txtCONMod.setBounds(170, 400, 40, 26);
        lpCharacterInfo.add(txtINTMod);
        txtINTMod.setBounds(170, 480, 40, 26);
        lpCharacterInfo.add(txtWISMod);
        txtWISMod.setBounds(170, 560, 40, 26);
        lpCharacterInfo.add(txtAC);
        txtAC.setBounds(240, 220, 30, 26);

        lblCurrentHP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lpCharacterInfo.add(lblCurrentHP);
        lblCurrentHP.setBounds(290, 290, 30, 40);
        lpCharacterInfo.add(txtInitiative);
        txtInitiative.setBounds(280, 220, 40, 26);

        lblMaxHP.setText("Hp");
        lpCharacterInfo.add(lblMaxHP);
        lblMaxHP.setBounds(230, 270, 30, 20);
        lpCharacterInfo.add(txtSpeed);
        txtSpeed.setBounds(330, 220, 30, 26);
        lpCharacterInfo.add(lblClassLvl);
        lblClassLvl.setBounds(250, 70, 110, 10);
        lpCharacterInfo.add(lblBGOutput);
        lblBGOutput.setBounds(260, 130, 100, 10);
        lpCharacterInfo.add(lblRaceOutput);
        lblRaceOutput.setBounds(260, 100, 100, 10);
        lpCharacterInfo.add(txtPersonality);
        txtPersonality.setBounds(380, 180, 130, 30);
        lpCharacterInfo.add(txtGoals);
        txtGoals.setBounds(380, 239, 130, 20);
        lpCharacterInfo.add(txtBonds);
        txtBonds.setBounds(380, 279, 130, 30);
        lpCharacterInfo.add(txtFlaws);
        txtFlaws.setBounds(380, 330, 130, 30);
        lpCharacterInfo.add(lblAgeOutput);
        lblAgeOutput.setBounds(380, 70, 50, 10);
        lpCharacterInfo.add(lblHeightOutput);
        lblHeightOutput.setBounds(430, 70, 80, 10);
        lpCharacterInfo.add(lblWeightOutput);
        lblWeightOutput.setBounds(390, 100, 60, 10);
        lpCharacterInfo.add(lblEyesOutput);
        lblEyesOutput.setBounds(450, 100, 50, 13);
        lpCharacterInfo.add(lblSkinOutput);
        lblSkinOutput.setBounds(390, 130, 50, 10);
        lpCharacterInfo.add(lblHairOutput);
        lblHairOutput.setBounds(440, 130, 60, 10);

        lblSTR.setText("STR");
        lpCharacterInfo.add(lblSTR);
        lblSTR.setBounds(170, 200, 23, 16);

        lblDEX.setText("DEX");
        lpCharacterInfo.add(lblDEX);
        lblDEX.setBounds(170, 280, 30, 16);

        lblCON.setText("CON");
        lpCharacterInfo.add(lblCON);
        lblCON.setBounds(170, 360, 30, 16);

        lblINT.setText("INT");
        lpCharacterInfo.add(lblINT);
        lblINT.setBounds(170, 440, 30, 16);

        lblWIS.setText("WIS");
        lpCharacterInfo.add(lblWIS);
        lblWIS.setBounds(170, 520, 22, 16);

        lblCHA.setText("CHA");
        lpCharacterInfo.add(lblCHA);
        lblCHA.setBounds(170, 590, 28, 16);

        lblPerception.setText("Per");
        lpCharacterInfo.add(lblPerception);
        lblPerception.setBounds(20, 310, 20, 16);

        lblCharacterSheetDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sheets/Character Sheet Scaled Down.png"))); // NOI18N
        lblCharacterSheetDisplay.setText("S");
        lpCharacterInfo.add(lblCharacterSheetDisplay);
        lblCharacterSheetDisplay.setBounds(0, 0, 530, 679);

        javax.swing.GroupLayout pnlCharacterSheetDisplayLayout = new javax.swing.GroupLayout(pnlCharacterSheetDisplay);
        pnlCharacterSheetDisplay.setLayout(pnlCharacterSheetDisplayLayout);
        pnlCharacterSheetDisplayLayout.setHorizontalGroup(
            pnlCharacterSheetDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpCharacterInfo)
        );
        pnlCharacterSheetDisplayLayout.setVerticalGroup(
            pnlCharacterSheetDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpCharacterInfo)
        );

        tbpDisplay.addTab("Character Information ", null, pnlCharacterSheetDisplay, "");

        lpSpells.add(txtSpellDC);
        txtSpellDC.setBounds(320, 30, 80, 40);
        lpSpells.add(txtSpellAbility);
        txtSpellAbility.setBounds(210, 30, 100, 40);
        lpSpells.add(txtSpellBonus);
        txtSpellBonus.setBounds(410, 30, 90, 40);
        lpSpells.add(txtSpellCastingClass);
        txtSpellCastingClass.setBounds(20, 30, 180, 40);
        lpSpells.add(lblSlotsTot9);
        lblSlotsTot9.setBounds(460, 140, 30, 30);
        lpSpells.add(lblSlotsTot8);
        lblSlotsTot8.setBounds(400, 180, 30, 30);
        lpSpells.add(lblSlotsTot7);
        lblSlotsTot7.setBounds(340, 180, 30, 30);
        lpSpells.add(lblSlotsTot6);
        lblSlotsTot6.setBounds(290, 180, 30, 30);
        lpSpells.add(lblSlotsTot5);
        lblSlotsTot5.setBounds(230, 180, 30, 30);
        lpSpells.add(lblSlotsTot4);
        lblSlotsTot4.setBounds(400, 100, 30, 30);
        lpSpells.add(lblSlotsTot3);
        lblSlotsTot3.setBounds(340, 100, 30, 30);
        lpSpells.add(lblSlotsTot2);
        lblSlotsTot2.setBounds(290, 100, 30, 30);
        lpSpells.add(lblSlotsTot1);
        lblSlotsTot1.setBounds(230, 100, 30, 30);
        lpSpells.add(txtExpn9);
        txtExpn9.setBounds(460, 180, 30, 30);
        lpSpells.add(txtExpn8);
        txtExpn8.setBounds(400, 220, 30, 30);
        lpSpells.add(txtExpn7);
        txtExpn7.setBounds(340, 220, 30, 30);
        lpSpells.add(txtExpn6);
        txtExpn6.setBounds(290, 220, 30, 30);
        lpSpells.add(txtExpn5);
        txtExpn5.setBounds(230, 220, 30, 30);
        lpSpells.add(txtExpn4);
        txtExpn4.setBounds(400, 140, 30, 30);
        lpSpells.add(txtExpn3);
        txtExpn3.setBounds(340, 140, 30, 30);
        lpSpells.add(txtExpn2);
        txtExpn2.setBounds(290, 140, 30, 30);
        lpSpells.add(txtExpn1);
        txtExpn1.setBounds(230, 140, 30, 30);

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        txtASpells9.setViewportView(jTextArea10);

        lpSpells.add(txtASpells9);
        txtASpells9.setBounds(340, 560, 160, 90);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        txtASpells8.setViewportView(jTextArea9);

        lpSpells.add(txtASpells8);
        txtASpells8.setBounds(170, 560, 170, 90);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        txtASpells7.setViewportView(jTextArea8);

        lpSpells.add(txtASpells7);
        txtASpells7.setBounds(10, 560, 160, 90);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        txtASpells6.setViewportView(jTextArea7);

        lpSpells.add(txtASpells6);
        txtASpells6.setBounds(340, 420, 160, 84);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        txtASpells5.setViewportView(jTextArea6);

        lpSpells.add(txtASpells5);
        txtASpells5.setBounds(170, 420, 170, 84);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        txtASpells4.setViewportView(jTextArea5);

        lpSpells.add(txtASpells4);
        txtASpells4.setBounds(10, 420, 160, 84);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        txtASpells3.setViewportView(jTextArea4);

        lpSpells.add(txtASpells3);
        txtASpells3.setBounds(340, 290, 160, 90);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        txtASpells2.setViewportView(jTextArea3);

        lpSpells.add(txtASpells2);
        txtASpells2.setBounds(170, 290, 170, 90);

        txtASpellsOne.setColumns(20);
        txtASpellsOne.setRows(5);
        txtASpells1.setViewportView(txtASpellsOne);

        lpSpells.add(txtASpells1);
        txtASpells1.setBounds(10, 290, 160, 90);

        txtACantrips.setColumns(20);
        txtACantrips.setRows(5);
        jScrollPane7.setViewportView(txtACantrips);

        lpSpells.add(jScrollPane7);
        jScrollPane7.setBounds(10, 130, 210, 110);

        lblSpellsDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sheets/Spell Sheet Scaled Down.png"))); // NOI18N
        lpSpells.add(lblSpellsDisplay);
        lblSpellsDisplay.setBounds(-4, 0, 540, 650);

        javax.swing.GroupLayout pnlSpellsDisplayLayout = new javax.swing.GroupLayout(pnlSpellsDisplay);
        pnlSpellsDisplay.setLayout(pnlSpellsDisplayLayout);
        pnlSpellsDisplayLayout.setHorizontalGroup(
            pnlSpellsDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpSpells, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        pnlSpellsDisplayLayout.setVerticalGroup(
            pnlSpellsDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSpellsDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpSpells, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
        );

        tbpDisplay.addTab("Spells", pnlSpellsDisplay);

        lpProAndEq.add(txtCP);
        txtCP.setBounds(150, 240, 30, 50);
        lpProAndEq.add(txtSP);
        txtSP.setBounds(200, 240, 30, 50);
        lpProAndEq.add(txtEP);
        txtEP.setBounds(250, 240, 30, 50);
        lpProAndEq.add(txtGP);
        txtGP.setBounds(300, 240, 30, 50);
        lpProAndEq.add(txtPP);
        txtPP.setBounds(350, 240, 30, 50);

        txtAWeapons.setColumns(20);
        txtAWeapons.setRows(5);
        jScrollPane8.setViewportView(txtAWeapons);

        lpProAndEq.add(jScrollPane8);
        jScrollPane8.setBounds(20, 80, 490, 160);

        txtAItems.setColumns(20);
        txtAItems.setRows(5);
        jScrollPane9.setViewportView(txtAItems);

        lpProAndEq.add(jScrollPane9);
        jScrollPane9.setBounds(30, 350, 480, 270);

        lblProAndEqDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sheets/Equipment Sheet Scaled Down.png"))); // NOI18N
        lpProAndEq.add(lblProAndEqDisplay);
        lblProAndEqDisplay.setBounds(5, -4, 540, 660);

        javax.swing.GroupLayout pnlProAndEqDisplayLayout = new javax.swing.GroupLayout(pnlProAndEqDisplay);
        pnlProAndEqDisplay.setLayout(pnlProAndEqDisplayLayout);
        pnlProAndEqDisplayLayout.setHorizontalGroup(
            pnlProAndEqDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lpProAndEq)
        );
        pnlProAndEqDisplayLayout.setVerticalGroup(
            pnlProAndEqDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProAndEqDisplayLayout.createSequentialGroup()
                .addComponent(lpProAndEq)
                .addContainerGap())
        );

        tbpDisplay.addTab("Proficiencis & Equipment ", pnlProAndEqDisplay);

        getContentPane().add(tbpDisplay);
        tbpDisplay.setBounds(640, 20, 560, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    
    private void btnRNDCharacterInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRNDCharacterInfoActionPerformed
      // Making an array for all the integers to be randomized 
        Integer [] AbilityScore = new Integer[6];
    
        // random values  made to choose Level, race, and class from the combo boxes 
       int Level = (int) ((Math.random() * 2) +1);
       int Class = (int) ((Math.random() * 3) + 1);
       int Race = (int) ((Math.random() * 3) + 1);
       
       comboLevel.setSelectedIndex(Level);
       comboClass.setSelectedIndex(Class);
       comboRace.setSelectedIndex(Race);
       
       // atributing a random value to each part of the array so that it can be sorted from lowest to highest and then assigned a hierarchy depending on class
        for (int i = 0; i < 6; i++) {
            AbilityScore[i] = AbilityScore();
        }
        Integer [] AbilityScoreFin = quickSort(AbilityScore, 0, AbilityScore.length-1);
        
        
        if (comboClass.getSelectedItem() == "Barbarian") {
            
             txtStr.setText(String.valueOf(AbilityScoreFin[5] ));
             txtCon.setText(String.valueOf(AbilityScoreFin[4] ));
             txtDex.setText(String.valueOf(AbilityScoreFin[3] ));
             txtWis.setText(String.valueOf(AbilityScoreFin[2] ));
             txtCha.setText(String.valueOf(AbilityScoreFin[1] ));
             txtInt.setText(String.valueOf(AbilityScoreFin[0] ));
             
        } else if (comboClass.getSelectedItem() == "Bard") {
            
             txtStr.setText(String.valueOf(AbilityScoreFin[0] ));
             txtCon.setText(String.valueOf(AbilityScoreFin[3] ));
             txtDex.setText(String.valueOf(AbilityScoreFin[4] ));
             txtWis.setText(String.valueOf(AbilityScoreFin[1] ));
             txtCha.setText(String.valueOf(AbilityScoreFin[5] ));
             txtInt.setText(String.valueOf(AbilityScoreFin[2] ));
            
            
        } else if (comboClass.getSelectedItem() == "Rouge") {
            
             txtStr.setText(String.valueOf(AbilityScoreFin[0] ));
             txtCon.setText(String.valueOf(AbilityScoreFin[4] ));
             txtDex.setText(String.valueOf(AbilityScoreFin[5] ));
             txtWis.setText(String.valueOf(AbilityScoreFin[3] ));
             txtCha.setText(String.valueOf(AbilityScoreFin[2] ));
             txtInt.setText(String.valueOf(AbilityScoreFin[1] ));
         
        }
        
        // depending on race you have diffrent ability score modifiers so these apply here directly from the input text box that was asigned previously 
        if (comboRace.getSelectedItem() == "Human") {
            
             txtStr.setText(String.valueOf(Integer.parseInt(txtStr.getText()) +1 ));
             txtCon.setText(String.valueOf(Integer.parseInt(txtCon.getText()) +1 ));
             txtDex.setText(String.valueOf(Integer.parseInt(txtDex.getText()) +1 ));
             txtWis.setText(String.valueOf(Integer.parseInt(txtWis.getText()) +1 ));
             txtCha.setText(String.valueOf(Integer.parseInt(txtCha.getText()) +1 ));
             txtInt.setText(String.valueOf(Integer.parseInt(txtInt.getText()) +1 ));
            
        } else if (comboRace.getSelectedItem() == "Elf") {
            
            txtDex.setText(String.valueOf(Integer.parseInt(txtDex.getText()) +2 ));
            txtCha.setText(String.valueOf(Integer.parseInt(txtCha.getText()) +1 ));
            
        } else if (comboRace.getSelectedItem() == "Tiefling") {
            
            txtInt.setText(String.valueOf(Integer.parseInt(txtInt.getText()) +1 ));
            txtCha.setText(String.valueOf(Integer.parseInt(txtCha.getText()) +2 ));
        }
       
    }//GEN-LAST:event_btnRNDCharacterInfoActionPerformed

    private void comboLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLevelActionPerformed

    private void btnRNDLookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRNDLookActionPerformed
        // creating colour arrays to drak skin, eyes, and hair from 
        String[] Colours = {"green", "blue", "red", "orange", "yellow", "Teal", "Brown", "Purple", "Pink", "Ginger", "black", "white", "Chocolate"};
        String[] Fleshs = {"Dark", "Light", "Pale", "Black", "White", "Brown", "Tan", "Light Tan", "Dark Tan", "Chocolate", "Caramel", "Beige"};
        
        // making randomization values for each number input 
        txtAge.setText(String.valueOf((int) ((Math.random() * 100)+10))); // age range from 10 to 110
        txtHeight.setText(String.valueOf((int) ((Math.random() * 89) + 91)) + " cm"); // height range from 3 foot to 6 foot
        txtWeight.setText(String.valueOf((int) ((Math.random() * 125) + 125)) + " lbs"); // weight range from 125 to 250 lbs
        
        //Drawing from each of the colour arrays to assign hair and eye colour
        txtEyes.setText(Colours[(int) (Math.random() * 12)]);
        txtHair.setText(Colours[(int) (Math.random() * 12)]);
        
        //checking which colour array to pick from depending on weather it's a teifling or not (elf's have human skin tones whereas teiflings have quirky skin tones) 
        if (comboRace.getSelectedItem() == "Tiefling") {
            txtSkin.setText(Colours[(int) (Math.random() * 12) ]);
        } else {
            txtSkin.setText(Fleshs[(int) (Math.random() * 12)  ]);
        }
        
        
    }//GEN-LAST:event_btnRNDLookActionPerformed

    private void btnCharacterSheetConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharacterSheetConfirmActionPerformed
      
        //setting the other tabs unaccesable until class and race are choosen
        tbpUserInput.setEnabledAt(2, false);
        tbpUserInput.setEnabledAt(3, false);
        
        // setting up proficiency options and saving throws for each class
          lblPro3.setVisible(false);
          comboPro3.setVisible(false);
          
          lblPro4.setVisible(false);
          comboPro4.setVisible(false);
       
        // checking that class, level, and race are all choosen
      if (comboLevel.getSelectedItem() == "Please Select" || comboClass.getSelectedItem() == "Please Select" || comboRace.getSelectedItem() == "Please Select") {
      lblRe1.setVisible(true); 
      lblRe2.setVisible(true); 
      lblRe3.setVisible(true);
      } else {
          try {
              //atributing the name box and items chosen from the combo boxes to the character sheet
              lblName.setText(txtCharacterName.getText());
              lblClassLvl.setText((String) comboClass.getSelectedItem() + " " +  comboLevel.getSelectedItem() );
              lblRaceOutput.setText((String) comboRace.getSelectedItem());
              
              //hiding the required labels if previously shown
              lblRe1.setVisible(false);
              lblRe2.setVisible(false);
              lblRe3.setVisible(false);
              
              // setting up the  access to spells only for bard 
              if (comboClass.getSelectedIndex() == 2) {
                  
                   tbpUserInput.setEnabledAt(2, true);
                   
                   
              } else {
                  tbpUserInput.setEnabledAt(3, true);
              }
              //setting prof bonous to +2 since thats only valid at level 1 and 2 
              lblProfBonNum.setText("+2");
              
              //setting the ability scores based on whats in the user input page 
              txtSTR.setText(txtStr.getText());
              txtDEX.setText(txtDex.getText());
              txtCON.setText(txtCon.getText());
              txtINT.setText(txtInt.getText());
              txtWIS.setText(txtWis.getText());
              txtCHA.setText(txtCha.getText());
              
              //setting a modifier based on whats in the base ability score tab using the modifier function
              txtSTRMod.setText((Modifier(Integer.parseInt(txtStr.getText()))));
              txtDEXMod.setText((Modifier(Integer.parseInt(txtDex.getText()))));
              txtCONMod.setText((Modifier(Integer.parseInt(txtCon.getText()))));
              txtINTMod.setText((Modifier(Integer.parseInt(txtInt.getText()))));
              txtWISMod.setText((Modifier(Integer.parseInt(txtWis.getText()))));
              txtCHAMod.setText((Modifier(Integer.parseInt(txtCha.getText()))));
              
              //setting the look labels on the output sheet based on input sheet value 
              lblAgeOutput.setText(txtAge.getText());
              lblHeightOutput.setText(txtHeight.getText());
              lblWeightOutput.setText(txtWeight.getText());
              lblEyesOutput.setText(txtEyes.getText());
              lblSkinOutput.setText(txtSkin.getText());
              lblHairOutput.setText(txtHair.getText());
              
              // reading the txt files to gain features and traits about each race 
              int Perception = (Integer.parseInt(txtWISMod.getText())) + 10;
              lblPerception.setText(Integer.toString(Perception));
              txtAFeatTraits.setText("");
              switch (comboRace.getSelectedIndex()) {
                  case 1:
                      File elf = new File("ElfFeatures.txt");              
                      BufferedReader br  = new BufferedReader(new FileReader(elf));
                      String Elf;
                      while ((Elf = br.readLine()) != null) {
                         
                          txtAFeatTraits.append(Elf);
                      } 
                      break;
                  case 3:
                      File T = new File("TieflingFeatures.txt");              
                      BufferedReader br1  = new BufferedReader(new FileReader(T));
                      String Tief;
                      while ((Tief = br1.readLine()) != null) {
                         
                          txtAFeatTraits.append(Tief);  
                      }   
                      break;
                  case 2:
                      txtAFeatTraits.setText("Humans are what you make of them");
                      break;
                  default:
                      break;
              }
          } catch (FileNotFoundException ex) {
              Logger.getLogger(DnDGrameForm.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(DnDGrameForm.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          // setting up equipment values for each class
          if (comboClass.getSelectedItem() == "Barbarian") {
               radEq1Op1.setText("a Greataxe");
               radEq1Op2.setText("any martial melee weapon");

               radEq2Op1.setText("two hand axes");
               radEq2Op2.setText("any simple weapon");

               lblThirdItem.setVisible(false);
               radEq3Op1.setVisible(false);
               lblOr3.setVisible(false);
               radEq3Op2.setVisible(false);
           } else if (comboClass.getSelectedItem() == "Bard") {
               radEq1Op1.setText("a rapier");
               radEq1Op2.setText("a longsword");

               radEq2Op1.setText("a diplomat's pack");
               radEq2Op2.setText("an entertainer's pack");

               radEq3Op1.setText("a lute");
               radEq3Op2.setText("any other musical instrument");
               
               lblThirdItem.setVisible(true);
               radEq3Op1.setVisible(true);
               lblOr3.setVisible(true);
               radEq3Op2.setVisible(true);

           } else if (comboClass.getSelectedItem() == "Rouge") {
               radEq1Op1.setText("a rapier");
               radEq1Op2.setText("a shortsword");

               radEq2Op1.setText("a shortbow and quiver of 20 arrows");
               radEq2Op2.setText("a shortsword");

               radEq3Op1.setText("a burglar's pack");
               radEq3Op2.setText("a dungeoneer's pack");
               
               lblThirdItem.setVisible(true);
               radEq3Op1.setVisible(true);
               lblOr3.setVisible(true);
               radEq3Op2.setVisible(true);
           }
          // setting up proficencies for each class
        if (comboClass.getSelectedItem() == "Bard") {
            txtASavThrows.setText("Cha: " + (txtCHAMod.getText()) + " " +lblProfBonNum.getText() + "\n" + "Dex: " + txtDEXMod.getText() + " " + lblProfBonNum.getText());
            
           comboPro1.removeAllItems();
           comboPro2.removeAllItems();
           comboPro3.removeAllItems();
           comboPro4.removeAllItems();

           comboPro1.addItem("--Select--");
           comboPro2.addItem("--Select--");
           comboPro3.addItem("--Select--");
           comboPro4.addItem("--Select--");
       
           lblPro3.setVisible(true);
           comboPro3.setVisible(true);
          
           
           for (int a = 0; a <= BardPros.length; a++){
               comboPro1.addItem(BardPros[a]);
               comboPro2.addItem(BardPros[a]);
               comboPro3.addItem(BardPros[a]);
           }
          
            
        } else if (comboClass.getSelectedItem() == "Barbarian") {
            
            txtASavThrows.setText("Str: " + (txtSTRMod.getText()) + " " +lblProfBonNum.getText() + "\n" + "Con: " + txtCONMod.getText() + " " + lblProfBonNum.getText());
            
            comboPro1.removeAllItems();
            comboPro2.removeAllItems();
            comboPro3.removeAllItems();
            comboPro4.removeAllItems();

           comboPro1.addItem("--Select--");
           comboPro2.addItem("--Select--");
           comboPro3.addItem("--Select--");
           comboPro4.addItem("--Select--");
          
          for (int a = 0; a <= BarbarianPros.length; a++){
              comboPro1.addItem(BarbarianPros[a]);
              comboPro2.addItem(BarbarianPros[a]);
          }
            
        } else if (comboClass.getSelectedItem() == "Rouge") {
            
            txtASavThrows.setText("Dex: " + (txtDEXMod.getText()) + " " +lblProfBonNum.getText() + "\n" + "Int: " + txtINTMod.getText() + " " + lblProfBonNum.getText());
            
            comboPro1.removeAllItems();
            comboPro2.removeAllItems();
            comboPro3.removeAllItems();
            comboPro4.removeAllItems();

           comboPro1.addItem("--Select--");
           comboPro2.addItem("--Select--");
           comboPro3.addItem("--Select--");
           comboPro4.addItem("--Select--");
       
           lblPro3.setVisible(true);
           comboPro3.setVisible(true);
           
           lblPro4.setVisible(true);
           comboPro4.setVisible(true);
          
           
            for (int a = 0; a <= RougePros.length; a++){
               comboPro1.addItem(RougePros[a]);
               comboPro2.addItem(RougePros[a]);
               comboPro3.addItem(RougePros[a]);
               comboPro4.addItem(RougePros[a]);
            
           }
            
        }
        
        
           
      }  
      int intCONMod = Integer.parseInt(txtCONMod.getText());
               int int12HP = 12 + intCONMod;
               int int8HP = 8 + intCONMod;
              if (comboClass.getSelectedItem() == "Barbarian") {



                  lblMaxHP.setText(Integer.toString(int12HP));
              } else if (comboClass.getSelectedItem() == "Bard") {

                  lblMaxHP.setText(Integer.toString(int8HP));
              } else if (comboClass.getSelectedItem() == "Rouge") {
                  
                  lblMaxHP.setText(Integer.toString(int8HP));
              }
        
        
    }//GEN-LAST:event_btnCharacterSheetConfirmActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtEyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEyesActionPerformed

    private void txtSkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSkinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSkinActionPerformed

    private void txtHairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHairActionPerformed

    private void btnRNDSpellsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRNDSpellsActionPerformed
      
        // reseting the previous spells if there we're any
       txtaCantrips.setText("");
       txtaSpells.setText("");
       
       // making an array to hold the spells chosen
        ArrayList <String> strCantrips = new ArrayList();
        ArrayList <String> strSpell1 = new ArrayList();
        
        //deciding how many spells to choose based on level 
        if (comboLevel.getSelectedIndex() == 1) {
             
            // choosing two cantrips
            for (int i = 1; i <= 2; i++) {
            int temp;
            temp = (int) ((Math.random() * 11) +1);
            switch (temp) {
            case 1:
                strCantrips.add("Blade Ward");
               
                break;
            case 2:
                strCantrips.add("Dancing Lights");

                break;
            case 3:
                strCantrips.add("Friends");
             
                break;
            case 4:
                strCantrips.add("Light");
              
                break;
            case 5:
                strCantrips.add("Mage Hand");
              
                break;
            case 6:
                strCantrips.add("Mending");
               
                break;
            case 7:
                strCantrips.add("Message");
               
                break;
            case 8:
                strCantrips.add("Minor Illusion");
                
                break;
            case 9:
                strCantrips.add("Prestidigitation");
              
                break;
            case 10:
                strCantrips.add("True Strike");
            break;
            case 11:
                strCantrips.add("Vicious Mockery");
                break;
            default:
                break;
            }
           
            }
             txtaCantrips.append(strCantrips.toString() + "\n");
             
             // choosing 2 spell1s
             for (int i = 1; i <= 2; i++) {
                 int temp;
                temp = (int) (Math.random() * 21) +1;
             switch (temp) {
               case 1:
                   strSpell1.add("Animal Friendship");
                   break;
               case 2: 
                   strSpell1.add("Bane");
                   break;
               case 3:
                   strSpell1.add("Charm Person");
                   break;
               case 4:
                   strSpell1.add("Comprehend Languages");
                   break;
               case 5:
                   strSpell1.add("Cure Wounds");
                   break;  
               case 6:
                   strSpell1.add("Detect Magic");
                   break;
               case 7:
                   strSpell1.add("Disguise Self");
                   break;   
               case 8:
                   strSpell1.add("Dissonant Whispers");
                   break;
               case 9:
                   strSpell1.add("Faerie Fire");
                   break;   
               case 10:
                   strSpell1.add("Feather Fall");
                   break;
               case 11:
                   strSpell1.add("Healing Word");
                   break;
               case 12:
                   strSpell1.add("Heroism");
                   break;
               case 13:
                   strSpell1.add("Identify");
                   break;
               case 14:
                   strSpell1.add("Illusory Script");
                   break;
               case 15:
                   strSpell1.add("Longstrider");
                   break;
               case 16:
                   strSpell1.add("Silent Image");
                   break;
               case 17:
                   strSpell1.add("Sleep");
                   break;
               case 18:
                   strSpell1.add("Speak with Animals");
                   break;
               case 19:
                   strSpell1.add("Tasha's Hideous Laughter");
                   break;
               case 20:
                   strSpell1.add("Thunderwave");
                   break;
               case 21:
                   strSpell1.add("Unseen Servant");
                   break;   
                    default:
                        break;
           }
               
                }
              txtaSpells.append(strSpell1.toString() + "\n");
        } else if (comboLevel.getSelectedIndex() == 2) {
             
            for (int i = 1; i <= 2; i++) {
            int temp;
            temp = (int) ((Math.random() * 11) +1);
            switch (temp) {
            case 1:
                strCantrips.add("Blade Ward");
               
                break;
            case 2:
                strCantrips.add("Dancing Lights");

                break;
            case 3:
                strCantrips.add("Friends");
             
                break;
            case 4:
                strCantrips.add("Light");
              
                break;
            case 5:
                strCantrips.add("Mage Hand");
              
                break;
            case 6:
                strCantrips.add("Mending");
               
                break;
            case 7:
                strCantrips.add("Message");
               
                break;
            case 8:
                strCantrips.add("Minor Illusion");
                
                break;
            case 9:
                strCantrips.add("Prestidigitation");
              
                break;
            case 10:
                strCantrips.add("True Strike");
            break;
            case 11:
                strCantrips.add("Vicious Mockery");
                break;
            default:
                break;
            }
           
            }
             txtaCantrips.append(strCantrips.toString() + "\n");
             
             for (int i = 1; i <= 3; i++) {
                 int temp;
                temp = (int) (Math.random() * 21) +1;
             switch (temp) {
               case 1:
                   strSpell1.add("Animal Friendship");
                   break;
               case 2: 
                   strSpell1.add("Bane");
                   break;
               case 3:
                   strSpell1.add("Charm Person");
                   break;
               case 4:
                   strSpell1.add("Comprehend Languages");
                   break;
               case 5:
                   strSpell1.add("Cure Wounds");
                   break;  
               case 6:
                   strSpell1.add("Detect Magic");
                   break;
               case 7:
                   strSpell1.add("Disguise Self");
                   break;   
               case 8:
                   strSpell1.add("Dissonant Whispers");
                   break;
               case 9:
                   strSpell1.add("Faerie Fire");
                   break;   
               case 10:
                   strSpell1.add("Feather Fall");
                   break;
               case 11:
                   strSpell1.add("Healing Word");
                   break;
               case 12:
                   strSpell1.add("Heroism");
                   break;
               case 13:
                   strSpell1.add("Identify");
                   break;
               case 14:
                   strSpell1.add("Illusory Script");
                   break;
               case 15:
                   strSpell1.add("Longstrider");
                   break;
               case 16:
                   strSpell1.add("Silent Image");
                   break;
               case 17:
                   strSpell1.add("Sleep");
                   break;
               case 18:
                   strSpell1.add("Speak with Animals");
                   break;
               case 19:
                   strSpell1.add("Tasha's Hideous Laughter");
                   break;
               case 20:
                   strSpell1.add("Thunderwave");
                   break;
               case 21:
                   strSpell1.add("Unseen Servant");
                   break;   
                    default:
                        break;
           }
               
                }
              txtaSpells.append(strSpell1.toString() + "\n");
        }
       
    }//GEN-LAST:event_btnRNDSpellsActionPerformed

    private void btnCantripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantripActionPerformed
       
        //making an array to hold the cantrip 
        ArrayList <String> strCantrips = new ArrayList();
        
        // getting the chosen option adding it to the array and then displaying it
            int temp;
            temp = comboCantrips.getSelectedIndex();
            switch (temp) {
            case 1:
                strCantrips.add("Blade Ward");
               
                break;
            case 2:
                strCantrips.add("Dancing Lights");

                break;
            case 3:
                strCantrips.add("Friends");
             
                break;
            case 4:
                strCantrips.add("Light");
              
                break;
            case 5:
                strCantrips.add("Mage Hand");
              
                break;
            case 6:
                strCantrips.add("Mending");
               
                break;
            case 7:
                strCantrips.add("Message");
               
                break;
            case 8:
                strCantrips.add("Minor Illusion");
                
                break;
            case 9:
                strCantrips.add("Prestidigitation");
              
                break;
            case 10:
                strCantrips.add("True Strike");
            break;
            case 11:
                strCantrips.add("Vicious Mockery");
                break;
            default:
                break;
            }
            txtaCantrips.append(strCantrips.toString() + "\n");

        
    }//GEN-LAST:event_btnCantripActionPerformed

    private void btnSpells1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpells1ActionPerformed
       // same code logic as cantrip
        ArrayList <String> strSpell1 = new ArrayList();
        
        int temp;
        temp = comboSpells1.getSelectedIndex();
     switch (temp) {
       case 1:
           strSpell1.add("Animal Friendship");
           break;
       case 2: 
           strSpell1.add("Bane");
           break;
       case 3:
           strSpell1.add("Charm Person");
           break;
       case 4:
           strSpell1.add("Comprehend Languages");
           break;
       case 5:
           strSpell1.add("Cure Wounds");
           break;  
       case 6:
           strSpell1.add("Detect Magic");
           break;
       case 7:
           strSpell1.add("Disguise Self");
           break;   
       case 8:
           strSpell1.add("Dissonant Whispers");
           break;
       case 9:
           strSpell1.add("Faerie Fire");
           break;   
       case 10:
           strSpell1.add("Feather Fall");
           break;
       case 11:
           strSpell1.add("Healing Word");
           break;
       case 12:
           strSpell1.add("Heroism");
           break;
       case 13:
           strSpell1.add("Identify");
           break;
       case 14:
           strSpell1.add("Illusory Script");
           break;
       case 15:
           strSpell1.add("Longstrider");
           break;
       case 16:
           strSpell1.add("Silent Image");
           break;
       case 17:
           strSpell1.add("Sleep");
           break;
       case 18:
           strSpell1.add("Speak with Animals");
           break;
       case 19:
           strSpell1.add("Tasha's Hideous Laughter");
           break;
       case 20:
           strSpell1.add("Thunderwave");
           break;
       case 21:
           strSpell1.add("Unseen Servant");
           break;   
            default:
                break;
   }
        txtaSpells.append(strSpell1.toString() + "\n");
        
    }//GEN-LAST:event_btnSpells1ActionPerformed

    private void btnSpellsConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpellsConfirmActionPerformed
        
        //setting the spell text to the spell sheet
        txtACantrips.setText(txtaCantrips.getText());
        txtASpellsOne.setText(txtaSpells.getText());
        
        // allowing the thrid tab to be revealed 
        tbpUserInput.setEnabledAt(3, true);
        lblPro3.setVisible(false);
        comboPro3.setVisible(false);
     
        lblPro4.setVisible(false);
        comboPro4.setVisible(false);
       
        
       
       //adding the proficience options based on class (even tho if you have acess to spells you only have bard
       if (comboClass.getSelectedItem() == "Barbarian") {
            comboPro1.removeAllItems();
            comboPro2.removeAllItems();
            comboPro3.removeAllItems();
            comboPro4.removeAllItems();

           comboPro1.addItem("--Select--");
           comboPro2.addItem("--Select--");
           comboPro3.addItem("--Select--");
           comboPro4.addItem("--Select--");

              for (int a = 0; a <= BarbarianPros.length; a++){
                  comboPro1.addItem(BarbarianPros[a]);
                  comboPro2.addItem(BarbarianPros[a]);
              }
               
           
          
          
       } else if (comboClass.getSelectedItem() == "Bard") {
           
           comboPro1.removeAllItems();
           comboPro2.removeAllItems();
           comboPro3.removeAllItems();
           comboPro4.removeAllItems();

           comboPro1.addItem("--Select--");
           comboPro2.addItem("--Select--");
           comboPro3.addItem("--Select--");
           comboPro4.addItem("--Select--");
       
           lblPro3.setVisible(true);
           comboPro3.setVisible(true);
          
           
           for (int a = 0; a <= BardPros.length; a++){
               comboPro1.addItem(BardPros[a]);
               comboPro2.addItem(BardPros[a]);
               comboPro3.addItem(BardPros[a]);
           }
           
          
               
       } else if (comboClass.getSelectedItem() == "Rogue") {
           
                comboPro1.removeAllItems();
                comboPro2.removeAllItems();
                comboPro3.removeAllItems();
                comboPro4.removeAllItems();
                

               comboPro1.addItem("--Select--");
               comboPro2.addItem("--Select--");
               comboPro3.addItem("--Select--");
               comboPro4.addItem("--Select--");
       
               lblPro3.setVisible(true);
               comboPro3.setVisible(true);
              
               lblPro4.setVisible(true);
               comboPro4.setVisible(true);
              
           
            for (int a = 0; a <= RougePros.length; a++){
               comboPro1.addItem(RougePros[a]);
               comboPro2.addItem(RougePros[a]);
               comboPro3.addItem(RougePros[a]);
               comboPro4.addItem(RougePros[a]);
           }
          
           
           
       }
       //adding equipemnt options based on class (even though if you're in spells you only have bard)
       if (comboClass.getSelectedItem() == "Barbarian") {
               radEq1Op1.setText("a Greataxe");
               radEq1Op2.setText("any martial melee weapon");

               radEq2Op1.setText("two hand axes");
               radEq2Op2.setText("any simple weapon");

               lblThirdItem.setVisible(false);
               radEq3Op1.setVisible(false);
               lblOr3.setVisible(false);
               radEq3Op2.setVisible(false);
           } else if (comboClass.getSelectedItem() == "Bard") {
               radEq1Op1.setText("a rapier");
               radEq1Op2.setText("a longsword");

               radEq2Op1.setText("a diplomat's pack");
               radEq2Op2.setText("an entertainer's pack");

               radEq3Op1.setText("a lute");
               radEq3Op2.setText("any other musical instrument");
               
               lblThirdItem.setVisible(true);
               radEq3Op1.setVisible(true);
               lblOr3.setVisible(true);
               radEq3Op2.setVisible(true);

           } else if (comboClass.getSelectedItem() == "Rogue") {
               radEq1Op1.setText("a rapier");
               radEq1Op2.setText("a shortsword");

               radEq2Op1.setText("a shortbow and quiver of 20 arrows");
               radEq2Op2.setText("a shortsword");

               radEq3Op1.setText("a burglar's pack");
               radEq3Op2.setText("a dungeoneer's pack");
               
               lblThirdItem.setVisible(true);
               radEq3Op1.setVisible(true);
               lblOr3.setVisible(true);
               radEq3Op2.setVisible(true);
           }
       
       tbpUserInput.setEnabledAt(3, true);
       
    }//GEN-LAST:event_btnSpellsConfirmActionPerformed

    private void btnRNDProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRNDProActionPerformed
        
        //choosing a random index of each combobox for each of the proficiencies based on class
        if (comboClass.getSelectedItem() == "Bard") {
            
            comboPro1.setSelectedIndex((int) (Math.random() * 18) + 1);
            comboPro2.setSelectedIndex((int) (Math.random() * 18) + 1);
            comboPro3.setSelectedIndex((int) (Math.random() * 18) + 1);
            
            
        } else if (comboClass.getSelectedItem() == "Barbarian") {
            
            comboPro1.setSelectedIndex((int) (Math.random() * 7) + 1);
            comboPro2.setSelectedIndex((int) (Math.random() * 7) + 1);
            
        } else if (comboClass.getSelectedItem() == "Rouge") {
            
            comboPro1.setSelectedIndex((int) (Math.random() * 11) + 1);
            comboPro2.setSelectedIndex((int) (Math.random() * 11) + 1);
            comboPro3.setSelectedIndex((int) (Math.random() * 11) + 1);
            comboPro4.setSelectedIndex((int) (Math.random() * 11) + 1);
        }
            
        
    }//GEN-LAST:event_btnRNDProActionPerformed

    private void btnRNDEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRNDEqActionPerformed
     //creating a random 0 or 1 option to randomize equipment selection 
       int a = (int) (Math.random() * 2);
       int b = (int) (Math.random() * 2);
       int c = (int) (Math.random() * 2);

       // if statment based on class because barbarian only has two item option choices
        if (comboClass.getSelectedItem() == "Barbarian") {
            if (a == 1) {
                radEq1Op1.setSelected(true);
            } else {
                radEq1Op2.setSelected(true);
            }
            if (b == 1) {
                radEq2Op1.setSelected(true);
            } else {
                radEq2Op2.setSelected(true);
            }
            
    
        } else {
            if (a == 1) {
                radEq1Op1.setSelected(true);
            } else {
                radEq1Op2.setSelected(true);
            }
            if (b == 1) {
                radEq2Op1.setSelected(true);
            } else {
                radEq2Op2.setSelected(true);
            }
            if (c == 1) {
                radEq3Op1.setSelected(true);
            } else {
                radEq3Op2.setSelected(true);
            }
        }
            
        
        
    }//GEN-LAST:event_btnRNDEqActionPerformed

    private void btnProAndEqConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProAndEqConfirmActionPerformed
       
        // reseting item and weapon boxes based on class
        txtAWeapons.setText("");
        txtAItems.setText("");
        
        //displaying the text of the radio button they choose into diffrent boxes 
        if (comboClass.getSelectedItem() == "Barbarian") {
            if (radEq1Op1.isSelected() == true) {
            txtAWeapons.append(radEq1Op1.getText() + "\n");
        }
            if (radEq1Op2.isSelected() == true) {
            txtAWeapons.append(radEq1Op2.getText() + "\n");
        }
            if (radEq2Op1.isSelected() == true) {
            txtAWeapons.append(radEq2Op1.getText() + "\n");
        }
            if (radEq2Op2.isSelected() == true) {
            txtAWeapons.append(radEq2Op2.getText() + "\n");
        }
                
        } else if (comboClass.getSelectedItem() == "Bard" ) {
            if (radEq1Op1.isSelected() == true) {
            txtAWeapons.append(radEq1Op1.getText() + "\n");
        }
            if (radEq1Op2.isSelected() == true) {
            txtAWeapons.append(radEq1Op2.getText() + "\n");
        }
            if (radEq2Op1.isSelected() == true) {
            txtAItems.append(radEq2Op1.getText() + "\n");
        }
            if (radEq2Op2.isSelected() == true) {
            txtAItems.append(radEq2Op2.getText() + "\n");
        }
            if (radEq3Op1.isSelected() == true) {
            txtAItems.append(radEq3Op1.getText() + "\n");
        }
            if (radEq3Op2.isSelected() == true) {
            txtAItems.append(radEq3Op2.getText() + "\n");
        }
        } else if (comboClass.getSelectedItem() == "Rouge") {
            
            if (radEq1Op1.isSelected() == true) {
            txtAWeapons.append(radEq1Op1.getText() + "\n");
        }
            if (radEq1Op2.isSelected() == true) {
            txtAWeapons.append(radEq1Op2.getText() + "\n");
        }
            if (radEq2Op1.isSelected() == true) {
            txtAWeapons.append(radEq2Op1.getText() + "\n");
        }
            if (radEq2Op2.isSelected() == true) {
            txtAWeapons.append(radEq2Op2.getText() + "\n");
        }
            if (radEq3Op1.isSelected() == true) {
            txtAItems.append(radEq3Op1.getText() + "\n");
        }
            if (radEq3Op2.isSelected() == true) {
            txtAItems.append(radEq3Op2.getText() + "\n");
        }
            
        }
        
        // reseting the skills box if previously entered 
        txtASkills.setText("");
        
        //taking the values from the proficiency box and displaying them in skills box depending on each class's amount of proficiences 
        if (comboClass.getSelectedItem() == "Barbarian") {
             txtASkills.append(String.valueOf(comboPro1.getSelectedItem()) + "\n");
             txtASkills.append(String.valueOf(comboPro2.getSelectedItem()) + "\n");
             
        } else if (comboClass.getSelectedItem() == "Bard") {
            txtASkills.append(String.valueOf(comboPro1.getSelectedItem()) + "\n");
            txtASkills.append(String.valueOf(comboPro2.getSelectedItem()) + "\n");
            txtASkills.append(String.valueOf(comboPro3.getSelectedItem()) + "\n");
             
        } else if (comboClass.getSelectedItem() == "Rouge") {
            txtASkills.append(String.valueOf(comboPro1.getSelectedItem()) + "\n");
            txtASkills.append(String.valueOf(comboPro2.getSelectedItem()) + "\n");
            txtASkills.append(String.valueOf(comboPro3.getSelectedItem()) + "\n");
            txtASkills.append(String.valueOf(comboPro4.getSelectedItem()) + "\n");
        }
            
       
            
        
        
    }//GEN-LAST:event_btnProAndEqConfirmActionPerformed

    private void btnCanResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanResetActionPerformed

        txtaCantrips.setText("");
    }//GEN-LAST:event_btnCanResetActionPerformed

    private void btnSpellResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpellResetActionPerformed
       
       txtaSpells.setText("");
    }//GEN-LAST:event_btnSpellResetActionPerformed

    public static String Modifier (Integer A) {
        
        //check what the ability score is to determine the modifier
        if (A == 1)
            return "-5";
        else if (A <= 3)
            return "-4";
        else if (A <= 5)
            return "-3";
        else if (A <= 7)
            return "-2";
        else if (A <= 9)
            return "-1";
        else if (A <= 11)
            return "0";
        else if (A <= 13)
            return "1";
        else if (A <= 15)
            return "2";
        else if (A <= 17)
            return "3"; 
        else if (A <= 19)
            return "4";
        else if (A <= 21)
            return "5";
        else if (A <= 23)
            return "6";
        else if (A <= 25)
            return "7";
        else if (A <= 27)
            return "8";
        else if (A <= 29)
            return "9";
        else if (A >= 30)
            return "10";
        
        
     return null;   
    }
    
    public static Integer AbilityScore () {
        //rolling 3, 6 sided dice to identify ability score
        int total;
        int d1 = (int) ((Math.random() * 6) +1);
        int d2 = (int) ((Math.random() * 6) +1);
        int d3 = (int) ((Math.random() * 6) +1);
        total = d1 + d2 + d3;
        return total;
    }
    
    public static Integer[] quickSort (Integer [] H, int begin, int end) {
        // recursion program to sort the ability score values 
        if (end > begin) {
            int j;
            j = divide(H, begin, end);
            quickSort(H, begin, j-1);
            quickSort(H, j+1, end);
        }

        return H;
    }
    public static Integer divide(Integer[]H, int begin, int end) {
       
        // setting up a middle line and switching the values if one is higher than the other
        int Temp;
        int i = (begin-1);
        int pivot = H[end];
        
        for (int j = begin; j < end; j++) {
            if (H[j] <= pivot) {
                
            
                i++;
                
                Temp = H[i]; 
                H[i] = H[j]; 
                H[j] = Temp;
                        
            }
            }
        int temp = H[i+1]; 
        H[i+1] = H[end]; 
        H[end] = temp; 
  
        return i+1; 

     }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DnDGrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DnDGrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DnDGrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DnDGrameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DnDGrameForm().setVisible(true);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(DnDGrameForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanReset;
    private javax.swing.JButton btnCantrip;
    private javax.swing.JButton btnCharacterSheetConfirm;
    private javax.swing.JButton btnProAndEqConfirm;
    private javax.swing.JButton btnRNDCharacterInfo;
    private javax.swing.JButton btnRNDEq;
    private javax.swing.JButton btnRNDLook;
    private javax.swing.JButton btnRNDPro;
    private javax.swing.JButton btnRNDSpells;
    private javax.swing.JButton btnSpellReset;
    private javax.swing.JButton btnSpells1;
    private javax.swing.JButton btnSpellsConfirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> comboCantrips;
    private javax.swing.JComboBox<String> comboClass;
    private javax.swing.JComboBox<String> comboLevel;
    private javax.swing.JComboBox<String> comboPro1;
    private javax.swing.JComboBox<String> comboPro2;
    private javax.swing.JComboBox<String> comboPro3;
    private javax.swing.JComboBox<String> comboPro4;
    private javax.swing.JComboBox<String> comboRace;
    private javax.swing.JComboBox<String> comboSpells1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JLabel lblAbilityScores;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeOutput;
    private javax.swing.JLabel lblBGOutput;
    private javax.swing.JLabel lblCHA;
    private javax.swing.JLabel lblCON;
    private javax.swing.JLabel lblCantrips;
    private javax.swing.JLabel lblCha;
    private javax.swing.JLabel lblCharacterInfo;
    private javax.swing.JLabel lblCharacterLook;
    private javax.swing.JLabel lblCharacterName;
    private javax.swing.JLabel lblCharacterSheetDisplay;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblClassLvl;
    private javax.swing.JLabel lblCon;
    private javax.swing.JLabel lblCurrentHP;
    private javax.swing.JLabel lblDEX;
    private javax.swing.JLabel lblDex;
    private javax.swing.JLabel lblEquipment;
    private javax.swing.JLabel lblEyes;
    private javax.swing.JLabel lblEyesOutput;
    private javax.swing.JLabel lblFirstItem;
    private javax.swing.JLabel lblHair;
    private javax.swing.JLabel lblHairOutput;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHeightOutput;
    private javax.swing.JLabel lblINT;
    private javax.swing.JLabel lblInTitle;
    private javax.swing.JLabel lblInpVal;
    private javax.swing.JLabel lblInt;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMaxHP;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOr1;
    private javax.swing.JLabel lblOr2;
    private javax.swing.JLabel lblOr3;
    private javax.swing.JLabel lblPerception;
    private javax.swing.JLabel lblPro1;
    private javax.swing.JLabel lblPro2;
    private javax.swing.JLabel lblPro3;
    private javax.swing.JLabel lblPro4;
    private javax.swing.JLabel lblProAndEqDisplay;
    private javax.swing.JLabel lblProfBonNum;
    private javax.swing.JLabel lblProficiences;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblRaceOutput;
    private javax.swing.JLabel lblRe1;
    private javax.swing.JLabel lblRe2;
    private javax.swing.JLabel lblRe3;
    private javax.swing.JLabel lblSTR;
    private javax.swing.JLabel lblSecondItem;
    private javax.swing.JLabel lblSkin;
    private javax.swing.JLabel lblSkinOutput;
    private javax.swing.JLabel lblSlotsTot1;
    private javax.swing.JLabel lblSlotsTot2;
    private javax.swing.JLabel lblSlotsTot3;
    private javax.swing.JLabel lblSlotsTot4;
    private javax.swing.JLabel lblSlotsTot5;
    private javax.swing.JLabel lblSlotsTot6;
    private javax.swing.JLabel lblSlotsTot7;
    private javax.swing.JLabel lblSlotsTot8;
    private javax.swing.JLabel lblSlotsTot9;
    private javax.swing.JLabel lblSpells;
    private javax.swing.JLabel lblSpells1;
    private javax.swing.JLabel lblSpellsDisplay;
    private javax.swing.JLabel lblStep1;
    private javax.swing.JLabel lblStep1Line2;
    private javax.swing.JLabel lblStep2;
    private javax.swing.JLabel lblStep2Line2;
    private javax.swing.JLabel lblStr;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblThirdItem;
    private javax.swing.JLabel lblWIS;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeightOutput;
    private javax.swing.JLabel lblWelcomeLine1;
    private javax.swing.JLabel lblWelcomeLine2;
    private javax.swing.JLabel lblWelcomeLine3;
    private javax.swing.JLabel lblWis;
    private javax.swing.JLayeredPane lpCharacterInfo;
    private javax.swing.JLayeredPane lpProAndEq;
    private javax.swing.JLayeredPane lpSpells;
    private javax.swing.JPanel pnlCharacterSheet;
    private javax.swing.JPanel pnlCharacterSheetDisplay;
    private javax.swing.JPanel pnlInstructions;
    private javax.swing.JPanel pnlProAndEq;
    private javax.swing.JPanel pnlProAndEqDisplay;
    private javax.swing.JPanel pnlSpells;
    private javax.swing.JPanel pnlSpellsDisplay;
    private javax.swing.JRadioButton radEq1Op1;
    private javax.swing.JRadioButton radEq1Op2;
    private javax.swing.JRadioButton radEq2Op1;
    private javax.swing.JRadioButton radEq2Op2;
    private javax.swing.JRadioButton radEq3Op1;
    private javax.swing.JRadioButton radEq3Op2;
    private javax.swing.JTabbedPane tbpDisplay;
    private javax.swing.JTabbedPane tbpUserInput;
    private javax.swing.JTextField txtAC;
    private javax.swing.JTextArea txtACantrips;
    private javax.swing.JTextArea txtAFeatTraits;
    private javax.swing.JTextArea txtAItems;
    private javax.swing.JTextArea txtAProfLang;
    private javax.swing.JTextArea txtASavThrows;
    private javax.swing.JTextArea txtASkills;
    private javax.swing.JScrollPane txtASpells1;
    private javax.swing.JScrollPane txtASpells2;
    private javax.swing.JScrollPane txtASpells3;
    private javax.swing.JScrollPane txtASpells4;
    private javax.swing.JScrollPane txtASpells5;
    private javax.swing.JScrollPane txtASpells6;
    private javax.swing.JScrollPane txtASpells7;
    private javax.swing.JScrollPane txtASpells8;
    private javax.swing.JScrollPane txtASpells9;
    private javax.swing.JTextArea txtASpellsOne;
    private javax.swing.JTextArea txtAWeapons;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBonds;
    private javax.swing.JTextField txtCHA;
    private javax.swing.JTextField txtCHAMod;
    private javax.swing.JTextField txtCON;
    private javax.swing.JTextField txtCONMod;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCha;
    private javax.swing.JTextField txtCharacterName;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtDEX;
    private javax.swing.JTextField txtDEXMod;
    private javax.swing.JTextField txtDex;
    private javax.swing.JTextField txtEP;
    private javax.swing.JTextField txtExpn1;
    private javax.swing.JTextField txtExpn2;
    private javax.swing.JTextField txtExpn3;
    private javax.swing.JTextField txtExpn4;
    private javax.swing.JTextField txtExpn5;
    private javax.swing.JTextField txtExpn6;
    private javax.swing.JTextField txtExpn7;
    private javax.swing.JTextField txtExpn8;
    private javax.swing.JTextField txtExpn9;
    private javax.swing.JTextField txtEyes;
    private javax.swing.JTextField txtFlaws;
    private javax.swing.JTextField txtGP;
    private javax.swing.JTextField txtGoals;
    private javax.swing.JTextField txtHair;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtINT;
    private javax.swing.JTextField txtINTMod;
    private javax.swing.JTextField txtInitiative;
    private javax.swing.JTextField txtInt;
    private javax.swing.JTextField txtPP;
    private javax.swing.JTextField txtPersonality;
    private javax.swing.JTextField txtSP;
    private javax.swing.JTextField txtSTR;
    private javax.swing.JTextField txtSTRMod;
    private javax.swing.JTextField txtSkin;
    private javax.swing.JTextField txtSpeed;
    private javax.swing.JTextField txtSpellAbility;
    private javax.swing.JTextField txtSpellBonus;
    private javax.swing.JTextField txtSpellCastingClass;
    private javax.swing.JTextField txtSpellDC;
    private javax.swing.JTextField txtStr;
    private javax.swing.JTextField txtWIS;
    private javax.swing.JTextField txtWISMod;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWis;
    private javax.swing.JTextArea txtaCantrips;
    private javax.swing.JTextArea txtaSpells;
    // End of variables declaration//GEN-END:variables
}
