package edu.udc;

import edu.udc.data.Country;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class ProjectGUI extends JFrame {
    private String frameTitle = "Diversity By Country";
    private String fractInfoTT = "<html>Fractionalization measures the probability that two randomly<br>" +
            "drawn individuals (from a country) are not from the same group.</html>";

    // Containers and Components
    private JPanel pnlMain = new JPanel();
    private JPanel pnlCompare = new JPanel();
    private JScrollPane scrlpnCountries = new JScrollPane();
    private JScrollPane scrlpnCompare = new JScrollPane();
    private JTable tblCountries = new JTable();
    private JTable tblCompare = new JTable();
    private JTextField txtfldCountriesFilter = new JTextField();
    private JLabel lblCountriesFilter = new JLabel("Search");
    private JLabel lblMap = new JLabel();
    private JLabel lblCountryStatic = new JLabel("Country:");
    private JLabel lblCountry = new JLabel();
    private JLabel lblCapitalStatic = new JLabel("Capital:");
    private JLabel lblCapital = new JLabel();
    private JLabel lblPopStatic = new JLabel("Pop (in Millions):");
    private JLabel lblPop = new JLabel();
    private JLabel lblFractionalization = new JLabel("Fractionalization");
    private JLabel lblFractInfo = new JLabel("?");
    private JLabel lblEthnicFracStatic = new JLabel("Ethnic:");
    private JLabel lblEthnicFrac = new JLabel();
    private JLabel lblLingFractStatic = new JLabel("Linguistic:");
    private JLabel lblLingFract = new JLabel();
    private JLabel lblReligFractStatic = new JLabel("Religious:");
    private JLabel lblReligFract = new JLabel();
    private JButton bttnToggleCompare = new JButton();
    private JButton bttnCompare = new JButton("Compare");
    private JButton bttnWiki = new JButton("Wikipedia");
    private JButton bttnRemove = new JButton("Remove");
    private JButton bttnInfo = new JButton("More Info");
    private JButton bttnClose = new JButton("Close");
    private JSeparator sprtrLeft = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator sprtrCompare = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator sprtrRight = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator sprtrDetails = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator sprtrFractTop = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator sprtrFractBot = new JSeparator(SwingConstants.HORIZONTAL);
    
    // Data and Models
    private CountriesTableModel ctmCountries;
    private TableRowSorter trsCountries;
    private CompareTableModel cmptmCompare;
    private TableRowSorter trsCompare;
    private ImageIcon iiFrameIcon;
    private ImageIcon iiDoubleArrows;
    private ImageIcon iiGlobeImage;
    private ImageIcon iiNoImage;
    ArrayList<ImageIcon> images = new ArrayList<>();
    
    // Initialization
    private ProjectGUI() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (IllegalAccessException |
                 InstantiationException |
                 ClassNotFoundException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initData();
        initImages();
        initComponents();
        initControls();
    }
    
    private void initData() {
        ctmCountries = new CountriesTableModel(Country.getCountryList());
        cmptmCompare = new CompareTableModel();
    }
    
    private void initImages() {
        Image tmp = null;
        iiFrameIcon = null;

        try {
            tmp = ImageIO.read(ClassLoader.getSystemResource("edu/udc/data/img/Globe-icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tmp != null) {
            iiFrameIcon = new ImageIcon(tmp);
        }

        tmp = null;
        iiDoubleArrows = null;
        try {
            tmp = ImageIO.read(ClassLoader.getSystemResource("edu/udc/data/img/double_arrows.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tmp != null) {
            tmp = tmp.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            iiDoubleArrows = new ImageIcon(tmp);
        }

        tmp = null;
        iiGlobeImage = null;
        try {
            tmp = ImageIO.read(ClassLoader.getSystemResource("edu/udc/data/img/Blank_globe.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tmp != null) {
            tmp = tmp.getScaledInstance(375, 375, Image.SCALE_SMOOTH);
            iiGlobeImage = new ImageIcon(tmp);
        }

        tmp = null;
        iiNoImage = null;
        try {
            tmp = ImageIO.read(ClassLoader.getSystemResource("edu/udc/data/img/maps/No_image_available.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tmp != null) {
            iiNoImage = new ImageIcon(tmp);
        }
        
        for (Country c : ctmCountries.getData()) {
            Image mapImage = null;
            try {
                mapImage  = ImageIO.read(ClassLoader.getSystemResource(c.getMapURL()));
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            ImageIcon map = null;
            if (mapImage != null) {
                // mapImage = mapImage.getScaledInstance(375, 375, Image.SCALE_FAST);
                map = new ImageIcon(mapImage);
            }
            images.add(map);
        }
    }
    
    private void initComponents() {
        tblCountries.setModel(ctmCountries);
        tblCountries.getColumnModel().getColumn(0).setMaxWidth(40);
        tblCountries.getColumnModel().getColumn(1).setMaxWidth(40);
//        ((DefaultTableCellRenderer)tblCountries.getTableHeader().getDefaultRenderer())
//                .setHorizontalAlignment(SwingConstants.LEFT);
        tblCountries.setDefaultRenderer(ImageIcon.class, new FlagRenderer());
        scrlpnCountries.add(tblCountries);
        scrlpnCountries.setViewportView(tblCountries);

        tblCompare.setModel(cmptmCompare);
        tblCompare.setDefaultRenderer(Double.class, new DoubleRenderer());
        scrlpnCompare.add(tblCompare);
        scrlpnCompare.setViewportView(tblCompare);

        lblCountriesFilter.setForeground(Color.GRAY);
        lblMap.setIcon(iiGlobeImage);
        lblFractionalization.setForeground(Color.GRAY);
        lblFractInfo.setForeground(Color.BLUE);
        lblFractInfo.setToolTipText(fractInfoTT);
        lblCountryStatic.setForeground(Color.GRAY);
        lblCapitalStatic.setForeground(Color.GRAY);
        lblPopStatic.setForeground(Color.GRAY);
        lblEthnicFracStatic.setForeground(Color.GRAY);
        lblLingFractStatic.setForeground(Color.GRAY);
        lblReligFractStatic.setForeground(Color.GRAY);

        bttnToggleCompare.setIcon(iiDoubleArrows);

        sprtrLeft.setForeground(Color.GRAY);
        sprtrCompare.setForeground(Color.GRAY);
        sprtrDetails.setForeground(Color.GRAY);
        sprtrFractTop.setForeground(Color.GRAY);
        sprtrFractBot.setForeground(Color.GRAY);
        
        // Layout for main panel
        GroupLayout mainLayout = new GroupLayout(pnlMain);
        pnlMain.setLayout(mainLayout);
        
        mainLayout.setAutoCreateGaps(true);
        mainLayout.setAutoCreateContainerGaps(true);
        
        mainLayout.setHorizontalGroup(mainLayout.createSequentialGroup()
            .addComponent(sprtrLeft)
            .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(mainLayout.createSequentialGroup()
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(scrlpnCountries, 0, 260, 260)
                        .addGroup(mainLayout.createSequentialGroup()
                            .addComponent(bttnWiki)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                            .addComponent(bttnCompare)
                        )
                        .addGroup(mainLayout.createSequentialGroup()
                            .addComponent(lblCountriesFilter)
                            .addComponent(txtfldCountriesFilter)
                        )
                    )
                    .addComponent(lblMap, 375, 375, Short.MAX_VALUE)
                )
                .addComponent(sprtrDetails)
                .addGroup(mainLayout.createSequentialGroup()
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblCountryStatic)
                        .addComponent(lblEthnicFracStatic)
                    )
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblCountry, 0, 100, Short.MAX_VALUE)
                        .addComponent(lblEthnicFrac)
                    )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblCapitalStatic)
                        .addComponent(lblLingFractStatic)
                    )
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblCapital, 0, 100, Short.MAX_VALUE)
                        .addComponent(lblLingFract)
                    )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblPopStatic)
                        .addComponent(lblReligFractStatic)
                    )
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblPop, 0, 60, Short.MAX_VALUE)
                        .addComponent(lblReligFract)
                    )
                )
                .addComponent(sprtrFractTop)
                .addGroup(mainLayout.createSequentialGroup()
                    .addComponent(lblFractionalization)
                    .addComponent(lblFractInfo)
                )
                .addComponent(sprtrFractBot)
                .addGroup(mainLayout.createSequentialGroup()
                    .addComponent(bttnInfo)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, 0, Short.MAX_VALUE)
                    .addComponent(bttnClose)
                )
            )
            .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(bttnToggleCompare, 0, 20, 20)
                .addComponent(sprtrCompare)
            )
            .addComponent(pnlCompare)
        );
        
        mainLayout.setVerticalGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(sprtrLeft)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(scrlpnCountries, 0, lblMap.getPreferredSize().height, lblMap.getMaximumSize().height)
                        .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(bttnWiki)
                            .addComponent(bttnCompare)
                        )
                        .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCountriesFilter)
                            .addComponent(txtfldCountriesFilter)
                        )
                    )
                    .addComponent(lblMap, 375, 375, Short.MAX_VALUE)
                )
                .addComponent(sprtrDetails)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createSequentialGroup()
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCountryStatic)
                        .addComponent(lblCountry)
                        .addComponent(lblCapitalStatic)
                        .addComponent(lblCapital)
                        .addComponent(lblPopStatic)
                        .addComponent(lblPop)
                    )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(sprtrFractTop)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFractionalization)
                        .addComponent(lblFractInfo)
                    )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEthnicFracStatic)
                        .addComponent(lblEthnicFrac)
                        .addComponent(lblLingFractStatic)
                        .addComponent(lblLingFract)
                        .addComponent(lblReligFractStatic)
                        .addComponent(lblReligFract)
                    )

                )
                .addComponent(sprtrFractBot)
                .addGroup(mainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnInfo)
                    .addComponent(bttnClose)
                )
            )
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(bttnToggleCompare,0, 20, 20)
                .addComponent(sprtrCompare)
            )
            .addComponent(pnlCompare)
        );

        // Layout for pnlCompare
        pnlCompare.setVisible(false);

        GroupLayout compareLayout = new GroupLayout(pnlCompare);
        pnlCompare.setLayout(compareLayout);

        compareLayout.setAutoCreateGaps(true);
        compareLayout.setAutoCreateContainerGaps(true);

        compareLayout.setHorizontalGroup(compareLayout.createSequentialGroup()
            .addGroup(compareLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(scrlpnCompare)
                .addComponent(bttnRemove)
            )
            .addComponent(sprtrRight)
        );

        compareLayout.setVerticalGroup(compareLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(compareLayout.createSequentialGroup()
                .addComponent(scrlpnCompare)
                .addComponent(bttnRemove)
            )
            .addComponent(sprtrRight)
        );


        // Initialize frame
        this.setContentPane(pnlMain);
        this.setIconImage(iiFrameIcon.getImage());
        this.setTitle(frameTitle);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void initControls() {
        ToolTipManager.sharedInstance().setInitialDelay(150);

        bttnToggleCompare.addActionListener(alExtend);
        bttnWiki.addActionListener(alWiki);
        bttnCompare.addActionListener(alSendToCompare);
        bttnClose.addActionListener(alClose);
        bttnRemove.addActionListener(alRemove);


        tblCountries.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        trsCountries = new TableRowSorter<>(ctmCountries);
        trsCountries.setSortable(1, false);
        tblCountries.setRowSorter(trsCountries);
        tblCountries.getSelectionModel().addListSelectionListener(lslCountriesTable);

        tblCompare.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        trsCompare = new TableRowSorter<>(cmptmCompare);
        tblCompare.setRowSorter(trsCompare);

        txtfldCountriesFilter.getDocument().addDocumentListener(dlTableFilter);
    }
    
    private static void createAndShowGUI() {
        SwingUtilities.invokeLater(ProjectGUI::new);
    }
    
    // Methods
    public static void main(String[] args) {
        createAndShowGUI();
    }

    private void filterTable() {
        RowFilter<CountriesTableModel, Integer> rf = new RowFilter<CountriesTableModel, Integer>() {
            @Override
            public boolean include(Entry<? extends CountriesTableModel, ? extends Integer> entry) {
                CountriesTableModel countriesModel = entry.getModel();
                Country country = countriesModel.getData().get(entry.getIdentifier());
                return country.getName().toLowerCase().contains(txtfldCountriesFilter.getText().toLowerCase());
            }
        };

        trsCountries.setRowFilter(rf);
    }

    private void addToCompareTable() {
        if (tblCountries.getSelectedRow() < 0) return;

        int row = tblCountries.convertRowIndexToModel(tblCountries.getSelectedRow());
        if (cmptmCompare.getData().isEmpty() ||
                !cmptmCompare.getData().contains(ctmCountries.getData().get(row))) {
            cmptmCompare.getData().add(ctmCountries.getData().get(row));
            cmptmCompare.fireTableRowsInserted(cmptmCompare.getData().size() - 1,
                    cmptmCompare.getData().size() - 1);
            if (!pnlCompare.isVisible()) {
                pnlCompare.setVisible(true);
                this.pack();
            }
        }
    }

    private void removeFromCompareTable() {
        if (tblCompare.getSelectedRow() < 0) return;

        int modelRow = tblCompare.convertRowIndexToModel(tblCompare.getSelectedRow());
        int viewRow = tblCompare.getSelectedRow();

        cmptmCompare.getData().remove(modelRow);
        cmptmCompare.fireTableRowsDeleted(modelRow, modelRow);

        if (cmptmCompare.getData().isEmpty()) {
            pnlCompare.setVisible(false);
            this.pack();
        }
        else {
            if (viewRow >= cmptmCompare.getData().size()) {
                tblCompare.setRowSelectionInterval(viewRow - 1, viewRow - 1);
            }
            else {
                tblCompare.setRowSelectionInterval(viewRow, viewRow);
            }
        }
    }
    
    private void updateCountryDetails() {
        if (tblCountries.getSelectedRow() == -1) {
            if (iiGlobeImage != null) lblMap.setIcon(iiGlobeImage);
            else if (iiNoImage != null) lblMap.setIcon(iiNoImage);

            lblCountry.setText("");
            lblCapital.setText("");
            lblPop.setText("");
            lblEthnicFrac.setText("");
            lblLingFract.setText("");
            lblReligFract.setText("");

            return;
        }

        int row = tblCountries.convertRowIndexToModel(tblCountries.getSelectedRow());

        Country country = ctmCountries.getData().get(row);
        
        ImageIcon mapIcon = images.get(row);
        if (mapIcon != null) {
            lblMap.setIcon(mapIcon);
        }
        else if(iiNoImage != null) lblMap.setIcon(iiNoImage);
        
        lblCountry.setText(country.getName());
        lblCapital.setText(country.getCapital());
        lblPop.setText(""+ country.getPopMil());
        lblEthnicFrac.setText("" + country.getEthnicFract());
        lblLingFract.setText("" + country.getLinguisticFract());
        lblReligFract.setText("" + country.getReligiousFract());
    }

    private void openWebpage(URL url) {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;

        if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
            try {
                desktop.browse(url.toURI());
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
    
    // Listeners
    private ActionListener alExtend = (ae) -> {
        if (pnlCompare.isVisible()) {
            pnlCompare.setVisible(false);
        }
        else {
            pnlCompare.setVisible(true);
        }
        this.pack();
    };

    private ActionListener alWiki = (ae) -> {
        if (tblCountries.getSelectedRow() < 0) return;

        int row = tblCountries.convertRowIndexToModel(tblCountries.getSelectedRow());
        openWebpage(ctmCountries.getData().get(row).getWikiURL());
    };

    private ActionListener alSendToCompare = (ae) -> {
        addToCompareTable();
    };

    private ActionListener alRemove = (ae) -> {
        removeFromCompareTable();
    };

    private ActionListener alClose = (ae) -> {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    };
    
    private ListSelectionListener lslCountriesTable = (lse) -> {
        if (lse.getValueIsAdjusting()) {
            return;
        }
        SwingUtilities.invokeLater(this::updateCountryDetails);
    };

    private DocumentListener dlTableFilter = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            filterTable();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            filterTable();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            filterTable();
        }
    };
}
