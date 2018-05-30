package pkg;

import java.awt.event.ActionEvent;
import jssc.SerialPortList;
import java.util.Random;
import jssc.SerialPort;
import jssc.SerialPortException;

public class SetLedMatrix extends javax.swing.JFrame {
    
    Random rannum = new Random();
    static SerialPort serialPort;

    public SetLedMatrix() {
        initComponents();
        LoadPorts();
        SetGUIInactive();
    }
    
    void SetGUIInactive() {
        LED1.setEnabled(false);
        LED2.setEnabled(false);
        LED3.setEnabled(false);
        LED4.setEnabled(false);
        LED5.setEnabled(false);
        LED6.setEnabled(false);
        LED7.setEnabled(false);
        LED8.setEnabled(false);
        LED9.setEnabled(false);
        LED10.setEnabled(false);
        LED11.setEnabled(false);
        LED12.setEnabled(false);
        LED13.setEnabled(false);
        LED14.setEnabled(false);
        LED15.setEnabled(false);
        LED15.setEnabled(false);
        LED16.setEnabled(false);
        LED17.setEnabled(false);
        LED18.setEnabled(false);
        LED19.setEnabled(false);
        LED20.setEnabled(false);
        LED21.setEnabled(false);
        LED22.setEnabled(false);
        LED23.setEnabled(false);
        LED24.setEnabled(false);
        LED25.setEnabled(false);
        LED26.setEnabled(false);
        LED27.setEnabled(false);
        LED28.setEnabled(false);
        LED29.setEnabled(false);
        LED30.setEnabled(false);
        LED31.setEnabled(false);
        LED32.setEnabled(false);
        LED33.setEnabled(false);
        LED34.setEnabled(false);
        LED35.setEnabled(false);
        LED36.setEnabled(false);
        LED37.setEnabled(false);
        LED38.setEnabled(false);
        LED39.setEnabled(false);
        LED40.setEnabled(false);
        LED41.setEnabled(false);
        LED42.setEnabled(false);
        LED43.setEnabled(false);
        LED44.setEnabled(false);
        LED45.setEnabled(false);
        LED46.setEnabled(false);
        LED47.setEnabled(false);
        LED48.setEnabled(false);
        LED49.setEnabled(false);
        LED50.setEnabled(false);
        LED51.setEnabled(false);
        LED52.setEnabled(false);
        LED53.setEnabled(false);
        LED54.setEnabled(false);
        LED55.setEnabled(false);
        LED56.setEnabled(false);
        LED57.setEnabled(false);
        LED58.setEnabled(false);
        LED59.setEnabled(false);
        LED60.setEnabled(false);
        LED61.setEnabled(false);
        LED62.setEnabled(false);
        LED63.setEnabled(false);
        LED64.setEnabled(false);
        cmdRandom.setEnabled(false);
    }
    
    void SetGUIActive() {
        LED1.setEnabled(true);
        LED2.setEnabled(true);
        LED3.setEnabled(true);
        LED4.setEnabled(true);
        LED5.setEnabled(true);
        LED6.setEnabled(true);
        LED7.setEnabled(true);
        LED8.setEnabled(true);
        LED9.setEnabled(true);
        LED10.setEnabled(true);
        LED11.setEnabled(true);
        LED12.setEnabled(true);
        LED13.setEnabled(true);
        LED14.setEnabled(true);
        LED15.setEnabled(true);
        LED15.setEnabled(true);
        LED16.setEnabled(true);
        LED17.setEnabled(true);
        LED18.setEnabled(true);
        LED19.setEnabled(true);
        LED20.setEnabled(true);
        LED21.setEnabled(true);
        LED22.setEnabled(true);
        LED23.setEnabled(true);
        LED24.setEnabled(true);
        LED25.setEnabled(true);
        LED26.setEnabled(true);
        LED27.setEnabled(true);
        LED28.setEnabled(true);
        LED29.setEnabled(true);
        LED30.setEnabled(true);
        LED31.setEnabled(true);
        LED32.setEnabled(true);
        LED33.setEnabled(true);
        LED34.setEnabled(true);
        LED35.setEnabled(true);
        LED36.setEnabled(true);
        LED37.setEnabled(true);
        LED38.setEnabled(true);
        LED39.setEnabled(true);
        LED40.setEnabled(true);
        LED41.setEnabled(true);
        LED42.setEnabled(true);
        LED43.setEnabled(true);
        LED44.setEnabled(true);
        LED45.setEnabled(true);
        LED46.setEnabled(true);
        LED47.setEnabled(true);
        LED48.setEnabled(true);
        LED49.setEnabled(true);
        LED50.setEnabled(true);
        LED51.setEnabled(true);
        LED52.setEnabled(true);
        LED53.setEnabled(true);
        LED54.setEnabled(true);
        LED55.setEnabled(true);
        LED56.setEnabled(true);
        LED57.setEnabled(true);
        LED58.setEnabled(true);
        LED59.setEnabled(true);
        LED60.setEnabled(true);
        LED61.setEnabled(true);
        LED62.setEnabled(true);
        LED63.setEnabled(true);
        LED64.setEnabled(true);
        cmdRandom.setEnabled(true);
    }
    
