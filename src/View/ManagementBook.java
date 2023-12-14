package View;

import Controller.ModelsController;
import DataAccess.FileAccess;
import DataAccess.IDataAccess;
import Models.Book;
import Models.Megazine;
import Models.Model;
import Models.Newspaper;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagementBook extends javax.swing.JFrame {

  DefaultTableModel DA;
  ArrayList<Model> list = new ArrayList<>();

  public ManagementBook() {
    initComponents();
    DA = new DefaultTableModel();
    tbl_Table.setModel(DA);
    String ext =
        "E:\\IT\\VSCode\\Github\\Document-Management\\src\\getData.txt";
    IDataAccess context = new FileAccess(ext);
    ModelsController controller = new ModelsController(context);
    list = controller.Repository.list();
    DA.setColumnIdentifiers(new Object[] {
        "Mã tài liệu", "Tác giả", "Tiêu đề", "Nhà xuất bản", "Số bản phát hành",
        "Số phát hành", " Ngày phát hành", "Tháng phát hành", "Số trang"});
    napDuLieu(list);
    lb_Id.setVisible(false);
    txt_Id.setVisible(false);
    lb_Authors.setVisible(false);
    txt_Authors.setVisible(false);
    lb_Title.setVisible(false);
    txt_Title.setVisible(false);
    lb_Publisher.setVisible(false);
    txt_Publisher.setVisible(false);
    lb_PublishedQuantity.setVisible(false);
    txt_PublishedQuantity.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(false);
    txt_Filter.setVisible(false);
    ptn_Filter.setVisible(false);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jScrollPane1 = new javax.swing.JScrollPane();
    tbl_Table = new javax.swing.JTable();
    ptn_Exit = new javax.swing.JButton();
    txt_Publisher = new javax.swing.JTextField();
    txt_Title = new javax.swing.JTextField();
    txt_IssueDay = new javax.swing.JTextField();
    txt_IssueMonth = new javax.swing.JTextField();
    txt_PublishedQuantity = new javax.swing.JTextField();
    lb_Id = new javax.swing.JLabel();
    lb_Authors = new javax.swing.JLabel();
    lb_PublishedQuantity = new javax.swing.JLabel();
    lb_Publisher = new javax.swing.JLabel();
    lb_NumberOfPages = new javax.swing.JLabel();
    lb_IssueMonth = new javax.swing.JLabel();
    lb_IssueDay = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    lb_Title = new javax.swing.JLabel();
    txt_NumberOfPages = new javax.swing.JTextField();
    txt_Id = new javax.swing.JTextField();
    txt_Authors = new javax.swing.JTextField();
    rdo_InsertMegazine = new javax.swing.JRadioButton();
    rdo_InsertNewspaper = new javax.swing.JRadioButton();
    rdo_InsertBook = new javax.swing.JRadioButton();
    rdo_Delete = new javax.swing.JRadioButton();
    rdo_Search = new javax.swing.JRadioButton();
    rdo_Filter = new javax.swing.JRadioButton();
    txt_Filter = new javax.swing.JTextField();
    lb_FitlerTitler = new javax.swing.JLabel();
    ptn_Filter = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tbl_Table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    tbl_Table.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {{"a", "b", "c", "a", new Integer(1), null,
                         new Integer(3), new Integer(4), new Integer(5)},
                        {"", null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null}},
        new String[] {"Mã tài liệu", "Tác giả", "Tiêu đề", "Nhà xuất bản",
                      "Số bản phát hành", "Số phát hành", "Ngày phát hành",
                      "Tháng phát hành", "Số trang"}) {
      Class[] types =
          new Class[] {java.lang.String.class,  java.lang.String.class,
                       java.lang.String.class,  java.lang.String.class,
                       java.lang.Integer.class, java.lang.String.class,
                       java.lang.Integer.class, java.lang.Integer.class,
                       java.lang.Integer.class};

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }
    });
    jScrollPane1.setViewportView(tbl_Table);

    ptn_Exit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    ptn_Exit.setText("Thoát");
    ptn_Exit.setToolTipText("");
    ptn_Exit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_ExitActionPerformed(evt);
      }
    });

    txt_Publisher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_Publisher.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_PublisherActionPerformed(evt);
      }
    });

    txt_Title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_Title.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_TitleActionPerformed(evt);
      }
    });

    txt_IssueDay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_IssueDay.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_IssueDayActionPerformed(evt);
      }
    });

    txt_IssueMonth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_IssueMonth.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_IssueMonthActionPerformed(evt);
      }
    });

    txt_PublishedQuantity.setFont(
        new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_PublishedQuantity.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            txt_PublishedQuantityActionPerformed(evt);
          }
        });

    lb_Id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Id.setText("Mã tài liệu:");

    lb_Authors.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Authors.setText("Tác giả:");

    lb_PublishedQuantity.setFont(
        new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_PublishedQuantity.setText("Số bản PH:");

    lb_Publisher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Publisher.setText("Nhà xuất bản:");

    lb_NumberOfPages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_NumberOfPages.setText("Số trang:");

    lb_IssueMonth.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_IssueMonth.setText("Tháng PH:");

    lb_IssueDay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_IssueDay.setText("Ngày PH:");

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jLabel6.setText("CHƯƠNG TRÌNH QUẢN LÝ TÀI LIỆU : SÁCH, BÁO, TẠP CHÍ");

    lb_Title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Title.setText("Tiêu đề:");

    txt_NumberOfPages.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_NumberOfPages.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_NumberOfPagesActionPerformed(evt);
      }
    });

    txt_Id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_Id.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_IdActionPerformed(evt);
      }
    });

    txt_Authors.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_Authors.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_AuthorsActionPerformed(evt);
      }
    });

    buttonGroup1.add(rdo_InsertMegazine);
    rdo_InsertMegazine.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_InsertMegazine.setText("Thêm tạp chí");
    rdo_InsertMegazine.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_InsertMegazineActionPerformed(evt);
      }
    });

    buttonGroup1.add(rdo_InsertNewspaper);
    rdo_InsertNewspaper.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_InsertNewspaper.setText("Thêm báo");
    rdo_InsertNewspaper.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_InsertNewspaperActionPerformed(evt);
      }
    });

    buttonGroup1.add(rdo_InsertBook);
    rdo_InsertBook.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_InsertBook.setText("Thêm sách");
    rdo_InsertBook.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_InsertBookActionPerformed(evt);
      }
    });

    buttonGroup1.add(rdo_Delete);
    rdo_Delete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_Delete.setText("Xóa");
    rdo_Delete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_DeleteActionPerformed(evt);
      }
    });

    buttonGroup1.add(rdo_Search);
    rdo_Search.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_Search.setText("Tìm");
    rdo_Search.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_SearchActionPerformed(evt);
      }
    });

    buttonGroup1.add(rdo_Filter);
    rdo_Filter.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_Filter.setText("Lọc");
    rdo_Filter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_FilterActionPerformed(evt);
      }
    });

    txt_Filter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    lb_FitlerTitler.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_FitlerTitler.setText("Lọc theo \"sách\",\"báo\",\"tạp chí\" ?");

    ptn_Filter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    ptn_Filter.setText("CHẠY");

    javax.swing.GroupLayout layout =
        new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                      layout.createSequentialGroup()
                          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                           Short.MAX_VALUE)
                          .addComponent(
                              jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                              623, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addGap(237, 237, 237))
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addComponent(
                                                lb_PublishedQuantity,
                                                javax.swing.GroupLayout
                                                    .Alignment.TRAILING)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addGap(3, 3, 3)
                                                    .addComponent(lb_Id)))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle
                                            .ComponentPlacement.RELATED)
                                    .addGroup(layout
                                                  .createParallelGroup(
                                                      javax.swing.GroupLayout
                                                          .Alignment.LEADING)
                                                  .addComponent(
                                                      txt_Id,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE,
                                                      89,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE)
                                                  .addComponent(
                                                      txt_PublishedQuantity,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE,
                                                      89,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE))
                                    .addGap(138, 138, 138))
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addGap(58, 58, 58)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                rdo_Filter)
                                                            .addComponent(
                                                                rdo_InsertBook))
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .LEADING)
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addGap(
                                                                        68,
                                                                        1059,
                                                                        Short
                                                                            .MAX_VALUE)
                                                                    .addComponent(
                                                                        ptn_Exit))
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addGap(
                                                                        7, 7, 7)
                                                                    .addGroup(
                                                                        layout
                                                                            .createParallelGroup(
                                                                                javax
                                                                                    .swing
                                                                                    .GroupLayout
                                                                                    .Alignment
                                                                                    .LEADING)
                                                                            .addGroup(
                                                                                layout
                                                                                    .createSequentialGroup()
                                                                                    .addGap(
                                                                                        87,
                                                                                        87,
                                                                                        87)
                                                                                    .addGroup(
                                                                                        layout
                                                                                            .createParallelGroup(
                                                                                                javax
                                                                                                    .swing
                                                                                                    .GroupLayout
                                                                                                    .Alignment
                                                                                                    .LEADING)
                                                                                            .addComponent(
                                                                                                lb_IssueDay)
                                                                                            .addComponent(
                                                                                                lb_Authors)))
                                                                            .addGroup(
                                                                                layout
                                                                                    .createSequentialGroup()
                                                                                    .addGroup(
                                                                                        layout
                                                                                            .createParallelGroup(
                                                                                                javax
                                                                                                    .swing
                                                                                                    .GroupLayout
                                                                                                    .Alignment
                                                                                                    .LEADING)
                                                                                            .addGroup(
                                                                                                layout
                                                                                                    .createSequentialGroup()
                                                                                                    .addGap(
                                                                                                        167,
                                                                                                        167,
                                                                                                        167)
                                                                                                    .addGroup(layout
                                                                                                                  .createParallelGroup(
                                                                                                                      javax
                                                                                                                          .swing
                                                                                                                          .GroupLayout
                                                                                                                          .Alignment
                                                                                                                          .LEADING)
                                                                                                                  .addComponent(
                                                                                                                      txt_IssueDay,
                                                                                                                      javax
                                                                                                                          .swing
                                                                                                                          .GroupLayout
                                                                                                                          .PREFERRED_SIZE,
                                                                                                                      81,
                                                                                                                      javax
                                                                                                                          .swing
                                                                                                                          .GroupLayout
                                                                                                                          .PREFERRED_SIZE)
                                                                                                                  .addComponent(
                                                                                                                      txt_Authors,
                                                                                                                      javax
                                                                                                                          .swing
                                                                                                                          .GroupLayout
                                                                                                                          .PREFERRED_SIZE,
                                                                                                                      81,
                                                                                                                      javax
                                                                                                                          .swing
                                                                                                                          .GroupLayout
                                                                                                                          .PREFERRED_SIZE))
                                                                                                    .addGap(
                                                                                                        35,
                                                                                                        35,
                                                                                                        35))
                                                                                            .addGroup(
                                                                                                javax
                                                                                                    .swing
                                                                                                    .GroupLayout
                                                                                                    .Alignment
                                                                                                    .TRAILING,
                                                                                                layout
                                                                                                    .createSequentialGroup()
                                                                                                    .addGroup(
                                                                                                        layout
                                                                                                            .createParallelGroup(
                                                                                                                javax
                                                                                                                    .swing
                                                                                                                    .GroupLayout
                                                                                                                    .Alignment
                                                                                                                    .LEADING)
                                                                                                            .addComponent(
                                                                                                                rdo_Search)
                                                                                                            .addComponent(
                                                                                                                rdo_InsertNewspaper))
                                                                                                    .addGap(
                                                                                                        47,
                                                                                                        47,
                                                                                                        47)))
                                                                                    .addGroup(
                                                                                        layout
                                                                                            .createParallelGroup(
                                                                                                javax
                                                                                                    .swing
                                                                                                    .GroupLayout
                                                                                                    .Alignment
                                                                                                    .LEADING)
                                                                                            .addGroup(
                                                                                                layout
                                                                                                    .createSequentialGroup()
                                                                                                    .addGap(
                                                                                                        39,
                                                                                                        39,
                                                                                                        39)
                                                                                                    .addGroup(layout
                                                                                                                  .createParallelGroup(javax
                                                                                                                                           .swing
                                                                                                                                           .GroupLayout
                                                                                                                                           .Alignment
                                                                                                                                           .LEADING)
                                                                                                                  .addComponent(
                                                                                                                      rdo_Delete)
                                                                                                                  .addComponent(
                                                                                                                      rdo_InsertMegazine)))
                                                                                            .addGroup(layout
                                                                                                          .createSequentialGroup()
                                                                                                          .addGroup(layout
                                                                                                                        .createParallelGroup(
                                                                                                                            javax
                                                                                                                                .swing
                                                                                                                                .GroupLayout
                                                                                                                                .Alignment
                                                                                                                                .TRAILING)
                                                                                                                        .addComponent(
                                                                                                                            ptn_Filter)
                                                                                                                        .addGroup(layout
                                                                                                                                      .createSequentialGroup()
                                                                                                                                      .addGroup(layout
                                                                                                                                                    .createParallelGroup(
                                                                                                                                                        javax
                                                                                                                                                            .swing
                                                                                                                                                            .GroupLayout
                                                                                                                                                            .Alignment
                                                                                                                                                            .LEADING)
                                                                                                                                                    .addComponent(
                                                                                                                                                        lb_IssueMonth)
                                                                                                                                                    .addComponent(
                                                                                                                                                        lb_Title))
                                                                                                                                      .addPreferredGap(
                                                                                                                                          javax
                                                                                                                                              .swing
                                                                                                                                              .LayoutStyle
                                                                                                                                              .ComponentPlacement
                                                                                                                                              .RELATED)
                                                                                                                                      .addGroup(
                                                                                                                                          layout
                                                                                                                                              .createParallelGroup(
                                                                                                                                                  javax
                                                                                                                                                      .swing
                                                                                                                                                      .GroupLayout
                                                                                                                                                      .Alignment
                                                                                                                                                      .LEADING,
                                                                                                                                                  false)
                                                                                                                                              .addComponent(
                                                                                                                                                  txt_Title)
                                                                                                                                              .addComponent(
                                                                                                                                                  txt_IssueMonth,
                                                                                                                                                  javax
                                                                                                                                                      .swing
                                                                                                                                                      .GroupLayout
                                                                                                                                                      .PREFERRED_SIZE,
                                                                                                                                                  110,
                                                                                                                                                  javax
                                                                                                                                                      .swing
                                                                                                                                                      .GroupLayout
                                                                                                                                                      .PREFERRED_SIZE))))
                                                                                                          .addGap(
                                                                                                              18,
                                                                                                              18,
                                                                                                              18)
                                                                                                          .addGroup(
                                                                                                              layout
                                                                                                                  .createParallelGroup(
                                                                                                                      javax
                                                                                                                          .swing
                                                                                                                          .GroupLayout
                                                                                                                          .Alignment
                                                                                                                          .LEADING)
                                                                                                                  .addComponent(
                                                                                                                      lb_Publisher)
                                                                                                                  .addComponent(
                                                                                                                      lb_NumberOfPages))
                                                                                                          .addGap(
                                                                                                              18,
                                                                                                              18,
                                                                                                              18)
                                                                                                          .addGroup(layout
                                                                                                                        .createParallelGroup(
                                                                                                                            javax
                                                                                                                                .swing
                                                                                                                                .GroupLayout
                                                                                                                                .Alignment
                                                                                                                                .LEADING,
                                                                                                                            false)
                                                                                                                        .addComponent(
                                                                                                                            txt_Publisher)
                                                                                                                        .addComponent(txt_NumberOfPages,
                                                                                                                                      javax
                                                                                                                                          .swing
                                                                                                                                          .GroupLayout
                                                                                                                                          .PREFERRED_SIZE,
                                                                                                                                      144,
                                                                                                                                      javax
                                                                                                                                          .swing
                                                                                                                                          .GroupLayout
                                                                                                                                          .PREFERRED_SIZE)))))))))
                                            .addComponent(jScrollPane1))
                                    .addGap(77, 77, 77))))
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(lb_FitlerTitler)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_Filter,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                     Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel6)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Id)
                            .addComponent(lb_Authors)
                            .addComponent(lb_Title)
                            .addComponent(
                                txt_Title,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Publisher)
                            .addComponent(
                                txt_Publisher,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_Authors,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                txt_Filter,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_FitlerTitler)
                            .addComponent(ptn_Filter))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_IssueDay)
                            .addComponent(lb_PublishedQuantity)
                            .addComponent(lb_IssueMonth)
                            .addComponent(lb_NumberOfPages)
                            .addComponent(
                                txt_IssueDay,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_IssueMonth,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_PublishedQuantity,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                txt_NumberOfPages,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39,
                        Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdo_Delete)
                            .addComponent(rdo_Search)
                            .addComponent(rdo_Filter))
                    .addGap(20, 20, 20)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ptn_Exit)
                            .addComponent(rdo_InsertMegazine)
                            .addComponent(rdo_InsertNewspaper)
                            .addComponent(rdo_InsertBook))
                    .addGap(43, 43, 43)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jTextField1ActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_jTextField1ActionPerformed

  private void rdo_InsertMegazineActionPerformed(
      java.awt.event.ActionEvent
          evt) { // GEN-FIRST:event_rdo_InsertMegazineActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_rdo_InsertMegazineActionPerformed

  private void rdo_InsertNewspaperActionPerformed(
      java.awt.event.ActionEvent
          evt) { // GEN-FIRST:event_rdo_InsertNewspaperActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_rdo_InsertNewspaperActionPerformed

  private void rdo_InsertBookActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_InsertBookActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_rdo_InsertBookActionPerformed

  private void txt_PublishedQuantityActionPerformed(
      java.awt.event.ActionEvent
          evt) { // GEN-FIRST:event_txt_PublishedQuantityActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_PublishedQuantityActionPerformed

  private void txt_IssueDayActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_IssueDayActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_IssueDayActionPerformed

  private void txt_TitleActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_TitleActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_TitleActionPerformed

  private void txt_PublisherActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_PublisherActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_PublisherActionPerformed

  private void txt_NumberOfPagesActionPerformed(
      java.awt.event.ActionEvent
          evt) { // GEN-FIRST:event_txt_NumberOfPagesActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_NumberOfPagesActionPerformed

  private void txt_IssueMonthActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_IssueMonthActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_IssueMonthActionPerformed

  private void txt_IdActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_txt_IdActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_IdActionPerformed

  private void txt_AuthorsActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_AuthorsActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_AuthorsActionPerformed

  private void jTextField2ActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_jTextField2ActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_jTextField2ActionPerformed

  public void napDuLieu(ArrayList<Model> list) {
    while (DA.getRowCount() > 0) {
      DA.removeRow(0);
    }
    for (var m : list) {
      if (m instanceof Book) {

        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(), "",
                                "", "", ((Book)m).getNumOfPages()});

      } else if (m instanceof Megazine) {

        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(),
                                ((Megazine)m).getIssueNumber(), "",
                                ((Megazine)m).getIssueMonth(), ""});

      } else if (m instanceof Newspaper) {

        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(), "",
                                ((Newspaper)m).getIssueDay(), "", ""});
      }
    }
  }

  private void rdo_FilterActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_FilterActionPerformed
                              // TODO add your handling code here:
    lb_FitlerTitler.setVisible(true);
    txt_Filter.setVisible(true);
    ptn_Filter.setVisible(true);
  } // GEN-LAST:event_rdo_FilterActionPerformed

  private void rdo_InsertActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_InsertActionPerformed
                              // TODO add your handling code here:

  } // GEN-LAST:event_rdo_InsertActionPerformed

  private void rdo_DeleteActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_DeleteActionPerformed
                              // TODO add your handling code here:
  }                           // GEN-LAST:event_rdo_DeleteActionPerformed

  private void rdo_SearchActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_SearchActionPerformed
                              // TODO add your handling code here:
  }                           // GEN-LAST:event_rdo_SearchActionPerformed

  private void ptn_FilterActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_FilterActionPerformed
    // TODO add your handling code here:
    if (txt_Filter.getText().equalsIgnoreCase("sách"))

  } // GEN-LAST:event_ptn_FilterActionPerformed

  private void ptn_SearchActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_SearchActionPerformed
                              // TODO add your handling code here:
  }                           // GEN-LAST:event_ptn_SearchActionPerformed

  private void ptn_DeleteActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_DeleteActionPerformed
                              // TODO add your handling code here:
  }                           // GEN-LAST:event_ptn_DeleteActionPerformed

  private void ptn_InsertActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_InsertActionPerformed
                              // TODO add your handling code here:
  }                           // GEN-LAST:event_ptn_InsertActionPerformed

  private void
  ptn_ExitActionPerformed(java.awt.event.ActionEvent
                              evt) { // GEN-FIRST:event_ptn_ExitActionPerformed

  } // GEN-LAST:event_ptn_ExitActionPerformed

  private void
  jButton1ActionPerformed(java.awt.event.ActionEvent
                              evt) { // GEN-FIRST:event_jButton1ActionPerformed
                                     // TODO add your handling code here:
  }                                  // GEN-LAST:event_jButton1ActionPerformed

  private void
  jButton2ActionPerformed(java.awt.event.ActionEvent
                              evt) { // GEN-FIRST:event_jButton2ActionPerformed
                                     // TODO add your handling code here:
  }                                  // GEN-LAST:event_jButton2ActionPerformed

  private void
  jButton5ActionPerformed(java.awt.event.ActionEvent
                              evt) { // GEN-FIRST:event_jButton5ActionPerformed
                                     // TODO add your handling code here:
  }                                  // GEN-LAST:event_jButton5ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting
    // code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the
     * default look and feel. For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info :
           javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(ManagementBook.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ManagementBook.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ManagementBook.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ManagementBook.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() { new ManagementBook().setVisible(true); }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lb_Authors;
  private javax.swing.JLabel lb_FitlerTitler;
  private javax.swing.JLabel lb_Id;
  private javax.swing.JLabel lb_IssueDay;
  private javax.swing.JLabel lb_IssueMonth;
  private javax.swing.JLabel lb_NumberOfPages;
  private javax.swing.JLabel lb_PublishedQuantity;
  private javax.swing.JLabel lb_Publisher;
  private javax.swing.JLabel lb_Title;
  private javax.swing.JButton ptn_Exit;
  private javax.swing.JButton ptn_Filter;
  private javax.swing.JRadioButton rdo_Delete;
  private javax.swing.JRadioButton rdo_Filter;
  private javax.swing.JRadioButton rdo_InsertBook;
  private javax.swing.JRadioButton rdo_InsertMegazine;
  private javax.swing.JRadioButton rdo_InsertNewspaper;
  private javax.swing.JRadioButton rdo_Search;
  private javax.swing.JTable tbl_Table;
  private javax.swing.JTextField txt_Authors;
  private javax.swing.JTextField txt_Filter;
  private javax.swing.JTextField txt_Id;
  private javax.swing.JTextField txt_IssueDay;
  private javax.swing.JTextField txt_IssueMonth;
  private javax.swing.JTextField txt_NumberOfPages;
  private javax.swing.JTextField txt_PublishedQuantity;
  private javax.swing.JTextField txt_Publisher;
  private javax.swing.JTextField txt_Title;
  // End of variables declaration//GEN-END:variables
}
