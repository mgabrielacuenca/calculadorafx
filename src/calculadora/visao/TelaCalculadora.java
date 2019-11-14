/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.visao;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Gabriela
 */
public class TelaCalculadora extends JFrame {

    JTextField tx1 = new JTextField(10);

    double valor1, valor2, resultado;
    int operacao;
    double verifica;

    public TelaCalculadora() throws HeadlessException {
        super("Calculadora da Gabriela");
        this.setLayout(new FlowLayout(10, 10, 10));
        this.setSize(180, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton btsoma = new JButton("+");
        JButton btsubtracao = new JButton("-");
        JButton btdivisao = new JButton("/");
        JButton btmultiplicacao = new JButton("*");
        JButton btresultado = new JButton("=");
        JButton btvirgula = new JButton(".");
        JButton btLimpar = new JButton("C");

        this.getContentPane().add(tx1);
        this.getContentPane().add(b0);
        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);
        this.getContentPane().add(b4);
        this.getContentPane().add(b5);
        this.getContentPane().add(b6);
        this.getContentPane().add(b7);
        this.getContentPane().add(b8);
        this.getContentPane().add(b9);
        this.getContentPane().add(btsoma);
        this.getContentPane().add(btsubtracao);
        this.getContentPane().add(btdivisao);
        this.getContentPane().add(btmultiplicacao);
        this.getContentPane().add(btresultado);
        this.getContentPane().add(btvirgula);
        this.getContentPane().add(btLimpar);

        b0.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "0");
            }

        });

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "1");
            }

        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "2");
            }
        });

        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "3");
            }

        });

        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "4");
            }
        });

        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "5");
            }
        });
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "6");
            }
        });
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "7");
            }
        });
        b8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "8");
            }
        });
        b9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText(tx1.getText() + "9");
            }
        });

        btLimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tx1.setText("");
                valor1 = 0;
                valor2 = 0;
            }
        });

        btvirgula.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tx1.setText(tx1.getText() + ".");
            }
        });
        btsoma.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tx1 != null) {
                    valor1 = Double.parseDouble(tx1.getText());
                    tx1.setText("");
                    operacao = 1;
                }
                valor1 = Double.parseDouble(tx1.getText());

                tx1.setText("");

                operacao = 1;
            }
        });
        btsubtracao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tx1 != null) {
                    valor1 = Double.parseDouble(tx1.getText());
                    tx1.setText("");
                    operacao = 2;
                }
                valor1 = Double.parseDouble(tx1.getText());

                tx1.setText("");

                operacao = 2;
            }
        });
        btmultiplicacao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tx1 != null) {
                    valor1 = Double.parseDouble(tx1.getText());
                    tx1.setText("");
                    operacao = 3;
                }
                valor1 = Double.parseDouble(tx1.getText());

                tx1.setText("");

                operacao = 3;
            }
        });
        btdivisao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tx1 != null) {
                    valor1 = Double.parseDouble(tx1.getText());
                    tx1.setText("");
                    operacao = 4;
                }
                valor1 = Double.parseDouble(tx1.getText());

                tx1.setText("");

                operacao = 4;
            }
        });

        btresultado.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(tx1.getText());

                if (operacao == 1) {

                    resultado = valor1 + valor2;// TODO add your handling code here:

                } else if (operacao == 2) {

                    resultado = valor1 - valor2;

                } else if (operacao == 3) {

                    resultado = valor1 * valor2;

                } else if (operacao == 4) {

                    resultado = valor1 / valor2;

                }

                tx1.setText("" + resultado);
                verifica = resultado;
            }

        }
        );

        tx1.setPreferredSize(new Dimension(0, 30));
        tx1.setFont(new java.awt.Font("", 1, 15));

    }

}
