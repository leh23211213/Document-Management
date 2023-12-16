package View;

import static java.util.Spliterators.iterator;

import Controller.ModelsController;
import DataAccess.FileAccess;
import DataAccess.IDataAccess;
import Models.Book;
import Models.Megazine;
import Models.Model;
import Models.Newspaper;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagementBook extends javax.swing.JFrame {

  DefaultTableModel DA = new DefaultTableModel();
  ArrayList<Model> list = new ArrayList<>();

  public ManagementBook() {
    initComponents();
    tbl_Table.setModel(DA);
    String ext =
        "E:\\IT\\VSCode\\Github\\Document-Management\\src\\getData.txt";
    IDataAccess context = new FileAccess(ext);
    ModelsController controller = new ModelsController(context);
    this.list = controller.Repository.list();
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
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(false);
    txt_Filter.setVisible(false);
    ptn_Filter.setVisible(false);
    ptn_Search.setVisible(false);
    txt_Search.setVisible(false);
    lb_Search.setVisible(false);
    ptn_Delete.setVisible(false);
    txt_Delete.setVisible(false);
    lb_Delete.setVisible(false);
    ptn_InsertNext.setVisible(false);
    lb_Insert.setVisible(false);
    txt_Insert.setVisible(false);
    ptn_Insert.setVisible(false);
  }

  @SuppressWarnings("unchecked")

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
    rdo_Insert = new javax.swing.JRadioButton();
    rdo_Delete = new javax.swing.JRadioButton();
    rdo_Search = new javax.swing.JRadioButton();
    rdo_Filter = new javax.swing.JRadioButton();
    txt_Filter = new javax.swing.JTextField();
    lb_FitlerTitler = new javax.swing.JLabel();
    ptn_ReSet = new javax.swing.JButton();
    ptn_Filter = new javax.swing.JButton();
    txt_Search = new javax.swing.JTextField();
    ptn_Search = new javax.swing.JButton();
    lb_Search = new javax.swing.JLabel();
    lb_Delete = new javax.swing.JLabel();
    txt_Delete = new javax.swing.JTextField();
    ptn_Delete = new javax.swing.JButton();
    lb_Insert = new javax.swing.JLabel();
    txt_Insert = new javax.swing.JTextField();
    ptn_InsertNext = new javax.swing.JButton();
    ptn_Insert = new javax.swing.JButton();
    lb_IssueNumber = new javax.swing.JLabel();
    txt_IssueNumber = new javax.swing.JTextField();

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

    buttonGroup1.add(rdo_Insert);
    rdo_Insert.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    rdo_Insert.setText("Thêm");
    rdo_Insert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rdo_InsertActionPerformed(evt);
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
    txt_Filter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_FilterActionPerformed(evt);
      }
    });

    lb_FitlerTitler.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_FitlerTitler.setText("Lọc theo \"sách\",\"báo\",\"tạp chí\" ?");

    ptn_ReSet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ptn_ReSet.setText("RESTART");
    ptn_ReSet.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_ReSetActionPerformed(evt);
      }
    });

    ptn_Filter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ptn_Filter.setText("Lọc");
    ptn_Filter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_FilterActionPerformed(evt);
      }
    });

    txt_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_Search.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_SearchActionPerformed(evt);
      }
    });

    ptn_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ptn_Search.setText("Tìm");
    ptn_Search.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_SearchActionPerformed(evt);
      }
    });

    lb_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Search.setText("Nhập tài liệu cần tìm theo ID:");

    lb_Delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Delete.setText("Nhập tài liệu cần xóa theo ID:");

    txt_Delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_Delete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_DeleteActionPerformed(evt);
      }
    });

    ptn_Delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ptn_Delete.setText("Xóa");
    ptn_Delete.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_DeleteActionPerformed(evt);
      }
    });

    lb_Insert.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_Insert.setText("Muốn thêm \"sách\",\"báo\",\"tạp chí\" ?");

    txt_Insert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    txt_Insert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_InsertActionPerformed(evt);
      }
    });

    ptn_InsertNext.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ptn_InsertNext.setText("Next");
    ptn_InsertNext.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_InsertNextActionPerformed(evt);
      }
    });

    ptn_Insert.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    ptn_Insert.setText("Thêm");
    ptn_Insert.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ptn_InsertActionPerformed(evt);
      }
    });

    lb_IssueNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    lb_IssueNumber.setText("Số PH:");

    txt_IssueNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    txt_IssueNumber.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txt_IssueNumberActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout =
        new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                      layout.createSequentialGroup()
                          .addContainerGap()
                          .addComponent(jScrollPane1)
                          .addGap(20, 20, 20))
            .addGroup(
                layout.createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGap(321, 321, 321)
                                    .addComponent(
                                        jLabel6,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        623,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addGap(221, 221, 221)
                                                    .addComponent(rdo_Filter)
                                                    .addGap(86, 86, 86)
                                                    .addComponent(rdo_Search)
                                                    .addGap(154, 154, 154)
                                                    .addComponent(rdo_Delete)
                                                    .addGap(123, 123, 123)
                                                    .addComponent(rdo_Insert))
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addGap(65, 65, 65)
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
                                                                    .addComponent(
                                                                        lb_Insert)
                                                                    .addGap(18,
                                                                            18,
                                                                            18)
                                                                    .addComponent(
                                                                        txt_Insert,
                                                                        javax
                                                                            .swing
                                                                            .GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        112,
                                                                        javax
                                                                            .swing
                                                                            .GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addGap(51,
                                                                            51,
                                                                            51)
                                                                    .addComponent(
                                                                        ptn_InsertNext))
                                                            .addGroup(
                                                                layout
                                                                    .createSequentialGroup()
                                                                    .addComponent(
                                                                        lb_FitlerTitler)
                                                                    .addPreferredGap(
                                                                        javax
                                                                            .swing
                                                                            .LayoutStyle
                                                                            .ComponentPlacement
                                                                            .UNRELATED)
                                                                    .addComponent(
                                                                        txt_Filter,
                                                                        javax
                                                                            .swing
                                                                            .GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        112,
                                                                        javax
                                                                            .swing
                                                                            .GroupLayout
                                                                            .PREFERRED_SIZE)
                                                                    .addGap(51,
                                                                            51,
                                                                            51)
                                                                    .addComponent(
                                                                        ptn_Filter)))
                                                    .addGap(38, 38, 38)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .TRAILING)
                                                            .addComponent(
                                                                lb_Search)
                                                            .addComponent(
                                                                lb_Delete))
                                                    .addGap(35, 35, 35)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .TRAILING)
                                                            .addComponent(
                                                                txt_Search,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                115,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(
                                                                txt_Delete,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                115,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addGap(40, 40, 40)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                ptn_Search,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                90,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(
                                                                ptn_Delete,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                90,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE))))
                                    .addGap(259, 259, 259)
                                    .addGroup(layout
                                                  .createParallelGroup(
                                                      javax.swing.GroupLayout
                                                          .Alignment.LEADING)
                                                  .addComponent(ptn_ReSet)
                                                  .addComponent(ptn_Exit))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                     Short.MAX_VALUE))
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(52, 52, 52)
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
                                                          .PREFERRED_SIZE)))
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGap(231, 231, 231)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                    .addComponent(lb_Authors)
                                                    .addGap(14, 14, 14))
                                            .addGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                    .addComponent(lb_IssueDay)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .RELATED)))
                                    .addGroup(layout
                                                  .createParallelGroup(
                                                      javax.swing.GroupLayout
                                                          .Alignment.LEADING)
                                                  .addComponent(
                                                      txt_IssueDay,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE,
                                                      99,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE)
                                                  .addComponent(
                                                      txt_Authors,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE,
                                                      99,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE))
                                    .addGap(62, 62, 62)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING,
                                                false)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addComponent(lb_IssueMonth)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .RELATED)
                                                    .addComponent(
                                                        txt_IssueMonth,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE,
                                                        110,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE))
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addComponent(lb_Title)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout
                                                            .DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addComponent(
                                                        txt_Title,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE,
                                                        130,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE)))
                                    .addGap(67, 67, 67)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addComponent(lb_Publisher)
                                            .addComponent(lb_NumberOfPages))
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(
                                                        txt_NumberOfPages,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE,
                                                        144,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE))
                                            .addGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(
                                                        txt_Publisher,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE,
                                                        144,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE)))))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82,
                        Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                          .addGap(26, 26, 26)
                                          .addComponent(ptn_Insert))
                            .addGroup(layout.createSequentialGroup()
                                          .addComponent(lb_IssueNumber)
                                          .addPreferredGap(
                                              javax.swing.LayoutStyle
                                                  .ComponentPlacement.UNRELATED)
                                          .addComponent(txt_IssueNumber,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE,
                                                        86,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE)))
                    .addGap(309, 309, 309)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel6)
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane1,
                                  javax.swing.GroupLayout.PREFERRED_SIZE, 256,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                layout.createSequentialGroup().addGap(2, 2, 2).addGroup(
                                    layout
                                        .createParallelGroup(
                                            javax.swing.GroupLayout.Alignment
                                                .LEADING)
                                        .addGroup(
                                            layout.createSequentialGroup()
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(lb_Id)
                                                        .addComponent(
                                                            txt_Id,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(
                                                            lb_PublishedQuantity)
                                                        .addComponent(
                                                            txt_PublishedQuantity,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE)))
                                        .addGroup(
                                            layout.createSequentialGroup()
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(
                                                            lb_Publisher)
                                                        .addComponent(
                                                            txt_Publisher,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(
                                                            lb_NumberOfPages)
                                                        .addComponent(
                                                            txt_NumberOfPages,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE)))
                                        .addGroup(
                                            layout.createSequentialGroup()
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(lb_Title)
                                                        .addComponent(
                                                            txt_Title,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(
                                                            lb_IssueMonth)
                                                        .addComponent(
                                                            txt_IssueMonth,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE)))
                                        .addGroup(
                                            layout.createSequentialGroup()
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(
                                                            lb_Authors)
                                                        .addComponent(
                                                            txt_Authors,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE))
                                                .addGap(44, 44, 44)
                                                .addGroup(
                                                    layout
                                                        .createParallelGroup(
                                                            javax.swing
                                                                .GroupLayout
                                                                .Alignment
                                                                .BASELINE)
                                                        .addComponent(
                                                            lb_IssueDay)
                                                        .addComponent(
                                                            txt_IssueDay,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .DEFAULT_SIZE,
                                                            javax.swing
                                                                .GroupLayout
                                                                .PREFERRED_SIZE)))))
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGroup(layout
                                                  .createParallelGroup(
                                                      javax.swing.GroupLayout
                                                          .Alignment.BASELINE)
                                                  .addComponent(lb_IssueNumber)
                                                  .addComponent(
                                                      txt_IssueNumber,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addComponent(ptn_Insert)
                                    .addGap(1, 1, 1)))
                    .addGap(63, 63, 63)
                    .addGroup(
                        layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGroup(layout
                                                  .createParallelGroup(
                                                      javax.swing.GroupLayout
                                                          .Alignment.BASELINE)
                                                  .addComponent(
                                                      txt_Insert,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE,
                                                      javax.swing.GroupLayout
                                                          .DEFAULT_SIZE,
                                                      javax.swing.GroupLayout
                                                          .PREFERRED_SIZE)
                                                  .addComponent(lb_Insert)
                                                  .addComponent(ptn_InsertNext))
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout
                                                            .DEFAULT_SIZE,
                                                        Short.MAX_VALUE)
                                                    .addComponent(ptn_ReSet)
                                                    .addGap(18, 18, 18))
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .BASELINE)
                                                            .addComponent(
                                                                txt_Filter,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(
                                                                lb_FitlerTitler)
                                                            .addComponent(
                                                                ptn_Filter))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .RELATED,
                                                        javax.swing.GroupLayout
                                                            .DEFAULT_SIZE,
                                                        Short.MAX_VALUE))))
                            .addGroup(
                                layout.createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout
                                                    .Alignment.LEADING)
                                            .addGroup(
                                                layout.createSequentialGroup()
                                                    .addComponent(ptn_Delete)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle
                                                            .ComponentPlacement
                                                            .RELATED)
                                                    .addGroup(
                                                        layout
                                                            .createParallelGroup(
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .Alignment
                                                                    .BASELINE)
                                                            .addComponent(
                                                                txt_Search,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing
                                                                    .GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(
                                                                ptn_Search)
                                                            .addComponent(
                                                                lb_Search)))
                                            .addGroup(
                                                layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout
                                                            .Alignment.BASELINE)
                                                    .addComponent(
                                                        txt_Delete,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE,
                                                        javax.swing.GroupLayout
                                                            .DEFAULT_SIZE,
                                                        javax.swing.GroupLayout
                                                            .PREFERRED_SIZE)
                                                    .addComponent(lb_Delete)))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle
                                            .ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)))
                    .addGroup(layout
                                  .createParallelGroup(
                                      javax.swing.GroupLayout.Alignment.LEADING)
                                  .addGroup(layout
                                                .createParallelGroup(
                                                    javax.swing.GroupLayout
                                                        .Alignment.BASELINE)
                                                .addComponent(rdo_Delete)
                                                .addComponent(rdo_Search)
                                                .addComponent(rdo_Filter)
                                                .addComponent(rdo_Insert))
                                  .addComponent(ptn_Exit))
                    .addContainerGap()));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void txt_IssueNumberActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_IssueNumberActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_IssueNumberActionPerformed

  private void ptn_InsertActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_InsertActionPerformed
    String id = txt_Id.getText().replaceAll(" ", "");
    int check = 0;
    for (var m : list) {
      if (m.getId().equals(id)) {
        check++;
      }
    }
    if (check != 0) {
      JOptionPane.showMessageDialog(null, "không được thêm trùng mã tài liệu");
    } else {
      String authors = txt_Authors.getText().replaceAll(" ", "");
      String title = txt_Title.getText().replaceAll(" ", "");
      String publisher = txt_Publisher.getText().replaceAll(" ", "");
      int publishedQuantity = Integer.parseInt(txt_PublishedQuantity.getText());
      if (id.charAt(0) == 'B') {
        int numberOfPages = Integer.parseInt(txt_NumberOfPages.getText());
        list.add(new Book(id, authors, title, publisher, publishedQuantity,
                          numberOfPages));
      } else if (id.charAt(0) == 'M') {
        int issueNumber = Integer.parseInt(txt_IssueNumber.getText());
        int issueMonth = Integer.parseInt(txt_IssueMonth.getText());

        list.add(new Megazine(id, authors, title, publisher, publishedQuantity,
                              issueNumber, issueMonth));
      } else if (id.charAt(0) == 'N') {
        int issueDay = Integer.parseInt(txt_IssueDay.getText());
        list.add(new Newspaper(id, authors, title, publisher, publishedQuantity,
                               issueDay));
      } else {
        JOptionPane.showMessageDialog(
            null, "Phải nhập mã tài liệu đúng quy chuẩn 'B--' 'M--' 'N--'!");
      }
    }
    napDuLieu(list);
  } // GEN-LAST:event_ptn_InsertActionPerformed

  private void txt_InsertActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_InsertActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_InsertActionPerformed

  private void ptn_InsertNextActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_InsertNextActionPerformed
    String key1 = "sách";
    String key2 = "tạpchí";
    String key3 = "báo";
    String text = txt_Insert.getText().replaceAll(" ", "");
    if (text.equals(key1)) {
      insertBook();
    } else if (text.equals(key2)) {
      insertMegazine();
    } else if (text.equals(key3)) {
      insertNewspaper();
    } else {
      JOptionPane.showMessageDialog(null, "Không tồn tại loại cần thêm");
    }

  } // GEN-LAST:event_ptn_InsertNextActionPerformed

  private void insertBook() {
    lb_Id.setVisible(true);
    txt_Id.setVisible(true);
    lb_Authors.setVisible(true);
    txt_Authors.setVisible(true);
    lb_Title.setVisible(true);
    txt_Title.setVisible(true);
    lb_Publisher.setVisible(true);
    txt_Publisher.setVisible(true);
    lb_PublishedQuantity.setVisible(true);
    txt_PublishedQuantity.setVisible(true);
    lb_IssueNumber.setVisible(true);
    txt_IssueNumber.setVisible(true);
    lb_NumberOfPages.setVisible(true);
    txt_NumberOfPages.setVisible(true);
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    ptn_Insert.setVisible(true);
  }
  private void insertMegazine() {
    lb_Id.setVisible(true);
    txt_Id.setVisible(true);
    lb_Authors.setVisible(true);
    txt_Authors.setVisible(true);
    lb_Title.setVisible(true);
    txt_Title.setVisible(true);
    lb_Publisher.setVisible(true);
    txt_Publisher.setVisible(true);
    lb_PublishedQuantity.setVisible(true);
    txt_PublishedQuantity.setVisible(true);
    lb_IssueNumber.setVisible(true);
    txt_IssueNumber.setVisible(true);
    lb_IssueNumber.setVisible(true);
    txt_IssueNumber.setVisible(true);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    ptn_Insert.setVisible(true);
  }
  private void insertNewspaper() {
    lb_Id.setVisible(true);
    txt_Id.setVisible(true);
    lb_Authors.setVisible(true);
    txt_Authors.setVisible(true);
    lb_Title.setVisible(true);
    txt_Title.setVisible(true);
    lb_Publisher.setVisible(true);
    txt_Publisher.setVisible(true);
    lb_PublishedQuantity.setVisible(true);
    txt_PublishedQuantity.setVisible(true);
    lb_IssueNumber.setVisible(true);
    txt_IssueNumber.setVisible(true);
    lb_IssueDay.setVisible(true);
    txt_IssueDay.setVisible(true);
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    ptn_Insert.setVisible(true);
  }

  private void txt_DeleteActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_DeleteActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_DeleteActionPerformed

  private void ptn_DeleteActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_DeleteActionPerformed
    // TODO add your handling code here:
    String key = txt_Delete.getText().replaceAll(" ", "");
    Delete(key);
  }
  // GEN-LAST:event_ptn_DeleteActionPerformed
  private void Delete(String key) {
    for (var m : list) {
      if (m.getId().equals(key)) {
        list.remove(m);
        break;
      }
      //   } else {
      //     break;
      //   }
    }
    napDuLieu(list);
  }

  private void ptn_SearchActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_SearchActionPerformed
    // TODO add your handling code here:
    String key = txt_Search.getText().replaceAll(" ", "");
    searchData(key);
  } // GEN-LAST:event_ptn_SearchActionPerformed

  private void searchData(String key) {
    while (DA.getRowCount() > 0) {
      DA.removeRow(0);
    }
    for (var m : list) {
      if (m.getId().equals(key) && key.charAt(0) == 'B') {
        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(), "",
                                "", "", ((Book)m).getNumOfPages()});
        break;
      } else if (m.getId().equals(key) && key.charAt(0) == 'M') {
        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(),
                                ((Megazine)m).getIssueNumber(), "",
                                ((Megazine)m).getIssueMonth(), ""});
        break;
      } else if (m.getId().equals(key) && key.charAt(0) == 'N') {
        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(), "",
                                ((Newspaper)m).getIssueDay(), "", ""});
        break;
      }
    }
    if (DA.getRowCount() == 0)
      JOptionPane.showMessageDialog(null, "Không tìm thấy");
  }

  private void txt_SearchActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_SearchActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_SearchActionPerformed

  private void ptn_FilterActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_FilterActionPerformed
    // TODO add your handling code here:
    String key1 = "sách";
    String key2 = "tạpchí";
    String key3 = "báo";
    String text = txt_Filter.getText().replaceAll(" ", "");
    if (text.equals(key1)) {
      napDuLieuSach(list);
    } else if (text.equals(key2)) {
      napDuLieuBao(list);
    } else if (text.equals(key3)) {
      napDuLieuTapChi(list);
    } else {
      JOptionPane.showMessageDialog(null, "Không tìm thấy");
    }
  } // GEN-LAST:event_ptn_FilterActionPerformed

  private void txt_FilterActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_txt_FilterActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_txt_FilterActionPerformed

  private void ptn_ReSetActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_ptn_ReSetActionPerformed
    // TODO add your handling code here:
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
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(false);
    txt_Filter.setVisible(false);
    ptn_Filter.setVisible(false);
    ptn_Search.setVisible(false);
    txt_Search.setVisible(false);
    lb_Search.setVisible(false);
    ptn_Delete.setVisible(false);
    txt_Delete.setVisible(false);
    lb_Delete.setVisible(false);
    ptn_InsertNext.setVisible(false);
    lb_Insert.setVisible(false);
    txt_Insert.setVisible(false);
    ptn_Insert.setVisible(false);
  } // GEN-LAST:event_ptn_ReSetActionPerformed

  private void jTextField1ActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_jTextField1ActionPerformed

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
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(true);
    txt_Filter.setVisible(true);
    ptn_Filter.setVisible(true);
    ptn_Search.setVisible(false);
    txt_Search.setVisible(false);
    lb_Search.setVisible(false);
    ptn_Delete.setVisible(false);
    txt_Delete.setVisible(false);
    lb_Delete.setVisible(false);
    ptn_InsertNext.setVisible(false);
    lb_Insert.setVisible(false);
    txt_Insert.setVisible(false);
    ptn_Insert.setVisible(false);
  } // GEN-LAST:event_rdo_FilterActionPerformed

  private void rdo_InsertActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_InsertActionPerformed
    // TODO add your handling code here:
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
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(false);
    txt_Filter.setVisible(false);
    ptn_Filter.setVisible(false);
    ptn_Search.setVisible(false);
    txt_Search.setVisible(false);
    lb_Search.setVisible(false);
    ptn_Delete.setVisible(false);
    txt_Delete.setVisible(false);
    lb_Delete.setVisible(false);
    ptn_InsertNext.setVisible(true);
    lb_Insert.setVisible(true);
    txt_Insert.setVisible(true);
    ptn_Insert.setVisible(false);
  } // GEN-LAST:event_rdo_InsertActionPerformed

  private void rdo_DeleteActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_DeleteActionPerformed
    // TODO add your handling code here:
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
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(false);
    txt_Filter.setVisible(false);
    ptn_Filter.setVisible(false);
    ptn_Search.setVisible(false);
    txt_Search.setVisible(false);
    lb_Search.setVisible(false);
    ptn_Delete.setVisible(true);
    txt_Delete.setVisible(true);
    lb_Delete.setVisible(true);
    ptn_InsertNext.setVisible(false);
    lb_Insert.setVisible(false);
    txt_Insert.setVisible(false);
    ptn_Insert.setVisible(false);
  } // GEN-LAST:event_rdo_DeleteActionPerformed

  private void rdo_SearchActionPerformed(
      java.awt.event
          .ActionEvent evt) { // GEN-FIRST:event_rdo_SearchActionPerformed
    // TODO add your handling code here:
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
    lb_IssueNumber.setVisible(false);
    txt_IssueNumber.setVisible(false);
    lb_IssueDay.setVisible(false);
    txt_IssueDay.setVisible(false);
    lb_IssueMonth.setVisible(false);
    txt_IssueMonth.setVisible(false);
    lb_NumberOfPages.setVisible(false);
    txt_NumberOfPages.setVisible(false);
    lb_FitlerTitler.setVisible(false);
    txt_Filter.setVisible(false);
    ptn_Filter.setVisible(false);
    ptn_Search.setVisible(true);
    txt_Search.setVisible(true);
    lb_Search.setVisible(true);
    ptn_Delete.setVisible(false);
    txt_Delete.setVisible(false);
    lb_Delete.setVisible(false);
    ptn_InsertNext.setVisible(false);
    lb_Insert.setVisible(false);
    txt_Insert.setVisible(false);
    ptn_Insert.setVisible(false);
  } // GEN-LAST:event_rdo_SearchActionPerformed

  public void napDuLieuSach(ArrayList<Model> list) {
    while (DA.getRowCount() > 0) {
      DA.removeRow(0);
    }
    for (var m : list) {
      if (m instanceof Book) {
        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(), "",
                                "", "", ((Book)m).getNumOfPages()});
      }
    }
  }
  public void napDuLieuBao(ArrayList<Model> list) {
    while (DA.getRowCount() > 0) {
      DA.removeRow(0);
    }
    for (var m : list) {
      if (m instanceof Newspaper) {
        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(), "",
                                ((Newspaper)m).getIssueDay(), "", ""});
      }
    }
  }
  public void napDuLieuTapChi(ArrayList<Model> list) {
    while (DA.getRowCount() > 0) {
      DA.removeRow(0);
    }
    for (var m : list) {
      if (m instanceof Megazine) {
        DA.addRow(new Object[] {m.getId(), m.getAuthors(), m.getTitle(),
                                m.getPublisher(), m.getPublishedQuantity(),
                                ((Megazine)m).getIssueNumber(), "",
                                ((Megazine)m).getIssueMonth(), ""});
      }
    }
  }

  private void
  ptn_ExitActionPerformed(java.awt.event.ActionEvent
                              evt) { // GEN-FIRST:event_ptn_ExitActionPerformed
    System.exit(0);
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
  private javax.swing.JLabel lb_Delete;
  private javax.swing.JLabel lb_FitlerTitler;
  private javax.swing.JLabel lb_Id;
  private javax.swing.JLabel lb_Insert;
  private javax.swing.JLabel lb_IssueDay;
  private javax.swing.JLabel lb_IssueMonth;
  private javax.swing.JLabel lb_IssueNumber;
  private javax.swing.JLabel lb_NumberOfPages;
  private javax.swing.JLabel lb_PublishedQuantity;
  private javax.swing.JLabel lb_Publisher;
  private javax.swing.JLabel lb_Search;
  private javax.swing.JLabel lb_Title;
  private javax.swing.JButton ptn_Delete;
  private javax.swing.JButton ptn_Exit;
  private javax.swing.JButton ptn_Filter;
  private javax.swing.JButton ptn_Insert;
  private javax.swing.JButton ptn_InsertNext;
  private javax.swing.JButton ptn_ReSet;
  private javax.swing.JButton ptn_Search;
  private javax.swing.JRadioButton rdo_Delete;
  private javax.swing.JRadioButton rdo_Filter;
  private javax.swing.JRadioButton rdo_Insert;
  private javax.swing.JRadioButton rdo_Search;
  private javax.swing.JTable tbl_Table;
  private javax.swing.JTextField txt_Authors;
  private javax.swing.JTextField txt_Delete;
  private javax.swing.JTextField txt_Filter;
  private javax.swing.JTextField txt_Id;
  private javax.swing.JTextField txt_Insert;
  private javax.swing.JTextField txt_IssueDay;
  private javax.swing.JTextField txt_IssueMonth;
  private javax.swing.JTextField txt_IssueNumber;
  private javax.swing.JTextField txt_NumberOfPages;
  private javax.swing.JTextField txt_PublishedQuantity;
  private javax.swing.JTextField txt_Publisher;
  private javax.swing.JTextField txt_Search;
  private javax.swing.JTextField txt_Title;
  // End of variables declaration//GEN-END:variables
}
