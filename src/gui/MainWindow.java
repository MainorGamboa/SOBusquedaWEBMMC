/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.event.HyperlinkEvent;


/**
 *
 * @author marcos
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
    
    ArrayList<String> pagesList = new ArrayList();
    
    public MainWindow() {
        initComponents();
        
        tpPages.setContentType("text/html");//set content as html
        tpPages.setEditable(false);//so its not editable
        tpPages.setOpaque(false);//so we dont see whit background
        tpPages.addHyperlinkListener((HyperlinkEvent hle) -> {
            if (HyperlinkEvent.EventType.ACTIVATED.equals(hle.getEventType())) {
                System.out.println(hle.getURL());
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(hle.getURL().toURI());
                } catch (URISyntaxException | IOException ex) {
                }
            }
        });
        
        tpResult.setContentType("text/html");//set content as html
        tpResult.setEditable(false);//so its not editable
        tpResult.setOpaque(false);//so we dont see whit background
        tpResult.addHyperlinkListener((HyperlinkEvent hle) -> {
            if (HyperlinkEvent.EventType.ACTIVATED.equals(hle.getEventType())) {
                System.out.println(hle.getURL());
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(hle.getURL().toURI());
                } catch (URISyntaxException | IOException ex) {
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        tbParall = new javax.swing.JToggleButton();
        pagesPanel = new javax.swing.JPanel();
        labelPagesTitle = new javax.swing.JLabel();
        btChangePages = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpPages = new javax.swing.JTextPane();
        resultsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpResult = new javax.swing.JTextPane();
        labelGlobeImage = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Browser");
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        mainPanel.setBackground(java.awt.Color.white);

        searchPanel.setBackground(java.awt.Color.white);
        searchPanel.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        tbParall.setBackground(java.awt.Color.white);
        tbParall.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        tbParall.setText("||");
        tbParall.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbParall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbParall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbParallActionPerformed(evt);
            }
        });

        pagesPanel.setBackground(java.awt.Color.white);
        pagesPanel.setForeground(java.awt.Color.white);

        labelPagesTitle.setText("Pages");

        btChangePages.setBackground(java.awt.Color.white);
        btChangePages.setText("Change");
        btChangePages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btChangePages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChangePagesActionPerformed(evt);
            }
        });

        tpPages.setEditable(false);
        tpPages.setBackground(java.awt.Color.white);
        jScrollPane1.setViewportView(tpPages);

        javax.swing.GroupLayout pagesPanelLayout = new javax.swing.GroupLayout(pagesPanel);
        pagesPanel.setLayout(pagesPanelLayout);
        pagesPanelLayout.setHorizontalGroup(
            pagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagesPanelLayout.createSequentialGroup()
                .addGroup(pagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagesPanelLayout.createSequentialGroup()
                        .addContainerGap(208, Short.MAX_VALUE)
                        .addComponent(btChangePages))
                    .addGroup(pagesPanelLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(labelPagesTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pagesPanelLayout.setVerticalGroup(
            pagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pagesPanelLayout.createSequentialGroup()
                .addComponent(labelPagesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btChangePages)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        resultsPanel.setBackground(java.awt.Color.white);
        resultsPanel.setForeground(java.awt.Color.white);

        jScrollPane3.setViewportView(tpResult);

        javax.swing.GroupLayout resultsPanelLayout = new javax.swing.GroupLayout(resultsPanel);
        resultsPanel.setLayout(resultsPanelLayout);
        resultsPanelLayout.setHorizontalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        resultsPanelLayout.setVerticalGroup(
            resultsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        labelGlobeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/globe.png"))); // NOI18N

        tfSearch.setFont(new java.awt.Font("Umpush", 0, 20)); // NOI18N
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btSearch.setBackground(java.awt.Color.white);
        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btSearch.setText("Search");
        btSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 124, 225)));
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGlobeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81)
                .addComponent(tbParall, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(tbParall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labelGlobeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbParallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbParallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbParallActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btChangePagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChangePagesActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);        
        fileChooser.setBackground(Color.white);
        fileChooser.setDialogTitle("Open");        
        fileChooser.setAcceptAllFileFilterUsed(false);
        
        int rVal = fileChooser.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            File newFile = fileChooser.getSelectedFile();
            try{            
                FileInputStream fstream = new FileInputStream(newFile.getAbsolutePath());
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String strLine;
                tpPages.removeAll();
                String ant = "";
                pagesList.clear();
                while ((strLine = br.readLine()) != null){
                    pagesList.add(strLine);
                    ant = ant +"<a href='http://"+strLine+"/'>"+strLine+"</a><br>";
                }
                tpPages.setText(ant);
            br.close();          
            }
            catch(IOException e){
            }
        }        
    }//GEN-LAST:event_btChangePagesActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    public void setResultText(String title, String url, String text){
        String format = title+"<br><a href='http://"+url+"/'>"+url+"</a><br>" +text;        
        tpResult.setText(format);
    }
    public void addResultText(String title, String url, String text){
        String format = title+"<br><a href='http://"+url+"/'>"+url+"</a><br>" +text;    
        String ant = tpResult.getText();
        ant = format+"<br><br>"+ ant ;
        tpResult.setText(ant);
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
               
        
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {      
                
                
                new MainWindow().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChangePages;
    private javax.swing.JButton btSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelGlobeImage;
    private javax.swing.JLabel labelPagesTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pagesPanel;
    private javax.swing.JPanel resultsPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JToggleButton tbParall;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextPane tpPages;
    private javax.swing.JTextPane tpResult;
    // End of variables declaration//GEN-END:variables
}
