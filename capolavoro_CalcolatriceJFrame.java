package CalcolatriceCapolavoro;

import java.lang.Math; 

/**
 *
 * @author acer
 */
public class capolavoro_CalcolatriceJFrame extends javax.swing.JFrame {

    double num, ans;
    int calcoli;
    
    public capolavoro_CalcolatriceJFrame() {
        initComponents();
        TurnOFF.setEnabled(false);
        disable();
    }
    
    //method that checks if the string is either empty or the last digit is a '.'
    public boolean checkDigitDot(){
        String app;
        boolean ris;
        int length;
        app = textField1.getText();
        length = app.length();
        ris = app.equals("") || app.charAt(length-1) == '.';
        return ris;
    }
    
    public boolean containsDot(){
        return textField1.getText().contains(".");
    }
    //method that checks if the string contains the letter "n", like in the word infinity and NaN 
    public boolean containsLetters(){
        return textField1.getText().toLowerCase().contains("n");
    }
    
    public void arithmeticOperation(){
        if(checkDigitDot() || containsLetters()){
            textField1.setText("0");
        }

        switch(calcoli){
            case 1 -> {
                //somma
                ans = num + Double.parseDouble(textField1.getText());//string to double
                textField1.setText(Double.toString(round(ans, textField1.getText().length())));
            }
            case 2 -> {
                //sottrazione
                ans = num - Double.parseDouble(textField1.getText());//string to double
                textField1.setText(Double.toString(ans));
            }
            case 3 -> {
                //moltiplicazione
                ans = num * Double.parseDouble(textField1.getText());//string to double
                textField1.setText(Double.toString(ans));
            }
            case 4 -> {
                //divisione
                ans = num / Double.parseDouble(textField1.getText());//string to double
                textField1.setText(Double.toString(ans));
            }
            case 5 -> {
                //potenza 
                ans = java.lang.Math.pow(num,Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(ans));
            }
        }
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    
    
    //turnOff
    @Override
    public void disable(){
        textField1.setText("");
        textField1.setEnabled(false);
        
        TurnON.setEnabled(true);
        TurnOFF.setEnabled(false);
        
        Button8.setEnabled(false);
        Button7.setEnabled(false);
        ButtonMINUS.setEnabled(false);
        Button9.setEnabled(false);
        Button5.setEnabled(false);
        Button4.setEnabled(false);
        ButtonMOLTIPLICATION.setEnabled(false);
        Button6.setEnabled(false);
        Button2.setEnabled(false);
        Button1.setEnabled(false);
        ButtonDIVISION.setEnabled(false);
        Button3.setEnabled(false);
        ButtonDOT.setEnabled(false);
        Button0.setEnabled(false);
        ButtonEQUALS.setEnabled(false);
        ButtonNEGPOS.setEnabled(false);
        ButtonDEL.setEnabled(false);
        ButtonPLUS.setEnabled(false);
        ButtonCANC.setEnabled(false);
        ButtonPower.setEnabled(false);
    }
    //turnOn
    @Override
    public void enable(){
        textField1.setEnabled(true);
        
        TurnON.setEnabled(false);
        TurnOFF.setEnabled(true);
        
        
        Button8.setEnabled(true);
        Button7.setEnabled(true);
        ButtonMINUS.setEnabled(true);
        Button9.setEnabled(true);
        Button5.setEnabled(true);
        Button4.setEnabled(true);
        ButtonMOLTIPLICATION.setEnabled(true);
        Button6.setEnabled(true);
        Button2.setEnabled(true);
        Button1.setEnabled(true);
        ButtonDIVISION.setEnabled(true);
        Button3.setEnabled(true);
        ButtonDOT.setEnabled(true);
        Button0.setEnabled(true);
        ButtonEQUALS.setEnabled(true);
        ButtonNEGPOS.setEnabled(true);
        ButtonDEL.setEnabled(true);
        ButtonPLUS.setEnabled(true);
        ButtonCANC.setEnabled(true);
        ButtonPower.setEnabled(true);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        TurnON = new javax.swing.JRadioButton();
        TurnOFF = new javax.swing.JRadioButton();
        Button8 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        ButtonMINUS = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        ButtonMOLTIPLICATION = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        ButtonDIVISION = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonDOT = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonEQUALS = new javax.swing.JButton();
        ButtonNEGPOS = new javax.swing.JButton();
        ButtonDEL = new javax.swing.JButton();
        ButtonPLUS = new javax.swing.JButton();
        ButtonCANC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonPower = new javax.swing.JButton();
        textField1 = new javax.swing.JTextField();
        jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcolatrice");
        setLocation(new java.awt.Point(700, 250));
        setResizable(false);

        buttonGroup1.add(TurnON);
        TurnON.setForeground(new java.awt.Color(0, 0, 0));
        TurnON.setText("ON");
        TurnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnONActionPerformed(evt);
            }
        });

        buttonGroup1.add(TurnOFF);
        TurnOFF.setForeground(new java.awt.Color(0, 0, 0));
        TurnOFF.setText("OFF");
        TurnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnOFFActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button8.setForeground(new java.awt.Color(0, 0, 0));
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button7.setForeground(new java.awt.Color(0, 0, 0));
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        ButtonMINUS.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonMINUS.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMINUS.setText("-");
        ButtonMINUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMINUSActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button9.setForeground(new java.awt.Color(0, 0, 0));
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button5.setForeground(new java.awt.Color(0, 0, 0));
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button4.setForeground(new java.awt.Color(0, 0, 0));
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        ButtonMOLTIPLICATION.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonMOLTIPLICATION.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMOLTIPLICATION.setText("*");
        ButtonMOLTIPLICATION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMOLTIPLICATIONActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button6.setForeground(new java.awt.Color(0, 0, 0));
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button2.setForeground(new java.awt.Color(0, 0, 0));
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button1.setForeground(new java.awt.Color(0, 0, 0));
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        ButtonDIVISION.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonDIVISION.setForeground(new java.awt.Color(0, 0, 0));
        ButtonDIVISION.setText("/");
        ButtonDIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDIVISIONActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button3.setForeground(new java.awt.Color(0, 0, 0));
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        ButtonDOT.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonDOT.setForeground(new java.awt.Color(0, 0, 0));
        ButtonDOT.setText(".");
        ButtonDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDOTActionPerformed(evt);
            }
        });

        Button0.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Button0.setForeground(new java.awt.Color(0, 0, 0));
        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        ButtonEQUALS.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonEQUALS.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEQUALS.setText("=");
        ButtonEQUALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEQUALSActionPerformed(evt);
            }
        });

        ButtonNEGPOS.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonNEGPOS.setForeground(new java.awt.Color(0, 0, 0));
        ButtonNEGPOS.setText("+/-");
        ButtonNEGPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNEGPOSActionPerformed(evt);
            }
        });

        ButtonDEL.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonDEL.setForeground(new java.awt.Color(0, 0, 0));
        ButtonDEL.setText("<--");
        ButtonDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDELActionPerformed(evt);
            }
        });

        ButtonPLUS.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonPLUS.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPLUS.setText("+");
        ButtonPLUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPLUSActionPerformed(evt);
            }
        });

        ButtonCANC.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonCANC.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCANC.setText("C");
        ButtonCANC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCANCActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        ButtonPower.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        ButtonPower.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPower.setText("^");
        ButtonPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPowerActionPerformed(evt);
            }
        });

        textField1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        textField1.setForeground(new java.awt.Color(0, 0, 0));
        textField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        jTextField.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jTextField.setForeground(new java.awt.Color(0, 0, 0));
        jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField.setText("Result ");
        jTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonEQUALS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonNEGPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonDIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonMOLTIPLICATION, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ButtonCANC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TurnOFF, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TurnON, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonPower, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonPLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TurnON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TurnOFF)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCANC, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPLUS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonPower, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMINUS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonMOLTIPLICATION, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonEQUALS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonNEGPOS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        textField1.setText(textField1.getText()  + "7");
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        textField1.setText(textField1.getText()  + "9");
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        textField1.setText(textField1.getText()  + "4");
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        textField1.setText(textField1.getText()  + "6");
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        textField1.setText(textField1.getText()  + "1");
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        textField1.setText(textField1.getText()  + "3");
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        textField1.setText(textField1.getText()  + "0");
    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonNEGPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNEGPOSActionPerformed
        //TODO make the whole string negative if positive and positive if negative
        if(textField1.getText().length() == 0) return;
        
        double app = Double.parseDouble(textField1.getText());
        double ris;
       
        ris = app * -1;
        textField1.setText(Double.toString(ris));
    }//GEN-LAST:event_ButtonNEGPOSActionPerformed

    private void ButtonCANCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCANCActionPerformed
        textField1.setText("");
    }//GEN-LAST:event_ButtonCANCActionPerformed

    private void TurnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnONActionPerformed
        // TODO add your handling code here:
        enable();
    }//GEN-LAST:event_TurnONActionPerformed

    private void TurnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnOFFActionPerformed
        disable();
        
    }//GEN-LAST:event_TurnOFFActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        textField1.setText(textField1.getText()  + "2");
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        textField1.setText(textField1.getText()  + "5");
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        textField1.setText(textField1.getText()  + "8");
    }//GEN-LAST:event_Button8ActionPerformed

    private void ButtonPLUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPLUSActionPerformed
        //somma
        if(checkDigitDot() || containsLetters()){
            textField1.setText("0");
        }
        num = Double.parseDouble(textField1.getText());
        calcoli = 1; 
        textField1.setText("");
        jLabel1.setText(num + "+ ");
    }//GEN-LAST:event_ButtonPLUSActionPerformed

    private void ButtonMOLTIPLICATIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMOLTIPLICATIONActionPerformed
        //multiplicazione
        if(checkDigitDot() || containsLetters()){
            textField1.setText("0");
        }
        num = Double.parseDouble(textField1.getText());
        calcoli = 3;
        textField1.setText("");
        jLabel1.setText(num + "* ");        
    }//GEN-LAST:event_ButtonMOLTIPLICATIONActionPerformed

    private void ButtonDIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDIVISIONActionPerformed
        //divisione
        if(checkDigitDot() || containsLetters()){
            textField1.setText("0");
        }
        num = Double.parseDouble(textField1.getText());
        calcoli = 4;
        textField1.setText("");
        jLabel1.setText(num + "/ ");
    }//GEN-LAST:event_ButtonDIVISIONActionPerformed

    private void ButtonEQUALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEQUALSActionPerformed
        arithmeticOperation();
        jLabel1.setText("");
    }//GEN-LAST:event_ButtonEQUALSActionPerformed

    private void ButtonDOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDOTActionPerformed
        if(!containsDot()){
            textField1.setText(textField1.getText() + ".");
        }
    }//GEN-LAST:event_ButtonDOTActionPerformed

    private void ButtonMINUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMINUSActionPerformed
        //sottrazione
        if(checkDigitDot() || containsLetters()){
            textField1.setText("0");
        }
        num = Double.parseDouble(textField1.getText());
        calcoli = 2;
        textField1.setText("");
        jLabel1.setText(num + "- ");
    }//GEN-LAST:event_ButtonMINUSActionPerformed

    private void ButtonDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDELActionPerformed
        if(containsLetters()) textField1.setText("");
        
        int length = textField1.getText().length();
        int number = textField1.getText().length() - 1;
        String app;
        
        if(length > 0){
            StringBuilder backSpace = new StringBuilder(textField1.getText());
            backSpace.deleteCharAt(number);
            app = backSpace.toString();
            textField1.setText(app);
        }
    }//GEN-LAST:event_ButtonDELActionPerformed

    private void ButtonPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPowerActionPerformed
        if(checkDigitDot() || containsLetters()){
            textField1.setText("0");
        }
        num = Double.parseDouble(textField1.getText());
        calcoli = 5;
        textField1.setText("");
        jLabel1.setText(num + "^ ");
    }//GEN-LAST:event_ButtonPowerActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

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
            java.util.logging.Logger.getLogger(capolavoro_CalcolatriceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(capolavoro_CalcolatriceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(capolavoro_CalcolatriceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(capolavoro_CalcolatriceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new capolavoro_CalcolatriceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonCANC;
    private javax.swing.JButton ButtonDEL;
    private javax.swing.JButton ButtonDIVISION;
    private javax.swing.JButton ButtonDOT;
    private javax.swing.JButton ButtonEQUALS;
    private javax.swing.JButton ButtonMINUS;
    private javax.swing.JButton ButtonMOLTIPLICATION;
    private javax.swing.JButton ButtonNEGPOS;
    private javax.swing.JButton ButtonPLUS;
    private javax.swing.JButton ButtonPower;
    private javax.swing.JRadioButton TurnOFF;
    private javax.swing.JRadioButton TurnON;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField;
    private javax.swing.JTextField textField1;
    // End of variables declaration//GEN-END:variables
}
