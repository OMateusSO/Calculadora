import javax.lang.model.type.NullType;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    Double val1, val2, res;
    String sinal;

    @SuppressWarnings("unchecked")

    private void initComponents() {

        txtRes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        txtRes.setFont(new java.awt.Font("Arial Black", 0, 18));
        txtRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResActionPerformed(evt);
            }
        });

        jButton1.setText("7");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("8");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("9");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("CE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("5");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("6");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(".");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("/");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("2");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("3");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("=");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("*");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("0");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton18.setText("C");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton20.setText("-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                                        .createSequentialGroup()
                                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jButton11,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                66,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jButton12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                66,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jButton13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                66,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jButton16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                144,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jButton9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                66,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 300,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE)));

        pack();
    }

    private void txtResActionPerformed(java.awt.event.ActionEvent evt) {
        txtRes.setText(txtRes.getText() + "");
    }

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {

        val1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        sinal = "/";
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        val1 = null;
        val2 = null;
        txtRes.setText("");
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        txtRes.setText("");
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "1");
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "2");
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "3");
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "4");
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "5");
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "6");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "7");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "8");
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        txtRes.setText(txtRes.getText() + "9");
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        val1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        sinal = "+";

    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        val2 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        if (sinal == "+") {
            res = soma(val1, val2);
        } else if (sinal == "-") {
            res = subitrai(val1, val2);
        } else if (sinal == "*") {
            res = multiplica(val1, val2);
        } else if (sinal == "/") {
            res = divide(val1, val2);
        }
        txtRes.setText(String.valueOf(res));
    }

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {

        val1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        sinal = "-";
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {

        val1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        sinal = "*";
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public static double soma(double A, double B) {
        return A + B;
    }

    public static double subitrai(double A, double B) {
        return A - B;
    }

    public static double multiplica(double A, double B) {
        return A * B;
    }

    public static double divide(double A, double B) {
        return A / B;
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField txtRes;

}