 
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class MainLayer extends javax.swing.JFrame {
    private static final String input1 = "PETER";
    public MainLayer() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ISSUE_BOOK = new javax.swing.JButton();
        RETURN_BOOK = new javax.swing.JButton();
        ADD_NEW_BOOKS = new javax.swing.JButton();
        STUDENT_REGISTERATION = new javax.swing.JButton();
        BOOK_DETAILS = new javax.swing.JButton();
        BOOK_Details = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Menu_Print = new javax.swing.JMenuItem();
        menu_save = new javax.swing.JMenuItem();
        Menu_SaveAll = new javax.swing.JMenuItem();
        menu_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_Undo = new javax.swing.JMenuItem();
        menu_Redo = new javax.swing.JMenuItem();
        menu_cut = new javax.swing.JMenuItem();
        menu_Paste = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_Developer = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menu_BooksAdded = new javax.swing.JMenuItem();
        menu_Recentpage = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_AboutUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomePage");
        setBackground(new java.awt.Color(0, 0, 153));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("University Library");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 12, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Library ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 70, 149, 41));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Book Details.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 121, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Issue Book.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 121, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Return Books.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 121, -1, -1));

        ISSUE_BOOK.setBackground(new java.awt.Color(0, 102, 102));
        ISSUE_BOOK.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ISSUE_BOOK.setForeground(new java.awt.Color(255, 255, 255));
        ISSUE_BOOK.setText("Issue Book");
        ISSUE_BOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISSUE_BOOKActionPerformed(evt);
            }
        });
        ISSUE_BOOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ISSUE_BOOKKeyPressed(evt);
            }
        });
        getContentPane().add(ISSUE_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 383, -1, -1));

        RETURN_BOOK.setBackground(new java.awt.Color(0, 102, 102));
        RETURN_BOOK.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RETURN_BOOK.setForeground(new java.awt.Color(255, 255, 255));
        RETURN_BOOK.setText("Return Book");
        RETURN_BOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETURN_BOOKActionPerformed(evt);
            }
        });
        RETURN_BOOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RETURN_BOOKKeyPressed(evt);
            }
        });
        getContentPane().add(RETURN_BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 383, -1, -1));

        ADD_NEW_BOOKS.setBackground(new java.awt.Color(0, 102, 102));
        ADD_NEW_BOOKS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ADD_NEW_BOOKS.setForeground(new java.awt.Color(255, 255, 255));
        ADD_NEW_BOOKS.setText("Add New Books");
        ADD_NEW_BOOKS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_NEW_BOOKSActionPerformed(evt);
            }
        });
        ADD_NEW_BOOKS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ADD_NEW_BOOKSKeyPressed(evt);
            }
        });
        getContentPane().add(ADD_NEW_BOOKS, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 440, -1, -1));

        STUDENT_REGISTERATION.setBackground(new java.awt.Color(0, 102, 102));
        STUDENT_REGISTERATION.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        STUDENT_REGISTERATION.setForeground(new java.awt.Color(255, 255, 255));
        STUDENT_REGISTERATION.setText("Student Registration");
        STUDENT_REGISTERATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STUDENT_REGISTERATIONActionPerformed(evt);
            }
        });
        STUDENT_REGISTERATION.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                STUDENT_REGISTERATIONKeyPressed(evt);
            }
        });
        getContentPane().add(STUDENT_REGISTERATION, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 440, -1, -1));

        BOOK_DETAILS.setBackground(new java.awt.Color(0, 102, 102));
        BOOK_DETAILS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BOOK_DETAILS.setForeground(new java.awt.Color(255, 255, 255));
        BOOK_DETAILS.setText("Issued Book Details");
        BOOK_DETAILS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOK_DETAILSActionPerformed(evt);
            }
        });
        BOOK_DETAILS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BOOK_DETAILSKeyPressed(evt);
            }
        });
        getContentPane().add(BOOK_DETAILS, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 476, -1, -1));

        BOOK_Details.setBackground(new java.awt.Color(0, 102, 102));
        BOOK_Details.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BOOK_Details.setForeground(new java.awt.Color(255, 255, 255));
        BOOK_Details.setText("Book Details");
        BOOK_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOK_DetailsActionPerformed(evt);
            }
        });
        BOOK_Details.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BOOK_DetailsKeyPressed(evt);
            }
        });
        getContentPane().add(BOOK_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 383, -1, -1));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        Menu_Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Menu_Print.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Menu_Print.setText("Print");
        Menu_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_PrintActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_Print);

        menu_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_save.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_save.setText("Save");
        jMenu1.add(menu_save);

        Menu_SaveAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Menu_SaveAll.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Menu_SaveAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a1.png"))); // NOI18N
        Menu_SaveAll.setText("Save All");
        Menu_SaveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SaveAllActionPerformed(evt);
            }
        });
        jMenu1.add(Menu_SaveAll);

        menu_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menu_Exit.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit.png"))); // NOI18N
        menu_Exit.setText("Exit");
        menu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        menu_Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_Undo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_Undo.setText("Undo");
        jMenu2.add(menu_Undo);

        menu_Redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_Redo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_Redo.setText("Redo");
        jMenu2.add(menu_Redo);

        menu_cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_cut.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_cut.setText("Cut");
        jMenu2.add(menu_cut);

        menu_Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_Paste.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_Paste.setText("Paste");
        jMenu2.add(menu_Paste);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Team");
        jMenu3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        menu_Developer.setText("Developer Contact");
        menu_Developer.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jMenuItem9.setText("+256706866585");
        menu_Developer.add(jMenuItem9);

        jMenu3.add(menu_Developer);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Window");
        jMenu5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        menu_BooksAdded.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menu_BooksAdded.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_BooksAdded.setText("Books Added");
        jMenu5.add(menu_BooksAdded);

        menu_Recentpage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menu_Recentpage.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_Recentpage.setText("Recent page");
        jMenu5.add(menu_Recentpage);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Help");
        jMenu6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        menu_AboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SPACE, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menu_AboutUs.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        menu_AboutUs.setText("About us");
        jMenu6.add(menu_AboutUs);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADD_NEW_BOOKSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_NEW_BOOKSActionPerformed
       int g = -1;
       while(g<0){
           String input1= JOptionPane.showInputDialog("Please enter Admin name to continue");
           
           if(input1.length()>0) {    
               g++;
        AddNewBook anb=new AddNewBook();
        anb.setVisible(true);
        this.setVisible(false);
           }
           else{
               JOptionPane.showMessageDialog(null,"You need to be an Admin to use this");
           }
       }
        
    }//GEN-LAST:event_ADD_NEW_BOOKSActionPerformed

    private void STUDENT_REGISTERATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STUDENT_REGISTERATIONActionPerformed
        try {
             for(int g=-1; g<0;g++){
                  String input= JOptionPane.showInputDialog("Please enter Admin name to continue");
           if(input.length()>0){  
             RegisterStudent r=new RegisterStudent();
        r.setVisible(true);
        this.setVisible(false);
           }
           else{
              JOptionPane.showMessageDialog(null,"You need to be an Admin to use this"); 
           }
           }  
        } catch (HeadlessException e) {
        }
 
       
        

      
    }//GEN-LAST:event_STUDENT_REGISTERATIONActionPerformed

    private void ISSUE_BOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISSUE_BOOKActionPerformed
        IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ISSUE_BOOKActionPerformed

    private void RETURN_BOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETURN_BOOKActionPerformed
        ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RETURN_BOOKActionPerformed

    private void BOOK_DETAILSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOK_DETAILSActionPerformed
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BOOK_DETAILSActionPerformed

    private void BOOK_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOK_DetailsActionPerformed
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BOOK_DetailsActionPerformed

    private void Menu_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_PrintActionPerformed

    }//GEN-LAST:event_Menu_PrintActionPerformed

    private void Menu_SaveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SaveAllActionPerformed

    }//GEN-LAST:event_Menu_SaveAllActionPerformed

    private void menu_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ExitActionPerformed
    if(JOptionPane.showConfirmDialog(null, "Confirm if you to exit", "Quit",JOptionPane.YES_NO_OPTION)==
           JOptionPane.YES_OPTION){
        System.exit(0);
    }      
       
    }//GEN-LAST:event_menu_ExitActionPerformed

    private void BOOK_DetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BOOK_DetailsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BookDetails Bd = new BookDetails();
            Bd.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BOOK_DetailsKeyPressed

    private void ISSUE_BOOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ISSUE_BOOKKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);}
    }//GEN-LAST:event_ISSUE_BOOKKeyPressed

    private void RETURN_BOOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RETURN_BOOKKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);}
    }//GEN-LAST:event_RETURN_BOOKKeyPressed

    private void ADD_NEW_BOOKSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADD_NEW_BOOKSKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           AddNewBook anb=new AddNewBook();
        anb.setVisible(true);
        this.setVisible(false);}
    }//GEN-LAST:event_ADD_NEW_BOOKSKeyPressed

    private void STUDENT_REGISTERATIONKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_STUDENT_REGISTERATIONKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          RegisterStudent r=new RegisterStudent();
        r.setVisible(true);
        this.setVisible(false);}
    }//GEN-LAST:event_STUDENT_REGISTERATIONKeyPressed

    private void BOOK_DETAILSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BOOK_DETAILSKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);}
    }//GEN-LAST:event_BOOK_DETAILSKeyPressed

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
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Splash().setVisible(true);
            new MainLayer().setVisible(false);
            
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_NEW_BOOKS;
    private javax.swing.JButton BOOK_DETAILS;
    private javax.swing.JButton BOOK_Details;
    private javax.swing.JButton ISSUE_BOOK;
    private javax.swing.JMenuItem Menu_Print;
    private javax.swing.JMenuItem Menu_SaveAll;
    private javax.swing.JButton RETURN_BOOK;
    private javax.swing.JButton STUDENT_REGISTERATION;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menu_AboutUs;
    private javax.swing.JMenuItem menu_BooksAdded;
    private javax.swing.JMenu menu_Developer;
    private javax.swing.JMenuItem menu_Exit;
    private javax.swing.JMenuItem menu_Paste;
    private javax.swing.JMenuItem menu_Recentpage;
    private javax.swing.JMenuItem menu_Redo;
    private javax.swing.JMenuItem menu_Undo;
    private javax.swing.JMenuItem menu_cut;
    private javax.swing.JMenuItem menu_save;
    // End of variables declaration//GEN-END:variables

    
      
    }

