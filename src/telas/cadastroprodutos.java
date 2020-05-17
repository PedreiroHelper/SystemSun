package telas;

import Entidades.Produto;
import conexao.bdprodutos;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author P4 Solutions
 */
public class cadastroprodutos extends javax.swing.JFrame {

    public cadastroprodutos() {
        initComponents();
        bdprodutos pdao = new bdprodutos();
        for (Produto arg : pdao.lercategoria()) {
            txtcategoria.addItem(arg);
        }
    }

    String imgPath = null;

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImageIcon != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }

        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(labelIMAGEM.getWidth(), labelIMAGEM.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtcnpj = new javax.swing.JTextField();
        txtfabricacao = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtestoqueatual = new javax.swing.JTextField();
        txtestoqueminimo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Código = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        categoria = new javax.swing.JLabel();
        cnpj = new javax.swing.JLabel();
        estilo = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        fabricacao = new javax.swing.JLabel();
        estoqueatual = new javax.swing.JLabel();
        estoqueminimo = new javax.swing.JLabel();
        txtestilo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelIMAGEM = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtcategoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        ImageIcon.setBackground(new java.awt.Color(255, 255, 255));
        ImageIcon.setPreferredSize(new java.awt.Dimension(1105, 596));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telalogin1.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo menor.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cliente.jpg"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estoque.jpg"))); // NOI18N

        jLabel4.setText("Cadastrar Produtos");

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtfabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfabricacaoActionPerformed(evt);
            }
        });

        txtmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarcaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(4, 4, 4));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Código.setText("Código");

        jLabel6.setText("Nome");

        categoria.setText("Categoria");

        cnpj.setText("CNPJ/Fornecedor");

        estilo.setText("Estilo");

        marca.setText("Marca");

        fabricacao.setText("Fabricação");

        estoqueatual.setText("Estoque atual");

        estoqueminimo.setText("Estoque Mínimo");

        txtestilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quadrado", "Retangular", "Redondo", "Gatinho", "Borboleta", "Irregular", "Oval", "Wayfarer", "Clubmaster" }));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar.jpg"))); // NOI18N
        jLabel7.setText("Voltar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.jpg"))); // NOI18N
        jLabel5.setText("Home");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(4, 4, 4));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelIMAGEM.setText("                                        Imagem");

        jButton3.setBackground(new java.awt.Color(4, 4, 4));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Adicionar uma foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(4, 4, 4));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------" }));
        txtcategoria.setToolTipText("");
        txtcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriaActionPerformed(evt);
            }
        });

        jLabel8.setText("OBS: Para pesquisar um Produto basta digitar o Cógido e clicar no botão Pesquisar ");

        javax.swing.GroupLayout ImageIconLayout = new javax.swing.GroupLayout(ImageIcon);
        ImageIcon.setLayout(ImageIconLayout);
        ImageIconLayout.setHorizontalGroup(
            ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ImageIconLayout.createSequentialGroup()
                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ImageIconLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ImageIconLayout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(6, 6, 6)
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2935, 2935, 2935))
                                    .addGroup(ImageIconLayout.createSequentialGroup()
                                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(ImageIconLayout.createSequentialGroup()
                                                .addComponent(categoria)
                                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(ImageIconLayout.createSequentialGroup()
                                                        .addGap(57, 57, 57)
                                                        .addComponent(cnpj)
                                                        .addGap(57, 57, 57)
                                                        .addComponent(estilo))
                                                    .addGroup(ImageIconLayout.createSequentialGroup()
                                                        .addGap(210, 210, 210)
                                                        .addComponent(jLabel11)))))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ImageIconLayout.createSequentialGroup()
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Código, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ImageIconLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2905, 2905, 2905))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2697, 2697, 2697))))
                    .addGroup(ImageIconLayout.createSequentialGroup()
                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ImageIconLayout.createSequentialGroup()
                                .addGap(500, 500, 500)
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(ImageIconLayout.createSequentialGroup()
                                        .addComponent(txtestilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(marca)
                                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fabricacao))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(estoqueatual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtestoqueatual, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(estoqueminimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtestoqueminimo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(ImageIconLayout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(ImageIconLayout.createSequentialGroup()
                                        .addComponent(labelIMAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton3)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ImageIconLayout.setVerticalGroup(
            ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageIconLayout.createSequentialGroup()
                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ImageIconLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ImageIconLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3))
                            .addGroup(ImageIconLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))))))
                    .addGroup(ImageIconLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(100, 100, 100)
                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ImageIconLayout.createSequentialGroup()
                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estilo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Código)
                                .addComponent(jLabel6)
                                .addComponent(categoria)
                                .addComponent(cnpj)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createSequentialGroup()
                            .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(estoqueatual)
                                .addComponent(estoqueminimo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtestoqueatual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtestoqueminimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marca)
                            .addGroup(ImageIconLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtestilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageIconLayout.createSequentialGroup()
                            .addComponent(fabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39))
                        .addComponent(txtfabricacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ImageIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIMAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ImageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImageIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed

    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtfabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfabricacaoActionPerformed

    }//GEN-LAST:event_txtfabricacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtcodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Código obrigatório");
            return;

        }
        if (txtnome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome obrigatório");
            return;

        }
        if (txtcnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo CNPJ/Forcenedor obrigatório");
            return;

        }
        if (txtmarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Marca obrigatório");
            return;

        }
        if (txtfabricacao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Fabricação obrigatório");
            return;

        }
        if (txtestoqueatual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Estoque autal obrigatório");
            return;

        }
        if (txtestoqueminimo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Estoque mínimo obrigatório");
            return;
        }

        Produto arg = new Produto();

        arg.setCodigo(Integer.parseInt(txtcodigo.getText()));
        arg.setNome(txtnome.getText());
        arg.setCnpj(txtcnpj.getText());
        arg.setCategoria(txtcategoria.getSelectedIndex());
        arg.setEstilo((String) txtestilo.getSelectedItem());
        arg.setMarca(txtmarca.getText());
        arg.setFabricacao(txtfabricacao.getText());
        arg.setEstoqueatual(Integer.parseInt(txtestoqueatual.getText()));
        arg.setEstoqueminimo(Integer.parseInt(txtestoqueminimo.getText()));
        arg.setImagem(imgPath);

        bdprodutos dao = new bdprodutos();
        dao.cadastrarproduto(arg);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        new Produtos().setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        new dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarcaActionPerformed

    }//GEN-LAST:event_txtmarcaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (txtcodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Código obrigatório");
            return;

        }
        if (txtnome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome obrigatório");
            return;

        }
        if (txtcnpj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo CNPJ/Forcenedor obrigatório");
            return;

        }
        if (txtmarca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Marca obrigatório");
            return;

        }
        if (txtfabricacao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Fabricação obrigatório");
            return;

        }
        if (txtestoqueatual.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Estoque autal obrigatório");
            return;

        }
        if (txtestoqueminimo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Estoque mínimo obrigatório");
            return;
        }
        if (txtestoqueminimo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Estoque mínimo obrigatório");
            return;
        }

        Produto arg = new Produto();

        arg.setCodigo(Integer.parseInt(txtcodigo.getText()));
        arg.setNome(txtnome.getText());
        arg.setCategoria(txtcategoria.getSelectedIndex());
        arg.setCnpj(txtcnpj.getText());
        arg.setEstilo((String) txtestilo.getSelectedItem());
        arg.setMarca(txtmarca.getText());
        arg.setFabricacao(txtfabricacao.getText());
        arg.setEstoqueatual(Integer.parseInt(txtestoqueatual.getText()));
        arg.setEstoqueminimo(Integer.parseInt(txtestoqueminimo.getText()));
        arg.setImagem(imgPath);

        bdprodutos dao = new bdprodutos();
        dao.atualizarproduto(arg);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            labelIMAGEM.setIcon(ResizeImage(path, null));
            imgPath = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "A imagem é invalida");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ResultSet rs = null;
        String host = "localhost";
        String user = "root";
        String password = "";
        String db = "suninventory";
        try {
            if (txtcodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo Código do produto obrigatório");
                return;

            }

            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, password);
            connection.setAutoCommit(false);
            PreparedStatement stmt = connection.prepareStatement("select * from produtos where cod_produto = ? ");
            stmt.setString(1, txtcodigo.getText());
            rs = stmt.executeQuery();
            while (rs.next()) {

                txtcodigo.setText(rs.getString("cod_produto"));
                txtnome.setText(rs.getString("nome"));
                txtcategoria.setSelectedIndex(rs.getInt("cod_categoria"));
                txtcnpj.setText(rs.getString("cnpj"));
                txtestilo.setSelectedItem(rs.getString("estilo"));
                txtmarca.setText(rs.getString("marca"));
                txtfabricacao.setText(rs.getString("data_fabricacao"));
                txtestoqueatual.setText(rs.getString("estoque_atual"));
                txtestoqueminimo.setText(rs.getString("estoque_minimo"));
                labelIMAGEM.setIcon(new javax.swing.ImageIcon(rs.getString("imagem")));

            }

            connection.commit();
            connection.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao consultar");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriaActionPerformed

    }//GEN-LAST:event_txtcategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroprodutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroprodutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Código;
    private javax.swing.JPanel ImageIcon;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel cnpj;
    private javax.swing.JLabel estilo;
    private javax.swing.JLabel estoqueatual;
    private javax.swing.JLabel estoqueminimo;
    private javax.swing.JLabel fabricacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelIMAGEM;
    private javax.swing.JLabel marca;
    private javax.swing.JComboBox<Object> txtcategoria;
    private javax.swing.JTextField txtcnpj;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JComboBox<String> txtestilo;
    private javax.swing.JTextField txtestoqueatual;
    private javax.swing.JTextField txtestoqueminimo;
    private javax.swing.JTextField txtfabricacao;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
