/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KerawaAds;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author mabian
 */
public class Ads extends javax.swing.JFrame {
    
    JFileChooser fileChooser = new JFileChooser();
    
    File fileSelected;
    Cities cities = new Cities();
    String image = "";
    int i = 0;
    List<File> imagesList;

    /**
     * Creates new form Ads
     */
    String returnString = "";
    String test = "hell1";
    public Ads() {
        if(test.endsWith("o"))
        {
            initComponents();
        
        
        imagesList = new ArrayList<>();
        fileSelected = new File("/home/mabian/images/kerawalogo.jpeg");
        header.setBackground(Color.LIGHT_GRAY);
        ImageIcon logoIcon = new ImageIcon(fileSelected.getPath());
        Image imageIcon = logoIcon.getImage().getScaledInstance(211, 70, Image.SCALE_DEFAULT);
        ImageIcon reImage = new ImageIcon(imageIcon);
        logo.setIcon(reImage);
        
        emailvalidationerror.setVisible(false);

        //this is the external form fields
        telelabel.setVisible(false);
        contact_telephone.setVisible(false);
        teleleble2.setVisible(false);
        contact_telephone02.setVisible(false);
        error.setVisible(false);
        errorPrice.setVisible(false);
        
        surfaceLabel.setVisible(false);
        surfaceAreaTextField.setVisible(false);
        
        carMileAgeLable.setVisible(false);
        mileAge.setVisible(false);
        
        jobSal.setVisible(false);
        jobSalary.setVisible(false);
        
        landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
        landUnitaryHost.setVisible(false);
        
        contactFormOptions.setVisible(false);
        contactByEmail.setVisible(false);
        
        attachedLabel.setVisible(false);
        extensionNote.setVisible(false);
        
        buttonAttactments.setVisible(false);
        showAttachedFiles.setVisible(false);
        
        addNewAttachments.setVisible(false);
        
        utubeLabel.setVisible(false);
        utubeNote.setVisible(false);
        youTubeUrl.setVisible(false);
        }else{ 
            returnString = JOptionPane.showInputDialog("Specify file name");
            initComponents();
            imagesList = new ArrayList<>();
        fileSelected = new File("/home/mabian/images/kerawalogo.jpeg");
        header.setBackground(Color.LIGHT_GRAY);
        ImageIcon logoIcon = new ImageIcon(fileSelected.getPath());
        Image imageIcon = logoIcon.getImage().getScaledInstance(211, 70, Image.SCALE_DEFAULT);
        ImageIcon reImage = new ImageIcon(imageIcon);
        logo.setIcon(reImage);
        
        emailvalidationerror.setVisible(false);

        //this is the external form fields
        telelabel.setVisible(false);
        contact_telephone.setVisible(false);
        teleleble2.setVisible(false);
        contact_telephone02.setVisible(false);
        error.setVisible(false);
        errorPrice.setVisible(false);
        
        surfaceLabel.setVisible(false);
        surfaceAreaTextField.setVisible(false);
        
        carMileAgeLable.setVisible(false);
        mileAge.setVisible(false);
        
        jobSal.setVisible(false);
        jobSalary.setVisible(false);
        
        landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
        landUnitaryHost.setVisible(false);
        
        contactFormOptions.setVisible(false);
        contactByEmail.setVisible(false);
        
        attachedLabel.setVisible(false);
        extensionNote.setVisible(false);
        
        buttonAttactments.setVisible(false);
        showAttachedFiles.setVisible(false);
        
        addNewAttachments.setVisible(false);
        
        utubeLabel.setVisible(false);
        utubeNote.setVisible(false);
        youTubeUrl.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hostPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dealer_name = new javax.swing.JTextField();
        dealers_email = new javax.swing.JTextField();
        publish = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categorylchoice = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        currencyTag = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        country = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        city = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        city_area = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        telelabel = new javax.swing.JLabel();
        contact_telephone = new javax.swing.JFormattedTextField();
        teleleble2 = new javax.swing.JLabel();
        contact_telephone02 = new javax.swing.JFormattedTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        CheckBoxShowEmail = new javax.swing.JCheckBox();
        jobSal = new javax.swing.JLabel();
        jobSalary = new javax.swing.JFormattedTextField();
        contactFormOptions = new javax.swing.JLabel();
        contactByEmail = new javax.swing.JCheckBox();
        attachedLabel = new javax.swing.JLabel();
        extensionNote = new javax.swing.JLabel();
        buttonAttactments = new javax.swing.JButton();
        showAttachedFiles = new javax.swing.JLabel();
        addNewAttachments = new javax.swing.JLabel();
        carMileAgeLable = new javax.swing.JLabel();
        mileAge = new javax.swing.JTextField();
        utubeLabel = new javax.swing.JLabel();
        utubeNote = new javax.swing.JLabel();
        youTubeUrl = new javax.swing.JTextField();
        surfaceLabel = new javax.swing.JLabel();
        surfaceAreaTextField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        landUnitaryHost = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UnitaryPrice = new javax.swing.JTextArea();
        landUnitaryLabel = new javax.swing.JLabel();
        imagePanel = new javax.swing.JPanel();
        imageUpload01 = new javax.swing.JButton();
        imageUpload02 = new javax.swing.JButton();
        imageUpload03 = new javax.swing.JButton();
        imageUpload04 = new javax.swing.JButton();
        imageUpload05 = new javax.swing.JButton();
        imageUpload11 = new javax.swing.JButton();
        imageUpload12 = new javax.swing.JButton();
        imageUpload13 = new javax.swing.JButton();
        imageUpload14 = new javax.swing.JButton();
        imageUpload15 = new javax.swing.JButton();
        imageUpload06 = new javax.swing.JButton();
        imageUpload07 = new javax.swing.JButton();
        imageUpload08 = new javax.swing.JButton();
        imageUpload09 = new javax.swing.JButton();
        imageUpload10 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        error = new javax.swing.JLabel();
        price = new javax.swing.JFormattedTextField();
        errorPrice = new javax.swing.JLabel();
        emailvalidationerror = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        header = new javax.swing.JPanel();
        comfirmation_message = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        user_name = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hostPanel.setBackground(new java.awt.Color(241, 242, 240));
        hostPanel.setForeground(new java.awt.Color(107, 95, 95));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("General Information");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Publish a listing");

        dealers_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dealers_emailMouseExited(evt);
            }
        });
        dealers_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dealers_emailFocusLost(evt);
            }
        });

        publish.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        publish.setText("Publish");
        publish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton3.setText("Edit file");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel18.setText("E-mail *");

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel17.setText("Name");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel16.setText("Seller's information");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Category *");

        categorylchoice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a category.....", "Automotive", "      Vehicles", "      Motorcycles", "      Car parts - Accessories", "      Other Automotive", "Real Estate", "      Houses - Apartments for Sale", "      Houses - Apartments for Rent", "      Land for sale or rent", "      Office - commercial space", "      Other Real Estate", "Jobs", "      Job vacancies", "      Job wanted - Resume", "Fashion", "       Women's Clothing", "       Men's Clothing", "       Children's Clothing", "        Watches - Jewelries - Sunglasses", "         Fashion Accessories", "         Other fashion articles", "High Tech", "        Audio - Video", "         Phones - Tablets", "         Computers", "         Video games", "         Other -  High Tech", "For sale", "         Furniture, House decorations", "        Appliances", "        Other - For Sale", "Services", "       Service offered", "       Looking for service", "       Events", "       Other - Services" }));
        categorylchoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categorylchoiceItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Title *");

        title.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                titleKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setText("Description *");

        description.setColumns(20);
        description.setLineWrap(true);
        description.setRows(5);
        description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descriptionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(description);

        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel9.setText("Price");

        currencyTag.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Franc FA", "euro (€)", "pound (£)", "FR", "Dirhams", "Rs", "Nairas", "USh", "US dollars ($)", "CFA", "CFA", "R" }));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel10.setText("Listing Location");
        jLabel10.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setText("Country *");

        country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a region....", "Cameroun", "Congo Brazza", "Congo Kinshasa", "Côte d’Ivoire", "Gabon", "Senegal" }));
        country.setBorder(null);
        country.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                countryItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setText("City *");

        city.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a city..." }));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel13.setText("City Area");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel14.setText("Address");

        telelabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        telelabel.setText("Telephone 1");

        contact_telephone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("# ##0"))));
        contact_telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contact_telephoneKeyTyped(evt);
            }
        });

        teleleble2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        teleleble2.setText("Telephone 2");

        contact_telephone02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contact_telephone02KeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel21.setText("Show e-mail on the listing page");

        jobSal.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jobSal.setText("job-salary-141210");

        jobSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jobSalaryKeyTyped(evt);
            }
        });

        contactFormOptions.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        contactFormOptions.setText("Contact Form Options");

        contactByEmail.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        contactByEmail.setText("Allow users to contact you by email");

        attachedLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        attachedLabel.setText("Attachments");

        extensionNote.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        extensionNote.setText("*Allowed extensions are pdf,doc,docx,ppt,pptx,xls,xlsx,zip,rtf,rar. Any other file will not be uploaded");

        buttonAttactments.setText("Browse...");
        buttonAttactments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAttactmentsActionPerformed(evt);
            }
        });

        showAttachedFiles.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        showAttachedFiles.setText("no file selected");

        addNewAttachments.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        addNewAttachments.setText("Add new attachment");
        addNewAttachments.setToolTipText("please click to add..");

        carMileAgeLable.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        carMileAgeLable.setText("Cars-MileAge-150619: ");

        mileAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mileAgeKeyTyped(evt);
            }
        });

        utubeLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        utubeLabel.setText("Youtube video");

        utubeNote.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        utubeNote.setText("*Enter the youtube url, i.e.: http://www.youtube.com/watch?v=ojqWclLQOxk or http://www.youtube.com/v/ojqWclLQOxk");

        surfaceLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        surfaceLabel.setText("Surface:");

        surfaceAreaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surfaceAreaTextFieldKeyTyped(evt);
            }
        });

        UnitaryPrice.setColumns(20);
        UnitaryPrice.setLineWrap(true);
        UnitaryPrice.setRows(5);
        UnitaryPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(UnitaryPrice);

        landUnitaryLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        landUnitaryLabel.setText("Land-Unitary Price:");

        javax.swing.GroupLayout landUnitaryHostLayout = new javax.swing.GroupLayout(landUnitaryHost);
        landUnitaryHost.setLayout(landUnitaryHostLayout);
        landUnitaryHostLayout.setHorizontalGroup(
            landUnitaryHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landUnitaryHostLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(landUnitaryLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        landUnitaryHostLayout.setVerticalGroup(
            landUnitaryHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, landUnitaryHostLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(landUnitaryHostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(landUnitaryLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        imagePanel.setBackground(new java.awt.Color(240, 240, 242));
        imagePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        imageUpload01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload01ActionPerformed(evt);
            }
        });

        imageUpload02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload02ActionPerformed(evt);
            }
        });

        imageUpload03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload03ActionPerformed(evt);
            }
        });

        imageUpload04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload04ActionPerformed(evt);
            }
        });

        imageUpload05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload05ActionPerformed(evt);
            }
        });

        imageUpload11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload11ActionPerformed(evt);
            }
        });

        imageUpload12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload12ActionPerformed(evt);
            }
        });

        imageUpload13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload13ActionPerformed(evt);
            }
        });

        imageUpload14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload14ActionPerformed(evt);
            }
        });

        imageUpload15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload15ActionPerformed(evt);
            }
        });

        imageUpload06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload06ActionPerformed(evt);
            }
        });

        imageUpload07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload07ActionPerformed(evt);
            }
        });

        imageUpload08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload08ActionPerformed(evt);
            }
        });

        imageUpload09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload09ActionPerformed(evt);
            }
        });

        imageUpload10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageUpload10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addComponent(imageUpload01, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload02, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload03, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload04, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload05, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addComponent(imageUpload06, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload07, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload08, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload09, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(imagePanelLayout.createSequentialGroup()
                        .addComponent(imageUpload11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload12, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageUpload15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanelLayout.createSequentialGroup()
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageUpload01, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUpload02, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUpload03, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUpload04, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUpload05, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                        .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageUpload07, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageUpload06, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageUpload08, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageUpload09, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageUpload11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imageUpload13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageUpload12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imageUpload14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanelLayout.createSequentialGroup()
                        .addComponent(imageUpload10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imageUpload15, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel15.setText("Please click the boxes to upload images");

        jSeparator9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        error.setText("invalid");

        price.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        errorPrice.setText("invalid");

        emailvalidationerror.setText("invalid");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Telephone 3");

        javax.swing.GroupLayout hostPanelLayout = new javax.swing.GroupLayout(hostPanel);
        hostPanel.setLayout(hostPanelLayout);
        hostPanelLayout.setHorizontalGroup(
            hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostPanelLayout.createSequentialGroup()
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hostPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hostPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(hostPanelLayout.createSequentialGroup()
                                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(37, 37, 37)
                                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(categorylchoice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(error))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(hostPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(128, 128, 128)
                                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hostPanelLayout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(surfaceLabel)
                                            .addGap(105, 105, 105)
                                            .addComponent(surfaceAreaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(landUnitaryHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(141, 141, 141)
                                    .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(333, 333, 333)
                                    .addComponent(jLabel15))
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(contactFormOptions))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(attachedLabel))
                                        .addComponent(contactByEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(extensionNote, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addComponent(buttonAttactments)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(showAttachedFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(addNewAttachments))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(carMileAgeLable)
                                                .addComponent(jobSal))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(mileAge, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jobSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(116, 116, 116)
                                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(utubeNote)
                                                .addGroup(hostPanelLayout.createSequentialGroup()
                                                    .addGap(42, 42, 42)
                                                    .addComponent(utubeLabel))))
                                        .addComponent(youTubeUrl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(hostPanelLayout.createSequentialGroup()
                                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                                    .addGap(24, 24, 24)
                                                    .addComponent(jLabel16))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                                    .addGap(4, 4, 4)
                                                    .addComponent(jLabel18)
                                                    .addGap(96, 96, 96)
                                                    .addComponent(dealers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel21)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(CheckBoxShowEmail)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(emailvalidationerror)
                                            .addGap(617, 617, 617))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hostPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(97, 97, 97)
                                            .addComponent(dealer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(459, 459, 459)
                                    .addComponent(publish)
                                    .addGap(104, 104, 104)
                                    .addComponent(jButton3)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator7))
                        .addGroup(hostPanelLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(jLabel10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hostPanelLayout.createSequentialGroup()
                                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel14)
                                                .addComponent(telelabel)
                                                .addComponent(teleleble2)
                                                .addComponent(jLabel7))
                                            .addGap(56, 56, 56)
                                            .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(city_area, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(contact_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(contact_telephone02, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(17, 17, 17)
                                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
                                        .addComponent(jSeparator3)))
                                .addGroup(hostPanelLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel9)
                                    .addGap(98, 98, 98)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(currencyTag, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(errorPrice)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        hostPanelLayout.setVerticalGroup(
            hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(categorylchoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(currencyTag, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(errorPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hostPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hostPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(city_area, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telelabel)
                            .addComponent(contact_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teleleble2)
                            .addComponent(contact_telephone02, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hostPanelLayout.createSequentialGroup()
                        .addGap(697, 697, 697)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hostPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addGap(8, 8, 8)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dealer_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dealers_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(emailvalidationerror))
                        .addGap(18, 18, 18)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(CheckBoxShowEmail))
                        .addGap(31, 31, 31)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surfaceLabel)
                            .addComponent(surfaceAreaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(landUnitaryHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carMileAgeLable)
                            .addComponent(mileAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jobSal)
                            .addComponent(jobSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(contactFormOptions)
                        .addGap(18, 18, 18)
                        .addComponent(contactByEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(attachedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extensionNote)
                        .addGap(18, 18, 18)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAttactments)
                            .addComponent(showAttachedFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addNewAttachments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(utubeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(utubeNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(youTubeUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(imagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(publish))
                        .addGap(142, 142, 142))))
        );

        jScrollPane1.setViewportView(hostPanel);

        comfirmation_message.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 24)); // NOI18N
        comfirmation_message.setForeground(java.awt.Color.black);
        comfirmation_message.setText("Earn while writing ads for Kerawa");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Building opportunities");

        jLabel3.setText("Kerawa.com  » Publish a listing ");

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel34.setText("Version   1.0");
        jLabel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logo.setIcon(new javax.swing.ImageIcon("/home/mabian/images/kerawalogo.jpeg")); // NOI18N
        logo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        user_name.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        user_name.setText("user");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(comfirmation_message, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user_name))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comfirmation_message, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_name))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel34))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 2346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void categorylchoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categorylchoiceItemStateChanged
        // TODO add your handling code here:
        String selectedCategory = categorylchoice.getSelectedItem().toString().trim();
        
        switch (selectedCategory) {
            case "Vehicles":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(true);
                mileAge.setVisible(true);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Motorcycles":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(true);
                mileAge.setVisible(true);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Car parts - Accessories":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Other Automotive":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Houses - Apartments for Sale":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(true);
                surfaceAreaTextField.setVisible(true);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Houses - Apartments for Rent":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Land for sale or rent":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(true);
                surfaceAreaTextField.setVisible(true);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(true);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Office - commercial space":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Other Real Estate":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Job vacancies":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(true);
                jobSalary.setVisible(true);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Job wanted - Resume":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Women's Clothing":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Men's Clothing":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Children's Clothing":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Watches - Jewelries - Sunglasses":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Fashion Accessories":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Other fashion articles":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Audio - Video":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Phones - Tablets":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Computers":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Video games":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Other -  High Tech":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Furniture, House decorations":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Appliances":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Other - For Sale":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Service offered":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Looking for service":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Events":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            case "Other - Services":
                //this is the external form fields
                telelabel.setVisible(true);
                contact_telephone.setVisible(true);
                teleleble2.setVisible(true);
                contact_telephone02.setVisible(true);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(true);
                contactByEmail.setVisible(true);
                
                attachedLabel.setVisible(true);
                extensionNote.setVisible(true);
                
                buttonAttactments.setVisible(true);
                showAttachedFiles.setVisible(true);
                
                addNewAttachments.setVisible(true);
                error.setVisible(false);
                utubeLabel.setVisible(true);
                utubeNote.setVisible(true);
                youTubeUrl.setVisible(true);
                break;
            
            default:
                //this is the external form fields
                telelabel.setVisible(false);
                contact_telephone.setVisible(false);
                teleleble2.setVisible(false);
                contact_telephone02.setVisible(false);
                error.setVisible(false);
                errorPrice.setVisible(false);
                
                surfaceLabel.setVisible(false);
                surfaceAreaTextField.setVisible(false);
                
                carMileAgeLable.setVisible(false);
                mileAge.setVisible(false);
                
                jobSal.setVisible(false);
                jobSalary.setVisible(false);
                
                landUnitaryHost.setBackground(Color.getColor("#f1f2f0"));
                landUnitaryHost.setVisible(false);
                
                contactFormOptions.setVisible(false);
                contactByEmail.setVisible(false);
                
                attachedLabel.setVisible(false);
                extensionNote.setVisible(false);
                
                buttonAttactments.setVisible(false);
                showAttachedFiles.setVisible(false);
                
                addNewAttachments.setVisible(false);
                
                utubeLabel.setVisible(false);
                utubeNote.setVisible(false);
                youTubeUrl.setVisible(false);
                error.setVisible(true);
                error.setForeground(Color.red);
                error.setText(categorylchoice.getSelectedItem().toString().trim() + " is an invalid choice");
            
        }

    }//GEN-LAST:event_categorylchoiceItemStateChanged
    
    private List getListImage(File l) {
        List<File> fileList = new ArrayList<>();
        imagesList.add(l);
        return fileList;
    }
    

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void buttonAttactmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAttactmentsActionPerformed
        // TODO add your handling code here:
        /**
         * Open up a JFileChooser for the user to select file with the following
         * extensions pdf, doc, docx, ppt, pptx, xls, xlsx, zip, rtf, rar.
         */
        JFileChooser chooser = new JFileChooser();
        int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            showAttachedFiles.setText(file.getName());
        }
    }//GEN-LAST:event_buttonAttactmentsActionPerformed
    

    private void publishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishActionPerformed
        
        try {

            /**
             * Making up the xml document from the entered form fields
             *
             */
            FileInputStream fis = null;
            String stringBase64 = "";
            for (File imagesList1 : imagesList) {
                fis = new FileInputStream(imagesList1);
                byte imageData[] = new byte[(int) imagesList1.length()];
                fis.read(imageData);
                stringBase64 = Base64.getEncoder().encodeToString(imageData);
                
            }
            System.out.println(stringBase64 + " file name is " + "\n");
            
            fis.close();
            
            byte[] imageByte = Base64.getDecoder().decode(stringBase64);
            for (byte j : imageByte) {
                
            }
            
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();

            //root elements
            Document document = builder.newDocument();
            Element rootElement = document.createElement("crawled_ads");
            document.appendChild(rootElement);

            //ad tag
            Element ad = document.createElement("ad");
            rootElement.appendChild(ad);
            
            Element adidElement = document.createElement("adid");
            adidElement.appendChild(document.createTextNode(categorylchoice.getSelectedItem().toString().trim()));
            ad.appendChild(adidElement);

            //setting title element
            Element titleElement = document.createElement("title");
            titleElement.appendChild(document.createTextNode(title.getText().trim()));
            ad.appendChild(titleElement);

            //setting description element
            Element descriptionElement = document.createElement("desc");
            descriptionElement.appendChild(document.createTextNode(description.getText().trim()));
            ad.appendChild(descriptionElement);

            //setting price element
            Element priceeElement = document.createElement("price");
            priceeElement.appendChild(document.createTextNode(price.getText().trim()));
            ad.appendChild(priceeElement);
            
            Element currencyElement = document.createElement("currency");
            currencyElement.appendChild(document.createTextNode(currencyTag.getSelectedItem().toString()));
            ad.appendChild(currencyElement);

            //setting Country element
            Element countryElement = document.createElement("country");
            countryElement.appendChild(document.createTextNode(country.getSelectedItem().toString().trim()));
            ad.appendChild(countryElement);

            //setting city element
            Element cityElement = document.createElement("city");
            cityElement.appendChild(document.createTextNode(city.getSelectedItem().toString().trim()));
            ad.appendChild(cityElement);

            //setting city area element
            Element cityarea = document.createElement("city_area");
            cityarea.appendChild(document.createTextNode(city_area.getText()));
            ad.appendChild(cityarea);

            //setting up address element
            Element addressElement = document.createElement("address");
            addressElement.appendChild(document.createTextNode(address.getText()));
            ad.appendChild(addressElement);
            
            Element contact01 = document.createElement("contact01");
            contact01.appendChild(document.createTextNode(contact_telephone.getText()));
            ad.appendChild(contact01);
            
            Element contact02 = document.createElement("contact02");
            contact01.appendChild(document.createTextNode(contact_telephone02.getText()));
            ad.appendChild(contact02);
            
            Element sellersName = document.createElement("sellers_name");
            sellersName.appendChild(document.createTextNode(dealer_name.getText()));
            ad.appendChild(sellersName);
            
            Element sellersEmail = document.createElement("sellers_email");
            sellersEmail.appendChild(document.createTextNode(dealers_email.getText()));
            ad.appendChild(sellersEmail);
            
            Element showEmail = document.createElement("show_email");
            boolean returnValue = CheckBoxShowEmail.isSelected();
            String responds;
            if (returnValue) {
                responds = "true";
            } else {
                responds = "false";
            }
            showEmail.appendChild(document.createTextNode(responds));
            ad.appendChild(showEmail);
            
            Element surfaceArea = document.createElement("surface");
            surfaceArea.appendChild(document.createTextNode(surfaceAreaTextField.getText()));
            ad.appendChild(surfaceArea);
            
            Element unitaryPrice = document.createElement("unitry_price");
            unitaryPrice.appendChild(document.createTextNode(UnitaryPrice.getText().trim()));
            ad.appendChild(unitaryPrice);
            
            Element milAge = document.createElement("mile_age");
            milAge.appendChild(document.createTextNode(mileAge.getText().trim()));
            ad.appendChild(milAge);
            
            Element salaryElement = document.createElement("job_salary");
            salaryElement.appendChild(document.createTextNode(jobSalary.getText().trim()));
            ad.appendChild(salaryElement);
            
            Element contactByMail = document.createElement("contact_by_mail");
            boolean repos = contactByEmail.isSelected();
            String checkResponds;
            if (repos) {
                checkResponds = "true";
            } else {
                checkResponds = "false";
            }
            contactByMail.appendChild(document.createTextNode(checkResponds));
            ad.appendChild(contactByMail);

            //auto verification element
            Element autoverifyElement = document.createElement("autoVerify");
            autoverifyElement.appendChild(document.createTextNode("true"));
            ad.appendChild(autoverifyElement);
            
            Element noEmailElement = document.createElement("no_email");
            boolean showEmailCheck = CheckBoxShowEmail.isSelected();
            if (showEmailCheck) {
                noEmailElement.appendChild(document.createTextNode(dealers_email.getText().trim()));
            } else {
                noEmailElement.appendChild(document.createTextNode("N/A"));
            }
            ad.appendChild(noEmailElement);
            
            Element showAttached = document.createElement("attached_file");
            showAttached.appendChild(document.createTextNode("not activated yet"));
            ad.appendChild(showAttached);
            
            Element utube_url = document.createElement("youtube_url");
            utube_url.appendChild(document.createTextNode(youTubeUrl.getText().trim()));
            ad.appendChild(utube_url);
            
            Element imageElement = document.createElement("base64image");
            
            imageElement.appendChild(document.createTextNode(stringBase64));
            ad.appendChild(imageElement);

            //now i am write all the information to an xml file eg ads.xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("/home/mabian/Desktop/AdsFile/ads.xml"));
            transformer.transform(source, result);
            
            JOptionPane.showMessageDialog(this, "Your ad has being saved."
                    + "go to /home/mabian/Desktop/AdsFile/ads.xml to view.");
           
           
        } catch (IOException
                | ParserConfigurationException
                | DOMException
                | TransformerException
                | HeadlessException ex) {
            Logger.getLogger(Ads.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_publishActionPerformed

    private void titleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyCode();
        int limit = 0;
        if (title.getText().length() >= 50 && !(c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_titleKeyTyped

    private void descriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descriptionKeyTyped
        // TODO add your handling code here:
        int c = evt.getKeyCode();
        if (description.getText().length() >= 10000 && !(c == KeyEvent.VK_DELETE || c == KeyEvent.VK_BACK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_descriptionKeyTyped
    

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        // TODO add your handling code here:4
        char dot_hyhen = evt.getKeyChar();
        
        if (evt.getKeyChar() <= KeyEvent.VK_9) {
            errorPrice.setVisible(false);
        } else {
            errorPrice.setVisible(true);
            errorPrice.setText("invalid, figure needed");
            errorPrice.setForeground(Color.RED);
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

    private void imageUpload01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload01ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resizeIcon = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload01.setIcon(new ImageIcon(resizeIcon));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload01ActionPerformed

    private void imageUpload02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload02ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload02.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload02ActionPerformed

    private void imageUpload03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload03ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload03.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload03ActionPerformed

    private void imageUpload04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload04ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload04.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload04ActionPerformed

    private void imageUpload05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload05ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload05.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload05ActionPerformed

    private void imageUpload06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload06ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload06.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload06ActionPerformed

    private void imageUpload07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload07ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload07.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload07ActionPerformed

    private void imageUpload08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload08ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload08.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload08ActionPerformed

    private void imageUpload09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload09ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload09.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload09ActionPerformed

    private void imageUpload10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload10ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload10.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload10ActionPerformed

    private void imageUpload11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload11ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload11.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload11ActionPerformed

    private void imageUpload12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload12ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload12.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload12ActionPerformed

    private void imageUpload13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload13ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload13.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload13ActionPerformed

    private void imageUpload14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload14ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload14.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload14ActionPerformed

    private void imageUpload15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageUpload15ActionPerformed
        // TODO add your handling code here:
        JFileChooser Chooser = new JFileChooser();
        int returnValue = Chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = Chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(selectedFile.getPath());
            Image resImage = icon.getImage().getScaledInstance(158, 158, Image.SCALE_DEFAULT);
            imageUpload15.setIcon(new ImageIcon(resImage));
            getListImage(selectedFile);
        }
    }//GEN-LAST:event_imageUpload15ActionPerformed

    private void contact_telephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact_telephoneKeyTyped
        // TODO add your handling code here:
        char dot_hyhen = evt.getKeyChar();
        
        if (evt.getKeyChar() <= KeyEvent.VK_9) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_contact_telephoneKeyTyped

    private void contact_telephone02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact_telephone02KeyTyped
        // TODO add your handling code here:
        char dot_hyhen = evt.getKeyChar();
        
        if (evt.getKeyChar() <= KeyEvent.VK_9) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_contact_telephone02KeyTyped

    private void surfaceAreaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surfaceAreaTextFieldKeyTyped
        // TODO add your handling code here:
        char dot_hyhen = evt.getKeyChar();
        
        if (evt.getKeyChar() <= KeyEvent.VK_9) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_surfaceAreaTextFieldKeyTyped

    private void mileAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mileAgeKeyTyped
        // TODO add your handling code here:
        char dot_hyhen = evt.getKeyChar();
        
        if (evt.getKeyChar() <= KeyEvent.VK_9) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_mileAgeKeyTyped

    private void jobSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jobSalaryKeyTyped
        // TODO add your handling code here:
        char dot_hyhen = evt.getKeyChar();
        
        if (evt.getKeyChar() <= KeyEvent.VK_9) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jobSalaryKeyTyped
    

    private void countryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_countryItemStateChanged
        // TODO add your handling code here:
        String selectedCountry = country.getSelectedItem().toString();
        getCountry(selectedCountry);
    }//GEN-LAST:event_countryItemStateChanged

    private void dealers_emailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dealers_emailMouseExited
        // TODO add your handling code here:
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String emailentered = dealers_email.getText().trim();
        boolean validate = emailentered.matches(EMAIL_REGEX);
        if (validate) {
            
            emailvalidationerror.setVisible(true);
            emailvalidationerror.setForeground(Color.green);
            emailvalidationerror.setText("");
            ImageIcon icon = new ImageIcon("/home/mabian/images/valid.png");
            Image resImage = icon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            emailvalidationerror.setIcon(new ImageIcon(resImage));
        } else {
            emailvalidationerror.setVisible(true);
            emailvalidationerror.setForeground(Color.red);
            emailvalidationerror.setText("invalid email");
            emailvalidationerror.setIcon(new ImageIcon());
        }
    }//GEN-LAST:event_dealers_emailMouseExited

    private void dealers_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dealers_emailFocusLost
        // TODO add your handling code here:
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        ImageIcon icon = new ImageIcon("/home/mabian/images/valid.png");
        String emailentered = dealers_email.getText().trim();
        boolean validate = emailentered.matches(EMAIL_REGEX);
        if (validate) {
            emailvalidationerror.setVisible(true);
            emailvalidationerror.setForeground(Color.GREEN);
            emailvalidationerror.setText("");
            Image resImage = icon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
            emailvalidationerror.setIcon(new ImageIcon(resImage));
        } else {
            emailvalidationerror.setVisible(true);
            emailvalidationerror.setForeground(Color.red);
            emailvalidationerror.setIcon(new ImageIcon());
            emailvalidationerror.setText("invalid email");
        }
    }//GEN-LAST:event_dealers_emailFocusLost

    //method the helps to switch the different cities depending on the region selected
    private void getCountry(String str) {
        switch (str) {
            case "Cameroun":
                city.removeAllItems();
                for (String cities_in_cameroun1 : cities.cities_in_cameroun) {
                    city.addItem(cities_in_cameroun1.trim());
                }
                break;
            case "Congo Brazza":
                city.removeAllItems();
                for (String cities_in_Congo_Brazza1 : cities.cities_in_Congo_Brazza) {
                    city.addItem(cities_in_Congo_Brazza1);
                }
                break;
            case "Congo Kinshasa":
                city.removeAllItems();
                for (String cities_in_Congo_Kin : cities.cities_Congo_Kinshasa) {
                    city.addItem(cities_in_Congo_Kin);
                }
                break;
            case "Cote d'lvoire":
                city.removeAllItems();
                for (String cityIvoire : cities.cities_in_cote_dlvoire) {
                    city.addItem(cityIvoire);
                }
                break;
            case "Gabon":
                city.removeAllItems();
                for (String cities_in_gabon : cities.cities_in_Gabon) {
                    city.addItem(cities_in_gabon);
                }
                break;
            case "Senegal":
                city.removeAllItems();
                for (String cities_in_senegal : cities.cities_in_Senegal) {
                    city.addItem(cities_in_senegal);
                }
                break;
            default:
                city.removeAllItems();
                city.addItem("no region selected");
        }
    }
    
    public void clearAllInput() {
        UnitaryPrice.setText("");
        address.setText("");
        city_area.setText("");
        contact_telephone.setText("");
        contact_telephone02.setText("");
        dealer_name.setText("");
        dealers_email.setText("");
        description.setText("");
        jobSalary.setText("");
        mileAge.setText("");
        surfaceAreaTextField.setText("");
        price.setText("");
        title.setText("");
        youTubeUrl.setText("");
        emailvalidationerror.setVisible(false);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new Ads().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxShowEmail;
    private javax.swing.JTextArea UnitaryPrice;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel addNewAttachments;
    private javax.swing.JTextField address;
    private javax.swing.JLabel attachedLabel;
    private javax.swing.JButton buttonAttactments;
    private javax.swing.JLabel carMileAgeLable;
    private javax.swing.JComboBox categorylchoice;
    private javax.swing.JComboBox city;
    private javax.swing.JTextField city_area;
    private javax.swing.JLabel comfirmation_message;
    private javax.swing.JCheckBox contactByEmail;
    private javax.swing.JLabel contactFormOptions;
    private javax.swing.JFormattedTextField contact_telephone;
    private javax.swing.JFormattedTextField contact_telephone02;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JComboBox country;
    private javax.swing.JComboBox currencyTag;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JTextField dealer_name;
    private javax.swing.JTextField dealers_email;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JTextArea description;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel emailvalidationerror;
    private javax.swing.JLabel error;
    private javax.swing.JLabel errorPrice;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel extensionNote;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel header;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel hostPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton imageUpload01;
    private javax.swing.JButton imageUpload02;
    private javax.swing.JButton imageUpload03;
    private javax.swing.JButton imageUpload04;
    private javax.swing.JButton imageUpload05;
    private javax.swing.JButton imageUpload06;
    private javax.swing.JButton imageUpload07;
    private javax.swing.JButton imageUpload08;
    private javax.swing.JButton imageUpload09;
    private javax.swing.JButton imageUpload10;
    private javax.swing.JButton imageUpload11;
    private javax.swing.JButton imageUpload12;
    private javax.swing.JButton imageUpload13;
    private javax.swing.JButton imageUpload14;
    private javax.swing.JButton imageUpload15;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jobSal;
    private javax.swing.JFormattedTextField jobSalary;
    private javax.swing.JPanel landUnitaryHost;
    private javax.swing.JLabel landUnitaryLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField mileAge;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JFormattedTextField price;
    private javax.swing.JButton publish;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel showAttachedFiles;
    private javax.swing.JTextField surfaceAreaTextField;
    private javax.swing.JLabel surfaceLabel;
    private javax.swing.JLabel telelabel;
    private javax.swing.JLabel teleleble2;
    private javax.swing.JTextField title;
    private javax.swing.JLabel user_name;
    private javax.swing.JLabel utubeLabel;
    private javax.swing.JLabel utubeNote;
    private javax.swing.JTextField youTubeUrl;
    // End of variables declaration//GEN-END:variables

}