    void startSerial() {
        serialPort = new SerialPort(ComboPorts
                .getSelectedItem()
                .toString()); 
        try {
            serialPort.openPort();//Open port
            serialPort.setParams(9600, 8, 1, 0);//Set params
            int mask = SerialPort.MASK_RXCHAR 
                    + SerialPort.MASK_CTS 
                    + SerialPort.MASK_DSR;//Prepare mask
            serialPort.setEventsMask(mask);//Set mask
            SetGUIActive();
        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboPorts = new javax.swing.JComboBox<>();
        lblPorts = new javax.swing.JLabel();
        cmdRandom = new javax.swing.JButton();
        cmdStart = new javax.swing.JButton();
        LED1 = new javax.swing.JCheckBox();
        LED2 = new javax.swing.JCheckBox();
        LED3 = new javax.swing.JCheckBox();
        LED4 = new javax.swing.JCheckBox();
        LED5 = new javax.swing.JCheckBox();
        LED6 = new javax.swing.JCheckBox();
        LED7 = new javax.swing.JCheckBox();
        LED8 = new javax.swing.JCheckBox();
        LED9 = new javax.swing.JCheckBox();
        LED10 = new javax.swing.JCheckBox();
        LED11 = new javax.swing.JCheckBox();
        LED12 = new javax.swing.JCheckBox();
        LED13 = new javax.swing.JCheckBox();
        LED14 = new javax.swing.JCheckBox();
        LED15 = new javax.swing.JCheckBox();
        LED16 = new javax.swing.JCheckBox();
        LED17 = new javax.swing.JCheckBox();
        LED18 = new javax.swing.JCheckBox();
        LED19 = new javax.swing.JCheckBox();
        LED20 = new javax.swing.JCheckBox();
        LED21 = new javax.swing.JCheckBox();
        LED22 = new javax.swing.JCheckBox();
        LED23 = new javax.swing.JCheckBox();
        LED24 = new javax.swing.JCheckBox();
        LED25 = new javax.swing.JCheckBox();
        LED26 = new javax.swing.JCheckBox();
        LED27 = new javax.swing.JCheckBox();
        LED28 = new javax.swing.JCheckBox();
        LED29 = new javax.swing.JCheckBox();
        LED30 = new javax.swing.JCheckBox();
        LED31 = new javax.swing.JCheckBox();
        LED32 = new javax.swing.JCheckBox();
        LED33 = new javax.swing.JCheckBox();
        LED34 = new javax.swing.JCheckBox();
        LED35 = new javax.swing.JCheckBox();
        LED36 = new javax.swing.JCheckBox();
        LED37 = new javax.swing.JCheckBox();
        LED38 = new javax.swing.JCheckBox();
        LED39 = new javax.swing.JCheckBox();
        LED40 = new javax.swing.JCheckBox();
        LED41 = new javax.swing.JCheckBox();
        LED42 = new javax.swing.JCheckBox();
        LED43 = new javax.swing.JCheckBox();
        LED44 = new javax.swing.JCheckBox();
        LED45 = new javax.swing.JCheckBox();
        LED46 = new javax.swing.JCheckBox();
        LED47 = new javax.swing.JCheckBox();
        LED48 = new javax.swing.JCheckBox();
        LED49 = new javax.swing.JCheckBox();
        LED50 = new javax.swing.JCheckBox();
        LED51 = new javax.swing.JCheckBox();
        LED52 = new javax.swing.JCheckBox();
        LED53 = new javax.swing.JCheckBox();
        LED54 = new javax.swing.JCheckBox();
        LED55 = new javax.swing.JCheckBox();
        LED56 = new javax.swing.JCheckBox();
        LED57 = new javax.swing.JCheckBox();
        LED58 = new javax.swing.JCheckBox();
        LED59 = new javax.swing.JCheckBox();
        LED60 = new javax.swing.JCheckBox();
        LED61 = new javax.swing.JCheckBox();
        LED62 = new javax.swing.JCheckBox();
        LED63 = new javax.swing.JCheckBox();
        LED64 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboPorts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPorts.setText("Ports:");

        cmdRandom.setText("Random Led");
        cmdRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRandomActionPerformed(evt);
            }
        });

        cmdStart.setText("Start Serial");
        cmdStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdStartActionPerformed(evt);
            }
        });

        LED1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED1ActionPerformed(evt);
            }
        });

        LED2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED2ActionPerformed(evt);
            }
        });

        LED3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED3ActionPerformed(evt);
            }
        });

        LED4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED4ActionPerformed(evt);
            }
        });

        LED5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED5ActionPerformed(evt);
            }
        });

        LED6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED6ActionPerformed(evt);
            }
        });

        LED7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED7ActionPerformed(evt);
            }
        });

        LED8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED8ActionPerformed(evt);
            }
        });

        LED9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED9ActionPerformed(evt);
            }
        });

        LED10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED10ActionPerformed(evt);
            }
        });

        LED11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED11ActionPerformed(evt);
            }
        });

        LED12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED12ActionPerformed(evt);
            }
        });

        LED13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED13ActionPerformed(evt);
            }
        });

        LED14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED14ActionPerformed(evt);
            }
        });

        LED15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED15ActionPerformed(evt);
            }
        });

        LED16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED16ActionPerformed(evt);
            }
        });

        LED17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED17ActionPerformed(evt);
            }
        });

        LED18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED18ActionPerformed(evt);
            }
        });

        LED19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED19ActionPerformed(evt);
            }
        });

        LED20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED20ActionPerformed(evt);
            }
        });

        LED21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED21ActionPerformed(evt);
            }
        });

        LED22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED22ActionPerformed(evt);
            }
        });

        LED23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED23ActionPerformed(evt);
            }
        });

        LED24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED24ActionPerformed(evt);
            }
        });

        LED25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED25ActionPerformed(evt);
            }
        });

        LED26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED26ActionPerformed(evt);
            }
        });

        LED27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED27ActionPerformed(evt);
            }
        });

        LED28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED28ActionPerformed(evt);
            }
        });

        LED29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED29ActionPerformed(evt);
            }
        });

        LED30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED30ActionPerformed(evt);
            }
        });

        LED31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED31ActionPerformed(evt);
            }
        });

        LED32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED32ActionPerformed(evt);
            }
        });

        LED33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED33ActionPerformed(evt);
            }
        });

        LED34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED34ActionPerformed(evt);
            }
        });

        LED35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED35ActionPerformed(evt);
            }
        });

        LED36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED36ActionPerformed(evt);
            }
        });

        LED37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED37ActionPerformed(evt);
            }
        });

        LED38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED38ActionPerformed(evt);
            }
        });

        LED39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED39ActionPerformed(evt);
            }
        });

        LED40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED40ActionPerformed(evt);
            }
        });

        LED41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED41ActionPerformed(evt);
            }
        });

        LED42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED42ActionPerformed(evt);
            }
        });

        LED43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED43ActionPerformed(evt);
            }
        });

        LED44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED44ActionPerformed(evt);
            }
        });

        LED45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED45ActionPerformed(evt);
            }
        });

        LED46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED46ActionPerformed(evt);
            }
        });

        LED47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED47ActionPerformed(evt);
            }
        });

        LED48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED48ActionPerformed(evt);
            }
        });

        LED49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED49ActionPerformed(evt);
            }
        });

        LED50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED50ActionPerformed(evt);
            }
        });

        LED51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED51ActionPerformed(evt);
            }
        });

        LED52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED52ActionPerformed(evt);
            }
        });

        LED53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED53ActionPerformed(evt);
            }
        });

        LED54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED54ActionPerformed(evt);
            }
        });

        LED55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED55ActionPerformed(evt);
            }
        });

        LED56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED56ActionPerformed(evt);
            }
        });

        LED57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED57ActionPerformed(evt);
            }
        });

        LED58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED58ActionPerformed(evt);
            }
        });

        LED59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED59ActionPerformed(evt);
            }
        });

        LED60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED60ActionPerformed(evt);
            }
        });

        LED61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED61ActionPerformed(evt);
            }
        });

        LED62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED62ActionPerformed(evt);
            }
        });

        LED63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED63ActionPerformed(evt);
            }
        });

        LED64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LED64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdRandom)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPorts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdStart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED1)
                                .addGap(10, 10, 10)
                                .addComponent(LED2)
                                .addGap(10, 10, 10)
                                .addComponent(LED3)
                                .addGap(10, 10, 10)
                                .addComponent(LED4)
                                .addGap(10, 10, 10)
                                .addComponent(LED5)
                                .addGap(10, 10, 10)
                                .addComponent(LED6)
                                .addGap(10, 10, 10)
                                .addComponent(LED7)
                                .addGap(10, 10, 10)
                                .addComponent(LED8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED9)
                                .addGap(10, 10, 10)
                                .addComponent(LED10)
                                .addGap(10, 10, 10)
                                .addComponent(LED11)
                                .addGap(10, 10, 10)
                                .addComponent(LED12)
                                .addGap(10, 10, 10)
                                .addComponent(LED13)
                                .addGap(10, 10, 10)
                                .addComponent(LED14)
                                .addGap(10, 10, 10)
                                .addComponent(LED15)
                                .addGap(10, 10, 10)
                                .addComponent(LED16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED17)
                                .addGap(10, 10, 10)
                                .addComponent(LED18)
                                .addGap(10, 10, 10)
                                .addComponent(LED19)
                                .addGap(10, 10, 10)
                                .addComponent(LED20)
                                .addGap(10, 10, 10)
                                .addComponent(LED21)
                                .addGap(10, 10, 10)
                                .addComponent(LED22)
                                .addGap(10, 10, 10)
                                .addComponent(LED23)
                                .addGap(10, 10, 10)
                                .addComponent(LED24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED25)
                                .addGap(10, 10, 10)
                                .addComponent(LED26)
                                .addGap(10, 10, 10)
                                .addComponent(LED27)
                                .addGap(10, 10, 10)
                                .addComponent(LED28)
                                .addGap(10, 10, 10)
                                .addComponent(LED29)
                                .addGap(10, 10, 10)
                                .addComponent(LED30)
                                .addGap(10, 10, 10)
                                .addComponent(LED31)
                                .addGap(10, 10, 10)
                                .addComponent(LED32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED33)
                                .addGap(10, 10, 10)
                                .addComponent(LED34)
                                .addGap(10, 10, 10)
                                .addComponent(LED35)
                                .addGap(10, 10, 10)
                                .addComponent(LED36)
                                .addGap(10, 10, 10)
                                .addComponent(LED37)
                                .addGap(10, 10, 10)
                                .addComponent(LED38)
                                .addGap(10, 10, 10)
                                .addComponent(LED39)
                                .addGap(10, 10, 10)
                                .addComponent(LED40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED41)
                                .addGap(10, 10, 10)
                                .addComponent(LED42)
                                .addGap(10, 10, 10)
                                .addComponent(LED43)
                                .addGap(10, 10, 10)
                                .addComponent(LED44)
                                .addGap(10, 10, 10)
                                .addComponent(LED45)
                                .addGap(10, 10, 10)
                                .addComponent(LED46)
                                .addGap(10, 10, 10)
                                .addComponent(LED47)
                                .addGap(10, 10, 10)
                                .addComponent(LED48))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED49)
                                .addGap(10, 10, 10)
                                .addComponent(LED50)
                                .addGap(10, 10, 10)
                                .addComponent(LED51)
                                .addGap(10, 10, 10)
                                .addComponent(LED52)
                                .addGap(10, 10, 10)
                                .addComponent(LED53)
                                .addGap(10, 10, 10)
                                .addComponent(LED54)
                                .addGap(10, 10, 10)
                                .addComponent(LED55)
                                .addGap(10, 10, 10)
                                .addComponent(LED56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LED57)
                                .addGap(10, 10, 10)
                                .addComponent(LED58)
                                .addGap(10, 10, 10)
                                .addComponent(LED59)
                                .addGap(10, 10, 10)
                                .addComponent(LED60)
                                .addGap(10, 10, 10)
                                .addComponent(LED61)
                                .addGap(10, 10, 10)
                                .addComponent(LED62)
                                .addGap(10, 10, 10)
                                .addComponent(LED63)
                                .addGap(10, 10, 10)
                                .addComponent(LED64)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboPorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPorts)
                    .addComponent(cmdStart))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED1)
                    .addComponent(LED2)
                    .addComponent(LED3)
                    .addComponent(LED4)
                    .addComponent(LED5)
                    .addComponent(LED6)
                    .addComponent(LED7)
                    .addComponent(LED8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED9)
                    .addComponent(LED10)
                    .addComponent(LED11)
                    .addComponent(LED12)
                    .addComponent(LED13)
                    .addComponent(LED14)
                    .addComponent(LED15)
                    .addComponent(LED16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED17)
                    .addComponent(LED18)
                    .addComponent(LED19)
                    .addComponent(LED20)
                    .addComponent(LED21)
                    .addComponent(LED22)
                    .addComponent(LED23)
                    .addComponent(LED24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED25)
                    .addComponent(LED26)
                    .addComponent(LED27)
                    .addComponent(LED28)
                    .addComponent(LED29)
                    .addComponent(LED30)
                    .addComponent(LED31)
                    .addComponent(LED32))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED33)
                    .addComponent(LED34)
                    .addComponent(LED35)
                    .addComponent(LED36)
                    .addComponent(LED37)
                    .addComponent(LED38)
                    .addComponent(LED39)
                    .addComponent(LED40))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED41)
                    .addComponent(LED42)
                    .addComponent(LED43)
                    .addComponent(LED44)
                    .addComponent(LED45)
                    .addComponent(LED46)
                    .addComponent(LED47)
                    .addComponent(LED48))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED49)
                    .addComponent(LED50)
                    .addComponent(LED51)
                    .addComponent(LED52)
                    .addComponent(LED53)
                    .addComponent(LED54)
                    .addComponent(LED55)
                    .addComponent(LED56))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LED57)
                    .addComponent(LED58)
                    .addComponent(LED59)
                    .addComponent(LED60)
                    .addComponent(LED61)
                    .addComponent(LED62)
                    .addComponent(LED63)
                    .addComponent(LED64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(cmdRandom)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRandomActionPerformed
        Thread randomCommThread = new Thread() {
            public void run() {
                randomLedCommand();
            }
        };                                         
        randomCommThread.start();
    }//GEN-LAST:event_cmdRandomActionPerformed

    private void cmdStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdStartActionPerformed
        cmdStart.setEnabled(false);
        Thread serialStartThread = new Thread() {
            public void run() {
                startSerial();
            }
        };
        serialStartThread.start();
    }//GEN-LAST:event_cmdStartActionPerformed

    private void LED1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED1ActionPerformed
       try {
            if (LED1.isSelected()) {
               serialPort.writeString("0,0,t\n");
            } else {
               serialPort.writeString("0,0,f\n");
            } 
       } catch (Exception e) {
           //pass
       } 
    }//GEN-LAST:event_LED1ActionPerformed

    private void LED2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED2ActionPerformed
        try {
            if (LED2.isSelected()) {
               serialPort.writeString("0,1,t\n");
            } else {
               serialPort.writeString("0,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED2ActionPerformed

    private void LED3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED3ActionPerformed
        try {
            if (LED3.isSelected()) {
               serialPort.writeString("0,2,t\n");
            } else {
               serialPort.writeString("0,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED3ActionPerformed

    private void LED4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED4ActionPerformed
        try {
            if (LED4.isSelected()) {
               serialPort.writeString("0,3,t\n");
            } else {
               serialPort.writeString("0,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED4ActionPerformed

    private void LED5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED5ActionPerformed
        try {
            if (LED5.isSelected()) {
               serialPort.writeString("0,4,t\n");
            } else {
               serialPort.writeString("0,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED5ActionPerformed

    private void LED6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED6ActionPerformed
        try {
            if (LED6.isSelected()) {
               serialPort.writeString("0,5,t\n");
            } else {
               serialPort.writeString("0,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED6ActionPerformed

    private void LED7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED7ActionPerformed
        try {
            if (LED7.isSelected()) {
               serialPort.writeString("0,6,t\n");
            } else {
               serialPort.writeString("0,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED7ActionPerformed

    private void LED8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED8ActionPerformed
        try {
            if (LED8.isSelected()) {
               serialPort.writeString("0,7,t\n");
            } else {
               serialPort.writeString("0,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED8ActionPerformed

    private void LED9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED9ActionPerformed
        try {
            if (LED9.isSelected()) {
               serialPort.writeString("1,0,t\n");
            } else {
               serialPort.writeString("1,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED9ActionPerformed

    private void LED10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED10ActionPerformed
        try {
            if (LED10.isSelected()) {
               serialPort.writeString("1,1,t\n");
            } else {
               serialPort.writeString("1,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED10ActionPerformed

    private void LED11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED11ActionPerformed
        try {
            if (LED11.isSelected()) {
               serialPort.writeString("1,2,t\n");
            } else {
               serialPort.writeString("1,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED11ActionPerformed

    private void LED12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED12ActionPerformed
        try {
            if (LED12.isSelected()) {
               serialPort.writeString("1,3,t\n");
            } else {
               serialPort.writeString("1,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED12ActionPerformed

    private void LED13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED13ActionPerformed
        try {
            if (LED13.isSelected()) {
               serialPort.writeString("1,4,t\n");
            } else {
               serialPort.writeString("1,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED13ActionPerformed

    private void LED14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED14ActionPerformed
        try {
            if (LED14.isSelected()) {
               serialPort.writeString("1,5,t\n");
            } else {
               serialPort.writeString("1,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED14ActionPerformed

    private void LED15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED15ActionPerformed
        try {
            if (LED15.isSelected()) {
               serialPort.writeString("1,6,t\n");
            } else {
               serialPort.writeString("1,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED15ActionPerformed

    private void LED16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED16ActionPerformed
        try {
            if (LED16.isSelected()) {
               serialPort.writeString("1,7,t\n");
            } else {
               serialPort.writeString("1,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED16ActionPerformed

    private void LED17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED17ActionPerformed
        try {
            if (LED17.isSelected()) {
               serialPort.writeString("2,0,t\n");
            } else {
               serialPort.writeString("2,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED17ActionPerformed

    private void LED18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED18ActionPerformed
        try {
            if (LED18.isSelected()) {
               serialPort.writeString("2,1,t\n");
            } else {
               serialPort.writeString("2,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED18ActionPerformed

    private void LED19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED19ActionPerformed
        try {
            if (LED19.isSelected()) {
               serialPort.writeString("2,2,t\n");
            } else {
               serialPort.writeString("2,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED19ActionPerformed

    private void LED20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED20ActionPerformed
        try {
            if (LED20.isSelected()) {
               serialPort.writeString("2,3,t\n");
            } else {
               serialPort.writeString("2,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED20ActionPerformed

    private void LED21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED21ActionPerformed
        try {
            if (LED21.isSelected()) {
               serialPort.writeString("2,4,t\n");
            } else {
               serialPort.writeString("2,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED21ActionPerformed

    private void LED22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED22ActionPerformed
        try {
            if (LED22.isSelected()) {
               serialPort.writeString("2,5,t\n");
            } else {
               serialPort.writeString("2,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED22ActionPerformed

    private void LED23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED23ActionPerformed
        try {
            if (LED23.isSelected()) {
               serialPort.writeString("2,6,t\n");
            } else {
               serialPort.writeString("2,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED23ActionPerformed

    private void LED24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED24ActionPerformed
        try {
            if (LED24.isSelected()) {
               serialPort.writeString("2,7,t\n");
            } else {
               serialPort.writeString("2,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED24ActionPerformed

    private void LED25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED25ActionPerformed
        try {
            if (LED25.isSelected()) {
               serialPort.writeString("3,0,t\n");
            } else {
               serialPort.writeString("3,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED25ActionPerformed

    private void LED26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED26ActionPerformed
        try {
            if (LED26.isSelected()) {
               serialPort.writeString("3,1,t\n");
            } else {
               serialPort.writeString("3,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED26ActionPerformed

    private void LED27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED27ActionPerformed
        try {
            if (LED27.isSelected()) {
               serialPort.writeString("3,2,t\n");
            } else {
               serialPort.writeString("3,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED27ActionPerformed

    private void LED28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED28ActionPerformed
        try {
            if (LED28.isSelected()) {
               serialPort.writeString("3,3,t\n");
            } else {
               serialPort.writeString("3,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED28ActionPerformed

    private void LED29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED29ActionPerformed
        try {
            if (LED29.isSelected()) {
               serialPort.writeString("3,4,t\n");
            } else {
               serialPort.writeString("3,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED29ActionPerformed

    private void LED30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED30ActionPerformed
        try {
            if (LED30.isSelected()) {
               serialPort.writeString("3,5,t\n");
            } else {
               serialPort.writeString("3,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED30ActionPerformed

    private void LED31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED31ActionPerformed
        try {
            if (LED31.isSelected()) {
               serialPort.writeString("3,6,t\n");
            } else {
               serialPort.writeString("3,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED31ActionPerformed

    private void LED32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED32ActionPerformed
        try {
            if (LED32.isSelected()) {
               serialPort.writeString("3,7,t\n");
            } else {
               serialPort.writeString("3,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED32ActionPerformed

    private void LED33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED33ActionPerformed
        try {
            if (LED33.isSelected()) {
               serialPort.writeString("4,0,t\n");
            } else {
               serialPort.writeString("4,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED33ActionPerformed

    private void LED34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED34ActionPerformed
        try {
            if (LED34.isSelected()) {
               serialPort.writeString("4,1,t\n");
            } else {
               serialPort.writeString("4,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED34ActionPerformed

    private void LED35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED35ActionPerformed
        try {
            if (LED35.isSelected()) {
               serialPort.writeString("4,2,t\n");
            } else {
               serialPort.writeString("4,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED35ActionPerformed

    private void LED36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED36ActionPerformed
        try {
            if (LED36.isSelected()) {
               serialPort.writeString("4,3,t\n");
            } else {
               serialPort.writeString("4,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED36ActionPerformed

    private void LED37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED37ActionPerformed
        try {
            if (LED37.isSelected()) {
               serialPort.writeString("4,4,t\n");
            } else {
               serialPort.writeString("4,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED37ActionPerformed

    private void LED38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED38ActionPerformed
        try {
            if (LED38.isSelected()) {
               serialPort.writeString("4,5,t\n");
            } else {
               serialPort.writeString("4,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED38ActionPerformed

    private void LED39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED39ActionPerformed
        try {
            if (LED39.isSelected()) {
               serialPort.writeString("4,6,t\n");
            } else {
               serialPort.writeString("4,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED39ActionPerformed

    private void LED40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED40ActionPerformed
        try {
            if (LED40.isSelected()) {
               serialPort.writeString("4,7,t\n");
            } else {
               serialPort.writeString("4,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED40ActionPerformed

    private void LED41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED41ActionPerformed
        try {
            if (LED41.isSelected()) {
               serialPort.writeString("5,0,t\n");
            } else {
               serialPort.writeString("5,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED41ActionPerformed

    private void LED42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED42ActionPerformed
        try {
            if (LED42.isSelected()) {
               serialPort.writeString("5,1,t\n");
            } else {
               serialPort.writeString("5,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED42ActionPerformed

    private void LED43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED43ActionPerformed
        try {
            if (LED43.isSelected()) {
               serialPort.writeString("5,2,t\n");
            } else {
               serialPort.writeString("5,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED43ActionPerformed

    private void LED44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED44ActionPerformed
        try {
            if (LED44.isSelected()) {
               serialPort.writeString("5,3,t\n");
            } else {
               serialPort.writeString("5,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED44ActionPerformed

    private void LED45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED45ActionPerformed
        try {
            if (LED45.isSelected()) {
               serialPort.writeString("5,4,t\n");
            } else {
               serialPort.writeString("5,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED45ActionPerformed

    private void LED46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED46ActionPerformed
        try {
            if (LED46.isSelected()) {
               serialPort.writeString("5,5,t\n");
            } else {
               serialPort.writeString("5,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED46ActionPerformed

    private void LED47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED47ActionPerformed
        try {
            if (LED47.isSelected()) {
               serialPort.writeString("5,6,t\n");
            } else {
               serialPort.writeString("5,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED47ActionPerformed

    private void LED48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED48ActionPerformed
        try {
            if (LED48.isSelected()) {
               serialPort.writeString("5,7,t\n");
            } else {
               serialPort.writeString("5,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED48ActionPerformed

    private void LED49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED49ActionPerformed
        try {
            if (LED49.isSelected()) {
               serialPort.writeString("6,0,t\n");
            } else {
               serialPort.writeString("6,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED49ActionPerformed

    private void LED50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED50ActionPerformed
        try {
            if (LED50.isSelected()) {
               serialPort.writeString("6,1,t\n");
            } else {
               serialPort.writeString("6,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED50ActionPerformed

    private void LED51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED51ActionPerformed
        try {
            if (LED51.isSelected()) {
               serialPort.writeString("6,2,t\n");
            } else {
               serialPort.writeString("6,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED51ActionPerformed

    private void LED52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED52ActionPerformed
        try {
            if (LED52.isSelected()) {
               serialPort.writeString("6,3,t\n");
            } else {
               serialPort.writeString("6,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED52ActionPerformed

    private void LED53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED53ActionPerformed
        try {
            if (LED53.isSelected()) {
               serialPort.writeString("6,4,t\n");
            } else {
               serialPort.writeString("6,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED53ActionPerformed

    private void LED54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED54ActionPerformed
        try {
            if (LED54.isSelected()) {
               serialPort.writeString("6,5,t\n");
            } else {
               serialPort.writeString("6,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED54ActionPerformed

    private void LED55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED55ActionPerformed
        try {
            if (LED55.isSelected()) {
               serialPort.writeString("6,6,t\n");
            } else {
               serialPort.writeString("6,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED55ActionPerformed

    private void LED56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED56ActionPerformed
        try {
            if (LED56.isSelected()) {
               serialPort.writeString("6,7,t\n");
            } else {
               serialPort.writeString("6,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED56ActionPerformed

    private void LED57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED57ActionPerformed
        try {
            if (LED57.isSelected()) {
               serialPort.writeString("7,0,t\n");
            } else {
               serialPort.writeString("7,0,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED57ActionPerformed

    private void LED58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED58ActionPerformed
        try {
            if (LED58.isSelected()) {
               serialPort.writeString("7,1,t\n");
            } else {
               serialPort.writeString("7,1,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED58ActionPerformed

    private void LED59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED59ActionPerformed
        try {
            if (LED59.isSelected()) {
               serialPort.writeString("7,2,t\n");
            } else {
               serialPort.writeString("7,2,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED59ActionPerformed

    private void LED60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED60ActionPerformed
        try {
            if (LED60.isSelected()) {
               serialPort.writeString("7,3,t\n");
            } else {
               serialPort.writeString("7,3,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED60ActionPerformed

    private void LED61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED61ActionPerformed
        try {
            if (LED61.isSelected()) {
               serialPort.writeString("7,4,t\n");
            } else {
               serialPort.writeString("7,4,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED61ActionPerformed

    private void LED62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED62ActionPerformed
        try {
            if (LED62.isSelected()) {
               serialPort.writeString("7,5,t\n");
            } else {
               serialPort.writeString("7,5,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED62ActionPerformed

    private void LED63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED63ActionPerformed
        try {
            if (LED63.isSelected()) {
               serialPort.writeString("7,6,t\n");
            } else {
               serialPort.writeString("7,6,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED63ActionPerformed

    private void LED64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LED64ActionPerformed
        try {
            if (LED64.isSelected()) {
               serialPort.writeString("7,7,t\n");
            } else {
               serialPort.writeString("7,7,f\n");
            } 
        } catch (Exception e) {
           //pass
        }
    }//GEN-LAST:event_LED64ActionPerformed
	
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetLedMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetLedMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetLedMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetLedMatrix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetLedMatrix().setVisible(true);
            }
        });
    }
    
    void LoadPorts() {
        String[] portNames = SerialPortList.getPortNames();
        ComboPorts.setModel(new javax.swing.DefaultComboBoxModel<>(portNames));
    }
    
    void randomLedCommand() {
        int row = rannum.nextInt((7 - 0));
        String strrow = Integer.toString(row);
        int col = rannum.nextInt((7 - 0));
        String strcol = Integer.toString(col);
        String strOut = strrow + "," + strcol + ",t" + '\n';
        System.out.println(strOut);
        try {
            serialPort.writeString(strOut);
        } catch (Exception e) {
            //
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPorts;
    private javax.swing.JCheckBox LED1;
    private javax.swing.JCheckBox LED10;
    private javax.swing.JCheckBox LED11;
    private javax.swing.JCheckBox LED12;
    private javax.swing.JCheckBox LED13;
    private javax.swing.JCheckBox LED14;
    private javax.swing.JCheckBox LED15;
    private javax.swing.JCheckBox LED16;
    private javax.swing.JCheckBox LED17;
    private javax.swing.JCheckBox LED18;
    private javax.swing.JCheckBox LED19;
    private javax.swing.JCheckBox LED2;
    private javax.swing.JCheckBox LED20;
    private javax.swing.JCheckBox LED21;
    private javax.swing.JCheckBox LED22;
    private javax.swing.JCheckBox LED23;
    private javax.swing.JCheckBox LED24;
    private javax.swing.JCheckBox LED25;
    private javax.swing.JCheckBox LED26;
    private javax.swing.JCheckBox LED27;
    private javax.swing.JCheckBox LED28;
    private javax.swing.JCheckBox LED29;
    private javax.swing.JCheckBox LED3;
    private javax.swing.JCheckBox LED30;
    private javax.swing.JCheckBox LED31;
    private javax.swing.JCheckBox LED32;
    private javax.swing.JCheckBox LED33;
    private javax.swing.JCheckBox LED34;
    private javax.swing.JCheckBox LED35;
    private javax.swing.JCheckBox LED36;
    private javax.swing.JCheckBox LED37;
    private javax.swing.JCheckBox LED38;
    private javax.swing.JCheckBox LED39;
    private javax.swing.JCheckBox LED4;
    private javax.swing.JCheckBox LED40;
    private javax.swing.JCheckBox LED41;
    private javax.swing.JCheckBox LED42;
    private javax.swing.JCheckBox LED43;
    private javax.swing.JCheckBox LED44;
    private javax.swing.JCheckBox LED45;
    private javax.swing.JCheckBox LED46;
    private javax.swing.JCheckBox LED47;
    private javax.swing.JCheckBox LED48;
    private javax.swing.JCheckBox LED49;
    private javax.swing.JCheckBox LED5;
    private javax.swing.JCheckBox LED50;
    private javax.swing.JCheckBox LED51;
    private javax.swing.JCheckBox LED52;
    private javax.swing.JCheckBox LED53;
    private javax.swing.JCheckBox LED54;
    private javax.swing.JCheckBox LED55;
    private javax.swing.JCheckBox LED56;
    private javax.swing.JCheckBox LED57;
    private javax.swing.JCheckBox LED58;
    private javax.swing.JCheckBox LED59;
    private javax.swing.JCheckBox LED6;
    private javax.swing.JCheckBox LED60;
    private javax.swing.JCheckBox LED61;
    private javax.swing.JCheckBox LED62;
    private javax.swing.JCheckBox LED63;
    private javax.swing.JCheckBox LED64;
    private javax.swing.JCheckBox LED7;
    private javax.swing.JCheckBox LED8;
    private javax.swing.JCheckBox LED9;
    private javax.swing.JButton cmdRandom;
    private javax.swing.JButton cmdStart;
    private javax.swing.JLabel lblPorts;
    // End of variables declaration//GEN-END:variables
}
